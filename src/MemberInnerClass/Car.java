package MemberInnerClass;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }
    class Engine{
        public void start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println("engine started");
            }else{
                System.out.println("engine is already on");
            }
        }      public  void stop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println("ENgine turned off");
            }else{
                System.out.println("engine is already off");
            }
        }
    }


}
