package rejimboga;

import java.util.*;

public class rejmboga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = 4;

        System.out.print("Координата Х:");
        int x = sc.nextInt();

        System.out.print("Координата Y:");
        int y = sc.nextInt();

        if(Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r,2)){
            System.out.print("Ця точка лежить в центрі кола");
        } else{
            System.out.print("Ця точка не лежить в центрі кола");
        }
    }
}
