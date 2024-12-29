package MemberInnerClass;

public class Engine {
    private Car2 car2;
    public Engine(Car2 car){
        this.car2=car;
    }

    public Car2 getCar2() {
        return car2;
    }

    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }
    public void start(){
        if(!car2.isEngineOn()){
            car2.setEngineOn();
            System.out.println(this.getCar2().getModel()+"engine start");
        }
        else{
            System.out.println(this.getCar2().getModel()+"engine is alredy start");
        }
    }
    public void stop(){
        if(car2.isEngineOn()){
            car2.setEngineOff();
            System.out.println(this.getCar2().getModel()+"engine is stoped");
        }
        else{
            System.out.println(this.getCar2().getModel()+"engine is already stop");
        }
    }

}
