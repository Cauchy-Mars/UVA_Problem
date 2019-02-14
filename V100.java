import java.io.EOFException;
import java.util.Scanner;

class V100_Count{
    public int count(int a){
        int i = 1;
        while (a != 1){
            if (a % 2 == 1) {
                a = (3*a+1)>>>1;
                i += 2;
            }
            else {
                a = a>>>1;
                i += 1;
            }
        }

        return i;
    }
}

public class V100 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        V100_Count cal = new V100_Count();
        int a, b, max;
        while(in.hasNextInt()){
            a = in.nextInt();
            b = in.nextInt();
            max = 0;

            if (a<b) {
                for (int i = a; i <= b; i++) {
                    if (cal.count(i) > max) max = cal.count(i);
                }
            }
            else{
                for (int i = b; i <= a; i++) {
                    if (cal.count(i) > max) max = cal.count(i);
                }
            }
            System.out.println(a + " " + b + " " + max);
        }

    }
}
