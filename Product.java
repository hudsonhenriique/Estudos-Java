public class Product {
    String name;
    double price;

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public Product(String name){
        this.name = name;
        this.price = 10.0;
    }

    public void showDetails() {
        System.out.println("Produto: " + name + ", Preço: R$: " + price);        
    }

    public static void main(String[] args) {
        Product produto1 = new Product("Camiseta",3.5);
        Product produto2 = new Product("Calça");

        produto1.showDetails();
        produto2.showDetails();
    }
    
};