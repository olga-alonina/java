package day1_keep_all_folders.April.April_20_day_50_Inheritance.computer;

public class Computer {
    String os;
    int memory;

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
