public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice i=" + i + " é " + alunos[i]);
        }

        for(String aluno : alunos){
            System.out.println("O aluno atual é: " + aluno);
        }

    }
    
}
