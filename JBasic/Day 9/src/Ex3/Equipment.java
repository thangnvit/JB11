package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public abstract class Equipment {
    protected String name;
    protected int level;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected String combatLine;

    public Equipment() {
    }

    public Equipment(String name,String combatLine, int level,int strength,int dexterity,int intelligence) {
        this.name = name;
        this.combatLine = combatLine;
        this.level = level;
        this.strength= strength;
        this.dexterity= dexterity;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCombatLine() {
        return combatLine;
    }

    public void setCombatLine(String combatLine) {
        this.combatLine = combatLine;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int getStrengthBonus(){
        return this.strength;
    }

    public int getDexterityBonus(){
        return this.dexterity;
    }
    public int getIntelligenceBonus(){
        return  this.intelligence;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", level=" + level +
                        ')';
    }

}
