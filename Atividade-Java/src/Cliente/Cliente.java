package Cliente;

public class Cliente {
    
    private String nome;
    private String cpf;
    private int anoNascimento;
    private double limiteDeCredito; 

    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
         return cpf;
    }
    
     public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
  
    
    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }
    
    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
    
    
    public boolean liberarCredito(double valor){
        if(valor <= limiteDeCredito ){
            return true;
        }

        return false;
    }
    
    public boolean restringirIdade(int anoAtual,int quantidadeParcelas){
        int idade = anoAtual - anoNascimento;  
        
        if(idade>=18 && idade < 60) {
            return true;
        }else if(idade >= 60 && idade < 70 && quantidadeParcelas <= 24){
            return true;
        }else if (idade >= 70 && idade < 80 && quantidadeParcelas <= 12){
            return true;
        }else if(idade >= 80 && quantidadeParcelas == 1){
            return true;
        } 
          
        return false;
    }
}
