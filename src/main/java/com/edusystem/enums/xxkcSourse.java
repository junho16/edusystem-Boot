package com.edusystem.enums;

/**
 * @author 花菜
 * @date 2021/4/19 11:17
 */
public enum  xxkcSourse {

    Sourse1("智慧树", 1),
    Sourse2("超星尔雅", 2),
    Sourse3("小木虫", 3),
    Sourse4("中国大学Mooc", 4),
    Sourse5("雨课堂", 5);

    private String name ;
    private int index ;

    private xxkcSourse( String name , int index ){
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
