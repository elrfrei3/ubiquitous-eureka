public class Menu {

    public static void main(String args []) {


        listaEnlasada I = new listaEnlasada();

        I.insertar("Karold");
        I.insertar("Emmanuel");
        I.insertar("Sofia");
        I.insertar("A");

        I.mostrarLista();


        System.out.println();
        I.eliminar();
        I.mostrarLista();


    }
}