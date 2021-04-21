package com.edusystem.service.Impl;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.entity.Class;
import com.edusystem.mapper.*;
import com.edusystem.service.ProfessionService;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 花菜
 * @date 2021/4/16 19:50
 */
@Slf4j
@Service
public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    ProfessionMapper professionMapper;

    @Autowired
    SysadminMapper sysadminMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    ClassMapper classMapper;

    @Autowired
    CollegeMapper collegeMapper;

    /**
     * 根据角色获取其可视的专业列表
     * @param token
     * @return
     */
    @Override
    public ArrayList fetchProfessionList(String token) {
        ArrayList collegeList = new ArrayList();
        ArrayList res = new ArrayList();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取专业列表。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取专业列表。用户信息==》角色: userrole=>{}", loginrole);
        //角色可以是admin/teacher==》给出一个学院的所有专业 superadmin=》所有学院的所有专业信息
        switch (loginrole){
            //查出该角色可以看几个学院的 -- 学院下有几个专业 -- 专业下有几个班？放map里算了
            case "superadmin": {
                CollegeExample collegeExample = new CollegeExample();
                CollegeExample.Criteria collegeExampleCriteria = collegeExample.createCriteria();
                collegeExampleCriteria.andCollegeIdIsNotNull();
                List<College> colleges = collegeMapper.selectByExample(collegeExample);
                if (colleges == null) {
                    log.info("方法：获取专业列表-获取角色可查看的学院列表信息。未查询到学院列表信息");
                    return null;
                } else {
                    collegeList = new ArrayList();
                    for(College college : colleges) {
                        //对每一个学院做一个对象
                        //collegeList是说有几个学院 都在这个collegeList列表里 教师是只有一个学院 clollegeMap是列表里的对象
                        HashMap clollegeMap = new HashMap();
                        clollegeMap.put("collegeid", college.getCollegeId());
                        clollegeMap.put("collegename", college.getCollegeName());

                        ProfessionExample example = new ProfessionExample();
                        ProfessionExample.Criteria criteria = example.createCriteria();
                        criteria.andCollegeIdEqualTo(college.getCollegeId());

                        List<Profession> professions = professionMapper.selectByExample(example);
                        if (professions == null) {
                            log.info("方法：获取专业列表。未查询到学院下专业列表信息");
                            return null;
                        } else {
                            ArrayList professionList = new ArrayList();
                            for (Profession profession : professions) {
                                HashMap professionMap = new HashMap();
                                professionMap.put("professionid", profession.getProfessionId());
                                professionMap.put("professionname", profession.getProfessionName());

                                String pId = profession.getProfessionId();
                                ClassExample classExample = new ClassExample();
                                ClassExample.Criteria exampleCriteria = classExample.createCriteria();
                                exampleCriteria.andProfessionIdEqualTo(pId);
                                ArrayList<Class> classes = (ArrayList<Class>) classMapper.selectByExample(classExample);
                                professionMap.put("classes", classes);
                                professionList.add(professionMap);
                            }
                            clollegeMap.put("professions", professionList);
                        }
                        collegeList.add(clollegeMap);
                    }
                    return collegeList;
                }
            }
            case "admin": {
                //查询出属于哪个学院
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                log.info("方法：获取专业列表。学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());
                if(sysadmin.getCollegeId() == null || sysadmin.getCollegeId().equals(""))
                    log.info("方法：获取专业列表。学院管理员不属于任何学院");
                else {
                    College college = collegeMapper.selectByPrimaryKey(sysadmin.getCollegeId());

                    //collegeList是说有几个学院 都在这个collegeList列表里 教师是只有一个学院 clollegeMap是列表里的对象
                    collegeList = new ArrayList();
                    HashMap clollegeMap = new HashMap();
                    clollegeMap.put("collegeid" ,  college.getCollegeId() );
                    clollegeMap.put("collegename" , college.getCollegeName());

                    ProfessionExample example = new ProfessionExample();
                    ProfessionExample.Criteria criteria = example.createCriteria();
                    criteria.andCollegeIdEqualTo(college.getCollegeId());

                    List<Profession> professions = professionMapper.selectByExample(example);
                    if (professions == null) {
                        log.info("方法：获取专业列表。未查询到学院下专业列表信息");
                        return null;
                    } else {
                        ArrayList professionList = new ArrayList();
                        for (Profession profession : professions) {
                            HashMap professionMap = new HashMap();
                            professionMap.put("professionid" , profession.getProfessionId());
                            professionMap.put("professionname" , profession.getProfessionName());

                            String pId = profession.getProfessionId();
                            ClassExample classExample = new ClassExample();
                            ClassExample.Criteria exampleCriteria = classExample.createCriteria();
                            exampleCriteria.andProfessionIdEqualTo(pId);
                            ArrayList<Class> classes = (ArrayList<Class>) classMapper.selectByExample(classExample);
                            professionMap.put("classes", classes);
                            professionList.add(professionMap);
                        }
                        clollegeMap.put("professions",professionList);
                    }
                    collegeList.add(clollegeMap);

                }
                return collegeList;
            }
            case "teacher": {
                //查询出属于哪个学院
                Teacher teacher = teacherMapper.selectByPrimaryKey(username);
                log.info("方法：获取专业列表 。教师{}属于学院id为==》{}的学院",username,teacher.getCollegeId());
                if(teacher.getCollegeId() == null || teacher.getCollegeId().equals(""))
                    log.info("方法：获取专业列表 。教师不属于任何学院");
                else {
                    College college = collegeMapper.selectByPrimaryKey(teacher.getCollegeId());

                    //collegeList是说有几个学院 都在这个collegeList列表里 教师是只有一个学院 clollegeMap是列表里的对象
                    collegeList = new ArrayList();
                    HashMap clollegeMap = new HashMap();
                    clollegeMap.put("collegeid" ,  college.getCollegeId() );
                    clollegeMap.put("collegename" , college.getCollegeName());

                    ProfessionExample example = new ProfessionExample();
                    ProfessionExample.Criteria criteria = example.createCriteria();
                    criteria.andCollegeIdEqualTo(college.getCollegeId());

                    List<Profession> professions = professionMapper.selectByExample(example);
                    if (professions == null) {
                        log.info("方法：获取专业列表。未查询到学院下专业列表信息");
                        return null;
                    } else {
                        ArrayList professionList = new ArrayList();
                        for (Profession profession : professions) {
                            HashMap professionMap = new HashMap();
                            professionMap.put("professionid" , profession.getProfessionId());
                            professionMap.put("professionname" , profession.getProfessionName());

                            String pId = profession.getProfessionId();
                            ClassExample classExample = new ClassExample();
                            ClassExample.Criteria exampleCriteria = classExample.createCriteria();
                            exampleCriteria.andProfessionIdEqualTo(pId);
                            ArrayList<Class> classes = (ArrayList<Class>) classMapper.selectByExample(classExample);
                            professionMap.put("classes", classes);
                            professionList.add(professionMap);
                        }
                        clollegeMap.put("professions",professionList);
                    }
                    collegeList.add(clollegeMap);

                }
                return collegeList;
            }
        }
        return null;
    }

}
