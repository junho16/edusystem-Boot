package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.enums.GetEunm;
import com.edusystem.mapper.CollegeMapper;
import com.edusystem.mapper.CourseMapper;
import com.edusystem.mapper.TeachtaskMapper;
import com.edusystem.mapper.XxkcMapper;
import com.edusystem.service.XxkcService;
import com.edusystem.util.JWTUtils;
import com.github.pagehelper.PageHelper;
import javafx.scene.shape.Circle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/19 13:50
 */
@Slf4j
@Service
public class XxkcServiceImpl implements XxkcService {

    @Autowired
    XxkcMapper xxkcMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    CourseMapper courseMapper;

    @Override
    public HashMap fetchXXKCList(int pageNum, int limit, Map query, String token) {
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));

        HashMap hashMap = new HashMap();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        log.info("方法：获取选修课程列表。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取选修课程列表。用户信息==》角色: userrole=>{}", loginrole);
        log.info("方法：获取选修课程列表。查询第{}页", pageNum);
        log.info("方法：获取选修课程列表。查询1页{}项", limit);

        //查询出所有信息==>前端已经根据角色显示其可以选择的班级 学院等选项
        XxkcExample example = new XxkcExample();
        XxkcExample.Criteria criteria = example.createCriteria();
        criteria.andXxkcIdIsNotNull();

        String keyword = (String) queryObj.get("keyword");
        if (!(keyword == null || keyword.equals(""))) {
            log.info("方法：获取选修课程列表。查询课程关键字为{}的选修课程列表", keyword);
            criteria.andXxkcNameLike( "%"+(keyword)+"%" );
        }

        String teachtaskGradelimit = (String) queryObj.get("teachtaskGradelimit");
        if (!(teachtaskGradelimit == null || teachtaskGradelimit.equals(""))) {
            log.info("方法：获取选修课程列表。查询年级为{}的选修课程列表", teachtaskGradelimit);
            criteria.andXxkcGradelimitEqualTo( (teachtaskGradelimit) );
        }

        String teachtaskAcademicyear = (String) queryObj.get("teachtaskAcademicyear");
        if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
            log.info("方法：获取选修课程列表。查询学年为{}的选修课程列表", teachtaskAcademicyear);
            criteria.andXxkcAcademicyearEqualTo( Integer.parseInt(teachtaskAcademicyear) );
        }
        String teachtaskAcademicterm = (String) queryObj.get("teachtaskAcademicterm");
        if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
            log.info("方法：获取选修课程列表。查询学期为{}的选修课程列表", teachtaskAcademicterm);
            criteria.andXxkcAcademictermEqualTo( Integer.parseInt(teachtaskAcademicterm) );
        }
        String teachtaskStarttime = (String) queryObj.get("teachtaskStarttime");
        if (!(teachtaskStarttime == null || teachtaskStarttime.equals(""))) {
            log.info("方法：获取选修课程列表。查询课程开始周数为{}的选修课程列表", teachtaskStarttime);
            criteria.andXxkcStarttimeEqualTo( Integer.parseInt(teachtaskStarttime) );
        }
        String teachtaskEndtime = (String) queryObj.get("teachtaskEndtime");
        if (!(teachtaskEndtime == null || teachtaskEndtime.equals(""))) {
            log.info("方法：获取选修课程列表。查询课程结束周数为{}的选修课程列表", teachtaskEndtime);
            criteria.andXxkcEndtimeEqualTo( Integer.parseInt(teachtaskEndtime) );
        }

        String sourse = (String) queryObj.get("sourse");
        if (!(sourse == null || sourse.equals(""))) {
            log.info("方法：获取选修课程列表。查询来源id为{}的选修课程列表", sourse);
            criteria.andXxkcSourseidEqualTo( sourse );
        }
        String kinds = (String) queryObj.get("kinds");
        if (!(kinds == null || kinds.equals(""))) {
            log.info("方法：获取选修课程列表。查询分类id为{}的选修课程列表", kinds);
            criteria.andXxkcKindidEqualTo( kinds );
        }




        ArrayList a= (ArrayList) xxkcMapper.selectByExample(example);
        int total = a.size();


        PageHelper.startPage(pageNum, limit);
        ArrayList<Teachtask> resitem = (ArrayList) xxkcMapper.selectByExample(example);
