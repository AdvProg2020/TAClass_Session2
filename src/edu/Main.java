package edu;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("1398-2");
        CommandProcessor commandProcessor = new CommandProcessor(manager);
        commandProcessor.run();
    }
}
