/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2019;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author JuanCamilo
 */
public class Ing_sw_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola c =new Cola ();
        int m;        
        Scanner L=new Scanner(System.in);
        do{
            System.out.println("--MENU--");
            System.out.println("1. Insertar Elemento");
            System.out.println("2. Retirar Elemento");           
            System.out.println("3. Insertar -n- Elementos Aleatorios");
            System.out.println("4. Retirar -n- Elementos Aleatorios");
            System.out.println("5. Tamaño");
            System.out.println("6.. Salir");
            m=L.nextInt();
            switch(m){
                case 1:
                    int a;
                    System.out.println("Inserte elemento");
                    a=L.nextInt();
                    System.out.println(c.enqueve(a));
                    break;
                case 2:
                    System.out.println("Retirar elemento");
                    System.out.println(c.dequeve());
                    break;
                case 3:
                    int x,n,i;
                    System.out.println("Digite cuantos numeros insertar");
                    n=L.nextInt();
                    for(i=0;i<=n-1;i++){
                        Random RD=new Random();
                        x=RD.nextInt(100);
                        System.out.println(c.enqueve(x));
                    }
                    break;
                case 4:
                    int n2,j;
                    System.out.println("Digite cuantos numeros retirar");
                    n2=L.nextInt();
                    for(j=0;j<=n2-1;j++){
                        System.out.println(c.dequeve());
                    }
                    break;
                case 5:
                    System.out.println(c.view());
                    break;
            }
        }while(m!=6);
    }
}
