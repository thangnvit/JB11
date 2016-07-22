package Ex3;

public class Armors {
    private String name;
    private int level;

    public Armors() {
    }

    public Armors(String name, int level) {
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
            case "Clothes":
                return "Your normal clothes block the attack";
            case "Chanmail":
                return "Your mighty chainmail block the attack";
            case "Leather":
                return "Your sneaky armor allows you to dodge the attack";
            case "Robes":
                return "Your magical robes protect you from the attack";
            default:
                return null;
        }
    }
}
