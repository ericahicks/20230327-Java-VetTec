package com.skillstorm.day3.mypackage;
// Enthuware Test 4 Problem 29
public class ChangeTest {
    private int myValue = 0;
    
    public void showOne(int myValue){ // called with myValue = 100
        myValue = myValue; // what does this do? **** local myValue is shadowing this.myValue 
    } // this method has no effect 
    
    public void showTwo(int myValue){ // called with myValue = 200
        this.myValue = myValue;
    }    
    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest(); // myValue = 0
        ct.showOne(100); // myValue = 0
        System.out.println(ct.myValue);
        ct.showTwo(200); // myValue = 200
        System.out.println(ct.myValue);
    }
}
