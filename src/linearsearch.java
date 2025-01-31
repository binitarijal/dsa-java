public class linearsearch {
    public static void main(String[] args) {
        int a[]={1,8,2,4,5,6};
        int b=9;
      boolean r=  search(a,b);
        System.out.println(r);
    }
    static boolean search(int arr[],int c) {

        if(arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c)
                return true;
        }
        return false;
    }
}
