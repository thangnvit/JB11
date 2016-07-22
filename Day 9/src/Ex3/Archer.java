package Ex3;

public class Archer extends Character {
    public Archer(String name) {
        this.setWeapon(null);
        this.setArmor(null);
        this.setName(name);
        this.setLevel(1);
        this.setStrength(1);
        this.setDexterity(5);
        this.setIntelligence(1);
        this.setAttack(1);
        this.setDefense(1);
    }

    public void setAttack() {
        if (getWeapon() == null) {
            setAttack(getLevel() + getDexterity());
        } else if (getWeapon().getName() == "Bow") {
            setAttack(getDexterity() + getLevel() + getWeapon().getLevel() + getWeapon().getLevel() * 2);
        } else {
            setAttack(getLevel() + getWeapon().getLevel() + getDexterity());
        }
    }

    public void setDefense() {
        if (getArmor() == null) {
            setDefense(getLevel());
        } else if (getArmor().getName() == "Leather") {
            setDefense(getLevel() + getArmor().getLevel() + getArmor().getLevel() * 2);
        } else {
            setDefense(getLevel() + getArmor().getLevel());
        }
    }

    public String toString() {
        if(this.getArmor() == null && this.getWeapon() == null)
            return "Type of character: Warrior\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nAim twice,shoot once\n";
        return "Type of character: Archer\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nAim twice,shoot once\n" + "Weapon's combat line:" + getWeapon().getMesseage() + "\nArmor's combat line:" + getArmor().getMesseage();
    }

}
