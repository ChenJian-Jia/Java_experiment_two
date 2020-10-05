package cn.itcast.day01.demo06;

public class PC {
    private CPU cPU;
    private HardDisk hardDisk;
    PC(CPU cPU){
        setcPU(cPU);
    }
    PC(HardDisk hardDisk){
        sethardDisk(hardDisk);
    }
    public void setcPU(CPU cPU) {
        this.cPU = cPU;
    }
    public void sethardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void show(){
        System.out.println("cpu的速度为："+cPU.getSpeed());
        System.out.println("cpu的名字为："+cPU.getName());
        System.out.println("cpu的赫兹为："+cPU.getHertz());
        System.out.println("cpu的厂家为："+cPU.getFactory());
        System.out.println("硬盘的容量为："+hardDisk.getAmount());
        System.out.println("硬盘的形状为："+hardDisk.getShape());
        System.out.println("硬盘的尺寸为："+hardDisk.getSize());
        System.out.println("硬盘的身份序号为："+hardDisk.getID());
    }
}
