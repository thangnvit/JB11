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

    public abstract void setEquipment(Weapons weapon, Armors armor);


    public abstract String tauntLine();

    public Hero changeHero(Hero hero) {
        Hero temp;
        temp = hero;
        return temp;
    }
//    public int getStrengthBonus(Equipment equipment) {
//       return this.strength += equipment.strength;
//    }
//
//    public int  getDexterityBonus(Equipment equipment) {
//        return this.dexterity += weapon.dexterity;
//    }
//
//    public int getIntelligenceBonus(Equipment equipment) {
//        return this.intelligence += weapon.intelligence;
//    }

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
                        "\n Weapon's combat line:" + weapon.getCombatLine() +
                        "\n Armor's combat line:" + armor.getCombatLine();
    }
}
