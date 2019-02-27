package com.mateacademy.builder;

public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    void buildMotherboard() {
        getComputer().setMotherboard(Motherboard.ASUS);
    }

    @Override
    void buildProcessor() {
        getComputer().setProcessor(Processor.Intel);
    }

    @Override
    void buildVideoCard() {
        getComputer().setVideoCard(VideoCard.Nvidia);
    }

    @Override
    void buildMemory() {
        getComputer().setMemory(Memory.SSD);
    }
}
