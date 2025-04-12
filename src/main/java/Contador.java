import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Por favor digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();
        try {

         contar (parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("Valor do segundo paramêtro não pode ser inferior ao primeiro");

        }
    }
//

        static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

            if ( parametroUm > parametroDois) {
                throw new ParametrosInvalidosException();
            }else {

                    for (int contagem = parametroDois - parametroUm; contagem >0; contagem--){
                        System.out.println("Contador operação " + contagem);
                    }
                System.out.println("Contador finalizado " );
                }

            }
        }






