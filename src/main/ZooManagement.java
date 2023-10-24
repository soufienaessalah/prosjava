package main;
import entity.*;

//import entity.*; import classet il koul ili fil entity
public class ZooManagement {

    public static void main(String[] args) {
        /*        Methode 1         */
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);
        /*        Methode 2         */
        lion =new Animal("9adem","Simba",18,false);
        /*                          */

        Zoo myZoo = new Zoo("ahmed mohsen", "janoub");
        Zoo notMyZoo = new Zoo("rass hanout", "fil 7ouma");


        Animal dog = new Animal("ben krima", "karim", 12, true);
        if(myZoo.addAnimal(lion))
            System.out.println(lion.getName()+" has been added successfully");
        else
            System.out.println(lion.getName()+" failed to add.");
        if(myZoo.addAnimal(dog))
            System.out.println(dog.getName()+" has been added successfully");
        else
            System.out.println(dog.getName()+" failed to add.");


        myZoo.displayAnimals();
        {
            int position=myZoo.searchAnimal(dog);
            String output;
            if (position!= -1)
                output="the animal is in "+position;
            else
                output="the animal is not found";
            System.out.println(output);
        }
        Animal dog2 = new Animal("barka", "barra", 2, true);
        {
            int position=myZoo.searchAnimal(dog2);
            String output;
            if (position!= -1)
                output="the animal is in "+position;
            else
                output="the animal is not found";
            System.out.println(output);
        }
        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        /********************************************************/
        /********************************************************/
        /********************************************************/
        /********************************************************/
        System.out.println("/********************************************************************************************************/");


        System.out.println("myZoo:\t"+myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("lion:\t" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("dog2:\t" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("dog:\t" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        //System.out.println(myZoo.comparerZoo(myZoo,notMyZoo));
        //System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
        /********************************************************/
        /********************************************************/
        /********************************************************/
        System.out.println("/********************************************************************************************************/");
        /********************************************************/
        //Aquatic aqua=new Aquatic("kil3ada","9la9et",12,true,"pedo");
        Aquatic dol=new Dolphin("5ouh","tah",12,false,"fil choujra",15);
        Aquatic pen=new Penguin("haw","kammalna",14,true,"phil",12);
        Aquatic pen1=new Penguin("chokla","komba",14,true,"phil",16);

       // aqua.swim();
        dol.swim();
        pen.swim();
        //System.out.println("output from Aquatic"+aqua);
        System.out.println("output from Dolphin"+dol);
        System.out.println("output from Penguin"+pen);
        myZoo.addAquaticAnimal(dol);
        myZoo.addAquaticAnimal(pen);
        myZoo.addAquaticAnimal(pen1);
        myZoo.displayaqua();
        System.out.println("max penguinSwimmingDepth:"+myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        //test equal
        Aquatic equal=new Penguin("chokla","komba",14,true,"phil",16);
        System.out.println(equal.equals(pen1));

    }
}
