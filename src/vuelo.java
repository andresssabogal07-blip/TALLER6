public class vuelo {
    private String origen, destino,numero;
    private int ocupacion, capacidadMaxima;

    public vuelo(){
    }
    public vuelo(String origen, String destino, String numero){
        this.origen=origen;
        this.destino=destino;
        this.numero=numero;
        this.ocupacion=0;
    }
    public vuelo(String origen, String destino, String numero, int ocupacion, int capacidadMaxima){
        this.origen=origen;
        this.destino=destino;
        this.numero=numero;
        this.ocupacion=ocupacion;
        this.capacidadMaxima=capacidadMaxima;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public String getNumero() {
        return numero;
    }
    public int getOcupacion() {
        return ocupacion;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void mostrarInfo() {
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Número de vuelo: " + numero);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
    }
    public void embarcar(int cantidad) {
        if (ocupacion + cantidad <= capacidadMaxima) {
            ocupacion += cantidad;
            System.out.println(cantidad + " pasajeros embarcados en el vuelo " + numero);
        } else {
            System.out.println("No se puede embarcar a " + cantidad + " pasajeros. Capacidad máxima alcanzada.");
        }
    }
    public void desembarcar(int cantidad) {
        if (ocupacion - cantidad >= 0) {
            ocupacion -= cantidad;
            System.out.println(cantidad + " pasajeros desembarcados del vuelo " + numero);
        } else {
            System.out.println("No se puede desembarcar a " + cantidad + " pasajeros. No hay suficientes pasajeros a bordo.");
        }
    }
}