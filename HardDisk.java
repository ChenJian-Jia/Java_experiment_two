package cn.itcast.day01.demo06;
import  java.util.Scanner;

public class HardDisk {
    private int amount;
    private String shape;
    private double size;
    private String ID;
    HardDisk(int amount,String shape,double size){
        setAmount(amount);
        setShape(shape);
        setSize(size);

    }
    HardDisk(String ID){
        setID(ID);
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        if (shape=="长方体"){
            this.shape=shape;
        }
        else{
            System.out.println("我这里只有这两种形状，哈哈哈哈！");
        }
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        if(size>100 && size<1000){
            this.size = size;
        }
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        if(ID.length()>5 && ID.length() <20){
            this.ID=ID;
        }
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount) {
        if(amount > 16 && amount  <2048){
            this.amount = amount;
        }
        else{
            System.out.println("容量整不对劲啊！！！");
        }
    }
}
