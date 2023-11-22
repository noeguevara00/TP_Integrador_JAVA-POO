package ar.com.codoacodo.interfaces;

public class SmsLog implements ILog {

	
	//atributos?
	private String number;
	/*
	public SmsLog(String number) {
		this.number = number;
	}
	*/
	
	
	@Override
	public void log() {
		System.out.println("Enviando sms al: " + getNumber());
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}

}
