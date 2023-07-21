
import java.util.*;
public class Main
{
    static int num_rec(int num){
        if (num==0){
            return 0;
        }
        num_rec(num-1);
        System.out.println(num);
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        num_rec(num);
    }
}