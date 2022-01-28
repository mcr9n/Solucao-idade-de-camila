

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class solucao {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //recebe as três idades na forma de inteiro.
        int idade1 = entrada.nextInt();
        int idade2 = entrada.nextInt();
        int idade3 = entrada.nextInt();
        //cria arraylist para armazenar as três idades.
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(idade1);
        idades.add(idade2);
        idades.add(idade3);
        //ordena o arraylist de forma crescente.
        Collections.sort(idades);
        //imprime para o usuário o segundo elemento do array(a idade da irmã do meio).
        System.out.println(idades.get(1));
    }
    
}
