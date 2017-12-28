
import java.util.Scanner;
import javax.swing.JTextField;



public class ProgressãoAritmetica extends javax.swing.JFrame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1,A2,A3,CNTermo,NTPedido,NTermo,Soma,Razao = 0,TFinal,NTFinal,TCentral;
        String PA;
        
        A1 = sc.nextInt(); /*Número pedido de a1*/
        A2 = sc.nextInt(); /*Número pedido de a2*/
        A3 = sc.nextInt(); /*Número pedido de a3*/
        NTermo = sc.nextInt();  /*Número pedido de um termo qualquer*/
        TFinal = sc.nextInt(); /*Número pedido do termo final da soma*/
        NTFinal = sc.nextInt(); /*Número pedido do ultimo termo da PA*/
        
        
        if ((A2 - A1) == (A3 - A2)) {
            PA = "É uma P.A.";
            Razao = A2 - A1; 
            
            CNTermo = A1 + ((NTermo -1) * Razao);
            System.out.println(CNTermo);
            NTPedido = ((TFinal - A1)/Razao) + 1;
            Soma = ((A1 + TFinal) * NTPedido)/2;
            
            TCentral = CNTermo + A1;
        }
        else {
            PA = "Não é uma P.A.";
        }  
    }
}

