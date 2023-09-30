package q1;
import java.util.*;
import java.io.*;
        

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String Designer; int Power, Power2; int tc;
        Power2=0;
        System.out.println();
        System.out.print("Enter designer: ");
        Designer = sc.nextLine();
        System.out.print("Enterpower: ");
        Power = sc.nextInt(); sc.nextLine();
        
        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");
        
        System.out.print("Enter tc (1 or 2): ");
        tc = sc.nextInt(); sc.nextLine();
        
        Engine t = new Engine(Designer, Power);
        if (tc==2) {
            System.out.print("Enter new power: ");
            Power2 = sc.nextInt(); sc.nextLine();
            t.setPower(Power2);
        }
        
        System.out.println("OUTPUT: ");
        
        switch (tc) {
            case 1: 
                String u= t.getDesigner();
                System.out.printf("%s\r\n",u);
                break;
            case 2:
                int v = t.getPower();
                System.out.printf("%d\r\n",v);
                break;
            default:
                return;
                       
        }
        System.out.println();
    }
    
}
