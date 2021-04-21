package com.edusystem.enums;

/**
 * @author 花菜
 * @date 2021/4/19 11:16
 */
public enum xxkcKind {

    Kind1("中华文化与历史传承", 1),
    Kind2("自然、科学与科技", 2),
    Kind3("社会热点与世界视野", 3),
    Kind4("自我认知与人生发展", 4),
    Kind5("经济管理与法律基础", 5),
    Kind6("文学修养与艺术鉴赏", 6);

    private String name ;
    private int index ;

    private xxkcKind( String name , int index ){
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


//    showKinds:[{
//        label:"中华文化与历史传承",
//                value:"1"
//    },{
//        label:"自然、科学与科技",
//                value:"2"
//    },{
//        label:"社会热点与世界视野",
//                value:"3"
//    },{
//        label:"自我认知与人生发展",
//                value:"4"
//    },{
//        label:"经济管理与法律基础",
//                value:"5"
//    },{
//        label:"文学修养与艺术鉴赏",
//                value:"6"
//    }],


}
