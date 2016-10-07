package Ex_2;

import java.util.ArrayList;

/**
 * Created by DEV on 7/11/2016.
 */
public class PhoneBook {
    private ArrayList<PhoneEntry> phoneEntries = new ArrayList();
    private int numberOfEntries;

    public PhoneBook() {

    }

    public PhoneBook(ArrayList phoneEntries) {
        this.phoneEntries = phoneEntries;
    }

    public void addEntry(PhoneEntry entry) {
        phoneEntries.add(entry);
    }

    public PhoneEntry findEntryByName(String entryName) {
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getName().compareTo(entryName) == 0) {
                return phoneEntries.get(i);
            }
        }
        return null;
    }

    public void deleteEntry(String entryName) {

        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getName().compareTo(entryName) == 0) {
                phoneEntries.remove(i);
            }
        }
    }

    public void editEntry(String entryName, String newPhoneNumber) {
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getName().compareTo(entryName) == 0) {
                phoneEntries.get(i).setPhoneNumber(newPhoneNumber);
            }
        }

    }

    public String toString() {
        String phoneBook = "";
        for (int i = 0; i < phoneEntries.size(); i++) {
            phoneBook = phoneBook + phoneEntries.get(i).toString() + "\n";
        }
        return phoneBook;
    }

    public boolean isDuplicateName(String entryName) {
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getName().compareTo(entryName) == 0)
                return true;
        }
        return false;
    }

    public boolean isDuplicateNumber(String entryNumber) {
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getPhoneNumber().compareTo(entryNumber) == 0)
                return true;
        }
        return false;
    }
}

