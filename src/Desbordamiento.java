public class Desbordamiento {
    public static void main(String[] args) throws Exception {
        DepositoAgua deposito1=new DepositoAgua();
        DepositoAgua deposito2=new DepositoAgua(100);
        DepositoAgua deposito3=new DepositoAgua(100, 30);

        deposito1.mostrarInfo();
        deposito2.mostrarInfo();
        deposito3.mostrarInfo();    
        deposito3.llenar(87);

}
}