package registers;

public class Registers {
	ZeroRegister R0 ;
	PcRegister PC ;
	GeneralRegister [] R ;
	
	public Registers(){
	R0 = new ZeroRegister();
	PC = new PcRegister();
	R = new GeneralRegister[31];
	for (int i = 0; i < R.length; i++) {
		R[i]=new GeneralRegister();
	}
	
	
	}

	public ZeroRegister getR0() {
		return R0;
	}

	public PcRegister getPC() {
		return PC;
	}

	public GeneralRegister[] getR() {
		return R;
	}

}
