package com.mateacademy.builder;

public abstract class ComputerBuilder {
    private Computer computer;

    public void createComputer() {
        computer = new Computer();
    }

    abstract void buildMotherboard();
    abstract void buildProcessor();
    abstract void buildVideoCard();
    abstract void buildMemory();

    public Computer getComputer() {
        return computer;
    }
}
