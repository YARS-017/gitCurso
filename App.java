import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner (System.in);
        


        System.out.println("Ingresa el monto de la compra: ");double mCompra = input.nextDouble();

        int bolita = (int)(Math.random()*(5-1+1)+1);
        System.out.println(bolita);   

        switch (bolita) { 
            case 1:
             System.out.println("Sacaste bolita blanca, no tienes descuento");
             System.out.println("El monto de tu compra es " + mCompra + "$");
             break;
            case 2:
             System.out.println("Sacaste bolita verde, tienes un descuento del 10%");
             mCompra = mCompra - (mCompra*.1);
             System.out.println("El monto de tu compra es " + mCompra + "$");
             break;
            case 3 :
            System.out.println("Sacaste bolita amarilla, tienes un descuento del 25%");
            mCompra = mCompra - (mCompra*.25);
            System.out.println("El monto de tu compra es " + mCompra + "$");
             break;
             case 4:
             System.out.println("Sacaste bolita azul, tienes un descuento del 50%");
             mCompra = mCompra - (mCompra*.5);
             System.out.println("El monto de tu compra es " + mCompra + "$");
             break;
             case 5:
             System.out.println("Sacaste bolita roja, tienes un descuento del 100%. Felicidades!!!");
             mCompra = mCompra - (mCompra*1);
             System.out.println("El monto de tu compra es " + mCompra + "$");
             break;
            default:
             System.out.println("No se pudo mi chavo");
          }
    }
}
