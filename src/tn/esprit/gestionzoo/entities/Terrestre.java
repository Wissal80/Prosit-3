package tn.esprit.gestionzoo.entities;

public  final class Terrestre  extends Animal {
        private int nbrLegs ;

        public Terrestre(){
                super();
        }

        public Terrestre(String family, String name , int age , boolean isMammal , int nbrLegs){
                super(family, name, age, isMammal);
                this.nbrLegs = nbrLegs;
        }


        public String toString() {
                super.toString();
                return "Terrestrial: number of legs - " + nbrLegs ;
        }


}
