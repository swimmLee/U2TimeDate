package u2time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author lheberer
 */
public class U2Time {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate  jt = LocalDate.of(1987, 3, 9); //joshuaTree
        LocalDate  rh = LocalDate.of(1988, 10, 10); //rattleAndHum
        LocalDate today = LocalDate.now();
        
        System.out.println("jt date " + jt);
        System.out.println("rh date " + rh);
        System.out.println("today is date " + today);
        
        Period d1 = Period.between(jt, today);
        System.out.println("Joshua tree to Today is: "+ d1);
        
        Period d2 = Period.between(jt, rh);
        System.out.println("Time jt to rh is: " + d2);
        
        LocalDate d3 = rh.plus(d2);
        System.out.println("Date for album three release: " + d3);
    }
    
}
