package gestao;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;

    }
    public Funcionario(){
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return this.salario;
    }
    public void addAumento(double percentual){
       salario += (percentual / 100) * salario;
    }
    public String toString(){
        return "ID : " + id + " / NOME:  " + nome + " / SALARIO:  " + String.format("%.2f", salario);

    }


}
