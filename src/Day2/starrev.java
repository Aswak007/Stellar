package Day2;

public class starrev {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <=row; i++) {    //i=row,i>=1,i--
            for (int j =1 ; j <=i; j++) {  //j=i,j>=1,j--    5 to 1
                System.out.print("* ");
            }
            System.out.println();
        } // 1 to 5
    }
}