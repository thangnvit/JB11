/**
 * Created by DEV on 7/13/2016.
 */
public abstract class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String gioiThieu();
}
