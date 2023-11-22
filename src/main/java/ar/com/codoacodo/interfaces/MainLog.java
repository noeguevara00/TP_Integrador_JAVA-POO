package ar.com.codoacodo.interfaces;

public class MainLog {

	public static void main(String[] args) {

		String target = getTargetFromDB();
		
		LogManager lm = new LogManager(target);	
		
		ILog logger = lm.getLogger();
		
		logger.log();
	}
	
	public static String getTargetFromDB() {
		return "C";
	}

	public static void mainV2(String[] args) {

		ILog[] loggers = new ILog[3];
		
		loggers[0] = LogManager.getLogger("A");
		loggers[1] = LogManager.getLogger("B");
		loggers[2] = LogManager.getLogger("C");
		
		for (ILog iLogger : loggers) {
			iLogger.log();
		}
	}

}
