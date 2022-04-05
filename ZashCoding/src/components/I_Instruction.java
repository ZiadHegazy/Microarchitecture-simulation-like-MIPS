package components;

import Exceptions.WrongLengthException;

public class I_Instruction extends Instruction{
	private String R1; 
	private String R2; 
	private String R3;
	private String IMMEDIATE;
	private String Value;
	public I_Instruction(String OPCODE ,String R1, String R2, String IMMEDIATE) throws WrongLengthException {
		super(OPCODE);
		if(R1.length()!=5){
			throw new WrongLengthException("R1 should be of Length 5");
		}else if(R2.length()!=5){
			throw new WrongLengthException("R2 should be of Length 5");		
		}else if(IMMEDIATE.length()!=18){
			throw new WrongLengthException("IMMEDIATE should be of Length 18");
		}
		
		this.R1 = R1;
		this.R2 = R2;
		this.IMMEDIATE = IMMEDIATE;
		this.Value = OPCODE + R1 + R2 + IMMEDIATE ;
	
}
	public String getR1() {
		return R1;
	}
	public String getR2() {
		return R2;
	}
	public String getR3() {
		return R3;
	}
	public String getIMMEDIATE() {
		return IMMEDIATE;
	}
	public String getValue() {
		return Value;
	}
}
