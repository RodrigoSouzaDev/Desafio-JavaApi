public class Multiplos {

    public static String somarMultiplos(int numero)
    {
        //multiplos de 3 ou 5
        int soma= 0;

        for (int i =1; i<numero ; i++){
            if(i % 3 ==0 || i % 5 ==0){
                System.out.println("Número "+i+" multiplo");
                soma += i;
            }
        }
        return "Soma = "+soma;
    }
}
