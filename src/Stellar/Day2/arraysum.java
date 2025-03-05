package Stellar.Day2;

public class arraysum {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3, 4 ,5};
        int sum;
        int total=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            total = sum+total;
        }
        System.out.println(total);

    }
}
