public class Nodo {

   private String dato;
   Nodo siguiente;

   public Nodo(String i, Nodo s){
   
    dato = i;
    siguiente = s;

   }

   public String getDato(){
     return dato;
   }

   public void setDato(String dato){
    this.dato = dato;
   }

   public Nodo getSiguiente(){
    return siguiente;
   }

   public void siguiente(Nodo siguiente) {
     this.siguiente = siguiente;
   }
    
}

