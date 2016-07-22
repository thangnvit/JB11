package Ex3;

public class Character {
    private String name;
    private Weapons weapon;
    private Armors armor;
    private int level, strength, dexterity, intelligence, attack, defense;

    public Character() {
        armor = new Armors();
        weapon = new Weapons();
    }

    public Character(String name, int strength, int dexterity, int attack, int intelligence, int defense, Armors armor, Weapons weapon) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.attack = attack;
        this.intelligence = intelligence;
        this.defense = defense;
        this.armor = new Armors();
        this.armor = armor;
        this.weapon = new Weapons();
        this.weapon = weapon;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Armors getArmor() {
        return armor;
    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void bonusStat(int strength, int dexterity, int intelligence) {
        this.setStrength(strength);
        this.setDexterity(dexterity);
        this.setIntelligence(intelligence);
    }
}
