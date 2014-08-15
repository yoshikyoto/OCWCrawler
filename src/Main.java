import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{
	
	/*
	 * OCW一覧: http://edu.k-forte.net/2013/06/ocw-japan-university/
	 * ocw.kyoto-u.ac.jp
	 * ocw.u-tokyo.ac.jp
	 * ocw.nagoya-u.jp
	 */
	public static void main(String args[]){
		String domains[] = {
			"ocw.kyoto-u.ac.jp",
			"ocw.u-tokyo.ac.jp",
			"ocw.nagoya-u.jp"
		};
		
		String ocwDomain = "ocw.kyoto-u.ac.jp";
		String courselist = "courselist";
		String logfile = "OcwCrawler.log";
		
		if(args.length >= 2){
			ocwDomain = args[0];
			courselist = args[1];
			logfile = ocwDomain + ".log";
			if(args.length >= 3) logfile = args[3];
		}
		
		Logger.setLogName(logfile);
		OCWCrawler crawler = new OCWCrawler(ocwDomain, courselist);
		crawler.crawl();
		Logger.sClose();
	}
}