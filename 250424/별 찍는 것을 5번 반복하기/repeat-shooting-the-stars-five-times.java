import java.io.* ; 
import java.util.* ;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        for (int i =0; i <5;i++){
            tenStar();
        }
        bw.close();
    }

    static void tenStar() throws IOException {
        for (int i = 0; i<10 ; i++){
            bw.write("*");
        }
        bw.write("\n");
    }
}   