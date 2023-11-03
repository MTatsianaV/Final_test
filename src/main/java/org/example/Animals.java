package org.example;

import java.util.List;

public class Animals {
    private static int animalCount = 0;

    private String name;
    private String birthDate;
    private List<String> commands;

    public Animals(String name, String birthDate, List<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
