
package modelo;
 
public class Sala {
 private String nome;
 private int numero, codusu, codserv;
 
 public Sala(){
     
 }
 public Sala(String nome, int numero, int codusu, int codserv){
     this.nome=nome;
     this.numero=numero;
     this.codusu=codusu;
     this.codserv=codserv;
 }
 public void setNome(String nome){
     this.nome=nome;
 }
 public String getNome(){
     return nome;
 }
 public void setNumero(int numero){
     this.numero=numero;
     
 }
 public int getNumero(){
     return numero;
 }
 public void setCodusu(int codusu){
     this.codusu=codusu;
     
 }
 public int getCodusu(){
     return codusu;
 }
 public void setCodserv(int codserv){
     this.codserv=codserv;
 }
 public int getCodserv(){
     return codserv;
     
 }
}
