package Tarefa1Refactorizacion;

public class Calculator {
    
    /**
     * Devolve a suma de dous enteiros
     *
     * @param num1 o primeiro enteiro
     * @param num2 o segundo enteiro
     * @return a suma de num1 e num2
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Devolve a resta de dous enteiros
     *
     * @param num1 o primeiro enteiro
     * @param num2 o segundo enteiro
     * @return a resta de num1 e num2
     */
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    /**
     * Devolve a multiplicacion de dous factores enteiros
     *
     * @param num1 o primeiro factor enteiro
     * @param num2 o segundo factor enteiro
     * @return a multiplicacion de num1 e num2
     */
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    /**
     * Devolve a suma de dous enteiros
     *
     * @param num1 o dividendo enteiro
     * @param num2 o divisor enteiro
     * @return a division de num1 entre num2
     * @throws IllegalArgumentException se o divisor e 0
     */
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return num1 / num2;
    }
    
}
