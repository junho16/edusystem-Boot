package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Teachtask;
import com.edusystem.entity.Tk;
import com.edusystem.entity.TkWithBLOBs;
import com.edusystem.mapper.TeachtaskMapper;
import com.edusystem.mapper.TkMapper;
import com.edusystem.service.TkService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/24 17:15
 */
@Service
@Slf4j
public class TkServiceImpl implements TkService {
    @Autowired
    TkMapper tkMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Override
    public HashMap createTkRecord(Map datamap, String token) {
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String tk_tkjsid = verify.getClaim("username").asString();

        String tk_id = (String) data.get("tk_id");
        String tk_classes = (String) data.get("tk_classes");
        String tk_content = (String) data.get("tk_content");
        String tk_content_short = (String)  data.get("tk_content_short");
        String tk_date = (String) data.get("tk_date");
        String tk_jc = (String) data.get("tk_jc");
        Integer tk_rate = (Integer) data.get("tk_rate");
        String tk_tags = (String) data.get("tk_tags");
        String tk_judge = (String) data.get("tk_judge");


        String tk_teachtaskid = (String) data.get("tk_teachtaskid");

        Teachtask teachtask = teachtaskMapper.selectByPrimaryKey(tk_teachtaskid);
        String tk_btkjsid = teachtask.getTeacherId();

        String tk_title = (String) data.get("tk_title");

        TkWithBLOBs tk = new TkWithBLOBs();
        tk.setTkId(tk_id);
        tk.setTkClasses(tk_classes);
        tk.setTkComments(tk_content);

        try {
            tk.setTkTime(DateUtil.getDateWithStr(tk_date));
        } catch (ParseException e) {
            log.error("方法：新增听课记录信息。字符串转Date类型失败！");
            e.printStackTrace();
        }

        tk.setTkJc(tk_jc);
        tk.setTkContentShort(tk_content_short);
        tk.setTkScore( tk_rate);
        tk.setTkTitle(tk_title);
        tk.setTkTkjsid(tk_tkjsid);
        tk.setTkBtkjsid(tk_btkjsid);
        tk.setTeachtaskId(tk_teachtaskid);
        tk.setTkTags(tk_tags);
        tk.setTkJudge(tk_judge);


        int ress = tkMapper.insertSelective(tk);

        if(ress >= 1)
            res.put(20000,"新增听课记录信息成功！");
        else
            res.put(18000,"新增听课记录信息失败！服务器内部错误！");
        return res;
    }
}
