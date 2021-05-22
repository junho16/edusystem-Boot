package com.edusystem.util.ga;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Random;

/**
 * 染色体
 * @author 花菜
 * @date 2021/5/22 0:33
 */
@Data
@AllArgsConstructor
public class Schedule {
    /**
     * GA中首要考虑的是如何表现其问题，即如何对染色体编码，使之适用于GA操作。
     * 在经典的遗传算法中，常采用浮点数或二进制的编码方法，
     * 目前，每条染色体代表每一节课的安排
     * 至于排课结果的优劣，则由适应度函数评估染色体的适应值来决定。
     */
    private String teachtaskid; //哪一个教学任务==》包含了courseid teacherid classid

    //下面三个字段是经过ga给的
    private String classroomid; //在哪一个教室
    private Integer weekday; //周几上课（1-7）
    private Integer slot; //第几节课（12 34 56 78 910 11）==》（1-6）


    public Schedule() {}
    public Schedule(String teachtaskid) {
        this.teachtaskid = teachtaskid;
    }

    void random_init(List<String> roomRange){
        //这里随机初始值的时候 还是使用一周五天 一天4节课的正常 课程安排条件
        Random random = new Random() ;
        this.classroomid = roomRange.get(random.nextInt(roomRange.size()));
        this.weekday = (int)( 1 + Math.random() * (5 - 1 + 1));
        this.slot = (int)( 1 + Math.random() * (4 - 1 + 1));
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "teachtaskid='" + teachtaskid + '\'' +
                ", classroomid='" + classroomid + '\'' +
                ", weekday=" + weekday +
                ", slot=" + slot +
                '}';
    }
}
