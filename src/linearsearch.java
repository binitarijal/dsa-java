import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int a[]={1,8,2,4,5,6};
        int b=9;
      boolean r=  search(a,b);
        //System.out.println(r);

        String str="Pratap";
        char target='k';
      //  System.out.println(strsearch(str,target));

        int arr[]={2,5,8,1,9,-4,6,-2};
        //System.out.println(min(arr));


        //-----2d array-----
        int arra[][]={
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        int targett=5;
      int ans[]=  search(arra,targett);
        System.out.println(Arrays.toString(ans));
    }
    static boolean search(int arr[],int c) {

        if(arr.length==0){
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == c)
                return true;
        }
        return false;
    }
    static boolean strsearch(String hh, char target){
        if(hh.length() == 0){
            return false;
        }
        for(int i=0;i<hh.length();i++){
            if(target==hh.charAt(i)){
                return true;
            }
        }
        return false;
    }
//-------minimun item search---------
    static int min(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
//------searching in 2d array-------
    static int[] search(int[][]arr, int target){
for(int i=0;i<arr.length;i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if(arr[i][j]==target){
        return new int[]{i,j};
}
    }
}
return new int[]{-1,-1};
    }
}
