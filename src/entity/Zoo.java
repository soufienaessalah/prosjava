package entity;

import java.util.Scanner;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private Aquatic aquatics[]=new Aquatic[10];
    private String name, city;
    private int nbrAnimals;
    public Zoo() {
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        while (this.name.isBlank()) {   //test ken il name frigh walla le
            Scanner input = new Scanner(System.in);// keni fergha wa9tha il boucle te5dem
            System.out.print("error:name must be not empty:"); //mayou5rej ilama il this.name ma3adech ferigh
            this.name = input.nextLine();
            input.close();
        }
    }
    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
       this.setName(name);
        // this.name = name;    //fazet il name not empty hayka deja ma5douma fil
        this.city = city;       //setName() donc n3aytilha leha hiya 5ir
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return -1;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals++] = animal;
        //nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals--] = null;
        //this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(Integer.toString(i)+"-"+animals[i]);
        }
    }
    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
        displayAnimals();
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        for(int i=0;i<aquatics.length;i++)
            if(aquatics[i]==null){
                aquatics[i]=aquatic;
                return;
            }
        System.out.println("table is full");
    }
    public void displayaqua(){
        for(int i=0;i<aquatics.length&&aquatics[i]!=null;i++)
            aquatics[i].swim();
    }
    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (Aquatic aquat : aquatics)
            if (aquat instanceof Penguin penguin && penguin.getDepth() > max)
                max = penguin.getDepth();
    return  max;
    }
    public void displayNumberOfAquaticsByType(){
        int dauphin=0,pingouin=0;
        for (Aquatic aquat:aquatics)
        {
            if (aquat instanceof Penguin)
                pingouin++;
            else if(aquat instanceof Dolphin)
                dauphin++;
        }
        System.out.println("nombre de dolphin="+dauphin);
        System.out.println("nombre de pinguin="+pingouin);
    }
}
