package Ex3;

/**
 * Created by DEV on 7/25/2016.
 */
public class Weapons extends Equipment {
    public Weapons(){

    }
    public Weapons(String name,int level){
        super(name,level);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMesseage() {
        if (this.name == null)
            return null;
        switch (this.name) {
            case "Stick":
                return "You poke your sticks for";
            case "Axe":
                return "You swing your mighty axe for";
            case "Bow":
                return "You should an arrow for";
            case "Staff":
                return "You cast a spell for";
            default:
                return null;
        }

    }
}
