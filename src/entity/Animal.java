package entity;

import java.util.Scanner;

public sealed class Animal permits Terrestrial,Aquatic {

    private String family, name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
        while (this.age<0) {   //test ken il name frigh walla le
            Scanner input = new Scanner(System.in);// keni fergha wa9tha il boucle te5dem
            System.out.print("error:age must be positive:"); //mayou5rej ilama il this.name ma3adech ferigh
            this.age = input.nextInt();
            input.close();
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
