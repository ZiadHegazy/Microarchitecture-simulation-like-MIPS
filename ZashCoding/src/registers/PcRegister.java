package registers;

public class PcRegister extends GeneralRegister{
	
	public PcRegister(){
		
	}
	public void increment(){
		this.setDecimalValue(this.getDecimalValue()+1);
	}
	public static void main(String[] args) {
		PcRegister s = new PcRegister();
		s.setDecimalValue(9);
		System.out.println(s.getBinaryValue());
		s.increment();
		System.out.println(s.getBinaryValue());
		
	}
}
