package javalogging;
import java.io.IOException;
import java.util.logging.*;

public class DemoLogger {
	private final static Logger logs=Logger.getLogger(DemoLogger.class.getName());

	
	public void printLog() throws SecurityException, IOException {
		System.out.println("In Class:"+DemoLogger.class.getName());
		logs.setLevel(Level.ALL);
		System.out.println("level is: "+logs.getLevel());
		ConsoleHandler handler1=new ConsoleHandler();
		FileHandler handler=new FileHandler("D:\\Java Programs\\helloworld\\bin\\javalogging\\loggingDemo.log");
		handler.setLevel(Level.ALL);
		handler1.setLevel(Level.ALL);
		logs.addHandler(handler1);
		logs.addHandler(handler);
		XMLFormatter xmlf=new XMLFormatter();
		handler.setFormatter(xmlf);
		handler1.setFormatter(new SimpleFormatter());
		handler.setFilter(logs.getFilter());
		//logs.removeHandler(handler);
		logs.log(Level.FINEST,"Finest level log.");
		Handler[] handlerList=logs.getHandlers();
		System.out.println("Handlers: ");
		for(Handler h:handlerList) {
			System.out.println(h.getClass().getName());
		}		
	}
}
