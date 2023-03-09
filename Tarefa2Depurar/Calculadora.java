public class Calculadora {
    public  int dividir(int dividendo, int divisor) {
        int resultado = 0;
        while (dividendo > 0) {
            dividendo -= divisor;
            resultado++;
        }
        return resultado;
    }

}
