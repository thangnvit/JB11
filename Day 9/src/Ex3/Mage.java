package Ex3;

public class Mage extends Hero {

    public Mage(String name) {
        this.name = name;
        strength = 1;
        dexterity = 1;
        intelligence = 5;
    }

    @Override
    public void setWeapon(Weapons weapon) {
        super.weapon = weapon;
        if (weapon == null) {
            attack = level +intelligence;
        } else if (weapon.getName() == "Staff") {
            attack= intelligence + level + weapon.getLevel() + weapon.getLevel() * 2;
        } else {
            attack = level + weapon.getLevel() + intelligence;
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
        return "Mind over matter";
    }

    @Override
    public String toString() {
        return "Mage {" + super.toString();
    }

    public static void main(String[] args) {
        Mage mg = new Mage("thang");
        Weapons wp = new Weapons("Staff",2);
        mg.setWeapon(wp);
        Armors ar = new Armors("Clothes",3);
        mg.setArmor(ar);
        System.out.println(mg.toString());

    }
}

