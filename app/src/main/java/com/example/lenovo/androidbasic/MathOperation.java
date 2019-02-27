package com.example.lenovo.androidbasic;

public class MathOperation {

    int no1, no2, ans;

    public MathOperation(int no1, int no2)
    {
        this.no1=no1;
        this.no2=no2;
    }

    int addition()
    {
        ans=no1+no2;
        return ans;
    }

    int subtraction()
    {
        ans=no1-no2;
        return ans;
    }

    int multiplication()
    {
        ans=no1*no2;
        return ans;
    }

    int division()
    {
        ans=no1/no2;
        return ans;
    }

}
