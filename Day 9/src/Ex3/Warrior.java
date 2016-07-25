package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Warrior extends Hero {
    public Warrior(String name) {
        this.name = name;
        strength = 5;
        dexterity = 1;
        intelligence = 1;
    }

    @Override
    public void setWeapon(Weapons weapon) {
        super.weapon = weapon;
        if (weapon == null) {
            attack = level + strength;
        } else if (weapon.getName() == "Staff") {
            attack = strength + level + weapon.getLevel() + weapon.getLevel() * 2;
        } else {
            attack = level + weapon.getLevel() + strength;
        }
    }

    @Override
    public void setArmor(Armors armor) {
        super.armor = armor;
        if (armor == null) {
            defense = level;
        } else if (armor.getName() == "Robes") {
            defense = level + armor.getLevel() + armor.getLevel() * 2;
        } else {
            defense = level + armor.getLevel();
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
