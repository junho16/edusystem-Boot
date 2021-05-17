package com.edusystem.util.ExcelListener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.edusystem.mapper.ScoreMapper;
import com.edusystem.service.Impl.ScoreServiceImpl;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 花菜
 * @date 2021/5/17 10:27
 */
@Slf4j
public class ScoreListenter extends AnalysisEventListener<ScoreData> {
    // 有个很重要的点 ScoreListenter 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
    private ScoreServiceImpl soreServiceImpl;
    private String token;



    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<ScoreData> list = new ArrayList<ScoreData>();


    /**
     * 这个每一条数据解析都会来调用
     */
    @Override
    public void invoke(ScoreData data, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}",data.toString());
        list.add(data);
        // TODO-达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM

    }
    /**
     * 所有数据解析完成了 都会来调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        log.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        for (int i =0;i<list.size();i++ ){
            ScoreData scoreData = new ScoreData();


            scoreData.setStudentid(list.get(i).getStudentid());
            scoreData.setStudentname(list.get(i).getStudentname());
            scoreData.setClassid(list.get(i).getClassid());

            scoreData.setTeachtaskid(list.get(i).getTeachtaskid());
            scoreData.setCoursename(list.get(i).getCoursename());

            scoreData.setScore_kq(list.get(i).getScore_kq());
            scoreData.setScore_ps(list.get(i).getScore_ps());
            scoreData.setScore_sy(list.get(i).getScore_sy());
            scoreData.setScore_qz(list.get(i).getScore_qz());
            scoreData.setScore_qm(list.get(i).getScore_qm());

            Boolean save = soreServiceImpl.saveScoreWithXls(scoreData,token);
            if (save){
                System.out.println("第"+i+"添加成功");
            }
        }
    }



    public ScoreListenter() {
    }
    public ScoreListenter( ScoreServiceImpl soreServiceImpl,String token ) {
        this.soreServiceImpl = soreServiceImpl;
        this.token = token;
    }
}
