package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Weapons extends Equipment {
    public Weapons(){

    }
    public Weapons(String name,String combatLine, int level,int strength,int dexterity,int intelligence){
        super(name,combatLine,level,strength,dexterity,intelligence);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
