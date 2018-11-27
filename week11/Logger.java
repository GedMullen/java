public class Logger {

	public static boolean debug = true;
	public static void log(String string){
			if(debug) System.out.println(string);
	}	
}
