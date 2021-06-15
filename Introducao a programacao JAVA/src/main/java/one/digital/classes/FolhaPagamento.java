package one.digital.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FolhaPagamento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numero = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int horas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valorHora = Double.parseDouble(st.nextToken());

        double salario =  horas*valorHora; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
