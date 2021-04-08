import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Ingrese los dos números a operar:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Seleccione la operación: 1 Suma, 2 Resta, 3  Multiplicación ó 4 División:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;
            case 3:
                System.out.println(mult( num1,num2));
                break;
            case 4:
                System.out.println(div( num1,num2));
                break;
            default:
                System.out.println("Entrada Incorrecta");


        }



    }
    public static int add(int x, int y) {
        int res = x + y;
        return res;
    }
    public static int sub(int x, int y) {
        int res = x-y;
        return res;
    }
    public static int mult(int x, int y) {
        int res = x*y;
        return res;
    }
    public static int div(int x, int y) {
        int res = x/y;
        return res;
    }


}
