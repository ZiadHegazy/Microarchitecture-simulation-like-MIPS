package components;

import Exceptions.WrongLengthException;

public class R_Instruction extends Instruction{
	private String R1; 
	private String R2; 
	private String R3;
	private String SHAMT;
	private String Value; 
	public R_Instruction(String OPCODE ,String R1, String R2, String R3, String SHAMT) throws WrongLengthException {
		super(OPCODE);
		if(R1.length()!=5){
			throw new WrongLengthException("R1 should be of Length 5");
		}else if(R2.length()!=5){
			throw new WrongLengthException("R2 should be of Length 5");		
		}else if(R3.length()!=5){
			throw new WrongLengthException("R3 should be of Length 5");		
		}else if(SHAMT.length()!=13){
			throw new WrongLengthException("Shamt should be of Length 13");}
		
		this.R1 = R1;
		this.R2 = R2;
		this.R3 = R3;
		this.SHAMT = SHAMT;
		this.Value = OPCODE + R1 + R2 + R3 + SHAMT ;
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
	public String getSHAMT() {
		return SHAMT;
	}
	public String getValue() {
		return Value;
	}
	
}
