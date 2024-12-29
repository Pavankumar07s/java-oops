package MemberInnerClass;

public class Car2 {
    private String model;
    private boolean isEngineOn;

    public Car2(String model){
        this.model=model;
        this.isEngineOn=false;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn() {
        isEngineOn = true;
    }
    public void setEngineOff() {
        isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
