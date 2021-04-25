package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.XXKCDto;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.XkService;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author 花菜
 * @date 2021/4/20 11:08
 */
@Service
@Slf4j
public class XkServiceImpl implements XkService {

    @Autowired
    ClsandstuMapper clsandstuMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    XxkcMapper xxkcMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public HashMap<Integer, String> createXkInfo(JSONObject jsonObject, String token) {
       return null;
    }

    @Override
    public HashMap<Integer, String> selXXKC(String data, String token) {

        HashMap<Integer,String> res = new HashMap<>();
        Clsandstu clsandstu = new Clsandstu();
        clsandstu.setClsandstuId((UUID.randomUUID().toString().substring(0,8)));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：选课-网课。当前请求token为{}",token);
        log.info("方法：选课-网课。用户信息==》账号: userId=>{}", username);
        log.info("方法：选课-网课。用户信息==》角色: userrole=>{}", loginrole);


        clsandstu.setStudentId(username);

        /**
         * 网课-存==》 0-选修课程id
         */
        clsandstu.setTeachtaskId("0-"+ data);

        int ress = clsandstuMapper.insertSelective(clsandstu);

        if(ress >= 1)
            res.put(20000,"新增选修网课信息成功！");
        else
            res.put(18000,"新增选修网课信息失败！服务器内部错误！");
        return res;
    }

    @Override
    public HashMap treedata(String token) {
        HashMap resHashMap = new HashMap<>();
        ArrayList<Teachtask> resArr = new ArrayList<Teachtask>();

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取选课数据。当前请求token为{}",token);
        log.info("方法：获取选课数据。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取选课数据。用户信息==》角色: userrole=>{}", loginrole);

        ClsandstuExample clsandstuExample = new ClsandstuExample();
        ClsandstuExample.Criteria criteria = clsandstuExample.createCriteria();
        criteria.andStudentIdEqualTo(username);
        ArrayList<Clsandstu> clsandstuList= (ArrayList<Clsandstu>) clsandstuMapper.selectByExample(clsandstuExample);

        for(Clsandstu cas : clsandstuList){
            Teachtask teachtask = new Teachtask();
            String[] casStrs = cas.getTeachtaskId().split("-");
            if(casStrs[0].equals("0")){
                //选修课程
                Xxkc xxkc = xxkcMapper.selectByPrimaryKey(casStrs[1]);

                teachtask.setTeachtaskId(cas.getTeachtaskId());
                teachtask.setCourseName(xxkc.getXxkcName());
                teachtask.setTeachtaskAcademicyear(xxkc.getXxkcAcademicyear());

            }else{
                //校内课程
                Teachtask kc = teachtaskMapper.selectByPrimaryKey(casStrs[0]);
                Course course = courseMapper.selectByPrimaryKey(kc.getCourseId());

                teachtask.setTeachtaskId(cas.getTeachtaskId());
                teachtask.setCourseName(course.getCourseName());
                teachtask.setTeachtaskAcademicyear(kc.getTeachtaskAcademicyear());

            }
            resArr.add(teachtask);

        }
        if (resArr == null) {
            log.info("方法：获取选课列表信息。未查询到选课列表");
            resHashMap.put(18000,"获取选课列表信息失败或列表为空！" );
        } else {
            resHashMap.put(20000,resArr);

        }
        return resHashMap;
    }

