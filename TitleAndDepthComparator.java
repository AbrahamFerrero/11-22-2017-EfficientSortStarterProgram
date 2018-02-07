import java.util.*;
/**
 * This class has been created by Abraham Ferrero as a requirement for assignment 2. Please read the readme.txt
 * file for more information.
 * 
 * @author (Abraham Ferrero) 
 * @version (23/NOV/2017)
 */
public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry qe1, QuakeEntry qe2) {
        int compString = qe1.getInfo().compareTo(qe2.getInfo());
        if (compString == 0){
            return Double.compare(qe1.getDepth(), qe2.getDepth());
        }
        return compString;
    }
}
