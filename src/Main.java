
public class Main {
    public static void main(String[] args) {

            Zoo z1 = new Zoo("Friguia", "Sousse",20);
            Zoo z2 = new Zoo("belvedere", "Tunis",30);
            Zoo GrandZoo = Zoo.comparerZoo (z1, z2);
            System.out.println("Le plus grand zoo est : " + GrandZoo.getName());
        boolean Plein1 = Zoo.isZooFull(z1);
        boolean Plein2 = Zoo.isZooFull(z2);

        System.out.println("Le zoo 1 est plein : " + Plein1);
        System.out.println("Le zoo 2 est plein : " + Plein1);

        }

    }
