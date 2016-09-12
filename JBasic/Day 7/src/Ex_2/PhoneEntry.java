package Ex_2;

public class PhoneEntry {
    private String name;
    private String phoneNumber;

    public PhoneEntry() {
    }

    public PhoneEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String toString() {
        String phoneEntry = getName() +"  "+ getPhoneNumber() + "\n";
        return phoneEntry;
    }
}

