package concursom;

/**
 *
 * @author Giovana Lara da Silva Costa RGM: 26401878
 */

//criar classe juri

public class Juri {
    private String nome_completo;
    private String nome_artistico;
    private String genero;

    public Juri() {
    }

    public Juri(String nome_completo, String nome_artistico, String genero) {
        this.nome_completo = nome_completo;
        this.nome_artistico = nome_artistico;
        this.genero = genero;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getNome_artistico() {
        return nome_artistico;
    }

    public void setNome_artistico(String nome_artistico) {
        this.nome_artistico = nome_artistico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome Completo: "+nome_completo+", "+"Nome Artístico: "+nome_artistico+", "+"Gênero musical: "+genero+", ";
    }
    
}