//        for(int j = 0 ;  j < resitem.size() ; j++){
//            //需要新增其课程名称与课程所属院系
//            Course c = courseMapper.selectByPrimaryKey(resitem.get(j).getCourseId());
//            Teacher t = teacherMapper.selectByPrimaryKey(resitem.get(j).getTeacherId());
//            resitem.get(j).setCourseName(c.getCourseName());
//            resitem.get(j).setCollegeId(c.getCollegeId());
//            resitem.get(j).setCollegeName(c.getCollegeName());
//            resitem.get(j).setTeacherName(t.getTeacherName());
//        }

        if (resitem == null) {
            log.info("方法：获取选修课程列表。未查询到信息");
            return null;
        } else {
            hashMap.put("total", total);
            hashMap.put("data", resitem);

        }
        return hashMap;
    }

    /**
     * 获取校内素质拓展课程 （选修课程）信息
     * 此方法是查询本学年的 以供给学生进行选课（和校外网课一起选的）
     * @param pageNum
     * @param limit
     * @param query
     * @param token
     * @return
     */
    @Override
    public HashMap fetchSZKCList(int pageNum, int limit, Map query, String token) {
        HashMap hashMap = new HashMap();
        try{
            DecodedJWT verify = JWTUtils.verify(token);
            String username = verify.getClaim("username").asString();
            String loginrole = verify.getClaim("loginrole").asString();

            log.info("方法：获取校内素质选修课程列表。用户信息==》账号: userId=>{}", username);
            log.info("方法：获取校内素质选修课程列表。用户信息==》角色: userrole=>{}", loginrole);
            log.info("方法：获取校内素质选修课程列表。查询第{}页", pageNum);
            log.info("方法：获取校内素质选修课程列表。查询1页{}项", limit);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            String year = sdf.format(new Date());
            log.info("方法：获取校内素质选修课程列表。查询{}-{}学年范围", Integer.parseInt(year)-1  ,  Integer.parseInt(year));
            //素质拓展课应该是本学年的可以选择
            TeachtaskExample teachtaskExample = new TeachtaskExample();
            TeachtaskExample.Criteria criteria = teachtaskExample.createCriteria();
            criteria.andProfessionIdIsNull();
            criteria.andClassIdIsNull();
            criteria.andTeachtaskAcademicyearBetween(Integer.parseInt(year)-1 , Integer.parseInt(year));

            List<Teachtask> teachtaskList = teachtaskMapper.selectByExample(teachtaskExample);
            for(Teachtask t : teachtaskList){
                //需要新增其课程名称与课程所属院系
                Course c = courseMapper.selectByPrimaryKey(t.getCourseId());
                t.setCollegeName(c.getCollegeName());
                t.setCourseName(c.getCourseName());
                t.setCredit(c.getCourseCredit());
            }
            hashMap.put("data", teachtaskList);
            return hashMap;
        }catch (Exception e){
            e.printStackTrace();
            log.error("方法：获取校内素质选修课程列表失败");
            return null;
        }
    }

    @Override
    public boolean updateXXKCInfo(JSONObject jsonObject, String token) {
        Xxkc xxkc = new Xxkc();
        xxkc.setXxkcId((String) jsonObject.get("xxkcId"));
        xxkc.setXxkcName((String) jsonObject.get("xxkcName"));

        xxkc.setXxkcAcademicterm(Integer.parseInt((String) jsonObject.get("xxkcAcademicterm")));
        xxkc.setXxkcAcademicyear(Integer.parseInt((String) jsonObject.get("xxkcAcademicyear")));
        xxkc.setXxkcCredit(Integer.parseInt((String) jsonObject.get("xxkcCredit")));
        xxkc.setXxkcEndtime(Integer.parseInt((String) jsonObject.get("xxkcEndtime")));
        xxkc.setXxkcGradelimit((String) jsonObject.get("xxkcGradelimit"));

//        xxkc.setXxkcIsrank((String) jsonObject.get("xxkcIsrank"));: 0
//        xxkc.setXxkcKind((String) jsonObject.get("xxkcKind"));
        xxkc.setXxkcKindid((String) jsonObject.get("xxkcKindid"));

        xxkc.setXxkcLearnHours(Integer.parseInt((String) jsonObject.get("xxkcLearnHours")));
        xxkc.setXxkcMaxlimit(Integer.parseInt((String) jsonObject.get("xxkcMaxlimit")));
        xxkc.setXxkcName((String) jsonObject.get("xxkcName"));
        xxkc.setXxkcNumlimit(Integer.parseInt((String) jsonObject.get("xxkcNumlimit")));
//        xxkc.setXxkcRemaerk((String) jsonObject.get("xxkcId"));: null
        xxkc.setXxkcSelnum(Integer.parseInt((String) jsonObject.get("xxkcSelnum")));
//        xxkc.setXxkcSourse((String) jsonObject.get("xxkcSourse"));
        xxkc.setXxkcSourseid((String) jsonObject.get("xxkcSourseid"));
        xxkc.setXxkcStarttime(Integer.parseInt((String) jsonObject.get("xxkcStarttime")));


        xxkc.setXxkcSourse(GetEunm.getSourse(Integer.parseInt((String) jsonObject.get("xxkcSourseid"))));
        xxkc.setXxkcKind(GetEunm.getKind(Integer.parseInt((String) jsonObject.get("xxkcKindid"))));





        int res = xxkcMapper.updateByPrimaryKeySelective(xxkc);
        return res>=1? true:false;
    }

    @Override
    public HashMap<Integer, String> createXXKCInfo(JSONObject jsonObject, String token) {
        HashMap<Integer,String> res = new HashMap<>();

        Xxkc xxkc = new Xxkc();

        xxkc.setXxkcId((UUID.randomUUID().toString().substring(0,8)));

        xxkc.setXxkcName((String) jsonObject.get("xxkcName"));

        xxkc.setXxkcAcademicterm(Integer.parseInt((String) jsonObject.get("xxkcAcademicterm")));
        xxkc.setXxkcAcademicyear(Integer.parseInt((String) jsonObject.get("xxkcAcademicyear")));
        xxkc.setXxkcCredit(Integer.parseInt((String) jsonObject.get("xxkcCredit")));
        xxkc.setXxkcEndtime(Integer.parseInt((String) jsonObject.get("xxkcEndtime")));
        xxkc.setXxkcGradelimit((String) jsonObject.get("xxkcGradelimit"));

//        xxkc.setXxkcIsrank((String) jsonObject.get("xxkcIsrank"));: 0
//        xxkc.setXxkcKind((String) jsonObject.get("xxkcKind"));
        xxkc.setXxkcKindid((String) jsonObject.get("xxkcKindid"));

        xxkc.setXxkcLearnHours(Integer.parseInt((String) jsonObject.get("xxkcLearnHours")));
        xxkc.setXxkcMaxlimit(Integer.parseInt((String) jsonObject.get("xxkcMaxlimit")));
        xxkc.setXxkcName((String) jsonObject.get("xxkcName"));
        xxkc.setXxkcNumlimit(Integer.parseInt((String) jsonObject.get("xxkcNumlimit")));
//        xxkc.setXxkcRemaerk((String) jsonObject.get("xxkcId"));: null
        xxkc.setXxkcSelnum(Integer.parseInt((String) jsonObject.get("xxkcSelnum")));
//        xxkc.setXxkcSourse((String) jsonObject.get("xxkcSourse"));
        xxkc.setXxkcSourseid((String) jsonObject.get("xxkcSourseid"));
        xxkc.setXxkcStarttime(Integer.parseInt((String) jsonObject.get("xxkcStarttime")));

        xxkc.setXxkcSourse(GetEunm.getSourse(Integer.parseInt((String) jsonObject.get("xxkcSourseid"))));
        xxkc.setXxkcKind(GetEunm.getKind(Integer.parseInt((String) jsonObject.get("xxkcKindid"))));



        int ress = xxkcMapper.insertSelective(xxkc);

        if(ress >= 1)
            res.put(20000,"新增网课信息成功！");
        else
            res.put(18000,"新增网课信息失败！服务器内部错误！");
        return res;
    }

    @Override
    public boolean deleteXXKCInfo(String id) {
        int res = xxkcMapper.deleteByPrimaryKey(id);
        return res>=1?true:false;
    }









}
