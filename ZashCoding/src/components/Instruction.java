package components;

import Exceptions.WrongLengthException;

public class Instruction {
	private String OPCODE ; 
	private boolean isFetching;
	private boolean isDecoding;
	private boolean isExecuting;
	private boolean isInMem;
	private boolean isWriting;
	private int counter; 
	
	public Instruction (String OPCODE) throws WrongLengthException{
		if(OPCODE.length()!=4) throw new WrongLengthException("OPCODE should be of size 4");
		this.OPCODE = OPCODE; 
	}
	
	
	public boolean isFetching() {
		return isFetching;
	}

	public void setFetching(boolean isFetching) {
		this.isFetching = isFetching;
	}

	public boolean isDecoding() {
		return isDecoding;
	}

	public void setDecoding(boolean isDecoding) {
		this.isDecoding = isDecoding;
	}

	public boolean isExecuting() {
		return isExecuting;
	}

	public void setExecuting(boolean isExecuting) {
		this.isExecuting = isExecuting;
	}

	public boolean isInMem() {
		return isInMem;
	}

	public void setInMem(boolean isInMem) {
		this.isInMem = isInMem;
	}

	public boolean isWriting() {
		return isWriting;
	}

	public void setWriting(boolean isWriting) {
		this.isWriting = isWriting;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getOPCODE() {
		return OPCODE;
	}

	
	
}
