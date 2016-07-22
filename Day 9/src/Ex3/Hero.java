package Ex3;

public class Hero extends Character {
    public Hero(String name) {
        this.setWeapon(null);
        this.setArmor(null);
        this.setName(name);
        this.setLevel(1);
        this.setStrength(1);
        this.setDexterity(1);
        this.setIntelligence(1);
        this.setAttack(1);
        this.setDefense(1);
    }

    public void setAttack() {
        if (getWeapon() == null) {
            setAttack(getLevel());
        } else {
            setAttack(getLevel() + getWeapon().getLevel() + getWeapon().getLevel() * 2);
        }
    }

    public void setDefense() {
        if (getArmor() == null) {
            setDefense(getLevel());
        } else {
            setDefense(getLevel() + getArmor().getLevel() + getArmor().getLevel() * 2);
        }
    }

    public String toString() {
        if(this.getArmor() == null && this.getWeapon() == null)
            return "Type of character: Hero\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nI am ready for anything\n";
        return "Type of character: Hero\n" + "Name: " + getName() + "\nLevel: " + getLevel() + "\nAttack:" + getAttack() + "\nDefense:" + getDefense() + "\nIntelligence:" + getIntelligence() + "\nI am ready for anything\n" + "Weapon's combat line:" + getWeapon().getMesseage() + "\nArmor's combat line:" + getArmor().getMesseage();
    }
}
