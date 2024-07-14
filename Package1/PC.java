package Package1;

public class PC {

    private String RAM;
	private String GPU;
    private String CPU;
    private String storage;
	private String powerSupply;
    
    public PC(PCBuilder builder) {
		this.RAM=builder.RAM;
		this.GPU=builder.GPU;
		this.CPU=builder.CPU;
		this.storage=builder.storage;
        this.powerSupply = builder.powerSupply;
	}

    @Override
    public String toString() {
        return "\n CPU: " + CPU +
                "\n GPU=" + GPU + 
                "\n RAM=" + RAM + 
                "\n storage=" + storage + 
                "\n powerSupply=" + powerSupply;
    }


    
}
