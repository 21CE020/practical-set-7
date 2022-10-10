import java.util.ArrayList;
import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        ArrayList<P7_3> obj = new ArrayList<P7_3>();
        int i = 1;
        while (i < 6) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter following details :-");
            System.out.println("Age :");
            int age = sc.nextInt();
            System.out.println("Net monthly Income :");
            double netincome = sc.nextDouble();
            System.out.println("Total work Experience :");
            int exp = sc.nextInt();
            System.out.println("Citizenship :");
            String citizenship = sc.next();
            obj.add(new P7_3(age, netincome, exp, citizenship));
            i++;
        }
        System.out.println("--------------------------------------------------");
        for (int j = 1; j < obj.size() + 1; j++) {
            System.out.println("AccHolder " + j + " is " + obj.get(j - 1).eligibility());
        }
    }
}
