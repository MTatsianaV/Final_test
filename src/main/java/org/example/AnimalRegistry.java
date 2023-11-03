package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animals> animalList;

    public AnimalRegistry() {
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animals animal) {
        animalList.add(animal);
    }

    public void displayAnimalCommands(String name) {
        for (Animals animal : animalList) {
            if (animal.getName().equals(name)) {
                List<String> commands = animal.getCommands();
                System.out.println("Список команд для животного " + name + ":");
                for (String command : commands) {
                    System.out.println(command);
                }
                return;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
    }

    public void trainNewCommand(String name, String newCommand) {
        for (Animals animal : animalList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.addCommand(newCommand);
                System.out.println("New command added for " + animal.getName() + ": " + newCommand);
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    public void displayAnimalsByBirthDate() {
        animalList.sort((a1, a2) -> a1.getBirthDate().compareTo(a2.getBirthDate()));
        System.out.println("Animals sorted by birth date:");
        for (Animals animal : animalList) {
            System.out.println("Name: " + animal.getName() + ", Birth Date: " + animal.getBirthDate());
        }
    }

    public void displayAnimalCount() {
        System.out.println("Total number of animals: " + Animals.getAnimalCount());
    }
}
