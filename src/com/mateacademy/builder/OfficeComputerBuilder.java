package com.mateacademy.builder;

public class OfficeComputerBuilder extends ComputerBuilder {

    @Override
    void buildMotherboard() {
        getComputer().setMotherboard(Computer.Motherboard.MSI);
    }

    @Override
    void buildProcessor() {
        getComputer().setProcessor(Computer.Processor.AMD);
    }

    @Override
    void buildVideoCard() {
        getComputer().setVideoCard(Computer.VideoCard.Palit);
    }

    @Override
    void buildMemory() {
        getComputer().setMemory(Computer.Memory.HDD);
    }
}
