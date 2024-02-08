public class listaEnlasada {

    Nodo inicio;
    Nodo fin;

    public listaEnlasada(){

        inicio = null;
        fin = null;

    }

    public void insertar(String dato) {

        Nodo nuevo = new Nodo (dato, inicio);

        inicio = nuevo;

        if (fin == null){
            fin = inicio;
        }

    }

    public void eliminar(){

        inicio = inicio.siguiente;
    }


public void mostrarLista(){
    Nodo temp = inicio;
    
    while (temp != null) {
     System.out.println(temp.getDato());
     temp = temp.siguiente;

    }

}

}