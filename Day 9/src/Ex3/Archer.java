package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Archer extends Hero {
    public Archer(String name) {
        this.name = name;
        strength = 1;
        dexterity = 5;
        intelligence = 1;
    }
    @Override
    public void setWeapon(Weapons weapon) {
        super.weapon = weapon;
        if (weapon == null) {
            attack = level + dexterity;
        } else if (weapon.getName() == "Staff") {
            attack= dexterity + level + weapon.getLevel() + weapon.getLevel() * 2;
        } else {
            attack = level + weapon.getLevel() + dexterity;
        }
    }

    @Override
    public void setArmor(Armors armor) {
        super.armor = armor;
        if (armor == null) {
            defense = level;
        } else if (armor.getName() == "Robes") {
            defense =  level + armor.getLevel() + armor.getLevel() * 2;
        } else {
            defense = level + armor.getLevel();
        }
    }

    @Override
    public String tauntLine() {
        return "Aim twice,shoot once";
    }

    @Override
    public String toString() {
        return "Archer {" + super.toString();
    }
}
