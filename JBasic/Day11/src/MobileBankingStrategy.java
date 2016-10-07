/**
 * Created by DEV on 8/1/2016.
 */
public class MobileBankingStrategy implements PaymentStrategy {
    protected String phoneNumber;
    protected int secretPIN;

    public MobileBankingStrategy(String phoneNumber, int secretPIN) {
        this.phoneNumber = phoneNumber;
        this.secretPIN = secretPIN;
    }

    @Override
    public boolean isValidInfo(Account account) {
        return (this.phoneNumber.equals(account.phoneNumber) && this.secretPIN == account.secretPIN);
    }
}
