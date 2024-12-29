package Enums;
public class Main {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(Day.MUNDAY);
        Day day = Day.MUNDAY;
        int ordinal = day.ordinal();
        System.out.println(ordinal);
        Day[] values = Day.values();
        for(Day a:values){
            System.out.println(a);
        }
        System.out.println(Day.MUNDAY.getLower());

        String res=switch (day){
            case SUNDAY-> "sunday";
            case MUNDAY -> "aaj hai munday";
            case TUESDAY -> null;
            case WEDNESDAY -> null;
            case THRUSDAY -> null;
            case FRIDAY -> null;
            case SATURDAY -> null;
            default -> "hatt sala";
        };

        System.out.println(res);
    }
}
