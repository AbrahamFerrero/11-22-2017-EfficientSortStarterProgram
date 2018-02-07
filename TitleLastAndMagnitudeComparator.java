import java.util.*;
/**
 * This class has been created by Abraham Ferrero as a requirement for assignment 3. Please read the readme.txt
 * file for more information.
 * 
 * @author (Abraham Ferrero) 
 * @version (23/NOV/2017)
 */
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2){
        String info1 = q1.getInfo();
        String info2 = q2.getInfo(); 
        String last1 = info1.substring(info1.lastIndexOf(" ")+1);
        String last2 = info2.substring(info2.lastIndexOf(" ")+1);
        int compString = last1.compareTo(last2);
        if(compString == 0){
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
        return compString;
    }
}


