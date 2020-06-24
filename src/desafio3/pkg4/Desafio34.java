package desafio3.pkg4;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio34 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        
        System.out.println("Qual a primeira nota?");
        nota1 = ler.nextDouble();
        System.out.println("Qual a segunda nota?");
        nota2 = ler.nextDouble();
        System.out.println("Qual a terceira nota?");
        nota3 = ler.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        
        if (media <= 6) {
            System.out.println("Sua nota é:"+media+"\nAprovado.");
        }else{
            System.out.println("Sua nota é:"+media+"\nReprovado.");
        }
    }
    
}
