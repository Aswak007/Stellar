package Day2;

public class complexpattern {
    public static void main(String[] args) {
        int row = 5;
        for (int i =1; i<=row ; ++i) {
            for(int l =1;l<=row-i;l++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=i-1;++k){
                System.out.print(k);
            }
            for (int j = i; j >= 1; --j) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
