public class DepositoAgua {
    private double capacidad,volumenActual;
    private String  depositoDesborde;

    
    public DepositoAgua() {
        this.capacidad=0;
        this.volumenActual=0;

    }
    public DepositoAgua(double capacidad){
        this.capacidad=capacidad;
        this.volumenActual=0;
        this.depositoDesborde=null;
    }
    public DepositoAgua(double capacidad, double volumenActual){
        this.capacidad=capacidad;
        this.volumenActual=volumenActual;
        this.depositoDesborde="no hay desborde";
    }
    public Double capacidad() {
        return capacidad;
    }
    public Double volumenActual() {
        return volumenActual;
    }
    public String depositoDesborde() {
        return depositoDesborde;
    
    }
    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }
    public void setVolumenActual(Double volumenActual) {
        this.volumenActual = volumenActual;
    }
    public void setDepositoDesborde(String depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    public void mostrarInfo() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Volumen Actual: " + volumenActual);
        System.out.println("deposito en desborde: " + depositoDesborde);
    }
    public void llenar(int cantidad) {
        if (volumenActual + cantidad <= capacidad) {
            volumenActual += cantidad;
            System.out.println( "el volumen actual es  "+ volumenActual + ", desborde=" + depositoDesborde);
        } else {
            System.out.println("No se puede llenar " + cantidad + " llega al limite.");
        }
    }
    public void desbordar(int cantidad) {
        if (volumenActual - cantidad >= 0) {
            volumenActual -= cantidad;
            System.out.println("el volumen actual es " + volumenActual + ", desborde=" + depositoDesborde);
        } else {
            System.out.println("No se puede desbordar " + cantidad + " llego al limite.");
        }
    }
}