
public class PhoneEntry {
    private String name;
    private String[] phoneNumber = new String[0];

    public PhoneEntry() {
    }

    public PhoneEntry(String name, String[] phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addPhoneNumber(String addPhoneNumber) {
        String[] newPhoneNumber = new String[phoneNumber.length + 1];
        for (int i = 0; i < phoneNumber.length; i++) {
            newPhoneNumber[i] = phoneNumber[i];
        }
        newPhoneNumber[phoneNumber.length] = addPhoneNumber;
        phoneNumber = newPhoneNumber;
    }

    public void deletePhoneNumber() {
        String[] newPhoneNumber = new String[0];
        phoneNumber = newPhoneNumber;

    }

    public boolean isDuplicateNumber(String newNumber) {
        for (int i = 0; i < phoneNumber.length; i++) {
            if (phoneNumber[i].compareTo(newNumber) == 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String[] arrayPhoneNumber = getPhoneNumber();
        String phoneEntry = getName();
        for (int i = 0; i < phoneNumber.length; i++) {
            phoneEntry = phoneEntry + " " + arrayPhoneNumber[i] + " ";
        }
        return phoneEntry;
    }
}
