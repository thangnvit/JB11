package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Archer extends Hero {
    public Archer() {
    }

    public Archer(String name) {
        this.name = name;
        strength = 1;
        dexterity = 5;
        intelligence = 1;
    }

    @Override
    public void setEquipment(Weapons weapon, Armors armor) {
        if (weapon == null) {
            this.attack = level;
        } else if (armor == null) {
            this.defense = level;
        } else {
            this.weapon = weapon;
            this.armor = armor;
            this.attack = this.level + weapon.level + weapon.getDexterityBonus();
            this.defense = this.level + armor.level + armor.getDexterityBonus();
        }
    }
    public void asd(){}
    @Override
    public String tauntLine() {
        return "Aim twice,shoot once";
    }

    @Override
    public String toString() {
        return "Archer {" + super.toString();
    }

    public static void main(String[] args) {
        Archer ar = new Archer("thang");
        Weapons weapon = new Weapons("Axe", "Axe day", 2, 1, 2, 3);
        Armors armor = new Armors("Clothes", "Clothes day", 4, 4, 3, 1);
        ar.setEquipment(weapon, armor);
        Hero wr = new Warrior();
        System.out.println("Truoc khi doi "+ wr+"\n");
        wr =  (Archer) (wr.changeHero(ar));
        System.out.println(wr.toString());
    }
}
