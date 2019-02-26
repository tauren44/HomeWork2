package com.mateacademy.builder;

public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    void buildMotherboard() {
        computer.setMotherboard(Computer.Motherboard.ASUS);
    }

    @Override
    void buildProcessor() {
        computer.setProcessor(Computer.Processor.Intel);
    }

    @Override
    void buildVideoCard() {
        computer.setVideoCard(Computer.VideoCard.Nvidia);
    }

    @Override
    void buildMemory() {
        computer.setMemory(Computer.Memory.SSD);
    }
}
