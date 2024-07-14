package Package1;

public class PCBuilder implements Builder{

    public String RAM ;
	public String GPU ;
    public String CPU ;
    public String storage;
	public String powerSupply;


    @Override
    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public Builder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    @Override
    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public Builder setstorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Builder setpowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    @Override
    public PC build() {
        return new PC(this);
    }
    
}
