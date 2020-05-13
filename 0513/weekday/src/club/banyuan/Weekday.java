package club.banyuan;


//使用周一到周天新建一个Weekday的公共枚举类
//枚举要有实例方法boolean isWeekday()和boolean isHoliday();
//isHoliday 应该返回与isWeekday相反的返回值

public enum Weekday {
    MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");

    private final String weekday;

    Weekday(String weekday){
        this.weekday = weekday;
    }

    public boolean isHoliday(){
        return this.equals(SATURDAY)||this.equals(SUNDAY);
    }
    public boolean isWeekday(){
        return !(isHoliday());
    }

    @Override
    public String toString() {
        return "Weekday{" +
                "weekday='" + weekday + '\'' +
                '}';
    }
}
