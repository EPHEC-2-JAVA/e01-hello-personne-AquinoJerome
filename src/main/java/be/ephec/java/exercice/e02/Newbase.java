package be.ephec.java.exercice.e02;



import java.util.Scanner;

public class Newbase {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer la base");
        int base = sc.nextInt();
        Scanner st = new Scanner(System.in);
        System.out.print("Entrer un nombre");
        String Nb = st.nextLine();
        int x = Integer.parseInt(Nb,base);
        System.out.print(x);

    }
}