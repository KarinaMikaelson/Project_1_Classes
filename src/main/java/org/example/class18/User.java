package org.example.class18;
/*
Write program: User that has a constructor that initializes instance variable name and mobile number.
Create a subclass/child class userInfo that will have user address variable and it also being
initialized through constructor call. Print users name, mobile number and address in userDetails method.
Test your code.
 */
public class User {
    protected String name;
    protected long mobileNumber;

    public User(String name, long mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class userInfo extends User{
    private String userAddress;
    public userInfo(String name, long mobileNumber, String userAddress){
        // super (parent constructor) should be on the first line Always
        super(name,mobileNumber);
        this.userAddress = userAddress ;
    }
    public void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+this.userAddress);
    }
}
class UserTester{
    public static void main(String[] args) {
        userInfo u = new userInfo("Jack",564336667,"455 Hollan Ave, New York");
        u.userDetails();
    }
}
