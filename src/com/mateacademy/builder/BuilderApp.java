package com.mateacademy.builder;

public class BuilderApp {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new GamingComputerBuilder());
        Computer computer = director.BuildComputer();
        System.out.println(computer);

        director.setBuilder(new OfficeComputerBuilder());
        computer = director.BuildComputer();
        System.out.println(computer);
    }
}
