/**
 * Created by DEV on 7/11/2016.
 */
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
    public void addPhoneNumber(String newphoneNumber){
        String[] newPhoneNumber = new String[phoneNumber.length+1];
        for(int i=0;i<phoneNumber.length;i++){
            newPhoneNumber[i] = phoneNumber[i];
        }
        newPhoneNumber[phoneNumber.length] = newphoneNumber;
        phoneNumber = newPhoneNumber;
    }
    public String toString(){
        String[] arrayPhoneNumber = getPhoneNumber();
        String phoneEntry= getName();
        for(int i=0;i<phoneNumber.length;i++){
             phoneEntry = phoneEntry+ " "+arrayPhoneNumber[i]+" ";
        }
        return phoneEntry;
    }
}
