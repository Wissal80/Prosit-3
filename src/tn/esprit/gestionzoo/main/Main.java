package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("friguia","souse",20);
        Dolphin dolphin = new Dolphin("dol","dol",12,true,"Ocean", 30.5f);
        Peenguin penguin = new Peenguin("Equidae", "Zebra", 3, false,"Antarctica", 50.0f);

        System.out.println(dolphin);
        System.out.println(penguin);

        Acquatic aquatic = new Acquatic("Equidae", "Zebra", 3, false,"Sea");
        Dolphin dolphin2 = new Dolphin("doll2","doll2",123,true,"Ocean", 25.0f);
        Peenguin penguin2 = new Peenguin("doll3","doll3",132,true,"Arctic", 40.0f);

        // aquatic.swim();
        // dolphin2.swim();
        // penguin2.swim();

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        //myZoo.displayZoo();


        Dolphin dolphin3 = new Dolphin("Dolphin Family", "Dolphin", 8, true, "Ocean", 20.5f);
        Peenguin penguin3 = new Peenguin("Penguin Family", "Penguin", 3, true, "Antarctica", 50.3f);

        myZoo.addAquaticAnimal(dolphin3);
        myZoo.addAquaticAnimal(penguin3);

        for (int i = 0; i < myZoo.getnbrAnimal(); i++) {
            myZoo.getAquaticAnimals()[i].swim();
        }

        Dolphin dolphin1 = new Dolphin("Dolphin Family", "Dolphin1", 5, true, "Ocean", 15.2f);
        Dolphin dolphin22 = new Dolphin("Dolphin Family", "Dolphin2", 8, true, "Sea", 18.5f);
        Peenguin penguin1 = new Peenguin("Penguin Family", "Penguin1", 3, true, "Antarctica", 50.3f);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin22);
        myZoo.addAquaticAnimal(penguin1);

        myZoo.displayNumberOfAquaticsByType();

        System.out.println("Maximum penguin swimming depth: " + myZoo.maxPenguinDepth());

        Acquatic aquatic1 = new Dolphin("Dolphin Family", "Dolphin1", 5, true, "Ocean", 15.2f);
        Acquatic aquatic2 = new Dolphin("Dolphin Family", "Dolphin1", 5, true, "Ocean", 15.2f);
        System.out.println("Are aquatic1 and aquatic2 equal? " + aquatic1.equals(aquatic2));


    }
}