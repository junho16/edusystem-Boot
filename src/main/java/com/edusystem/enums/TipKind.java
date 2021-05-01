package com.edusystem.enums;

public enum TipKind {
    Tip1("学生-你已被添加到XX学院XX班级", 1),

    Tip2("学生-你已选择XX校外选修课程", 2),
    Tip3("学生-你已选择XX校内素质拓展课程", 3),
    Tip4("学生-你已选择XX课程（校内非素质拓展课程）", 4),

    Tip5("教师-你已提交教师教学质量管理的记录", 5),
    Tip6("教师-你已修改教师教学质量管理的记录", 6),

    Tip7("教师-你已提交教授XX课程的申请", 7),
    Tip8("教师-你提交对XX课程的教授申请已被通过", 8),
    Tip9("教师-你提交对XX课程的教授申请已被拒绝", 9),


    Tip10("留言-你在XX时间收到XX发来的留言", 10),
    Tip11("留言-你在XX时间收到了XX发来的留言回复", 11),
    Tip12("留言-你在XX时间确认收到XX发来的留言", 12),
    Tip13("留言-你在XX时间转发了XX发来的留言", 13),
    Tip14("留言-你在XX时间回复了XX发来的留言", 14);


    private String name ;
    private int index ;

    private TipKind(String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
