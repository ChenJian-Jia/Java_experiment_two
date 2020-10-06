# Java_experiment_two
计191_贾忱健_2019310177_实验二
# 一、实验目的：
### 学会创建和使用对象
### 学会定义类和构造方法
### 理解封装
### 掌握类与对象的基本思想
### 巩固类与对象的基本方法
# 二、实验要求：
### 1.基本要求：
#### 完成教材p110 第四题关于PC、内存等模拟的程序；
#### 用类描述计算机中CPU的速度和硬盘容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。
#### CPU类：要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed;
#### HardDisk类：要求getAmount()返回amount的值，要求setAmount(int m)将参数m的赋值给amount;
#### PC类：要求setCPU(CPU c)将参数c的值赋值给cpu,要求setHarDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。
#### Test主类要求：
#### (1) 在main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200。
#### (2) 在main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。
#### (3) 在main方法中创建一个PC对象pc。
#### (4) 在pc调用setCPU(CPU c)方法，调用时实参是cpu。
#### (5) 在pc调用setHardDisk(HardDisk h)方法，调用时实参是disk。
#### (6) pc调用show()方法。
### 2.附加要求：
#### a)类中定义不少于两个构造方法；
#### b)每个类定义不少于2个属性，且属性的类型应该多样化；
#### c)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
#### d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法；
# 三、解题思路：
### 第一步，先建立三个类，根据实验要求中的基本要求在各个类中定义成员变量。第二步，针对成员变量定义set和get方法并用if进行逻辑判断。第三步，对各个类中的成员变量添加private关键字，使其只有在本类中才能直接访问。第四步，在各类中创建多个构造方法在构造方法中调用set和get方法。第五步，在PC类中定义show的方法并用对象.get的方式来展示类中成员信息。第六步，在Test中利用构造方法来创建对象并初始化，用对象.set的方式来设置对象成员的值。第七步，在Test类中通过对象.方法的方式来调用show方法进行实验结果展示。
# 四、操作过程：
### （1）根据课本上的要求、课本上的提示和所学的基础知识，首先创建出三个类分别为：PC、CPU、HardDisk和测试类Test。
### （2）根据题目要求在CPU类中设置成员变量speed、name、hertz和factory，在HardDisk中设置成员变量amount、shape、size和ID。
### （3）在CPU类和HardDisk类中各设置8个方法，针对于四个变量的get和set方法，用来对所接受的参数进行逻辑判断并将符合逻辑判断的参数，利用this关键字将该参数赋值给该类中的成员变量，如果逻辑判断不符合就用else给出相应的提示信息。
### （4）在set方法中利用if和else语句进行逻辑判断，在get方法中利用retrun返回该类中的成员变量。
### （5）利用privat关键字对成员变量，使被修饰的成员变量只能在本类中访问。
### （6）在类中定义出多个构造方法，其中所接受的参数类型不同，在构造方法中调用set方法，用来在创建对象时，对对象进行初始化。
### （7）在PC类中用CPU类创建cPU成员变量和用HardDisk类创建hardDisk成员变量。
### （8）在PC类中定义两个构造方法，用来将所接收的CPU类和HardDisk类的参数，并在构造方法中调用set方法和利用this关键字对cPU和hardDisk成员变量赋值。
### （9）在PC类中定义名为show的方法并利用对象.get方法来打印对象cPU和对象hardDisk的属性信息。
### （10）在Test类中利用构造方法CPU创建cPU对象并进行初始化，利用HardDisk构造方法创建hardDisk对象并进行初始化，利用PC构造方法创建pc对象并进行初始化。
### （11）在Test类中利用对象.set的方法对对象的成员变量赋值。
### （12）在Test类中利用对象.方法的来调用show方法，来打印数据。
# 五、核心代码：
### 1.CPU类的构造方法的定义：
```
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
```
### 2.HardDisk类中的set和get方法的定义：
```
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
            System.out.println("我这里只有这一种形状，哈哈哈哈！");
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

```
### 3.PC类中定义设置cPU对象和hardDisk对象的值的构造方法：
```
PC(CPU cPU){
        setcPU(cPU);
    }
    PC(HardDisk hardDisk){
        sethardDisk(hardDisk);
    }
```
### 4.Test类中用构造方法创建对象时的初始化：
```
CPU cPU = new CPU(2600,"古力娜扎的i5",2.5);
HardDisk hardDisk =new HardDisk(512,"长方体",110.0);
```
# 六、实验结果
![img](https://github.com/ChenJian-Jia/Java_experiment_two/blob/main/Picture%20of%20experimental%20results/%E8%AE%A1191_%E8%B4%BE%E5%BF%B1%E5%81%A5_2019310177_%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C%E5%9B%BE%E7%89%87.png)
# 七、实验感想：
### 本次实验掌握了类与对象的基本操作和基础知识，比如什么是对象，对象就是真实的实体，对象与实体是一一对应的，是一种具体的实体。类就是类是具备某些共同特征的实体的集合，它是一种抽象的概念，用程序设计的语言来说，类是一种抽象的数据类型，它是对所具有相同特征实体的抽象。掌握了用类创建对象的方法，利用类中定义的构造方法来创建对象。学习了private和this关键字，来进行封装。对创建的类中的成员变量进行封装。体会了把本次实验的多个类放置在不同的包中的private修饰符的用法。进一步加深了对于类和对象的理解。之前一直不会使用GitHub，今天通过老师的讲解，学会了创建仓库，将代码托管在GitHub上并学会了README.MD的基本操作。
