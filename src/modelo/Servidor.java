
package modelo;

public class Servidor {
    private String nome;
    private int matricula, choraria;
    
    public Servidor(){
        
    }
     public Servidor(String nome, int matricula, int choraria){
         this.nome=nome;
         this.matricula=matricula;
         this.choraria=choraria;
        
    }
     public void setNome(String nome){
         this.nome=nome;
     }
     public String getNome(){
         return nome;
         
     }
     public void setMatricula(int matricula){
         this.matricula=matricula;
     }
     public int getMatricula (){
         return matricula;
     }
     public void setCHoraria(int choraria){
         this.choraria=choraria;
     }
}
