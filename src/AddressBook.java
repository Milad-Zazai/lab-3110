import java.util.ArrayList;

public class AddressBook {


    ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo x) {
        buddies.add(x);
    }
    public void removeBuddy(BuddyInfo x) {
        buddies.remove(x);
    }

    public static void main(String[] args) {
    BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(buddy);
        }
}