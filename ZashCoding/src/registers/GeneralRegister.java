package registers;

public class GeneralRegister {
	private final int width = 32 ; 
	private String binaryValue ="00000000000000000000000000000000"; 
	private int DecimalValue=0;
	

	public GeneralRegister(){
		
		
	}
	public String getBinaryValue() {
		return binaryValue;
	}

	public int getDecimalValue() {
		return DecimalValue;
	}

	public void setDecimalValue(int decimalValue) {
		DecimalValue = decimalValue;
		this.binaryValue= Integer.toBinaryString(DecimalValue);
		int size = binaryValue.length();
		for (int i = 0; i < (width-size); i++) {
			binaryValue="0"+binaryValue;
		}
	}

	public int getWidth() {
		return width;
	}
	
	
}
