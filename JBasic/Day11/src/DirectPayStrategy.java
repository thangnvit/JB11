/**
 * Created by DEV on 8/1/2016.
 */
public class DirectPayStrategy implements PaymentStrategy {
    protected int secretPIN;
    protected String userId;

    public DirectPayStrategy(int secretPIN, String userId) {
        this.secretPIN = secretPIN;
        this.userId = userId;
    }

    @Override
    public boolean isValidInfo(Account account) {
        return (this.secretPIN == account.secretPIN && this.userId.equals(account.userId));
    }
}
