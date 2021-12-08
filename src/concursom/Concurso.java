package concursom;

/**
 *
 * @author Giovana Lara da Silva Costa RGM: 26401878
 */

//CRIAR CLASSE CONCURSO

import javax.swing.JOptionPane;

public class Concurso {
    private String nomeConcurso;
    private Candidato candidatos[];
    private Juri juris[];
    
    public Concurso(String nomeConcurso) {
        this.nomeConcurso = nomeConcurso;
       
        
        //CRIAR OBJETOS PARA USAR NO TESTE

        candidatos = new Candidato[10];
        candidatos[0] = new Candidato(1234, "012.345.678-90", "WD", 23, 'M', "rock");
        candidatos[1] = new Candidato(1235, "023.456.789.00", "Juliette", 34, 'F', "rock");
        candidatos[2] = new Candidato(1236, "034.567.891-01", "José", 21, 'M', "forró");
        candidatos[3] = new Candidato(1237, "045.678.910-11", "Mariah", 18, 'F', "sertanejo");
        candidatos[4] = new Candidato(1238, "056.789.101-11", "Carlos Alberto", 56, 'M', "rock");
        candidatos[5] = new Candidato(1239, "067.891.011-12", "Josefa", 25, 'F', "sertanejo");
        candidatos[6] = new Candidato(1240, "078.910.111-12", "Gustavo Porto", 34, 'M', "forró");
        candidatos[7] = new Candidato(1241, "089.101.112-13", "Taís", 22, 'F', "romantica");
        candidatos[8] = new Candidato(1242, "091.011.121-13", "Kennedy", 31, 'M', "rock");
        candidatos[9] = new Candidato(1243, "010.111.121-13", "Cícero", 20, 'M', "rap");
      
        //JURIS
        juris = new Juri[5];
        juris[0]=new Juri("Cícero Rosa Lins", "Cícero", "MPB");
        juris[1]=new Juri("Rodrigo Alarcon", "Rodrigo", "MPB");
        juris[2]=new Juri("Thais Dayane da Silva", "Mc Tha", "pop");
        juris[3]=new Juri("Gustavo de Almeida Ribeiro", "Black Alien", "rap");
        juris[4]=new Juri("Gabrielly Nunes", "Gabz", "rap");
         
        System.out.println("Apuração sobre o " + getNomeConcurso() + " 2021 ");
        candidatos_juri();
        candidatos_idade();
        candidatos_homens();    
    }
    //MÉTODO QUE LEIA O NOME DE UM GÊNERO MUSICAL E VISUALIZE OS CANDIDATOS E JURIS COM ESSE GÊNERO CADASTRADO
    public void candidatos_juri(){               
                String genero = JOptionPane.showInputDialog(null, "Digite o gênero musical: ");
                System.out.println("\nCandidatos do gênero musical " + genero + ":");
                for(int i=0; i<candidatos.length; i++){
                    if(candidatos[i].getGenero_musical().equals(genero)){
                        System.out.println(candidatos[i].toString());
                    } 
                }
                
                System.out.println("\nJúris do gênero musical " + genero + ":");
                for(int i=0; i<juris.length; i++){
                    if(juris[i].getGenero().equals(genero)){
                        System.out.println(juris[i].toString());       
                    }  
                }   
    }  
    
    //ELABORE UM MÉTODO QUE LISTE OS CANDIDATOS COM IDADES ENTRE 21 E 25 ANOS, DO SEXO F
    public void candidatos_idade(){
        System.out.println("\nCandidatas com idade entre 21 e 25 anos:");
        for(int i=0; i<candidatos.length; i++){
            if(candidatos[i].getIdade()>=21 && candidatos[i].getIdade()<=25){
                if(candidatos[i].getSexo()=='F'){
                    System.out.println(candidatos[i].toString());
                }
            }
        }
    }
    
  //ELABORE UM MÉTODO QUE CONTE OS CANDIDATOS HOMENS E VISUALIZE ESTA QUANTIDADE  
    public void candidatos_homens(){
        int m = 0;
        for(int i=0; i<candidatos.length; i++){            
            if(candidatos[i].getSexo()=='M'){
                m++;               
            }
        }
        System.out.println("\nTemos " + m + " candidatos homens registrados nessa edição");
    }

    public String getNomeConcurso() {
        return nomeConcurso;
    }

    public void setNomeConcurso(String nomeConcurso) {
        this.nomeConcurso = nomeConcurso;
    }

}
