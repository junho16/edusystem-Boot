//package com.edusystem.util;
//
//import com.edusystem.entity.Teacher;
//import com.edusystem.service.Impl.MailServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
///**
// * @author 花菜
// * @date 2021/5/10 21:18
// */
//public class SendMailUtil  implements Runnable {
//
//    @Autowired
//    MailServiceImpl mailService;
//
//    private List<Teacher> teacherList;
//
//    @Override
//    public void run() {
//        MailServiceImpl mailService = new MailServiceImpl();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        for(Teacher t : teacherList ){
//            //发邮件
//            String to = t.getTeacherEmail();
//            System.out.println(to);
//            System.out.println(t.toString());
//            mailService.send(to, "听课通知", "您最近有一场教学质量管理任务，请提前准备！时间：" + sdf.format(new Date()));
//        }
//    }
//
//    public List<Teacher> getTeacherList() {
//        return teacherList;
//    }
//
//    public void setTeacherList(List<Teacher> teacherList) {
//        this.teacherList = teacherList;
//    }
//
//    public SendMailUtil(  List<Teacher> teacherList) {
//        this.teacherList = teacherList;
//    }
//}
