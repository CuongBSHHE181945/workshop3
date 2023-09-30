
package q2;
import java.util.*;
import java.io.*;

public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String label; int type, step; int tc;
        System.out.println();
        System.out.print("Enter label: ");
        label = sc.nextLine();
        System.out.print("Enter type: ");
        type = sc.nextInt(); sc.nextLine();
        System.out.print("Enter label: ");
        step = sc.nextInt(); sc.nextLine();
        System.out.println("1 - Test toString()");
        System.out.println("2 - Test setData()");
        System.out.println("3 - Test getValue()");
        
        System.out.print("Enter TC: ");
        tc = sc.nextInt(); sc.nextLine();
        System.out.println("OUTPUT: ");
        
        switch (tc) {
            case 1: 
                Robot a11 = new Robot(label, type);
                System.out.println(a11);
                Robot a12 = new SpecRobot(label,type,step);
                System.out.println(a12);
                break;
            case 2:
                SpecRobot b2 = new SpecRobot(label,type,step);
                b2.setData();
                String v2 = b2.getLabel();
                int k2 = b2.getType();
                System.out.printf("%s,%d\n",v2,k2);
                break;
            case 3: 
                SpecRobot b3 = new SpecRobot(label,type,step);
                int v3 = b3.getValue();
                System.out.printf("%d \n",v3);
                break;
            default:
                break;
        }
        System.out.println();
    }
    
}
