package entity;
public class Dolphin extends Aquatic {
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    private float swimmingSpeed;

    @Override
    public String toString() {
        return super.toString()+"Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';                //hakeya cha3malna
                                    //maw il classe Animal 3andou toString mte3ou
                                    // 5dimha minba3d il classe Aquatic 5dem il toString mte3ou
                                    // minba3d yexecuti il fonction hethi ili fil Dolphin
                                    //hakeya il code ashel w 5ir fil manther
                                    //5ir min hakka :
    /*
    return "Animal{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName()+ '\'' +
                ", age=" +getAge() +
                ", isMammal=" + isMammal()+
                '}'+
                "Aquatic{" +
                "habitat='" + getHabitat() + '\'' +
                '}'+"Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';    //*/
    }
    public void swim(){
        System.out.println("\tThis dolphin is swimming.");
    }       //saret redefinition
}
