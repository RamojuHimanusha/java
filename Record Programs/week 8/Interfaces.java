
import java.util.*;

interface Employee {
    void salary();
}

class Regular implements Employee {
    public void salary() {
        System.out.printf("Salary Details:\n");
        System.out.printf("Basic Pay: 25000 HRA: 15000 T.A: 5000 Total Amount: 45000");
    }
}

class Contract implements Employee {
    public void salary() {
        System.out.printf("Salary Details:\n");
        System.out.printf("Basic Pay: 12000 HRA: 0 T.A: 3000 Total Amount: 15000");
    }
}

public class EmployeeSalary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Employee Id: ");
        String id = sc.next();

        Employee e;

        if(id.charAt(0) == 'R')
            e = new Regular();
        else
            e = new Contract();

        e.salary();
    }
}


/*Output
Enter Employee Id: R101
Salary Details:
Basic Pay: 25000 HRA: 15000 T.A: 5000 Total Amount: 45000
*/
