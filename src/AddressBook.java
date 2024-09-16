import java.util.ArrayList;

public class AddressBook {


    ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo x) {
        buddies.add(x);
    }
    public void removeBuddy(BuddyInfo x) {
        buddies.remove(x);
    }

    public static void main(String[] args) {
    System.out.println("Address Book");
        }
}