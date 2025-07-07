public class PetMachine {
    private boolean clean = true;
    private int water = 10;
    private int shampoo = 10;
    private Pet pet;

    public void takeShowerInPet(){
        if(this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet esta limpo");
    }

    public void addWater(){
        if(this.water == 30){
            System.out.println("A capacidade de aguá da maquina esta no limite");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if(this.shampoo == 10){
            System.out.println("A capacidade de aguá da maquina esta no limite");
            return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if(hasPet()){
            System.out.println("O pet esta na maquina nesse momento!");
            return;
        }
        if (this.clean){
            System.out.println("A maquina esta suja");
            return;
        }

        this.pet = pet;

    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet esta limpo");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina esta limpa");
    }
}
