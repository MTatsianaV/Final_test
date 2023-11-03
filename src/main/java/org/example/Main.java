package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> catCommands1 = new ArrayList<>();
        catCommands1.add("Jump");
        catCommands1.add("Meow");
        catCommands1.add("Sit");
        Cats cat1 = new Cats("Murca", "2020.01.01", catCommands1);
        List<String> catCommands2 = new ArrayList<>();
        catCommands2.add("Jump");
        catCommands2.add("Meow");
        catCommands2.add("Roll");
        Cats cat2 = new Cats("Tom", "2021.02.02", catCommands2);
        List<String> catCommands3 = new ArrayList<>();
        catCommands3.add("Jump");
        catCommands3.add("Meow");
        catCommands3.add("Roll");
        Cats cat3 = new Cats("Mutzik", "2019.03.02", catCommands2);
        List<String> dogCommands1 = new ArrayList<>();
        dogCommands1.add("Sit");
        dogCommands1.add("Stay");
        dogCommands1.add("Voice");
        dogCommands1.add("Jump");
        Dogs dog1 = new Dogs("Jack", "2017.03.01", dogCommands1);
        List<String> dogCommands2 = new ArrayList<>();
        dogCommands2.add("Sit");
        dogCommands2.add("Stay");
        dogCommands2.add("Voice");
        dogCommands2.add("Jump");
        Dogs dog2 = new Dogs("Granda", "2022.07.01", dogCommands1);
        List<String> dogCommands3 = new ArrayList<>();
        dogCommands3.add("Sit");
        dogCommands3.add("Stay");
        dogCommands3.add("Voice");
        dogCommands3.add("Jump");
        Dogs dog3 = new Dogs("Reks", "2022.12.01", dogCommands3);
        List<String> hamsterCommands1 = new ArrayList<>();
        hamsterCommands1.add("Jump");
        hamsterCommands1.add("Stay");
        hamsterCommands1.add("Run");
        Hamsters hamster1 = new Hamsters("Ginger", "2023.04.15", hamsterCommands1);
        List<String> hamsterCommands2 = new ArrayList<>();
        hamsterCommands2.add("Run");
        hamsterCommands2.add("Roll");
        Hamsters hamster2 = new Hamsters("Circle", "2022.11.02", hamsterCommands2);
        List<String> hamsterCommands3 = new ArrayList<>();
        hamsterCommands3.add("Run");
        Hamsters hamster3 = new Hamsters("Homa", "2022.12.25", hamsterCommands3);
        List<String> horseCommands1 = new ArrayList<>();
        horseCommands1.add("Jump");
        horseCommands1.add("Stay");
        horseCommands1.add("Run");
        Horses horse1 = new Horses("Black", "2018.08.10", horseCommands1);
        List<String> horseCommands2 = new ArrayList<>();
        horseCommands2.add("Jump");
        horseCommands2.add("Stay");
        horseCommands2.add("Run");
        horseCommands2.add("Back");
        Horses horse2 = new Horses("Marusya", "2019.11.11", horseCommands2);
        List<String> horseCommands3 = new ArrayList<>();
        horseCommands3.add("Jump");
        horseCommands3.add("Back");
        horseCommands3.add("Run");
        Horses horse3 = new Horses("Buran", "2020.12.12", horseCommands2);
        List<String> camelCommands1 = new ArrayList<>();
        camelCommands1.add("Git");
        camelCommands1.add("Durr");
        camelCommands1.add("Kush");
        Camels camle1 = new Camels("Zembo", "2019.01.14", camelCommands1);
        List<String> camelCommands2 = new ArrayList<>();
        camelCommands2.add("Git");
        camelCommands2.add("Durr");
        camelCommands2.add("Kush");
        camelCommands2.add("Hup");
        Camels camle2 = new Camels("Lila", "2020.02.02", camelCommands2);
        List<String> camelCommands3 = new ArrayList<>();
        camelCommands3.add("Git");
        camelCommands3.add("Durr");
        camelCommands3.add("Kush");
        camelCommands3.add("Hup");
        camelCommands3.add("Khh");
        Camels camle3 = new Camels("Blum", "2020.03.02", camelCommands3);
        List<String> donkeyCommands1 = new ArrayList<>();
        donkeyCommands1.add("Go");
        donkeyCommands1.add("Stay");
        Donkeys donkey1 = new Donkeys("Liz", "2021.05.07", donkeyCommands1);
        List<String> donkeyCommands2 = new ArrayList<>();
        donkeyCommands2.add("Go");
        donkeyCommands2.add("Stay");
        donkeyCommands2.add("Hurry");
        Donkeys donkey2 = new Donkeys("Perp", "2022.04.21", donkeyCommands2);
        List<String> donkeyCommands3 = new ArrayList<>();
        donkeyCommands3.add("Go");
        donkeyCommands3.add("Stay");
        donkeyCommands3.add("Run");
        Donkeys donkey3 = new Donkeys("Dior", "2022.12.03", donkeyCommands3);


        AnimalRegistry registry = new AnimalRegistry();
        registry.addAnimal(cat1);
        registry.addAnimal(cat2);
        registry.addAnimal(cat3);
        registry.addAnimal(dog1);
        registry.addAnimal(dog2);
        registry.addAnimal(dog3);
        registry.addAnimal(hamster1);
        registry.addAnimal(hamster2);
        registry.addAnimal(hamster3);
        registry.addAnimal(horse1);
        registry.addAnimal(horse2);
        registry.addAnimal(horse3);
        registry.addAnimal(camle1);
        registry.addAnimal(camle2);
        registry.addAnimal(camle3);
        registry.addAnimal(donkey1);
        registry.addAnimal(donkey2);
        registry.addAnimal(donkey3);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Animal Registry Menu =====");
            System.out.println("1. Add new animal");
            System.out.println("2. Display animal commands");
            System.out.println("3. Train new command");
            System.out.println("4. Display animals by birth date");
            System.out.println("5. Display total animal count");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter animal birth date (yyyy-mm-dd): ");
                    String birthDate = scanner.nextLine();
                    List<String> commands = new ArrayList<>();
                    System.out.print("Enter number of commands: ");
                    int numCommands = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numCommands; i++) {
                        System.out.print("Enter command " + (i + 1) + ": ");
                        String command = scanner.nextLine();
                        commands.add(command);
                    }
                    System.out.print("Enter animal type (dog, cat, hamster, horse, camel, donkey): ");
                    String type = scanner.nextLine();

                    Animals animal;
                    switch (type) {
                        case "dog":
                            animal = new Dogs(name, birthDate, commands);
                            break;
                        case "cat":
                            animal = new Cats(name, birthDate, commands);
                            break;
                        case "hamster":
                            animal = new Hamsters(name, birthDate, commands);
                            break;
                        case "horse":
                            animal = new Horses(name, birthDate, commands);
                            break;
                        case "camel":
                            animal = new Camels(name, birthDate, commands);
                            break;
                        case "donkey":
                            animal = new Donkeys(name, birthDate, commands);
                            break;
                        default:
                            System.out.println("Invalid animal type.");
                            continue;
                    }

                    registry.addAnimal(animal);
                    System.out.println("New animal added to the registry.");
                    break;

                case 2:
                    System.out.print("Enter animal name: ");
                    String animalName = scanner.nextLine();
                    registry.displayAnimalCommands(animalName);
                    break;

                case 3:
                    System.out.print("Enter animal name: ");
                    String animalName2 = scanner.nextLine();
                    System.out.print("Enter new command: ");
                    String newCommand = scanner.nextLine();
                    registry.trainNewCommand(animalName2, newCommand);
                    break;

                case 4:
                    registry.displayAnimalsByBirthDate();
                    break;

                case 5:
                    registry.displayAnimalCount();
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
