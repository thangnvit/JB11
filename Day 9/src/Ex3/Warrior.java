package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Warrior extends Hero {
    public Warrior(){

    }
    public Warrior(String name) {
        this.name = name;
        strength = 5;
        dexterity = 1;
        intelligence = 1;
    }

    @Override
    public void setEquipment(Weapons weapon, Armors armor) {
        if (weapon == null) {
            this.attack = level;
        } else if (armor == null) {
            this.defense = level;
        } else {
            this.weapon.setName(weapon.name);
            this.armor.setName(armor.name);
            this.weapon.setLevel(weapon.level);
            this.armor.setLevel(armor.level);
            this.attack = this.level + weapon.level + weapon.getStrengthBonus();
            this.defense = this.level + armor.level + armor.getStrengthBonus();
        }
    }

    @Override
    public String tauntLine() {
        return "I am mighty";
    }

    @Override
    public String toString() {
        return "Warrior {" + super.toString();
    }
}
