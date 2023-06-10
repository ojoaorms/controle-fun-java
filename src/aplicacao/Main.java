package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import gestao.Funcionario;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.println("Entre com a quantidade de funcionarios da loja:  ");
        double n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.print("Digite o ID do funcionario " + (i+1) + " : ");
            Integer id = sc.nextInt();
            System.out.print("Digite o nome do funcionario : ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite o salario atual de " + nome + " : ");
            Double salario = sc.nextDouble();

            Funcionario fun = new Funcionario(id, nome, salario);

            list.add(fun);
        }
        System.out.println();
        System.out.println("Entre com o ID do funcionario que recebera aumento: ");
        int aumento = sc.nextInt();
        Integer pos = posicao(list, aumento);
        if(pos == null){
            System.out.println("ID não encontrado!");
        }
        else{
            System.out.println("Entre com a porcentagem que o funcionarion recebera de aumento:  ");
            double percentual = sc.nextDouble();
            list.get(pos).addAumento(percentual);
        }
        System.out.println();
        System.out.println("Lista de funcionarios e seus respectivos atributos:  ");
        for(Funcionario fun : list){
            System.out.println(fun);
        }




        sc.close();
    }
    public static Integer posicao(List<Funcionario> list, int id){git remote add origin git@github.com:ojoaorms/controle-fun-java.git
        for(int i=0; i< list.size(); i++){
         if(list.get(i).getId() == id){
             return i;
         }
        }
        return null;
    }
}