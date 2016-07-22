package Ex3;

public class Mage extends Character {
    public Mage(String name) {
        this.setWeapon(null);
        this.setArmor(null);
        this.setName(name);
        this.setLevel(1);
        this.setStrength(1);
        this.setDexterity(1);
        this.setIntelligence(5);
        this.setAttack(1);
        this.setDefense(1);
    }

    public void setAttack() {
        if (getWeapon() == null) {
            setAttack(getLevel() + getIntelligence());
        } else if (getWeapon().getName() == "Staff") {
            setAttack(getIntelligence() + getLevel() + getWeapon().getLevel() + getWeapon().getLevel() * 2);
        } else {
            setAttack(getLevel() + getWeapon().getLevel() + getIntelligence());
        }
    }

    public void setDefense() {
        if (getArmor() == null) {
            setDefense(getLevel());
        } else if (getArmor().getName() == "Robes") {
            setDefense(getLevel() + getArmor().getLevel() + getArmor().getLevel() * 2);
        } else {
            setDefense(getLevel() + getArmor().getLevel());
        }
    }

    public String toString() {
        if(this.getArmor() == null && this.getWeapon() == null)
            return "Type of character: Warrior\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nMind over matter\n";
        return "Type of character: Mage\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nMind over matter\n" + "Weapon's combat line:" + getWeapon().getMesseage() + "\nArmor's combat line:" + getArmor().getMesseage();
    }
}

