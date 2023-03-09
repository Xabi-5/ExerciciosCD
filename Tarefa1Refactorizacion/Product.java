package Tarefa1Refactorizacion;

public class Product {
    
    public String name;
    public double price;
    public int stock;

    //Crea unha nova instance de Product con nome, precio e stock
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //Imprime o nome, precio e stock do producto
    public void printProductDetails() {
        String productDetails = "";
        productDetails += "Product name: " + name + "\n";
        productDetails += "Price: $ " + price + "\n";
        productDetails += "Stock: " + stock;
        System.out.println(productDetails);
    }
}


/*Como os atributos son publicos, non hai necesidade de getters e setters,
 * por iso os quitei. A outra opcion seria facelos privados.
 * 
 * Fixen un novo String en printProductDetails() para reducir o numero
 * de chadamas a impresion, mellorando a eficiencia
 */
