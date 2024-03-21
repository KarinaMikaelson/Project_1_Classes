package org.example.review2;

public class E3IfElse {
    public static void main(String[] args) {

        boolean haveCoupon=true;
        int coupon=20;

        if(haveCoupon){
            if(coupon==10){
                System.out.print("Apply 10% discount");
            }else if(coupon==20){
                System.out.print("Apply 20% discount");
            }else{
                System.out.print("Wrong coupon");
            }
        }
    }
}
