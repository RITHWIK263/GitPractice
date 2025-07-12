import java.util.*;
public class In1 {
    public static void main(String []ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. :");
        int i = sc.nextInt();
        System.out.println("Enter another number. :");
        int j = sc.nextInt();
        int ans = i + j;
        System.out.println("The answer is: " + ans);
    }
}
