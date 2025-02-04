import java.util.Scanner;

public class recursion {
    static void recurprint(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        recurprint(n-1);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        recurprint(a);
    }
}
