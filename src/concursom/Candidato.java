package concursom;

/**
 *
 * @author Giovana Lara da Silva Costa RGM: 26401878
 */

//criar classe candidato

public class Candidato {
    private int numero_candidato;
    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    private String genero_musical;

    public Candidato() {
    }

    public Candidato(int numero_candidato, String cpf, String nome, int idade, char sexo, String genero_musical) {
        this.numero_candidato = numero_candidato;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.genero_musical = genero_musical;
    }

    public int getNumero_candidato() {
        return numero_candidato;
    }

    public void setNumero_candidato(int numero_candidato) {
        this.numero_candidato = numero_candidato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }

    @Override
    public String toString() {
        return "Nº do canditado: "+numero_candidato+", "+"CPF: "+cpf+", "+"Nome: "+nome+
                ", "+"idade: "+idade+", "+"sexo: "+sexo+", "+"Gênero Musical: "+genero_musical+", ";
    }
    
    
}
