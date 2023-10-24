package entity;
public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public  Penguin(){ //construction par defauts
        super("family","name",4,true,"habitat");
            //ken nahiw super fil ligne 10 ijik error 5ater fil classe Aquatic
            // manech mdecalarin constructeur par defaut kema
            //il fonction ili 9e3din ne5dmou feha Public Penguin()
    }
    public  float getDepth(){
        return  this.swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString()+"Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
    public void swim(){
        //super.swim();
        System.out.println("\ti identify as Penguin");
    }
}
