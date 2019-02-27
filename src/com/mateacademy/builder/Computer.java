package com.mateacademy.builder;

public class Computer {
    private Motherboard motherboard;
    private Processor processor;
    private VideoCard videoCard;
    private Memory memory;

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Computer: motherboard=" + motherboard + ", processor=" + processor +
                ", videocard=" + videoCard + ", memory=" + memory;
    }
}
