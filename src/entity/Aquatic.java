package  entity;
public non-sealed abstract class Aquatic extends Animal{
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    private String habitat;

    @Override
    public String toString() {
        return super.toString()+"Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
/*    public  void  swim(){
        System.out.println("This aquatic animal is swimming.");
    }
    */
    public abstract void swim();
    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()==this.getClass()){
            Aquatic aquatic=(Aquatic) obj;
            return aquatic.getName().equals(this.getName())&&aquatic.getAge()==this.getAge();
        }
        return  false;
    }
}
