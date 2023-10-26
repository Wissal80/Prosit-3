package tn.esprit.gestionzoo.entities;

public non-sealed class Acquatic extends Animal  {

    private String habitat ;

    public Acquatic(){
        super();
    }
    public Acquatic(String family, String name , int age , boolean isMammal , String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Acquatic aquatic = (Acquatic) obj;
        return getAge() == aquatic.getAge() && getName().equals(aquatic.getName()) && habitat.equals(aquatic.habitat);
    }
}
