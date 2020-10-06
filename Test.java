package cn.itcast.day01.demo06;

public class Test {
    public static void main(String[] args) {
        CPU cPU = new CPU(2600,"古力娜扎的i5",2.5);
        cPU.setFactory("AMD");
        HardDisk hardDisk =new HardDisk(512,"长方体",110.0);
        hardDisk.setID("5555555555");
        PC pc =new PC(cPU);
        pc.sethardDisk(hardDisk);
        pc.show();
    }
}
