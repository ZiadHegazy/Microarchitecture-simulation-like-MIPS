package components;

import Exceptions.WrongLengthException;

public class J_Instruction extends Instruction{
	private String Adress;
	private String Value; 
	public J_Instruction(String OPCODE , String Address) throws WrongLengthException{
		super(OPCODE);
		if(Address.length()!=28)throw new WrongLengthException("Address should be of Length 28");
		
		this.Adress=Address;
		this.Value = OPCODE + Address ;

	}
	public String getAdress() {
		return Adress;
	}
	public String getValue() {
		return Value;
	}
}
