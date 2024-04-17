package org.example.class18;

public class MinimumOfTwoNumbers {
    public int returnMinimumNumber(int a, int b){
        // This is one of many ready logics to use
        return a > b ? b : a;
    }
    public void returnMinimumNumber(int a, double b){
        if(a > b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
    public void returnMinimumNumber(double a, int b){
        if(a < b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public double returnMinimumNumber(double a, double b){
        // This is one of many ready logics to use
        return Math.min(a,b);
    }
}
class MinimumOfTwoNumbersTester{
    public static void main(String[] args) {
        MinimumOfTwoNumbers c = new MinimumOfTwoNumbers();
        c.returnMinimumNumber(24,8.2);
    }
}
