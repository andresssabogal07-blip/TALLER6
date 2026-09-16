public class modificar {
    public static void main(String[] args) {
        vuelo vuelo=new vuelo();
        vuelo vuelo2=new vuelo("Bogota","Medellin","AB476");
        vuelo vuelo3=new vuelo("Bogota", "Paris", "bV654", 100, 150);
        vuelo.mostrarInfo();
        vuelo2.mostrarInfo();
        vuelo3.mostrarInfo();
        System.out.println("despues de embarcar:");
        vuelo3.embarcar(30);
        vuelo3.mostrarInfo();
        System.out.println("despues de desembarcar:");
        vuelo3.desembarcar(20);
        vuelo3.mostrarInfo();
    }
}