    @Override
    public HashMap tabledata(  Map query, String token) {
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));
        HashMap resHashMap = new HashMap<>();
        ArrayList<XXKCDto> resArr = new ArrayList<XXKCDto>();

        /**
         *  kcId: null,
         *  kcName: null,
         *  kcTeacher: null,
         *  kcSourseid: null,
         *  kcKindid: null,
         *  kcSourse: null,
         *  kcKind: null,
         *  kcAcademicyear: null,
         *  kcAcademicterm: null,
         *  kcStarttime: null,
         *  kcEndtime: null,
         *  kcCredit: null,
         *  kcLearnHours: null,
         *  kcIseveryweek : null,
         *  kcNumlimit: null,
         *  kcMaxlimit: null,
         *  kcSelnum: null,
         *  kcIsrank: null,
         *
         *  kcClassid
         */

        /**
         *  keyword: null, // 课程名关键字
         *  sourseid: null,
         *  kindsid: null,
         *
         *  teachtaskAcademicyear: null,
         *  teachtaskAcademicterm: null,
         *  teachtaskStarttime: null,
         *  teachtaskEndtime: null,
         */

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取选课数据。当前请求token为{}",token);
        log.info("方法：获取选课数据。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取选课数据。用户信息==》角色: userrole=>{}", loginrole);

        ClsandstuExample clsandstuExample = new ClsandstuExample();
        ClsandstuExample.Criteria criteria = clsandstuExample.createCriteria();
        criteria.andStudentIdEqualTo(username);
        ArrayList<Clsandstu> clsandstuList= (ArrayList<Clsandstu>) clsandstuMapper.selectByExample(clsandstuExample);

        for(Clsandstu cas : clsandstuList){
            XXKCDto xxkcDto = new XXKCDto();
            String[] casStrs = cas.getTeachtaskId().split("-");
            if(casStrs[0].equals("0")){
                //选修课程
                Xxkc xxkc = xxkcMapper.selectByPrimaryKey(casStrs[1]);

                xxkcDto.setKcId(xxkc.getXxkcId());
                xxkcDto.setKcName(xxkc.getXxkcName());
                xxkcDto.setKcSourseid(xxkc.getXxkcSourseid());
                xxkcDto.setKcKindid(xxkc.getXxkcKindid());
                xxkcDto.setKcSourse(xxkc.getXxkcSourse());
                xxkcDto.setKcKind(xxkc.getXxkcKind());
                xxkcDto.setKcAcademicyear(xxkc.getXxkcAcademicyear()+"");
                xxkcDto.setKcAcademicterm(xxkc.getXxkcAcademicterm()+"");
                xxkcDto.setKcStarttime(xxkc.getXxkcStarttime()+"");
                xxkcDto.setKcEndtime(xxkc.getXxkcEndtime()+"");
                xxkcDto.setKcCredit(xxkc.getXxkcCredit()+"");
                xxkcDto.setKcLearnHours(xxkc.getXxkcLearnHours()+"");
                xxkcDto.setKcNumlimit(xxkc.getXxkcNumlimit()+"");
                xxkcDto.setKcMaxlimit(xxkc.getXxkcMaxlimit()+"");
                xxkcDto.setKcSelnum(xxkc.getXxkcSelnum()+"");
                xxkcDto.setKcIsrank(xxkc.getXxkcIsrank()+"");
                //  三个字段没有
                //  kcIseveryweek
                //  kcTeacher
                //  kcClassid
                String sourseid = (String) queryObj.get("sourseid");
                if( !(sourseid == null || sourseid.equals(""))  ){
                    log.info("方法：获取学生选课数据。查询平台id为{}的网课课程", sourseid);
                    if(!xxkcDto.getKcSourseid().equals(sourseid))
                        continue;
                }

                String kindsid = (String) queryObj.get("kindsid");
                if( !(kindsid == null || kindsid.equals(""))  ){
                    log.info("方法：获取学生选课数据。查询类型id为{}的网课课程", kindsid);
                    if(!xxkcDto.getKcKindid().equals(kindsid))
                        continue;
                }
            }else{
                //校内课程
                Teachtask kc = teachtaskMapper.selectByPrimaryKey(casStrs[0]);
                Course course = courseMapper.selectByPrimaryKey(kc.getCourseId());

                xxkcDto.setKcId(kc.getTeachtaskId());
                xxkcDto.setKcName(course.getCourseName());
//                四个字段没有
//                xxkcDto.setKcSourseid(kc.getXxkcSourseid());
//                xxkcDto.setKcKindid(kc.getXxkcKindid());
//                xxkcDto.setKcSourse(kc.getXxkcSourse());
//                xxkcDto.setKcKind(kc.getXxkcKind());
                xxkcDto.setKcAcademicyear(kc.getTeachtaskAcademicyear()+"");
                xxkcDto.setKcAcademicterm(kc.getTeachtaskAcademicterm()+"");
                xxkcDto.setKcStarttime(kc.getTeachtaskStarttime()+"");
                xxkcDto.setKcEndtime(kc.getTeachtaskEndtime()+"");


                Teacher teacher = teacherMapper.selectByPrimaryKey(kc.getTeacherId());
                xxkcDto.setKcTeacher(teacher.getTeacherName()+"");


                xxkcDto.setKcCredit(course.getCourseCredit()+"");
                xxkcDto.setKcLearnHours(course.getCourseTheoryhours()+"");
                xxkcDto.setKcNumlimit(kc.getTeachtaskNumlimit()+"");
                xxkcDto.setKcMaxlimit(kc.getTeachtaskMaxnum()+"");
                xxkcDto.setKcSelnum(kc.getTeachtaskSelnum()+"");
                xxkcDto.setKcIsrank(kc.getTeachtaskIsrank()+"");
                xxkcDto.setKcIseveryweek(kc.getTeachtaskIseveryweek()+"");

                xxkcDto.setKcClassid(kc.getClassId());


            }
            String keyword = (String) queryObj.get("keyword");
            if( !(keyword == null || keyword.equals(""))  ){
                log.info("方法：获取学生选课数据。查询keyword为{}的网课课程", keyword);
                if(!xxkcDto.getKcName().contains(keyword))
                    continue;
            }



            String teachtaskAcademicyear = (String) queryObj.get("teachtaskAcademicyear");
            if( !(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))  ){
                log.info("方法：获取学生选课数据。查询学年为{}的网课课程", teachtaskAcademicyear);
                if(!xxkcDto.getKcAcademicyear().equals(teachtaskAcademicyear))
                    continue;
            }

            String teachtaskAcademicterm = (String) queryObj.get("teachtaskAcademicterm");
            if( !(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))  ){
                log.info("方法：获取学生选课数据。查询学期为{}的网课课程", teachtaskAcademicterm);
                if(!xxkcDto.getKcAcademicterm().equals(teachtaskAcademicterm))
                    continue;
            }

            String teachtaskStarttime = (String) queryObj.get("teachtaskStarttime");
            if( !(teachtaskStarttime == null || teachtaskStarttime.equals(""))  ){
                log.info("方法：获取学生选课数据。查询开始周数为{}的网课课程", teachtaskStarttime);
                if(!xxkcDto.getKcStarttime().equals(teachtaskStarttime))
                    continue;
            }

            String teachtaskEndtime = (String) queryObj.get("teachtaskEndtime");
            if( !(teachtaskEndtime == null || teachtaskEndtime.equals(""))  ){
                log.info("方法：获取学生选课数据。查询结课周数为{}的网课课程", teachtaskEndtime);
                if(!xxkcDto.getKcEndtime().equals(teachtaskEndtime))
                    continue;
            }

            resArr.add(xxkcDto);

        }
        if (resArr == null) {
            log.info("方法：获取学生选课数据。未获取学生选课数据列表");
            resHashMap.put(18000,"获取学生选课数据或列表为空！" );
        } else {
            resHashMap.put(20000,resArr);

        }
        return resHashMap;

    }


}
