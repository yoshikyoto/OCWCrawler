import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Logger{
	public static PrintWriter p;
	public PrintWriter pw;

	// Class Method
	public static void setLogName(String filename){
		if(p != null) p.close();
		
		File dir = new File("log");
		dir.mkdir();

		try {
			File file = new File("log/" + filename);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			p = new PrintWriter(bw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sPrint(String str){ p.print(str); }
	public static void sPrintln(String str){ p.println(str); }
	public static void sClose(){ p.close(); }
	
	
	// Instance Method
	Logger(String filename){
		File dir = new File("log");
		dir.mkdir();

		try {
			File file = new File("log/" + filename);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void println(String str){ pw.println(str); }
	public void print(String str){ pw.print(str); }
	public void close(){ pw.close(); }
}