import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        iniciar();
    }

    private static void iniciar(){
        System.out.println("Digite um número inteiro positivo");
        Scanner scan =  new Scanner(System.in);
        try{
            int numero = scan.nextInt();
            if(numero >= 0){
                System.out.println( "O fatorial de "+ numero+" é : " + Fatorial.calcular(numero));
            }
            else {
                System.out.println("Por Favor digite um número positivo");
                iniciar();
            }
        }catch (InputMismatchException e){
            System.out.println("Por Favor digite um número inteiro positivo");
            iniciar();
        }
    }
}
