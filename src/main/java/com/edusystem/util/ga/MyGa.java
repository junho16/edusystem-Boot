package com.edusystem.util.ga;

import com.edusystem.entity.Classroom;
import jdk.internal.org.objectweb.asm.ClassReader;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections4.map.LinkedMap;

import java.util.*;

/**
 * 遗传算法排课
 * @author 花菜
 * @date 2021/5/22 0:31
 */
@Data
@AllArgsConstructor
public class MyGa {

    //种群的规模（0-100）
    private Integer popsize = 32;
    //种群的变异概率
    private Double mutprob = 0.3;
    //精英种群的个数
    private Integer elite = 15;
    //进化代数（100-500）
    private Integer maxiter = 500;
    //所有的种群 每一个种群中存放需要编排的课程列表
    private List<List<Schedule>> population;

    public MyGa() {
    }

    /**
     * ga主体
     * 参数：教学任务信息列表 、所有可以使用的教师的id列表 、需要排到第几节课
     * @param schedules
     * @param roomRange
     * @return
     */
    public List<Schedule> evolution(List<Schedule> schedules, List<String> roomRange){
        //冲突最小的种群的冲突得分，若为0则说明已获得最优的种群结果，可返回
        int bestScore = 0;
        //最优的课程编排结果
        List<Schedule> bestSchedule = new ArrayList<>();
        init_population(schedules, roomRange);
        for(int i = 0 ; i < this.maxiter ; i++){
            List<List<Schedule>> newPopulation = new ArrayList<>();
            //获取冲突结果
            LinkedMap<List<Schedule> , Integer> cost_map = schedule_cost(this.population, this.elite);
            for(List<Schedule> key : cost_map.keySet()){
                //若发现冲突结果为0 则说明可将其当做最优排课结果返回
                bestScore = cost_map.get(key);
                if(bestScore == 0) {
                    bestSchedule = key;
                    return bestSchedule;
                }
            }
//            System.out.println(cost_map.size()+"===1");

            //精英种群集合
            for(List<Schedule> key : cost_map.keySet()){
                newPopulation.add(key);
            }
//            System.out.println(newPopulation.size()+"===2");

            while (newPopulation.size() < this.popsize){
                List<Schedule> tmp = new ArrayList<>();
                if(Math.random() < this.mutprob){
                    //落在变异概率内 变异
                    tmp = mutate(newPopulation, roomRange);
                }else{
                    //交叉
                    tmp = crossover(newPopulation);
                }
                newPopulation.add(tmp);
            }
            this.population = newPopulation;
        }
        return bestSchedule;
    }

    /**
     * 变异 根据精英种群集合 在将其变异后 返回一个新的种群
     * @param eiltePopulation
     * @param roomRange
     * @return
     */
    List<Schedule> mutate(List<List<Schedule>> eiltePopulation , List<String> roomRange ){
        Random random = new Random();
        //选择变异哪一个精英种群
//        List<Schedule> ep = eiltePopulation.get(random.nextInt(this.elite));
        int getIndex = random.nextInt(eiltePopulation.size());
//        System.out.println("===变异==》"+getIndex+"===");
//        System.out.println("===变异总长度==》"+eiltePopulation.size()+"===");
        List<Schedule> ep = eiltePopulation.get(getIndex);
        for(Schedule s : ep){
            int pos = random.nextInt(3);
            if(pos == 0){
                s.setClassroomid( roomRange.get(random.nextInt(roomRange.size())) );
            }else if(pos == 1){
                s.setWeekday((int)( 1 + Math.random() * (5 - 1 + 1)));
            }else if(pos == 2){
                s.setSlot((int)( 1 + Math.random() * (4 - 1 + 1)));
            }
        }
        return ep;
    }

    /**
     * 交叉 根据精英种群集合 在将其中两个种群交叉后 返回一个新的种群
     * @param eiltePopulation
     * @return
     */
    List<Schedule> crossover(List<List<Schedule>> eiltePopulation){
        Random random = new Random();
        //选择变异哪两个精英种群
//        List<Schedule> e1 = eiltePopulation.get(random.nextInt(this.elite));
//        List<Schedule> e2 = eiltePopulation.get(random.nextInt(this.elite));
        int getIndex1 = random.nextInt(eiltePopulation.size());
//        System.out.println("===交叉getIndex1==>"+getIndex1+"===");
        int getIndex2 = random.nextInt(eiltePopulation.size());
//        System.out.println("===交叉getIndex2==>"+getIndex2+"===");
//        System.out.println("===交叉总长度==》"+eiltePopulation.size()+"===");

        List<Schedule> e1 = eiltePopulation.get(getIndex1);
        List<Schedule> e2 = eiltePopulation.get(getIndex2);
        int pos = random.nextInt(3);
        for(int i = 0 ; i < e1.size() ; i++ ){
            if(pos == 0){
                e1.get(i).setClassroomid( e2.get(i).getClassroomid());
            }else if(pos == 1){
                e1.get(i).setWeekday( e2.get(i).getWeekday());
            }else if(pos == 2){
                e1.get(i).setSlot( e2.get(i).getSlot());
            }
        }
        return e1;
    }


