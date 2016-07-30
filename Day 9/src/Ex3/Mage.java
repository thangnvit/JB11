package Ex3;

public class Mage extends Hero {
    public Mage(){

    }
    public Mage(String name) {
        this.name = name;
        strength = 1;
        dexterity = 1;
        intelligence = 5;
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
            this.attack = this.level + weapon.level + weapon.getIntelligenceBonus();
            this.defense = this.level + armor.level + armor.getIntelligenceBonus();
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

}

