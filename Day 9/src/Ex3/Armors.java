package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Armors extends Equipment{
    public Armors(){}
    public Armors(String name,int level){
        super(name,level);
    }
    @Override
    public String getMesseage(){
        if (this.name == null)
            return null;
        switch (this.name) {
            case "Clothes":
                return "Your normal clothes block the attack";
            case "Chanmail":
                return "Your mighty chainmail block the attack";
            case "Leather":
                return "Your sneaky armor allows you to dodge the attack";
            case "Robes":
                return "Your magical robes protect you from the attack";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
