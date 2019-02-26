package com.mateacademy.builder;

public class OfficeComputerBuilder extends ComputerBuilder {

    @Override
    void buildMotherboard() {
        computer.setMotherboard(Computer.Motherboard.MSI);
    }

    @Override
    void buildProcessor() {
        computer.setProcessor(Computer.Processor.AMD);
    }

    @Override
    void buildVideoCard() {
        computer.setVideoCard(Computer.VideoCard.Palit);
    }

    @Override
    void buildMemory() {
        computer.setMemory(Computer.Memory.HDD);
    }
}
