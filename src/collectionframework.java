import java.util.Arrays;

public class collectionframework {
    public static void main(String[] args) {

int arr[]={1,2,3,4,5,6,7};
int empt[]=new int[arr.length];
for(int i=arr.length-1,j=0;i>=0;i--,j++){
    empt[j]=arr[i];
}
        System.out.println(Arrays.toString(empt));
    }
}
