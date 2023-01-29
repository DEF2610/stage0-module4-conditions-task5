package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year){
            case 2000,2004,2008,2012,2016,2020,2024,2028,2032,2040,2044,2048,2052,2056,2060:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
        }
    }
}
