/**
 * Created by DEV on 8/1/2016.
 */
public class CreditCardStrategy implements PaymentStrategy {
    protected String name;
    protected String cardNumber;
    protected int secretPIN;

    public CreditCardStrategy(String name, int secretPIN, String cardNumber) {
        this.name = name;
        this.secretPIN = secretPIN;
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean isValidInfo(Account account) {
        return (this.name.equals(account.name) && this.cardNumber.equals(account.cardNumber) && this.secretPIN == secretPIN);
    }
}
