
public class ComputerTest {
    public static void main(String[] args) {
        // High-end configuration
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.showSpecs();

        System.out.println("\n------------------\n");

        // Budget configuration
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB HDD")
                .build();

        System.out.println("Office PC Configuration:");
        officePC.showSpecs();
    }
}
