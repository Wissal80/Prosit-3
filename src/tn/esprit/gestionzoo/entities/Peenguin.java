package tn.esprit.gestionzoo.entities;

public class Peenguin extends Acquatic{
    private float SwimigDepth;

    public Peenguin(String family, String name, int age, Boolean isMammal, String habitat, float v) {
        super(family, name, age, isMammal, habitat);
    }


    public float getSwimigDepth() {

        return SwimigDepth;
    }

    public void setSwimigDepth(float swimigDepth) {
        SwimigDepth = swimigDepth;
    }

    public String toString(){

        return super.toString()+"SwimingDepth"+SwimigDepth;
    }



}
