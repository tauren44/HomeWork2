package com.mateacademy.builder;

public class OfficeComputerBuilder extends ComputerBuilder {

    @Override
    void buildMotherboard() {
        getComputer().setMotherboard(Motherboard.MSI);
    }

    @Override
    void buildProcessor() {
        getComputer().setProcessor(Processor.AMD);
    }

    @Override
    void buildVideoCard() {
        getComputer().setVideoCard(VideoCard.Palit);
    }

    @Override
    void buildMemory() {
        getComputer().setMemory(Memory.HDD);
    }
}
