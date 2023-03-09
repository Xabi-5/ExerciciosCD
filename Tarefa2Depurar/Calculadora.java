public class Calculadora {

    public int dividir(int dividendo, int divisor) {
        int resultado = 0;

        //Boolean que determina se o resultado será negativo
        boolean negativo = false;
        if(divisor == 0){
            throw new IllegalArgumentException("O divisor non pode ser 0");

        //Altera o valor de negativo e pasa o dividendo a valor absoluto
        }else if(dividendo < 0 && divisor >0){
            negativo = true;
            dividendo = - dividendo;

        //Altera o valor de negativo e pasa o divisor a valor absoluto
        }else if(divisor < 0 && dividendo >0){
            negativo = true;
            divisor = - divisor;

        //Altera o valor de negativo e pasa ambas variables a valor absoluto
        }else if(dividendo <0 && divisor <0){
            negativo = true;
            dividendo = -dividendo;
            divisor = - divisor;

        //Para que redondee a 0 se o divisor é maior
        }else if(dividendo>0 && divisor > dividendo){
            return resultado= 0;
        }
        while (dividendo > 0) {
            dividendo -= divisor;
            resultado++;
        }
        return negativo ? -resultado : resultado;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}
