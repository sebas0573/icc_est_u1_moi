public class App {
    public static void main(String[] args) throws Exception {
        
        MetodoInsercion ordenar = new MetodoInsercion();
        
        int[] arreglo = { 3, 5, 1, 2, 4 };
        
        int[] arregloOrdenado = ordenar.sortInsertion(arreglo, true);
        
        ordenar.printArray(arregloOrdenado);
    }
}
