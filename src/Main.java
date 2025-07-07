import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        var option = -1;
        do {
            System.out.println("Escolha uma das opções ");
            System.out.println("========================");
            System.out.println("1- dar banho no pet ");
            System.out.println("2- abastecer maquina com agua ");
            System.out.println("3- abastecer maquina com shampoo ");
            System.out.println("4- verificar agua da maquina ");
            System.out.println("5- verificar shampoo da maquina ");
            System.out.println("6- verificar se tem pet no banho ");
            System.out.println("7- colocar pet na maquina ");
            System.out.println("8- retirar pet da maquina ");
            System.out.println("9- limpar a maquina ");
            System.out.println("0- Encerrar ");
            System.out.println("========================");

            option = scanner.nextInt();
            switch (option) {
                case 1 -> petMachine.takeShowerInPet();
                case 2 -> setWater();
                case 3 -> setShampooIn();
                case 4 -> verifiWater();
                case 5 -> verifiShampoo();
                case 6 -> checkPet();
                case 7 -> setPetInPetMachine();
                case 8 -> getPetFromMachine();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Invalida!!");

            }
        }while (option != 0);
    }

    private static void setShampooIn() {
        System.out.println("tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void setWater() {
        System.out.println("tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void verifiWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina esta no momento com" + amount + "litros de shampoo");
    }

    private static void verifiShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com" + amount + "litros de shampoo");
    }

    private static void checkPet() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "tem pet na maquina" : "não tem pet na maquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
    }

    public static void getPetFromMachine(){
        petMachine.removePet();
    }
}