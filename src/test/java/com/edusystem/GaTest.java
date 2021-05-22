package com.edusystem;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.util.ga.MyGa;
import com.edusystem.util.ga.Schedule;
import com.edusystem.util.recommend.MyRecommend.MyRecommendUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @author 花菜
 * @date 2021/5/22 13:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GaTest {

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    ClassroomMapper classroomMapper;

    @Test
    public void test(){
        int year = 2021;
        int term = 1;
        TeachtaskExample example = new TeachtaskExample();
        TeachtaskExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherIdIsNotNull();
        criteria.andTeachtaskAcademictermEqualTo(term);
        criteria.andTeachtaskAcademicyearEqualTo(year);

        //查出有哪些课程是此学年 此学期的
        ArrayList<Teachtask> teachtasksTmp = (ArrayList) teachtaskMapper.selectByExample(example);

        ArrayList<Teachtask> teachtasks = new ArrayList();
        //更新-如果一个教学任务说明了其一周上几节课 就给其一周布置几节课
        for(Teachtask t : teachtasksTmp){
            int num = t.getTeachtaskNumlimit();
            for(int i = 0 ; i < num ;i++ ){
                teachtasks.add(t);
            }
        }
        ClassroomExample classroomExample = new ClassroomExample();
        ClassroomExample.Criteria classCriteria = classroomExample.createCriteria();
        classCriteria.andClassroomIdIsNotNull();
        //查出有哪些教室
        ArrayList<Classroom> classrooms = (ArrayList) classroomMapper.selectByExample(classroomExample);


        ArrayList<String> classroomidlist = new ArrayList<>();
        for(Classroom c : classrooms){
            classroomidlist.add(c.getClassroomId());
        }
        ArrayList<Schedule> schedules = new ArrayList<>();

        for(Teachtask t : teachtasks){
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));
            schedules.add(new Schedule( t.getTeachtaskId() ));

        }

        MyGa myGa = new MyGa();
        List<Schedule> res = myGa.evolution(schedules,classroomidlist);
        for(Schedule s: res){
            System.out.println(s);
        }

    }


}
