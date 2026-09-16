public class App {
    public static void main(String[] args) throws Exception {
        libro libro1=new libro();
        libro libro2=new libro("el principito","antoine de saint-exupery");
        libro libro3=new libro("la tormenta", "German Castro Caicedo");
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
}
}