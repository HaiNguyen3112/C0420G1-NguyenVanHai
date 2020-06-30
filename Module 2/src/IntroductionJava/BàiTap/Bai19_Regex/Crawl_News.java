package IntroductionJava.BàiTap.Bai19_Regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl_News {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", ",");
            // regex
            Pattern p = Pattern.compile("<h2><a title=(.)+\">(.*?)</a></h2>");
//            Pattern p = Pattern.compile(">(.*?)</a></h2>");
////            Pattern p = Pattern.compile("<h2><a title=(.)+\">(.*?)</a>");
////            Pattern p = Pattern.compile(".htm\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
//                System.out.println(m.group(0));
//                System.out.println(m.group(1));
                System.out.println(m.group(2));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
