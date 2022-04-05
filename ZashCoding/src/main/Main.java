package main;

import registers.Registers;
import components.MainMemory;

public class Main {
	MainMemory M ;
	Registers R ;
	
	public void fetch(){
		M.getInstruction(R.getPC().getDecimalValue());
		R.getPC().setDecimalValue(R.getPC().getDecimalValue()); 
	}
}
