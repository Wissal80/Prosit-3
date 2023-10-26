package tn.esprit.gestionzoo.entities;

public class Dolphin extends Acquatic{
    private float Swimingspeed;

    public Dolphin(String family, String name, int age, Boolean isMammal, String habitat, float v) {
        super(family, name, age, isMammal, habitat);
        this.Swimingspeed=Swimingspeed;
    }



    public float getSwimingspeed() {
        return Swimingspeed;

    }

    public void setSwimingspeed(float swimingspeed) {
        Swimingspeed = swimingspeed;
    }

    public String toString(){
        return super.toString()+"swimingspeed:"+Swimingspeed;
    }

    public void Swim(){
        System.out.println("this dolphin is swiming");
    }
}
