package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.UserDto;
import com.edusystem.entity.Notice;
import com.edusystem.entity.NoticeExample;
import com.edusystem.mapper.NoticeMapper;
import com.edusystem.service.NoticeService;
import com.edusystem.service.UserService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/27 23:32
 */
@Service
@Slf4j
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeMapper noticeMapper;

    @Autowired
    UserService userService;

    @Override
    public HashMap getNoticeList(Map datamap, String userid) {
        HashMap<Integer,Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        try{
            NoticeExample noticeExample = new NoticeExample();
            NoticeExample.Criteria criteria  = noticeExample.createCriteria();
            noticeExample.setOrderByClause("notice_time DESC");

            String fromNoticeTime = (String)data.get("fromNoticeTime");
            if (!(fromNoticeTime == null || fromNoticeTime.equals(""))) {
                try {
                    log.info("方法：查询以户可见的留言信息。从{}开始",DateUtil.getDateWithStr(fromNoticeTime));
                    criteria.andNoticeTimeGreaterThanOrEqualTo(DateUtil.getDateWithStr(fromNoticeTime));
                } catch (ParseException e) {
                    log.error("方法：查询以户可见的留言信息。字符串转Date类型失败！");
                    e.printStackTrace();
                }
            }
            String toNoticeTime = (String)data.get("toNoticeTime");
            if (!(toNoticeTime == null || toNoticeTime.equals(""))) {
                try {
                    log.info("方法：查询以户可见的留言信息。截至至{}",DateUtil.getDateWithStr(toNoticeTime));
                    criteria.andNoticeTimeLessThanOrEqualTo(DateUtil.getDateWithStr(toNoticeTime));
                } catch (ParseException e) {
                    log.error("方法：查询以户可见的留言信息。字符串转Date类型失败！");
                    e.printStackTrace();
                }
            }
            criteria.andNoticeToidEqualTo(userid);
            criteria.andNoticePidIsNull();
            criteria.andNoticeIdIsNotNull();

//            Integer page = (Integer)data.get("page");
//            Integer limit = (Integer)data.get("limit");
            List<Notice> noticeList = noticeMapper.selectByExampleWithBLOBs(noticeExample);


            for(Notice n : noticeList){
                NoticeExample commentExample = new NoticeExample();
                NoticeExample.Criteria commentCriteria  = commentExample.createCriteria();
                commentCriteria.andNoticePidEqualTo(n.getNoticeId());
                commentExample.setOrderByClause("notice_time DESC");

                List<Notice> comments = noticeMapper.selectByExampleWithBLOBs(commentExample);
                for(Notice c : comments){
                    UserDto userDto = userService.getUserInfoWithId(c.getNoticeFromid());
                    c.setNotice_fromUserName(userDto.getUserName());
                    c.setNotice_fromUserRole(userDto.getUserRole());
                    c.setNotice_fromPic(userDto.getUserPic());
                }
                n.setNotice_comments(comments);

                UserDto userDto = userService.getUserInfoWithId(n.getNoticeFromid());
                n.setNotice_fromUserName(userDto.getUserName());
                n.setNotice_fromUserRole(userDto.getUserRole());
                n.setNotice_fromPic(userDto.getUserPic());
            }
            int total = noticeList.size();
            noticeList = PageUtil.startPage(
                    noticeList,
                    (Integer)data.get("page"),
                    (Integer)data.get("limit")
            );
            HashMap resData = new HashMap();
            resData.put("data" , noticeList);
            resData.put("total" , total);
            res.put(20000,resData);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"查询以户可见的留言信息！服务器内部错误！");
            return res;
        }
        return res;
    }

    @Override
    public HashMap getMySendNoticeList(Map datamap, String userid) {
        HashMap<Integer,Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        try{
            NoticeExample noticeExample = new NoticeExample();
            NoticeExample.Criteria criteria  = noticeExample.createCriteria();
            noticeExample.setOrderByClause("notice_time DESC");

            String fromNoticeTime = (String)data.get("fromNoticeTime");
            if (!(fromNoticeTime == null || fromNoticeTime.equals(""))) {
                try {
                    log.info("方法：查询以户可见的发起的留言信息。从{}开始",DateUtil.getDateWithStr(fromNoticeTime));
                    criteria.andNoticeTimeGreaterThanOrEqualTo(DateUtil.getDateWithStr(fromNoticeTime));
                } catch (ParseException e) {
                    log.error("方法：查询以户可见的发起的留言信息。字符串转Date类型失败！");
                    e.printStackTrace();
                }
            }
            String toNoticeTime = (String)data.get("toNoticeTime");
            if (!(toNoticeTime == null || toNoticeTime.equals(""))) {
                try {
                    log.info("方法：查询以户可见的发起的留言信息。截至至{}",DateUtil.getDateWithStr(toNoticeTime));
                    criteria.andNoticeTimeLessThanOrEqualTo(DateUtil.getDateWithStr(toNoticeTime));
                } catch (ParseException e) {
                    log.error("方法：查询以户可见的发起的留言信息。字符串转Date类型失败！");
                    e.printStackTrace();
                }
            }
            criteria.andNoticeFromidEqualTo(userid);
            criteria.andNoticePidIsNull();
            criteria.andNoticeIdIsNotNull();

//            Integer page = (Integer)data.get("page");
//            Integer limit = (Integer)data.get("limit");
            List<Notice> noticeList = noticeMapper.selectByExampleWithBLOBs(noticeExample);


            for(Notice n : noticeList){
                NoticeExample commentExample = new NoticeExample();
                NoticeExample.Criteria commentCriteria  = commentExample.createCriteria();
                commentCriteria.andNoticePidEqualTo(n.getNoticeId());
                commentExample.setOrderByClause("notice_time DESC");

                List<Notice> comments = noticeMapper.selectByExampleWithBLOBs(commentExample);
                for(Notice c : comments){
                    UserDto userDto = userService.getUserInfoWithId(c.getNoticeFromid());
                    c.setNotice_fromUserName(userDto.getUserName());
                    c.setNotice_fromUserRole(userDto.getUserRole());
                    c.setNotice_fromPic(userDto.getUserPic());
                }
                n.setNotice_comments(comments);

                UserDto userDto = userService.getUserInfoWithId(n.getNoticeFromid());
                n.setNotice_fromUserName(userDto.getUserName());
                n.setNotice_fromUserRole(userDto.getUserRole());
                n.setNotice_fromPic(userDto.getUserPic());
            }
            int total = noticeList.size();
            noticeList = PageUtil.startPage(
                    noticeList,
                    (Integer)data.get("page"),
                    (Integer)data.get("limit")
            );
            HashMap resData = new HashMap();
            resData.put("data" , noticeList);
            resData.put("total" , total);
            res.put(20000,resData);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"查询以户可见的留言信息！服务器内部错误！");
            return res;
        }
        return res;
    }


    @Override
    public HashMap createNoticeInfo(Map datamap, String token) {
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        Notice notice = new Notice();

        DecodedJWT verify = JWTUtils.verify(token);
        notice.setNoticeId(UUID.randomUUID().toString().substring(0,8));
        notice.setNoticeFromid(verify.getClaim("username").asString());
        notice.setNoticeToid((String)data.get("to_user"));
        notice.setNoticeContent((String) data.get("content"));
        notice.setNoticeTitle((String) data.get("title"));
        notice.setNoticeIsseen(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            notice.setNoticeTime(DateUtil.getDateWithStr(df.format(new Date())));
        } catch (ParseException e) {
            log.error("方法：新建留言记录。获取系统当前时间错误~");
            e.printStackTrace();
        }
        try{
            int ress = noticeMapper.insertSelective(notice);
            if(ress >= 1)
                res.put(20000,"新增留言记录信息成功！");
            else
                res.put(18000,"新增留言记录信息失败！服务器内部错误！");
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：新建留言记录。插入数据错误！");
            res.put(18000,"新增留言信息失败！服务器内部错误！");
            return res;
        }
    }

    @Override
    public HashMap createNoticeCommentInfo(Map datamap, String token) {
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        Notice notice = new Notice();
        DecodedJWT verify = JWTUtils.verify(token);
        notice.setNoticeId(UUID.randomUUID().toString().substring(0,8));

        notice.setNoticeFromid(verify.getClaim("username").asString());
        notice.setNoticeToid((String)data.get("noticeFromid"));
//        notice.setNoticeFromid(verify.getClaim("username").asString());
//        notice.setNoticeToid((String)data.get("to_user"));

        notice.setNoticeTitle("回复");
        notice.setNoticeContent((String) data.get("notice_hf"));

        notice.setNoticePid((String)data.get("noticeId"));
        notice.setNoticeIsseen(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            notice.setNoticeTime(DateUtil.getDateWithStr(df.format(new Date())));
        } catch (ParseException e) {
            log.error("方法：创建留言的回复记录。获取系统当前时间错误~");
            e.printStackTrace();
        }
        try{
            int ress = noticeMapper.insertSelective(notice);
            if(ress >= 1)
                res.put(20000,"创建留言的回复记录成功！");
            else
                res.put(18000,"创建留言的回复记录失败！服务器内部错误！");
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：创建留言的回复记录。插入数据错误！");
            res.put(18000,"创建留言的回复记录失败！服务器内部错误！");
            return res;
        }
    }

    @Override
    public HashMap updateNoticeState(String noticeid, int state) {
        HashMap<Integer,String> res = new HashMap<>();

        Notice notice = new Notice();
        notice.setNoticeId(noticeid);
        notice.setNoticeIsseen(state);
        try{
            int ress = noticeMapper.updateByPrimaryKeySelective(notice);
            if(ress >= 1)
                res.put(20000,"修改留言的查看状态成功！");
            else
                res.put(18000,"修改留言的查看状态失败！服务器内部错误！");
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：修改留言的查看状态。插入数据错误！");
            res.put(18000,"修改留言的查看状态失败！服务器内部错误！");
            return res;
        }
    }
}
