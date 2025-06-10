package com.prabhat;

public class Dev {

//    private Laptop laptop; // Reference variable
//    private int age;
    //this parameterized constructor is connected to <constructor-arg value="14" /> in spring.xml
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 1 Constructor (parameterized).");
//    }

//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
    //getter setter for Laptop was also there we have just have removed it.

    // The Below code is after using Computer Interface.

    private Computer com;

    public Dev(){
        System.out.println("Dev Constructor.");
    }

    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("Working on Awesome Project");
//        laptop.compile();
        com.compile();
    }
}
