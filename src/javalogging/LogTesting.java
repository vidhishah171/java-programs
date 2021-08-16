package javalogging;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
//import org.apache.log4j.Logger;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LogTesting {

	//static Logger logger=Logger.getLogger(LogTesting.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {
		// TODO Auto-generated method stub
		DemoLogger dlogger=new DemoLogger();
		dlogger.printLog();
		System.out.println();
		System.out.println("In Class:"+LogTesting.class.getName());
		LogManager lgm=LogManager.getLogManager();
		Logger log=lgm.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.setLevel(Level.FINEST);
		FileHandler handler=new FileHandler("D:\\Java Programs\\helloworld\\bin\\javalogging\\logging.log");
		handler.setLevel(Level.FINEST);
		log.addHandler(handler);
		XMLFormatter xmlf=new XMLFormatter();
		handler.setFormatter(xmlf);
		log.config("Config level log in file.");
		log.log(Level.FINER,"Finer level log in file.");
		log.severe("Severe level log in file and console.");
		log.warning("Warning level log in file and console.");

	}

}
