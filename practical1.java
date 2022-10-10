import java.util.Arrays;
 
public class practical1 {
    public static void main(String[] args) {
        P7_1[] s = new P7_1[4];
        s[0] = new P7_1("Aakash", 18, 35);
        s[1] = new P7_1("Rishikesh", 18, 94);
        s[2] = new P7_1("Darsh", 19, 53);
        s[3] = new P7_1("Darshan", 18, 82);
        System.out.println("------------------------------------ --------------");
        System.out.println("Before sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
        Arrays.sort(s);
        System.out.println("After sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
    }
}
