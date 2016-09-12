/**
 * Created by DEV on 8/1/2016.
 */
public class Account {
    protected String userId;
    protected String name;
    protected String phoneNumber;
    protected String cardNumber;
    protected double balance;
    protected int secretPIN;

    public Account() {

    }

    public Account(String userId, String name, int secretPIN) {
        this.userId = userId;
        this.name = name;
        this.secretPIN = secretPIN;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account(String userId, String name, int secretPIN, double balance) {
        this.userId = userId;
        this.name = name;
        this.secretPIN = secretPIN;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getSecretPIN() {
        return secretPIN;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double deposit(double value) {
        return balance = balance + value;
    }

    boolean isRightPIN(int secretPIN) {
        return this.secretPIN == secretPIN;
    }

    public String generateRandomCardNumber() {
        creaditCard itCard = new creaditCard();
        return (itCard.generate("2", 10));
    }

    public double withDraw(PaymentStrategy payStrg, double value) {
        if (payStrg.isValidInfo(this)) {
            return this.balance = this.balance - value;
        } else {
            return this.balance;
        }
    }

}
