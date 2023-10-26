package tn.esprit.gestionzoo.entities;

public class Acquatic extends Animal{
    private  String habitat;
    private float SwimingSpeed;


    public Acquatic(String family, String name, int age, Boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
        this.SwimingSpeed=SwimingSpeed;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getSwimingSpeed() {
        return SwimingSpeed;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setSwimingSpeed(float swimingSpeed) {
        SwimingSpeed = swimingSpeed;
    }

    @Override
    public String toString() {
        return "Acquatic{" +
                "habitat='" + habitat + '\'' +
                ", SwimingSpeed=" + SwimingSpeed +
                '}';
    }
}
