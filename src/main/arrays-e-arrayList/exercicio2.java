import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
//        Desenvolva um sistema que:
//        Use ArrayList para armazenar nomes de alunos
//        Permita adicionar, remover e listar alunos
//        Implemente busca por nome (ignorando case)
//        Exiba a quantidade total de alunos

        Scanner scanner = new Scanner(System.in);

        int opcao;

        ArrayList<String> alunos = new ArrayList<String>();
        do{
            System.out.println();
            System.out.println("===LISTA DE OPÇÕES DO SISTEMA===");
            System.out.println("Segue uma lista de opções!");
            System.out.println("0 - Sair do Sistema!");
            System.out.println("1 - Adicionar Aluno!");
            System.out.println("2 - Remover Aluno!");
            System.out.println("3 - Buscar um aluno pelo nome!");
            System.out.println("4 - Listar todos os alunos cadastrados!");
            System.out.println("5 - Exibir quantidade total dos alunos!");
            System.out.print("Digite o número relacionado a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

               switch (opcao){
                   case 1:
                       System.out.println();
                       System.out.print("Digite o nome do aluno que deseja adicionar: ");
                       String nomeParaAdicionar = scanner.nextLine();
                       alunos.add(nomeParaAdicionar);
                       System.out.println("Aluno '" + nomeParaAdicionar + "' adicionado ao sistema!");
                       break;
                   case 2:
                       System.out.println();
                       if (alunos.isEmpty()){
                           System.out.println("A lista de alunos está vazia, adicione algum e volte aqui!");
                       }else {
                           System.out.print("Digite o nome do aluno que deseja remover: ");
                           String nomeParaRemover = scanner.nextLine();
                           System.out.println("Fazendo a busca do aluno '" + nomeParaRemover + "', aguarde..." );

                           boolean encontrado = false;
                           for (int i = 0; i < alunos.size(); i++) {
                               if (alunos.get(i).equalsIgnoreCase(nomeParaRemover)){
                                   String aux = alunos.remove(i);
                                   System.out.println("Aluno '" + aux + "' removido do sistema com sucesso!");
                                   encontrado = true;
                                   break;
                               }
                           }
                           if(!encontrado){
                               System.out.println("O aluno + '" + nomeParaRemover + "' não foi encontrado. Verifique se digitou corretamente!");
                           }
                       }
                       break;
                   case 3:
                       System.out.println();
                       if (alunos.isEmpty()){
                           System.out.println("A lista de alunos está vazia, adicione algum e volte aqui!");
                       } else {
                           System.out.print("Digite o nome do aluno que deseja buscar: ");
                           String nomeParaBuscar = scanner.nextLine();
                           System.out.println("Fazendo a busca do aluno '" + nomeParaBuscar + "', aguarde..." );

                           boolean encontrado = false;
                           for (String aluno : alunos) {
                               if (aluno.equalsIgnoreCase(nomeParaBuscar)) {
                                   System.out.println("O aluno '" + aluno + "' foi encontrado!");
                                   encontrado = true;
                                   break;
                               }
                           }
                           if (!encontrado){
                               System.out.println("O aluno + '" + nomeParaBuscar + "' não foi encontrado. Verifique se digitou corretamente!");
                           }
                       }
                       break;
                   case 4:
                       System.out.println();
                       if (alunos.isEmpty()){
                           System.out.println("A lista de alunos está vazia, adicione algum e volte aqui!");
                       }
                       System.out.println("===LISTAGEM DOS ALUNOS===");
                       for (int i = 0; i < alunos.size(); i++) {
                           System.out.println((i + 1) + " - Aluno(a): " + alunos.get(i));
                       }
                       break;
                   case 5:
                       System.out.println();
                       if (alunos.isEmpty()){
                           System.out.println("A quantidade de alunos é 0!");
                       }
                       if (alunos.size()==1){
                           System.out.println("A quantidade de alunos é " + alunos.size()+ " aluno!");
                       }
                       System.out.println("A quantidade de alunos são " + alunos.size()+ " alunos!");


           }

       } while (opcao != 0);
        System.out.println();
        System.out.println("Saindo do sistema...");
        scanner.close();
    }
}
