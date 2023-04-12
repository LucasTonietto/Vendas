import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Evento evento1 = new Evento("Show Ana Castela ", "25/09/2022", 100, 10);
        Evento evento2 = new Evento("Show Bruno e Barretto", "15/10/2022", 200, 20);
        Evento evento3 = new Evento("Pedro Paulo e Alex", "15/11/2022", 300, 2);
       
    
        Ingresso ingressoPista1 = new IngressoPista("Lucas", "14725836912", evento1);
        Ingresso ingressoVip1 = new IngressoVIP("Rodrigo", "36925814714", evento1);
        Ingresso ingressoCamorote1 = new IngressoCamarote("Marcos ", "78945612398", evento1);
        Ingresso ingressoPista2 = new IngressoPista("Carlos", "74819065231", evento2);
        Ingresso ingressoVip2 = new IngressoVIP("Henrique", "13579086427", evento2);
        Ingresso ingressoCamorote2 = new IngressoCamarote("Gustavo ", "75849613245", evento2);
        Ingresso ingressoPista3 = new IngressoPista("Matheus", "1464164589", evento3);
        Ingresso ingressoVip3 = new IngressoVIP("Antony", "20156974897", evento3);
        Ingresso ingressoCamorote3 = new IngressoCamarote("Altevir ", "70895234793", evento3);

   
   
        
        ingressoPista1.imprimirValor();
        ingressoPista1.mostrarResumo();        
        evento1.venderIngresso(ingressoPista1);
        
        ingressoVip1.imprimirValor();
        ingressoVip1.mostrarResumo();
        evento1.venderIngresso(ingressoVip1);
        
        ingressoCamorote1.imprimirValor();
        ingressoCamorote1.mostrarResumo();
        evento1.venderIngresso(ingressoCamorote1);
        
        ingressoPista2.imprimirValor();
        ingressoPista2.mostrarResumo();        
        evento2.venderIngresso(ingressoPista2);
        
        ingressoVip2.imprimirValor();
        ingressoVip2.mostrarResumo();
        evento2.venderIngresso(ingressoVip2);
        
        ingressoCamorote2.imprimirValor();
        ingressoCamorote2.mostrarResumo();
        evento2.venderIngresso(ingressoCamorote2);
        
        
        ingressoPista3.imprimirValor();
        ingressoPista3.mostrarResumo();        
        evento3.venderIngresso(ingressoPista3);
        
        ingressoVip3.imprimirValor();
        ingressoVip3.mostrarResumo();
        evento3.venderIngresso(ingressoVip3);
        
        ingressoCamorote3.imprimirValor();
        ingressoCamorote3.mostrarResumo();
        evento3.venderIngresso(ingressoCamorote3);
        
        
        
        
    }
}
