import java.util.Arrays;

public class dup {
    public static void main(String[]args){

        int arr[]={1,2,2,3,4,4,4,5,5};
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int dup=0;
            if(arr[i]==arr[i+1]){
                dup=1;
            }
            if(dup==1){

                continue;

            }
            System.out.println(arr[i]);


        }
}}
