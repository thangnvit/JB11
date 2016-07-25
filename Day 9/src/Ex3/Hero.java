package Ex3;

public abstract class Hero {
    protected String name;
    protected Weapons weapon;
    protected Armors armor;
    protected int level, strength, dexterity, intelligence, attack, defense, hp = 100;

    public Hero() {
        armor = new Armors();
        weapon = new Weapons();
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int defense, int attack, int dexterity, int intelligence, int strength, int level, Armors armor, Weapons weapon) {
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.strength = strength;
        this.level = level;
        this.armor = armor;
        this.weapon = weapon;
    }

    public abstract void setArmor(Armors armor);

    public abstract void setWeapon(Weapons weapon);

    public String tauntLine() {
        return "I am ready for anything";
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", weapon(" + weapon +
                ", armor(" + armor +
                ", level=" + level +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", attack=" + attack +
                ", defense=" + defense +
                ", hp=" + hp +
                '}' +
                "\n Here'staunt line:" + tauntLine() +
                "\n Weapon's combat line:" + weapon.getMesseage() +
                "\n Armor's combat line:" + armor.getMesseage();
    }
}
