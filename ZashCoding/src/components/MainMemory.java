package components;

public class MainMemory {
	private final int size = 2048;
	private Object [] Mem ; 
	
	public MainMemory(String filepath){
		Object [] Mem = new Object[size];
	}
	
	public Instruction getInstruction(int pc){
		return (Instruction) Mem[pc];
	}
	
}
