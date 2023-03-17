public class Main {
    public static void main(String[] args) {
        int var1 = 15;
        int var2 = 20;
        int var3 = 5;

        var total = suma(var1, var2, var3);
        System.out.println("Suma: "+ var1 + " + " + var2 + " + " + var3 +" = "+total);

        Coche miCoche = new Coche();
        miCoche.MasPuertas();
        System.out.println("Número de puertas: " + miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {

        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void MasPuertas() {
        this.puertas++;
    }
}
