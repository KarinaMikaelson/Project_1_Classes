package org.example.class18;
/*
Write program: User that has a constructor that initializes instance variable name and mobile number.
Create a subclass/child class userInfo that will have user address variable and it also being
initialized through constructor call. Print users name, mobile number and address in userDetails method.
Test your code.

SECOND WAY - Asghar
- String method added
 */
public class UserTwo {
    private String name;
    private long mobileNumber;

    public UserTwo(String name, long mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    // ADDED
    public String getInfo(){
        return name+" "+mobileNumber;
    }
}
class userInfoTwo extends UserTwo{
    private String userAddress;
    public userInfoTwo(String name, long mobileNumber, String userAddress){
        super(name,mobileNumber);
        this.userAddress = userAddress ;
    }
    public void printUserDetails(){
        // CHANGED
        System.out.println(getInfo()+" "+userAddress);
    }
}
class UserTesterTwo{
    public static void main(String[] args) {
        userInfo u = new userInfo("Jack",564336667,"455 Hollan Ave, New York");
        u.userDetails();
    }
}
