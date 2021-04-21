package com.edusystem.enums;

/**
 * @author 花菜
 * @date 2021/4/19 16:45
 */
public class GetEunm {
    public static String getKind(int index) {
        switch (index) {
            case 1:
                return xxkcKind.Kind1.getName();
            case 2:
                return xxkcKind.Kind2.getName();
            case 3:
                return xxkcKind.Kind3.getName();
            case 4:
                return xxkcKind.Kind4.getName();
            case 5:
                return xxkcKind.Kind5.getName();
            case 6:
                return xxkcKind.Kind6.getName();
            default:
                return null;
        }
    }

    public static String getSourse(int index) {
        switch (index) {
            case 1:
                return xxkcSourse.Sourse1.getName();
            case 2:
                return xxkcSourse.Sourse2.getName();
            case 3:
                return xxkcSourse.Sourse3.getName();
            case 4:
                return xxkcSourse.Sourse4.getName();
            case 5:
                return xxkcSourse.Sourse5.getName();

            default:
                return null;
        }
    }
}
