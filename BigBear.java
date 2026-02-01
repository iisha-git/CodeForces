import java.util.Scanner;

public class BigBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(a<=b){
            a = a*3;
            b = b*2;
            count=count+1;
        }
        System.out.println(count);
    }
}
