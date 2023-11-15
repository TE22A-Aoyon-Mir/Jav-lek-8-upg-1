import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);

        //a & b
        System.out.println("\n");
        int varv = 2;
        while(varv<6)
        {
            System.out.println("Varv nr: "+varv);
            varv++;
        }

        //c
        System.out.println("\n");
        for(int varv1=0; varv1<6; varv1++)
        {
            System.out.println("Varv1 nr: "+varv1);
        }

        //d
        System.out.println("\n");
        int varv2 = 0;
        do
        {
            System.out.println("Varv2 nr: "+varv2);
            varv2++;
        }
        while(varv2<6);

        //e
        System.out.println("\n");
        int varv3 = 5;
        while(varv3>0)
        {
            System.out.println("Varv3 nr: "+varv3);
            varv3--;
        }

        //f
        System.out.println("\n");
        {
            for(int varv4 = 5; varv4 >-1; varv4--)
            {
                System.out.println("Varv4 nr: "+varv4);
            }
        }
    }
}
