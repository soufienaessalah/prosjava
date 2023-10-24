package entity;
public non-sealed class Terrestrial extends Animal{
    private int nbrLegs;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}
