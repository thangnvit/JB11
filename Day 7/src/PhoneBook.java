/**
 * Created by DEV on 7/11/2016.
 */
public class PhoneBook {
    private PhoneEntry[] phoneEntries = new PhoneEntry[0];
    private int numberOfEntries;

   public PhoneBook() {

    }

    public PhoneBook(PhoneEntry[] phoneEntries) {
        this.phoneEntries = phoneEntries;
    }

    public void addEntry(PhoneEntry entry) {
        PhoneEntry[] newPhoneEntries = new PhoneEntry[phoneEntries.length + 1];
        for (int i = 0; i < phoneEntries.length; i++) {
            newPhoneEntries[i] = phoneEntries[i];
        }
        newPhoneEntries[phoneEntries.length] = entry;
        phoneEntries = newPhoneEntries;
    }

    public PhoneEntry findEntryByName(String entryName) {
        for (int i = 0; i < phoneEntries.length; i++) {
            if (phoneEntries[i].getName().compareTo(entryName) == 0) {
                return phoneEntries[i];
            }
        }
        return null;
    }

    public void deleteEntry(String entryName) {

        for (int i = 0; i < phoneEntries.length - 1; i++) {
            if (phoneEntries[i].getName().compareTo(entryName) == 0) {
                for (i = 0; i < phoneEntries.length - 1; i++) {
                    phoneEntries[i] = phoneEntries[i + 1];
                }
            }
        }
        PhoneEntry[] newPhoneEntries = new PhoneEntry[phoneEntries.length - 1];
        for (int i = 0; i < newPhoneEntries.length; i++) {
            newPhoneEntries[i] = phoneEntries[i];
        }
        phoneEntries = newPhoneEntries;
    }

    public void editEntry(String entryName,String[] newPhoneNumber) {
        for (int i = 0; i < phoneEntries.length; i++) {
            if (phoneEntries[i].getName().compareTo(entryName) == 0) {
                phoneEntries[i].setPhoneNumber(newPhoneNumber);
            }
        }

    }


    public String toString() {
        String phoneBook = "";
        for (int i = 0; i < phoneEntries.length; i++) {
            phoneBook = phoneBook + phoneEntries[i].toString() + "\n";
        }
        return phoneBook;
    }

    public boolean isDuplicateName(String entryName){
        for(int i=0;i<phoneEntries.length;i++){
            if(phoneEntries[i].getName().compareTo(entryName) == 0)
                return true;
        }
        return  false;
    }
    public boolean isDuplicateNumber(String entryNumber){
        for(int i=0;i<phoneEntries.length;i++){
            if(phoneEntries[i].isDuplicateNumber(entryNumber))
                return true;
        }
        return  false;
    }
}
