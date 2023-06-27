import java.util.Scanner;

public class boj2875 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        int count = 0;

        while (N>=2 && M>=1 && N+M>=3+K){
            N = N-2;
            M = M-1;
            count ++ ;
        }
        System.out.println(count);
    }
}
