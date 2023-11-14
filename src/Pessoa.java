// Arquivo: /src/Pessoa.java
public class Pessoa {
   
    private String nome;
    private int idade;

   
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. A idade deve ser um valor positivo.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        
        Pessoa arthur = new Pessoa("Arthur", 17);

        arthur.exibirInformacoes();
    }
}