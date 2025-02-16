import java.util.Arrays;

public class collectionframework {

    static int printSum(int[] arr){
        int sum=0;
        int len= arr.length;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(printSum(a));


//int arr[]={1,2,3,4,5,6,7};
//int empt[]=new int[arr.length];
//for(int i=arr.length-1,j=0;i>=0;i--,j++){
//    empt[j]=arr[i];
//}
//        System.out.println(Arrays.toString(empt));


    }
}
