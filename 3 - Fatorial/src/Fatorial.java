public class Fatorial {

    public static int calcular(int numero){
        if(numero > 0 ){
            int fatorial= 1;
            for(int i = 2 ; i<= numero; i++){
                fatorial *= i;
            }
            return fatorial;
        }
        else return 1;
    }
}
