package Tarefa1Refactorizacion;

//Paseino a Java xa que non dimos como facer probas en JS

public class CaixaBranca {
    
    public CaixaBranca() {
    }

    public double calcularAreaTriangulo(double base, double altura){
        if(base <= 0 || altura <= 0){
            throw new IllegalArgumentException("Los valores de base y altura deben ser mayores que cero");
        }
        double area = (base * altura) /2;
        return area;
    }
}
