package cn.itcast.day01.demo06;

public class CPU {
    private int speed;
    private String name;
    private double hertz;
    private String factory;
    CPU(){
    }
    CPU(int speed, String name, double hertz) {
        setSpeed(speed);
        setName(name);
        setHertz(hertz);
    }
    CPU(String factory){
        setFactory(factory);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name instanceof String){
            this.name=name;
        }
    }

    public double getHertz() {
        return hertz;
    }

    public void setHertz(double hertz) {
        if (hertz > 2.4 && hertz <4.0) {
            this.hertz = hertz;
        }
        else {
            System.out.println("hertz过高");
        }
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        if (factory == "AMD"){
            this.factory=factory;
        }
        else {
            System.out.println("请输入正确的厂家");
        }

    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 3500 && speed > 2000){
            this.speed=speed;
        }
        else{
            System.out.println("您的cpu无了!!!");
        }
    }

}
