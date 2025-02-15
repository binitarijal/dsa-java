import java.util.Scanner;

public class recursion {
    static void recurprint(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return ;
        }
        //self work
        System.out.println(n);
        //recursive work
        recurprint(n-1);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        recurprint(a);
    }
}
