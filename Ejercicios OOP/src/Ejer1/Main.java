package Ejer1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Customer pep=new Customer("PEP");
        pep.setMembertype("Gold");
        System.out.println(pep);


        Visit visita=new Visit(pep, new Date());
        visita.setProductExpense(36);
        visita.setServiceExpence(40);
        System.out.println(visita.toString());


        String UserOption;
       /* do {
            System.out.println(" Qué quieres hacer? \n 1) Realizar una suscrípción \n 2) Elegir un producto");
            UserOption = sc.nextLine();
                Customer pep=new Customer("PEP");
            if (UserOption.equals("1")) {


                System.out.println(" Qué suscrípción deseas? \n 1) Premium \n 2) Gold 3) Silver ");
                UserOption = sc.nextLine();

                if (UserOption.equals("1")) {

                }



            } else if (UserOption.equals("2")) {

            }
        } while (UserOption.equals("1") || UserOption.equals("2"));

*/
    }
}