package Ex3;

public class Weapons {
    private String name;
    private int level;

    public Weapons() {
    }

    public Weapons(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getMesseage() {
        if (this.name == null)
            return null;
        switch (this.name) {
            case "Stick":
                return "You poke your sticks for";
            case "Axe":
                return "You swing your mighty axe for";
            case "Bow":
                return "You should an arrow for";
            case "Staff":
                return "You cast a spell for";
            default:
                return null;
        }
    }
}
