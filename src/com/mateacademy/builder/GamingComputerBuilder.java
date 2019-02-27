package com.mateacademy.builder;

public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    void buildMotherboard() {
        getComputer().setMotherboard(Computer.Motherboard.ASUS);
    }

    @Override
    void buildProcessor() {
        getComputer().setProcessor(Computer.Processor.Intel);
    }

    @Override
    void buildVideoCard() {
        getComputer().setVideoCard(Computer.VideoCard.Nvidia);
    }

    @Override
    void buildMemory() {
        getComputer().setMemory(Computer.Memory.SSD);
    }
}
