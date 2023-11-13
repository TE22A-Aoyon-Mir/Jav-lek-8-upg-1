import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);

        //a & b
        int varv = 2;
        while(varv<6)
        {
            System.out.println("Varv nr: "+varv);
            varv++;
        }

        //c
        for(int varv1=0; varv1<6; varv1++)
        {
            System.out.println("Varv1 nr: "+varv1);
        }
    }
}
