package task1;

import java.util.PrimitiveIterator;

public class Student extends Person{
     private String name;
     private int year;
     private double fee;

     public Student(String name,String adress,String program,int year,double fee){

     }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
