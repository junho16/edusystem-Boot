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

    public static String getTip(int index) {
        switch (index) {
            case 1:
                return TipKind.Tip1.getName();
            case 2:
                return TipKind.Tip2.getName();
            case 3:
                return TipKind.Tip3.getName();
            case 4:
                return TipKind.Tip4.getName();
            case 5:
                return TipKind.Tip5.getName();
            case 6:
                return TipKind.Tip6.getName();
            case 7:
                return TipKind.Tip7.getName();
            case 8:
                return TipKind.Tip8.getName();
            case 9:
                return TipKind.Tip9.getName();
            case 10:
                return TipKind.Tip10.getName();
            case 11:
                return TipKind.Tip11.getName();
            case 12:
                return TipKind.Tip12.getName();
            case 13:
                return TipKind.Tip13.getName();
            case 14:
                return TipKind.Tip14.getName();

            default:
                return null;
        }
    }
}
