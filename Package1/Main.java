package Package1;

public class Main {
    public static void main(String[] args) {
        Builder builder = new PCBuilder();
        PC customPC = builder.setCPU("Intel i7")
                            .setGPU("NVIDIA GTX 3080")
                            .setRAM("16GB")
                            .setstorage("1TB SSD")
                            .setpowerSupply("750W")
                            .build();
        System.out.println("========================");
        System.out.println(customPC);
    }
}
