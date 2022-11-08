package org.example.lib;

public class TestLib {
    public int getSum(int a,int b)
    {

        System.out.println("Hi You are in custom library& Sum method");
        return a+b;
    }
    public int getDiff(int a,int b)
    {

        System.out.println("Hi You are in custom library& substract method");
        return a-b;
    }
    public int getProduct(int a,int b)
    {

        System.out.println("Hi You are in custom library& multiplication method");
        return a*b;
    }
}
