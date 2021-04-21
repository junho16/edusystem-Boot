package com.edusystem.Controller;

import com.alibaba.fastjson.JSONObject;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.StudentServiceImpl;
import com.edusystem.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/3 15:43
 */
@Slf4j
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    /**
     * 返回格式
     * http://localhost:9528/dev-api/vue-element-admin/article/list?page=1&limit=20&sort=%2Bid
     *{
     *     "code": 20000,
     *     "data":[ {
     *         "classid":"172021",
     *         "total": 100,
     *         "items": [
     *             {
     *                 "id": 100,
     *                 "timestamp": 1028834736411,
     *                 "author": "Sarah",
     *                 "reviewer": "Kevin",
     *                 "title": "Euei Hgotsf Rmodxdq Aurdwu Tgjmu Zdfk Fhiutvxvsn Rtecwf Gdslbdp",
     *                 "content_short": "mock data",
     *                 "content": "<p>I am testing data, I am testing data.</p><p><img src=\"https://wpimg.wallstcn.com/4c69009c-0fd4-4153-b112-6cb53d1cf943\"></p>",
     *                 "forecast": 93.15,
     *                 "importance": 2,
     *                 "type": "JP",
     *                 "status": "draft",
     *                 "display_time": "1979-02-15 22:20:34",
     *                 "comment_disabled": true,
     *                 "pageviews": 563,
     *                 "image_uri": "https://wpimg.wallstcn.com/e4558086-631c-425c-9430-56ffb46e70b3",
     *                 "platforms": [
     *                     "a-platform"
     *                 ]
     *             }
     *         ]
     *     } ]
     * }
     * {"code":20000,"data":{"total":100,"items":[]}}
     * {"code":60204,"message":"error, has not data."}
     * @param @RequestParam HashMap query,@RequestParam String token
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public MyResponse studentList(@RequestParam Map query, @RequestParam String token) {
        /**
         * 请求参数==》格式 map有两个值
             2
             query={"page":1,"limit":20,"sort":"+id"}
             token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2d
         */
        JSONObject  queryObj = JSONObject.parseObject((String) query.get("query"));
        String mytoken = ((String) query.get("token"));
        boolean isHasAll = CommonUtil.hasAllRequired(queryObj,"page,limit");
        /**
         * TODO-这里不知道为什么 获取的token变成了双份==》eg：token为123 此处参数token打印出123,123。初步判断是因为map里有token字段了
         */
        log.info("方法：获取学生列表。当前token为{}",token);
        log.info("方法：获取学生列表。当前mytoken为{}",mytoken);
        MyResponse result ;
        if(isHasAll){
            HashMap res = studentService.getStudentListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,mytoken);
