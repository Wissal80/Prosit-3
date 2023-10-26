package tn.esprit.gestionzoo.entities;

import javax.print.attribute.standard.PageRanges;
import java.util.Arrays;

public class Zoo {


    Animal[] animals;
    String name;
    String city;
    int age;
    String habitat;
    private static final int NBR_CAGES = 25;
    int nbrAnimal = 0;
    Peenguin peenguin;
    Acquatic[] aquaticAnimals = new Acquatic[10];
    public int nbAquaticAnimaux;


    public Zoo(String name, String city, int i) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];

    }


    public Acquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void DisplayZoo() {
        System.out.println("My Zoo name is:" + this.name + ",city is :" + this.city + "nmbr:25");
    }

    public String toString() {
        String var10000 = Arrays.toString(this.animals);
        return "Zoo{animals=" + var10000 + ", name='" + this.name + "', city='" + this.city + "', nbrCages=25}";
    }

    public Boolean addAnimal(Animal animal) {
        if (this.nbrAnimal > 25) {
            return false;
        } else {
            this.animals[this.nbrAnimal] = animal;
            ++this.nbrAnimal;
            return true;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < this.nbrAnimal; ++i) {
            if (this.animals[i].equals(animal)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < this.nbrAnimal; ++i) {
            if (this.animals[i].equals(animal)) {
                for (int j = i; j < this.nbrAnimal - 1; ++j) {
                    this.animals[j] = this.animals[j + 1];
                }

                this.animals[this.nbrAnimal - 1] = null;
                --this.nbrAnimal;
                return true;
            }
        }

        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.nbrAnimal > z2.nbrAnimal ? z1 : z2;
    }

    public static boolean isZooFull(Zoo zoo) {
        return zoo.nbrAnimal >= 25;
    }


    public int getnbrAnimal() {

        return nbrAnimal;
    }

    public void addAquaticAnimal(Acquatic aquatic) {
        if (nbAquaticAnimaux < 10) {
            aquaticAnimals[nbAquaticAnimaux] = aquatic;
            nbAquaticAnimaux++;
        } else {
            System.out.println("tableau Plein");
        }
    }

    public void displayAquaticAnimals() {
        for (Acquatic a : aquaticAnimals) {
            if (a != null)
                a.swim();
        }

    }


    public float maxPenguinDepth() {
        float max = 0;
        for (int i = 0; i < nbAquaticAnimaux; i++) {
            if (aquaticAnimals[i] instanceof Peenguin) {
                if (max < ((Peenguin) aquaticAnimals[i]).getSwimigDepth()) {
                    max = ((Peenguin) aquaticAnimals[i]).getSwimigDepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < nbAquaticAnimaux; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Peenguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
}