    /**
     * 随机初始化不同的种群
     * @param schedules
     * @param roomRange
     */
    void init_population( List<Schedule> schedules , List<String> roomRange ){
        this.population = new ArrayList<>();
        for(int i = 0 ; i < this.popsize ; i++){
            List<Schedule> entity = new ArrayList<>();
            for(int j = 0; j < schedules.size() ; j++ ){
                Schedule tmp = schedules.get(j);
                tmp.random_init(roomRange);
                entity.add(new Schedule(
                        tmp.getTeachtaskid(),
                        tmp.getClassroomid(),
                        tmp.getWeekday(),
                        tmp.getSlot()
                ));
            }
            this.population.add(entity);
        }
    }


    /**
     * 计算课表种群的冲突。
     * 返回：精英种群--排名第一的种群若冲突值为0则说明是可以作为最优种群
     *
     * 当被测试课表冲突为0的时候，这个课表就是个符合规定的课表。
     * 冲突检测遵循下面几条规则：
     * 同一个教室在同一个时间只能有一门课。
     * 同一个班级在同一个时间只能有一门课。
     * 同一个教师在同一个时间只能有一门课。
     * 上面三条是原代码里的，对于目前情况
     * 只需要满足 同一个教室在同一个时间 只能有一各教学任务
     * @param population
     * @param elite
     * @return
     */
    LinkedMap<List<Schedule> , Integer> schedule_cost(List<List<Schedule>> population , Integer elite){
        LinkedMap<List<Schedule> , Integer> utilMap = new LinkedMap();
        LinkedMap<List<Schedule> , Integer> resMap = new LinkedMap();
        List<Integer> conflicts = new ArrayList<>();
        //一个种群有多长==》有多少课程需要安排
        int n = population.get(0).size();

        for(List<Schedule> p : population){
            //对一个种群遍历，求种群的适应度
            int conflict = 0;
            for(int i = 0 ;i < n-1 ;i++){
                for(int j = i+1 ;j < n ; j++){
                    //check course in same time and same room
                    //检查冲突 需保证 在同一天 同一节课 下的 同一个教室中没有两个课程
                    if(p.get(i).getClassroomid().equals(p.get(j).getClassroomid())  &&
                            p.get(i).getWeekday()  == p.get(j).getWeekday() &&
                            p.get(i).getSlot()  == p.get(j).getSlot() ){
                        conflict += 1;
                    }
                }
            }
            utilMap.put( p , conflict);
        }
        //根据冲突值排序
        List<Map.Entry<List<Schedule> , Integer>> entryList = new ArrayList<Map.Entry<List<Schedule> , Integer>>(utilMap.entrySet());
        Collections.sort(entryList,new Comparator<Map.Entry< List<Schedule> , Integer > >() {
            @Override
            public int compare(Map.Entry<List<Schedule> , Integer> me1, Map.Entry<List<Schedule> , Integer> me2){
                //按照从小到大的顺序排列
                return me1.getValue().compareTo(me2.getValue());
            }
        });
//        System.out.println(utilMap.size());
        Iterator<Map.Entry<List<Schedule> , Integer>> iter = entryList.iterator();
        Map.Entry<List<Schedule> , Integer> tmpEntry = null;
        int flag = 0;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            resMap.put(tmpEntry.getKey(), tmpEntry.getValue());
//            System.out.println(tmpEntry.getKey() + " " + tmpEntry.getValue());
            flag++;
            if(flag == elite)
                break;
        }
        //说明一下：此处的resMap的大小会变化 因为排序后可能会出现相同的种群情况 因为把value值更新了
//        System.out.println(resMap.size());
        return resMap;
    }


    /**
     * 解释：
     * 遗传算法在进化中是以每个个体的适应度值为依据来选取下一代种群的。
     * 适应度函数设定的好坏直接影响到遗传算法的收敛速度和能否找到最优解。
     * 在本系统中，适应度函数的设计思想是对每条染色体中存在的冲突类型进行加权求和，
     * 其中权值Wi代表的是第i条规则的重要程度，若某条染色体违反了某条规则i，
     * 则将其值Pi置为1（若没有违反规则i，则Pi值为0），其受到的惩罚值为Wi*Pi 。
     * 染色体适应度函数值越小，则表示其拥有较好的授课时段和教室，其在下一代的演化中的生存概率就较大。
     * 在这次设计的适应性（schedule_cost）把Wi默认为1
     */


}
