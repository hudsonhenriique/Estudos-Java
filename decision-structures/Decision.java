import java.util.Scanner;

public class Decision{

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Digite um número: ");  // Aqui você pode digitar um número pelo teclado. Por exemplo, 10.
    int numero = s.nextInt();

    if(numero > 0){
        System.out.println("O número é positivo: " + numero);
    } 
    else
     if( numero < 0 ){
        System.out.println("O número é negativo: " + numero);
     }
     else{
        System.out.println("O número é igual a 0(zero) " + numero);
     }
    }
    // System.out.println("Fim do Programa");
}