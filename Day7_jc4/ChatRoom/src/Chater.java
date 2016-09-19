import java.io.Serializable;

/**
 * Created by DEV on 9/19/2016.
 */
public class Chater implements Serializable{
    private String nickName;
    private String text;

    public Chater(String nickName, String text) {
        this.nickName = nickName;
        this.text = text;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return  nickName + ":" + text;
    }
}
