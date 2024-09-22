import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo x) {
        if(buddies != null) {
        buddies.add(x);
        }
    }
    public BuddyInfo removeBuddy(int x) {
        if(x >= 0 && x < buddies.size()) {
            return buddies.remove(x);
        }
        return null;
    }
    //public String toString() {
      //  return buddies.toString();
    //}
    public static void main(String[] args) {
    BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(0);
        }
} //This is being commited
