public class Vendedor extends Pessoa implements Info {
    private String nomeLoja;
    private String cnpj;

    public Vendedor(String nomeLoja, String cnpj, String nomeCompleto, String sexo, String cpf, String email, String senha, String endereco, String telefone, String login ){
        super(nomeCompleto,sexo,cpf,email,senha,endereco,telefone,login);
        this.nomeLoja = nomeLoja;
        this.cnpj = cnpj;
    }

    public String getNomeLoja(){
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public void ImprimirInfomacoes(){
        System.out.println("<==============  INFORMAÇÕES DO VENDEDOR  ================>");
        System.out.println("Nome da loja: " + getNomeLoja());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Nome completo: " + getNomeCompleto());
        System.out.println("Sexo: " + getSexo());
        System.out.println("CPF: " + getCpf());
        System.out.println("EMAIL: " + getEmail());
        System.out.println("SENHA: " + getSenha());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Login: " + getLogin());
    }
    
}
