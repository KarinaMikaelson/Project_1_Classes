package org.example.class17;

 class X {
    void showClassX(){
        System.out.println("class X");
    }
}
 class Y extends X{
    void showClassY(){
        System.out.println("class Y");
    }
}
class  Z extends Y{
     void showClassZ(){
         System.out.println("class Z");
     }

    public static void main(String[] args) {
        Z z = new Z();
        z.showClassX();
        z.showClassY();
        z.showClassZ();
    }
}

