
import java.util.*;

class RBI {
    double rate() {
        return 4;
    }
}

class SBI extends RBI {
    double rate() {
        return 7;
    }
}

class ICICI extends RBI {
    double rate() {
        return 6;
    }
}

class PNB extends RBI {
    double rate() {
        return 5;
    }
}

public class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Bank name to find the rate of Interest : ");
        String s = sc.next();

        RBI b;

        if(s.equalsIgnoreCase("RBI"))
            b = new RBI();
        else if(s.equalsIgnoreCase("SBI"))
            b = new SBI();
        else if(s.equalsIgnoreCase("ICICI"))
            b = new ICICI();
        else
            b = new PNB();

        System.out.printf("RBI rate of interest is : %.0f%%", b.rate());
    }
}

/*Output:


Enter the Bank name to find the rate of Interest : SBI
RBI rate of interest is : 7%
*/