//            ArrayList students = studentService.getStudentListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),token);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }else{
            result = new MyResponse(MyResponse.Fail_CODE,"参数错误！可能是缺失参数或后台接收参数错误！");
        }
        return result;
    }

    @PostMapping("/update")
    @ResponseBody
    public MyResponse updateStudentInfo(@RequestParam String data, @RequestParam String token) {
        /**
         * 请求参数==》格式
         * {
         *     "studentId": "333333",
         *     "studentIdnumber": "33333333",
         *     "collegeId": "1",
         *     "classId": "172021",
         *     "studentName": "王豪图",
         *     "studentGender": "17",
         *     "studentAge": 21,
         *     "studentPsd": "333333",
         *     "studentBirthday": "2021-04-05T09:54:21.000Z",
         *     "studentRoomid": "27-707",
         *     "studentEthnic": "藏族",
         *     "studentRxrq": "2017",
         *     "studentHometown": null,
         *     "studentAddress": null,
         *     "studentEmail": "3",
         *     "studentPhone": null,
         *     "studentXgbz": null,
         *     "studentPic": "http://m.qpic.cn/psc?/V545Fi2B3ZX6uf2jmOrM0jJkaz4OqBvd/45NBuzDIW489QBoVep5mcdFxf.B*O85st7QQII.snPtkNAPclX3L1mqXS6TlrtTIH34WFkkQzz41RWwY3RYC9bfxhEBIVaQda85wJbcFnHE!/b&bo=LAEsAQAAAAABFzA!&rf=viewer_4",
         *     "timestamp": null,
         * }
         */
        JSONObject stuUpdateData = JSONObject.parseObject(data);
        log.info("方法：更新学生信息。当前token为{}",token);
        MyResponse result;
        Boolean res = studentService.updateStudentInfo(stuUpdateData,token);
        result = res?
                new MyResponse(MyResponse.SUCCESS_CODE,"update student info success!"):
                new MyResponse(MyResponse.Fail_CODE,"update student info fail!");
        return result;
    }

    @PostMapping("/create")
    @ResponseBody
    public MyResponse createStudentInfo(@RequestParam String data, @RequestParam String token) {
        /**
         * 请求参数==》格式
         * data: {
         *     "studentId": "1",
         *     "studentIdnumber": "1",
         *     "collegeId": "1",
         *     "classId": "172031",
         *     "studentName": "1",
         *     "studentGender": "男",
         *     "studentAge": "",
         *     "studentPsd": "",
         *     "studentBirthday": "2021-04-06 13:32:46",
         *     "studentRoomid": "1",
         *     "studentEthnic": "汉族",
         *     "studentRxrq": "2021-04-06 13:32:50",
         *     "studentHometown": "",
         *     "studentAddress": "",
         *     "studentEmail": "1",
         *     "studentPhone": "",
         *     "studentXgbz": "",
         *     "studentPic": ""
         * }
         */
        JSONObject stuCreateData = JSONObject.parseObject(data);
        log.info("方法：新增学生信息。当前token为{}",token);
        MyResponse result;
        HashMap res = studentService.createStudentInfo(stuCreateData,token);
        String flag = (String) res.get(20000);
        result = flag!=null?
                new MyResponse(MyResponse.SUCCESS_CODE,(String) res.get(20000)):
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000));
        return result;
    }


    @PostMapping("/delete")
    @ResponseBody
    public MyResponse deleteStudentInfo(@RequestParam String studentId, @RequestParam String token) {
        /**
         * 请求参数==》格式
         * id:XXX token:XXX
         */
        log.info("方法：删除学生信息。当前token为{}",token);
        log.info("方法：删除学生信息。删除学号为 {} 的学生",studentId);
        MyResponse result;
        boolean res = studentService.deleteStudentInfo(studentId);
        result = res?
                new MyResponse(MyResponse.SUCCESS_CODE,"delete student info success!"):
                new MyResponse(MyResponse.Fail_CODE,"delete student info fail!");
        return result;
    }

    /**
     * 获取考研就业满意度用以展示
     * 返回格式
     * {
     * 	"code": 20000,
     * 	"data": [{
     * 		"classid": "172021",
     * 		"total": 100,
     * 	  	"ky":50,
     * 	  	"jy":50,
     * 	  	"myd":70
     *   }]
     * }
     * {"code":20000,"data":{"total":100,"items":[]}}
     * {"code":60204,"message":"error, has not data."}
     * @param token
     * @return
     */
    @GetMapping("/kyjymyd")
    @ResponseBody
    public MyResponse getKyjymydData(@RequestParam String token) {

        log.info("方法：获取考研就业满意度。当前token为{}",token);
        MyResponse result;

        ArrayList arrayList = studentService.getKyjymydData(token);
        try{
            if(arrayList != null)
                result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",arrayList);
            else
                result = new MyResponse(MyResponse.Fail_CODE,"error, 未查询到考研就业满意度数据");
        }catch (Exception e){
            log.error("方法：获取考研就业满意度失败。错误为{}",e);
            result = new MyResponse(MyResponse.Fail_CODE,"获取考研就业满意度失败，出现内部错误！");
        }
        return result;
    }

    /**
     * 获取考研就业满意度用以展示
     * 返回格式
     * {
     * 	"code": 20000,
     * 	"data": [{
     * 		"year": "2017",
     * 		"stuTotal": 100,
     * 		"kySum": 50,
     * 		"jySum": 50
     *   }]
     * }
     * {"code":20000,"data":{"total":100,"items":[]}}
     * {"code":60204,"message":"error, has not data."}
     * @param token
     * @return
     */
    @GetMapping("/snkyjy")
    @ResponseBody
    public MyResponse getSnkyjyData(@RequestParam String token) {

        log.info("方法：获取近三年考研就业人数。当前token为{}",token);
        MyResponse result;

        ArrayList arrayList = studentService.getSnkyjyData(token);
        try{
            if(arrayList != null)
                result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",arrayList);
            else
                result = new MyResponse(MyResponse.Fail_CODE,"error, 未查询到近三年考研就业人数");
        }catch (Exception e){
            log.error("方法：获取获取近三年考研就业人数失败。错误为{}",e);
            result = new MyResponse(MyResponse.Fail_CODE,"获取近三年考研就业人数失败，出现内部错误！");
        }
        return result;
    }

    /**
     * 获取考研去向用以展示
     * 返回格式
     * {
     * 	"code": 20000,
     * 	"data": ['172021','172031']
     * }
     * {"code":20000,"data":{"total":100,"items":[]}}
     * {"code":60204,"message":"error, has not data."}
     * @param token
     * @return
     */
    @GetMapping("/kyqx")
    @ResponseBody
    public MyResponse getKyqxData(@RequestParam String token , @RequestParam String classid) {

        log.info("方法：根据班级id获取考研去向详情。当前token为{}",token);
        log.info("方法：根据班级id获取考研去向详情。获取班级id为{}的班级考研去向",classid);
        MyResponse result;

        HashMap res = studentService.getKyqxData(token,classid);
        try{
            if(res != null)
                result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
            else
                result = new MyResponse(MyResponse.Fail_CODE,"error, 未查询到考研去向详情");
        }catch (Exception e){
            log.error("方法：根据班级id获取考研去向详情失败。错误为{}",e);
            result = new MyResponse(MyResponse.Fail_CODE,"获取考研去向详情失败，出现内部错误！");
        }
        return result;
    }


    /**
     * 获取就业去向用以展示
     * 返回格式
     * {
     * 	"code": 20000,
     * 	"data": ['172021','172031']
     * }
     * {"code":20000,"data":{"total":100,"items":[]}}
     * {"code":60204,"message":"error, has not data."}
     * @param token
     * @return
     */
    @GetMapping("/jyqx")
    @ResponseBody
    public MyResponse getJyqxData(@RequestParam String token , @RequestParam String classid) {

        log.info("方法：根据班级id获取就业去向详情。当前token为{}",token);
        log.info("方法：根据班级id获取就业去向详情。获取班级id为{}的班级就业去向",classid);
        MyResponse result;

        HashMap res = studentService.getJyqxData(token,classid);
        try{
            if(res != null)
                result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
            else
                result = new MyResponse(MyResponse.Fail_CODE,"error, 未查询到就业去向详情");
        }catch (Exception e){
            log.error("方法：根据班级id获取就业去向详情失败。错误为{}",e);
            result = new MyResponse(MyResponse.Fail_CODE,"获取就业去向详情失败，出现内部错误！");
        }
        return result;
    }



    /**
     * 获取当前用户角色可以查看的班级列表 用以选择
     * 返回格式
     * {
     * 	"code": 20000,
     * 	"data": ['172021','172031']
     * }
     * {"code":20000,"data":{"total":100,"items":[]}}
     * {"code":60204,"message":"error, has not data."}
     * @param token
     * @return
     */
    @GetMapping("/classes")
    @ResponseBody
    public MyResponse getClasses(@RequestParam String token) {

        log.info("方法：获取当前用户角色可以查看的班级列表。当前token为{}",token);
        MyResponse result;

        ArrayList res = studentService.getClasses(token);
        try{
            if(res != null)
                result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
            else
                result = new MyResponse(MyResponse.Fail_CODE,"error, 未获取当前用户角色可以查看的班级列表详情");
        }catch (Exception e){
            log.error("方法：获取当前用户角色可以查看的班级列表详情失败。错误为{}",e);
            result = new MyResponse(MyResponse.Fail_CODE,"获取当前用户角色可以查看的班级列表失败，出现内部错误！");
        }
        return result;
    }


}
