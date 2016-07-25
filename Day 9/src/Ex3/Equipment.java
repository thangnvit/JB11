package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public abstract class Equipment {
    protected String name;
    protected int level;

    public Equipment() {
    }

    public Equipment(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", level=" + level +
                        ')';
    }

    public abstract String getMesseage();
}
