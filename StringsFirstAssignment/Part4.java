
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;

public class Part4 {
    public void findurl() {
        URLResource ur = new URLResource ("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String s : ur.words()) {
            String stolower = s.toLowerCase();
            int pos = stolower.indexOf("youtube.com");
            if (pos != -1) {
                int beg = s.lastIndexOf("\"", pos);
                int end = s.indexOf("\"", pos +1);
                System.out.println(s.substring(beg +1, end));
            }
            /**
            if (stolower.contains("youtube.com") && (stolower.contains("https://")) || (stolower.contains("https://"))) {
               int startIndex = stolower.indexOf("\"");
               int endIndex = stolower.indexOf("\"");
               String youtubeLink = s.substring(startIndex, endIndex);
               System.out.println(youtubeLink ); 
            }
            */
        }
    }
}
