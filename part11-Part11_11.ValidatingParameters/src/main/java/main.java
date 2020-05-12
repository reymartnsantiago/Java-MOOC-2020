
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println(comp(new int[]{}, 
                new int[]{1}));
    }

    public static boolean comp(int[] a, int[] b) {
        boolean status=true;
        for(int i=0; i<=a.length-1; i++){
          status= a[i] * a[i] == b[i+1 ];
            
            if(!status) return status;
        }
        return status;
    }

}
