import java.util.ArrayList;

public class BuddyInfo {
    public String getName() {
        return name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public String getaddress() {
        return address;
    }
public BuddyInfo(){
        name = "Milad";
        phone_number = "613 123 4567";
        address = "54 this street";
        
}
    public String name;
    public String address;
    public String phone_number;

    BuddyInfo(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }
    public String toString() {//overriding the toString() method
        return name + " " + address + " " + phone_number;
    }
        public static void main(String[] args) {
        BuddyInfo myObj = new BuddyInfo();
        System.out.println(myObj.getName());
        System.out.println(myObj.getaddress());
        System.out.println(myObj.getPhone_number());
        System.out.println("Hello world!");
        System.out.println("Hello " + myObj.getName());
    }
}

