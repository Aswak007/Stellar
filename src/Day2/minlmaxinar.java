package Day2;

public class minlmaxinar {
    public static void main(String[] args) {
        int[] a={1,3,5,2,4};
        int max=a[0];
        for(int i=0;i<=a.length-1;++i){
                if(max<a[i]){
                    max=a[i];
                }
            }
        System.out.println(max);
        }
    }
