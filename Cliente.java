public class Cliente extends Pessoa implements Info  {

    public Cliente(String nomeCompleto, String sexo, String cpf, String email, String senha, String endereco, String telefone, String login){
        super(nomeCompleto, sexo, cpf, email, senha, endereco, telefone, login);
    }

    @Override
    public void ImprimirInfomacoes(){
        System.out.println("<==================== INFORMAÇÕES DO CLIENTE =====================>");
        System.out.println("O nome do cliente é: " + getNomeCompleto()); 
        System.out.println("O sexo é: " + getSexo());
        System.out.println("O CPF é: " + getCpf());
        System.out.println("O Email é: " + getEmail());
        System.out.println("A senha é: " + getSenha());
        System.out.println("O endereço é: " + getEndereco());
        System.out.println("O telefone é: " + getTelefone());
        System.out.println("O Login: " + getLogin());
        
    }


}
