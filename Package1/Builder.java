package Package1;

public interface Builder {
    
    public String RAM = "";
	public String GPU = "";
    public String CPU = "";
    public String storage= "";
	public String powerSupply ="";

    
    Builder setRAM(String RAM);
    Builder setGPU(String GPU);
    Builder setCPU(String CPU);
    Builder setstorage(String storage);
    Builder setpowerSupply(String powerSupply);
    PC build();
}
