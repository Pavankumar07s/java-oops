package Enums;

public enum Day {
    SUNDAY("sunday"),
    MUNDAY("munday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THRUSDAY("Thrusday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    Day(String lower){
        System.out.println("constructor called");
        this.lower=lower;
    }

    public String getLower() {
        return lower;
    }

    public void setLower(String lower) {
        this.lower = lower;
    }

    private String lower;


    public void Display(){
        System.out.println("today is"+this.name());
    }
}
