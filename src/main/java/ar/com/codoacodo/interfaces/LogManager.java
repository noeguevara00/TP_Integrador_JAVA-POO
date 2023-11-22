package ar.com.codoacodo.interfaces;

public class LogManager {

	private String target;
	
	public static ILog getLogger(String target) {
//		A > FSLogger
//		B >  EmailLogger
//		C > SMSLogger
		
		//Interface i = new ClaseQueImplementa();
		
		ILog logger;
		switch (target) {
			case "A":
				logger = new SmsLog();
				((SmsLog)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLog();
				break;
			case "C":
				logger = new EmailLog();
				break;
			default:
				logger = null;
		}
		return logger;
	}
	
	public LogManager(String target) {
		this.target = target;
	}
	
	public ILog getLogger() {
//		A > FSLogger
//		B >  EmailLogger
//		C > SMSLogger
		
		//Interface i = new ClaseQueImplementa();
		
		ILog logger;
		switch (this.target) {
			case "A":
				logger = new SmsLog();
				((SmsLog)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLog();
				break;
			case "C":
				logger = new EmailLog();
				break;
			default:
				logger = null;
		}
		return logger;
	}
}
