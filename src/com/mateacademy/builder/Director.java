package com.mateacademy.builder;

public class Director {
    private ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer BuildComputer() {
        builder.createComputer();
        builder.buildMotherboard();
        builder.buildProcessor();
        builder.buildVideoCard();
        builder.buildMemory();
        return builder.getComputer();
    }
}
