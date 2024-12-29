package StaticInnerClass;

public class Computer {
    private String name;

    public Computer(String name, String model, String os) {
        this.name = name;
        this.model = model;
        this.os = String.valueOf(new operatingSystem(os));
    }

    private String model;

    private String os;
    static public class Pendrive{
        private String model;
        public Pendrive(String model) {
            this.model = model;
        }
        

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(operatingSystem os) {
        this.os = String.valueOf(os);
    }
    class operatingSystem{

        private String osName;

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public operatingSystem(String osName) {
            this.osName = osName;
        }
    }
}
