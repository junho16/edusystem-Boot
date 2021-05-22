package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.ScoreDto;
import com.edusystem.dto.XXKCDto;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.ScoreService;
import com.edusystem.util.ExcelListener.ScoreData;
import com.edusystem.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 花菜
 * @date 2021/5/12 9:10
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreMapper scoreMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ClsandstuMapper clsandstuMapper;

    @Autowired
    XkServiceImpl xkService;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    CourseMapper courseMapper;

    /**
     *{data={
     *  "studentId":"3333325",
     *  "teachtaskId":null,
     *  "courseId":"1",
     *  "courseName":"计算机科学导论",
     *  "score_kq":null,
     *  "score_ps":null,
     *  "score_sy":null,
     *  "score_qz":null,
     *  "score_qm":null,
     *  "score_kf":null
     * }}
     * @param datamap
     * @param token
     * @return
     */
    @Override
    public HashMap saveScoreWithHand(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();


        String studentId = (String) data.get("studentId");
        String teachtaskId = (String) data.get("teachtaskId");
        String courseId = (String) data.get("courseId");
        String courseName = (String) data.get("courseName");
        Integer score_kq = Integer.parseInt((String) data.get("score_kq"));
        Integer score_ps = Integer.parseInt((String) data.get("score_ps"));
        Integer score_sy = Integer.parseInt((String) data.get("score_sy"));
        Integer score_qz = Integer.parseInt((String) data.get("score_qz"));
        Integer score_qm = Integer.parseInt((String) data.get("score_qm"));


        try{
            ScoreExample scoreExample = new ScoreExample();
            ScoreExample.Criteria scorecia = scoreExample.createCriteria();
            scorecia.andTeachtaskIdEqualTo(teachtaskId);
            scorecia.andStudentIdEqualTo(studentId);
            List<Score> isHas = scoreMapper.selectByExample(scoreExample);
            if( isHas.size() != 0  ) {
                //区别于学生成绩的保存成功返回值 证明 此学生成绩已存在
                res.put(20000,false);
                return res;
            }

            Score score = new Score();
            score.setScoreId( UUID.randomUUID().toString().substring(0,8) );
            score.setStudentId(studentId);
            score.setTeachtaskId(teachtaskId);
            score.setCourseId(courseId);
            score.setCourseName(courseName);
            score.setScoreDeduce(score_kq);
            score.setScoreMid(score_qz);
            score.setScoreTest(score_sy);
            score.setScoreUsual(score_ps);
            score.setScoreEnd(score_qm);

            int total = 0;
            //算分規則：暫定是 平时10（平时60 考勤40） 期中30 期末40 实验20
            total = (int) ((score_kq * 0.4 + score_ps * 0.6) * 0.1+
                                score_qz * 0.3 +
                                score_qm * 0.4 +
                                score_sy * 0.2);

            score.setScoreTotal(total);
            scoreMapper.insertSelective(score);
            res.put(20000,"学生成绩保存成功 ！");
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"学生成绩保存失败 ！");
            return res;
        }
    }


    @Override
    public Boolean saveScoreWithXls(ScoreData datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();


        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        String studentId = (String) datamap.getStudentid();
        String teachtaskId = (String) datamap.getTeachtaskid();

        Teachtask t = teachtaskMapper.selectByPrimaryKey(teachtaskId);
        Course c = courseMapper.selectByPrimaryKey(t.getCourseId());
        String courseId = (String) c.getCourseId();
        String courseName = (String) datamap.getCoursename();

        Integer score_kq = Integer.parseInt((String) datamap.getScore_kq());
        Integer score_ps = Integer.parseInt((String) datamap.getScore_ps());
        Integer score_sy = Integer.parseInt((String) datamap.getScore_sy());
        Integer score_qz = Integer.parseInt((String) datamap.getScore_qz());
        Integer score_qm = Integer.parseInt((String) datamap.getScore_qm());

        try{
            Score score = new Score();
            score.setStudentId(studentId);
            score.setTeachtaskId(teachtaskId);
            score.setCourseId(courseId);
            score.setCourseName(courseName);
            score.setScoreDeduce(score_kq);
            score.setScoreMid(score_qz);
            score.setScoreTest(score_sy);
            score.setScoreUsual(score_ps);
            score.setScoreEnd(score_qm);
            int total = 0;
            //算分規則：暫定是 平时10（平时60 考勤40） 期中30 期末40 实验20
            total = (int) ((score_kq * 0.4 + score_ps * 0.6) * 0.1+
                    score_qz * 0.3 +
                    score_qm * 0.4 +
                    score_sy * 0.2);
            score.setScoreTotal(total);

            ScoreExample scoreExample = new ScoreExample();
            ScoreExample.Criteria scorecia = scoreExample.createCriteria();
            scorecia.andTeachtaskIdEqualTo(teachtaskId);
            scorecia.andStudentIdEqualTo(studentId);
            List<Score> isHas = scoreMapper.selectByExample(scoreExample);

            if( isHas.size() != 0  ) {
                //区别于学生成绩的保存成功返回值 证明 此学生成绩已存在 update覆盖
                score.setScoreId(isHas.get(0).getScoreId());
                return scoreMapper.updateByPrimaryKeySelective(score)==1 ? true:false;
            }else{
                score.setScoreId( UUID.randomUUID().toString().substring(0,8) );
                return scoreMapper.insertSelective(score)==1 ? true:false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     *{data={
     *  "studentId":"3333325",
     *  "teachtaskId":null,
     *  "courseId":"1",
     *  "courseName":"计算机科学导论",
     *  "score_kq":null,
     *  "score_ps":null,
     *  "score_sy":null,
     *  "score_qz":null,
     *  "score_qm":null,
     *  "score_kf":null
     * }}
     * @param datamap
     * @param token
     * @return
     */
    @Override
    public HashMap updateScoreWithHand(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();


        String studentId = (String) data.get("studentId");
        String teachtaskId = (String) data.get("teachtaskId");
        String courseId = (String) data.get("courseId");
        String courseName = (String) data.get("courseName");
        Integer score_kq = Integer.parseInt((String) data.get("score_kq"));
        Integer score_ps = Integer.parseInt((String) data.get("score_ps"));
        Integer score_sy = Integer.parseInt((String) data.get("score_sy"));
        Integer score_qz = Integer.parseInt((String) data.get("score_qz"));
        Integer score_qm = Integer.parseInt((String) data.get("score_qm"));


        try{
            ScoreExample scoreExample = new ScoreExample();
            ScoreExample.Criteria scorecia = scoreExample.createCriteria();
            scorecia.andTeachtaskIdEqualTo(teachtaskId);
            scorecia.andStudentIdEqualTo(studentId);
            List<Score> isHas = scoreMapper.selectByExample(scoreExample);


            Score score = isHas.get(0);
            score.setScoreDeduce(score_kq);
            score.setScoreMid(score_qz);
            score.setScoreTest(score_sy);
            score.setScoreUsual(score_ps);
            score.setScoreEnd(score_qm);

            int total = 0;
            //算分規則：暫定是 平时10（平时60 考勤40） 期中30 期末40 实验20
            total = (int) ((score_kq * 0.4 + score_ps * 0.6) * 0.1+
                    score_qz * 0.3 +
                    score_qm * 0.4 +
                    score_sy * 0.2);

            score.setScoreTotal(total);
            scoreMapper.updateByPrimaryKeySelective(score);
            res.put(20000,"学生成绩更新成功 ！");
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"学生成绩更新失败 ！");
            return res;
        }
    }


    /**
     *{data={
     *  "teachtaskId":null
     * }}
     * @param datamap
     * @param token
     * @return
     */
    @Override
    public HashMap getScoreData(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        String teachtaskId = (String) data.get("teachtaskId");


        try{
            List<ScoreDto > reslist = new ArrayList<>();
            ScoreExample scoreExample = new ScoreExample();
            ScoreExample.Criteria scorecia = scoreExample.createCriteria();
            scorecia.andTeachtaskIdEqualTo(teachtaskId);

            List<Score> scores = scoreMapper.selectByExample(scoreExample);
            if(scores.size() == 0 || scores == null){
                //无记录说明需要重新记录
                List<Clsandstu> students = new ArrayList<>();

                ClsandstuExample clsandstuExample = new ClsandstuExample();
                ClsandstuExample.Criteria criteria = clsandstuExample.createCriteria();
                criteria.andTeachtaskIdEqualTo(teachtaskId);
                List<Clsandstu> clsandstus1 = clsandstuMapper.selectByExample(clsandstuExample);
                students.addAll(clsandstus1);

                ClsandstuExample clsandstuExample2 = new ClsandstuExample();
                ClsandstuExample.Criteria criteria2 = clsandstuExample2.createCriteria();
                criteria2.andTeachtaskIdEqualTo("0-"+teachtaskId);
                List<Clsandstu> clsandstus2 = clsandstuMapper.selectByExample(clsandstuExample2);
                students.addAll(clsandstus2);

                for(Clsandstu stu : students ){
                    ScoreDto scoreDto = new ScoreDto();

                    scoreDto.setStudentId(stu.getStudentId());
                    Student student = studentMapper.selectByPrimaryKey(stu.getStudentId());
                    scoreDto.setStudentName(student.getStudentName());
                    scoreDto.setClassId(student.getClassId());
                    scoreDto.setStudentEmail(student.getStudentEmail());
                    scoreDto.setStudentPhone(student.getStudentPhone());
                    scoreDto.setStudentGender(student.getStudentGender());
                    scoreDto.setCollegeId(student.getCollegeId());

                    scoreDto.setScore_kq("");
                    scoreDto.setScore_ps("");
                    scoreDto.setScore_sy("");
                    scoreDto.setScore_qz("");
                    scoreDto.setScore_qm("");

                    reslist.add(scoreDto);
                }
            }else{
                for(Score s : scores ){
                    ScoreDto scoreDto = new ScoreDto();

                    scoreDto.setStudentId(s.getStudentId());
                    Student student = studentMapper.selectByPrimaryKey(s.getStudentId());
                    scoreDto.setStudentName(student.getStudentName());
                    scoreDto.setClassId(student.getClassId());
                    scoreDto.setStudentEmail(student.getStudentEmail());
                    scoreDto.setStudentPhone(student.getStudentPhone());
                    scoreDto.setStudentGender(student.getStudentGender());
                    scoreDto.setCollegeId(student.getCollegeId());

                    scoreDto.setScore_kq(s.getScoreDeduce()+"");
                    scoreDto.setScore_ps(s.getScoreUsual()+"");
                    scoreDto.setScore_sy(s.getScoreTest()+"");
                    scoreDto.setScore_qz(s.getScoreMid()+"");
                    scoreDto.setScore_qm(s.getScoreEnd()+"");

                    reslist.add(scoreDto);
                }
            }
            res.put(20000,reslist);
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取学生成绩列表失败 ！");
            return res;
        }
    }


    @Override
    public HashMap getStudentScores(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        List<ScoreDto > reslist = new ArrayList<>();
        try{
            Map resmap = xkService.tabledata(   datamap,  token);
            List isnull = (List) resmap.get(20000);
            if( isnull == null || isnull.size() ==0){
                res.put(20000,false);//返回false说明此学生在该学年、学期下无课程信息
                return res;
            }else{
                List<XXKCDto> list = (List<XXKCDto>) resmap.get(20000);
                for(XXKCDto xxkcDto : list){
                    ScoreExample scoreExample = new ScoreExample();
                    ScoreExample.Criteria scorecia = scoreExample.createCriteria();
                    scorecia.andTeachtaskIdEqualTo(xxkcDto.getKcTeachTaskId());
                    scorecia.andStudentIdEqualTo(username);
                    List<Score> scores = scoreMapper.selectByExample(scoreExample);
                    for(Score s : scores ){
                        Teachtask t = teachtaskMapper.selectByPrimaryKey(s.getTeachtaskId());
                        Course c = courseMapper.selectByPrimaryKey(s.getCourseId());

                        ScoreDto scoreDto = new ScoreDto();
                        scoreDto.setStudentId(s.getStudentId());
                        Student student = studentMapper.selectByPrimaryKey(s.getStudentId());
                        scoreDto.setStudentName(student.getStudentName());
                        scoreDto.setClassId(student.getClassId());
                        scoreDto.setStudentEmail(student.getStudentEmail());
                        scoreDto.setStudentPhone(student.getStudentPhone());
                        scoreDto.setStudentGender(student.getStudentGender());
                        scoreDto.setCollegeId(student.getCollegeId());

                        scoreDto.setScore_kq(s.getScoreDeduce()+"");
                        scoreDto.setScore_ps(s.getScoreUsual()+"");
                        scoreDto.setScore_sy(s.getScoreTest()+"");
                        scoreDto.setScore_qz(s.getScoreMid()+"");
                        scoreDto.setScore_qm(s.getScoreEnd()+"");

                        scoreDto.setScoreSum(s.getScoreTotal()+"");
                        scoreDto.setCourseName(c.getCourseName()+"");
                        scoreDto.setCourseKcxz(c.getKcxzName()+"");
                        scoreDto.setCourseCirdit(c.getCourseCredit()+"");
                        scoreDto.setCourseStudyHour(c.getCourseTheoryhours()+"");
                        scoreDto.setCourseCheckKind(c.getCourseCheckkind()+"");


                        reslist.add(scoreDto);
                    }
                }

                res.put(20000,reslist);
                return res;

            }
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取学生成绩列表失败 ！");
            return res;
        }
    }

    @Override
    public HashMap getStudentScoreByTeachtaskid(Map datamap, String token){
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        List<ScoreDto> reslist  = new ArrayList<>();
        try{
            ScoreExample scoreExample = new ScoreExample();
            ScoreExample.Criteria scorecia = scoreExample.createCriteria();
            scorecia.andTeachtaskIdEqualTo((String)data.get("teachtaskid") );
            scorecia.andStudentIdEqualTo(username);
            List<Score> scores = scoreMapper.selectByExample(scoreExample);


            for(Score s : scores ) {
                Teachtask t = teachtaskMapper.selectByPrimaryKey(s.getTeachtaskId());
                Course c = courseMapper.selectByPrimaryKey(s.getCourseId());

                ScoreDto scoreDto = new ScoreDto();
                scoreDto.setStudentId(s.getStudentId());
                Student student = studentMapper.selectByPrimaryKey(s.getStudentId());
                scoreDto.setStudentName(student.getStudentName());
                scoreDto.setClassId(student.getClassId());
                scoreDto.setStudentEmail(student.getStudentEmail());
                scoreDto.setStudentPhone(student.getStudentPhone());
                scoreDto.setStudentGender(student.getStudentGender());
                scoreDto.setCollegeId(student.getCollegeId());

                scoreDto.setScore_kq(s.getScoreDeduce() + "");
                scoreDto.setScore_ps(s.getScoreUsual() + "");
                scoreDto.setScore_sy(s.getScoreTest() + "");
                scoreDto.setScore_qz(s.getScoreMid() + "");
                scoreDto.setScore_qm(s.getScoreEnd() + "");

                scoreDto.setScoreSum(s.getScoreTotal() + "");
                scoreDto.setCourseName(c.getCourseName() + "");
                scoreDto.setCourseKcxz(c.getKcxzName() + "");
                scoreDto.setCourseCirdit(c.getCourseCredit() + "");
                scoreDto.setCourseStudyHour(c.getCourseTheoryhours() + "");
                scoreDto.setCourseCheckKind(c.getCourseCheckkind() + "");


                reslist.add(scoreDto);

            }

            res.put(20000,reslist);
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取学生某课程成绩失败 ！");
            return res;
        }
    }

    @Override
    public HashMap getStudentScoreForChart(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();

        ArrayList<Map> reslist = new ArrayList();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        try{
            String selClass = (String)data.get("selClass");
            String teachtaskAcademicyear = (String)data.get("teachtaskAcademicyear");
            String teachtaskAcademicterm = (String)data.get("teachtaskAcademicterm");

            TeachtaskExample teachtaskExample = new TeachtaskExample();
            TeachtaskExample.Criteria criteria = teachtaskExample.createCriteria();
            criteria.andClassIdEqualTo(selClass);
            criteria.andTeachtaskAcademicyearEqualTo(Integer.parseInt(teachtaskAcademicyear));
            criteria.andTeachtaskAcademictermEqualTo(Integer.parseInt(teachtaskAcademicterm));

            List<Teachtask> teachtasks = teachtaskMapper.selectByExample(teachtaskExample);

            //每一门课程的最高最低平均分，每一个分段有多少人
            for(Teachtask teachtask : teachtasks){
                ScoreExample scoreExample = new ScoreExample();
                ScoreExample.Criteria scoreCriteria = scoreExample.createCriteria();
                scoreCriteria.andTeachtaskIdEqualTo(teachtask.getTeachtaskId());
                List<Score> scores = scoreMapper.selectByExample(scoreExample);
                int max = -100;
                int min = 100;
                int avg = 0;
                int score_0_60 = 0;
                int score_60_70 = 0;
                int score_70_80 = 0;
                int score_80_90 = 0;
                int score_90_100 = 0;
                int total = 0;
                int num = 0;
                Course corese = courseMapper.selectByPrimaryKey(teachtask.getCourseId());
                String courseName = corese.getCourseName();
                for(Score score : scores){
                    num++;
                    total += score.getScoreTotal();
                    if(score.getScoreTotal() > max)
                        max = score.getScoreTotal();
                    if(score.getScoreTotal() < min)
                        min = score.getScoreTotal();
                    if(score.getScoreTotal() >= 0 && score.getScoreTotal() < 60) score_0_60++;
                    if(score.getScoreTotal() >= 60 && score.getScoreTotal() < 70) score_60_70++;
                    if(score.getScoreTotal() >= 70 && score.getScoreTotal() < 80) score_70_80++;
                    if(score.getScoreTotal() >= 80 && score.getScoreTotal() < 90) score_80_90++;
                    if(score.getScoreTotal() >= 90 && score.getScoreTotal() <= 100) score_90_100++;

                }
                HashMap hashMap = new HashMap();
                hashMap.put("coursename",courseName);
                hashMap.put("max",scores.size()==0?0:max);
                hashMap.put("min",scores.size()==0?0:min);
                hashMap.put("avg",num==0?0:total/num);
                hashMap.put("score_0_60",score_0_60);
                hashMap.put("score_60_70",score_60_70);
                hashMap.put("score_70_80",score_70_80);
                hashMap.put("score_80_90",score_80_90);
                hashMap.put("score_90_100",score_90_100);
                reslist.add(hashMap);
            }
            res.put(20000,reslist);
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取学生可视化图表课程成绩失败 ！");
            return res;
        }
    }

    @Override
    public HashMap getOwnScoreForChart(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        List<ScoreDto> reslist = new ArrayList<>();
        int score_0_60 = 0;
        int score_60_70 = 0;
        int score_70_80 = 0;
        int score_80_90 = 0;
        int score_90_100 = 0;
        try {
            Map resmap = xkService.tabledata(datamap, token);
            List isnull = (List) resmap.get(20000);

            List<XXKCDto> list = (List<XXKCDto>) resmap.get(20000);
            for (XXKCDto xxkcDto : list) {
                ScoreExample scoreExample = new ScoreExample();
                ScoreExample.Criteria scorecia = scoreExample.createCriteria();
                scorecia.andTeachtaskIdEqualTo(xxkcDto.getKcTeachTaskId());
                scorecia.andStudentIdEqualTo(username);
                List<Score> scores = scoreMapper.selectByExample(scoreExample);
                for (Score s : scores) {
                    Teachtask t = teachtaskMapper.selectByPrimaryKey(s.getTeachtaskId());
                    Course c = courseMapper.selectByPrimaryKey(s.getCourseId());

                    ScoreDto scoreDto = new ScoreDto();
                    scoreDto.setStudentId(s.getStudentId());
                    Student student = studentMapper.selectByPrimaryKey(s.getStudentId());
                    scoreDto.setStudentName(student.getStudentName());
                    scoreDto.setClassId(student.getClassId());
                    scoreDto.setStudentEmail(student.getStudentEmail());
                    scoreDto.setStudentPhone(student.getStudentPhone());
                    scoreDto.setStudentGender(student.getStudentGender());
                    scoreDto.setCollegeId(student.getCollegeId());

                    scoreDto.setScore_kq(s.getScoreDeduce() + "");
                    scoreDto.setScore_ps(s.getScoreUsual() + "");
                    scoreDto.setScore_sy(s.getScoreTest() + "");
                    scoreDto.setScore_qz(s.getScoreMid() + "");
                    scoreDto.setScore_qm(s.getScoreEnd() + "");

                    scoreDto.setScoreSum(s.getScoreTotal() + "");
                    scoreDto.setCourseName(c.getCourseName() + "");
                    scoreDto.setCourseKcxz(c.getKcxzName() + "");
                    scoreDto.setCourseCirdit(c.getCourseCredit() + "");
                    scoreDto.setCourseStudyHour(c.getCourseTheoryhours() + "");
                    scoreDto.setCourseCheckKind(c.getCourseCheckkind() + "");


                    reslist.add(scoreDto);

                    if (s.getScoreTotal() >= 0 && s.getScoreTotal() < 60) score_0_60++;
                    if (s.getScoreTotal() >= 60 && s.getScoreTotal() < 70) score_60_70++;
                    if (s.getScoreTotal() >= 70 && s.getScoreTotal() < 80) score_70_80++;
                    if (s.getScoreTotal() >= 80 && s.getScoreTotal() < 90) score_80_90++;
                    if (s.getScoreTotal() >= 90 && s.getScoreTotal() <= 100) score_90_100++;

                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("data", reslist);
            hashMap.put("score_0_60", score_0_60);
            hashMap.put("score_60_70", score_60_70);
            hashMap.put("score_70_80", score_70_80);
            hashMap.put("score_80_90", score_80_90);
            hashMap.put("score_90_100", score_90_100);

            res.put(20000, hashMap);
            return res;

        } catch (Exception e) {
            e.printStackTrace();
            res.put(18000, "获取学生个人可视化成绩信息失败 ！");
            return res;
        }
    }

}
