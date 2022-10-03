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


    }
}