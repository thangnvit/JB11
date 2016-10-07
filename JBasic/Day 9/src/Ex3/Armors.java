package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Armors extends Equipment{
    public Armors(){}
    public Armors(String name,String combatLine,int level,int strength,int dexterity,int intelligence){
        super(name,combatLine,level,strength,dexterity,intelligence);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public  String getMesseage(){
        return null;
    };
}
