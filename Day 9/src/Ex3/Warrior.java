package Ex3;

public class Warrior extends Character {
    public Warrior(String name) {
        this.setWeapon(null);
        this.setArmor(null);
        this.setName(name);
        this.setLevel(1);
        this.setStrength(5);
        this.setDexterity(1);
        this.setIntelligence(1);
        this.setAttack(1);
        this.setDefense(1);
    }

    public void setAttack() {
        if (getWeapon() == null) {
            setAttack(getLevel() + getStrength());
        } else if (getWeapon().getName() == "Axe") {
            setAttack(getStrength() + getLevel() + getWeapon().getLevel() + getWeapon().getLevel() * 2);
        } else {
            setAttack(getLevel() + getWeapon().getLevel() + getStrength());
        }
    }

    public void setDefense() {
        if (getArmor() == null) {
            setDefense(getLevel());
        } else if (getArmor().getName() == "Chanmail") {
            setDefense(getLevel() + getArmor().getLevel() + getArmor().getLevel() * 2);
        } else {
            setDefense(getLevel() + getArmor().getLevel());
        }
    }

    public String toString() {
        if(this.getArmor() == null && this.getWeapon() == null)
        return "Type of character: Warrior\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nI am mighty\n";
        return "Type of character: Warrior\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nI am mighty\n" + "Weapon's combat line:" + getWeapon().getMesseage() + "\nArmor's combat line:" + getArmor().getMesseage();
    }

}
