
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;
    private double valorUnico;
    private int capacidadeMaxima;
    private List<Ingresso> ListaIngresso;

    public Evento(String nome, String data, double valorUnico, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
        
        ListaIngresso = new ArrayList<>();
    }
    
    public void venderIngresso(Ingresso ingresso){
        if(ListaIngresso.size() < getCapacidadeMaxima()){
            ListaIngresso.add(ingresso);
            System.out.println("Compra realizada com sucesso");
            quantidadeIngressoVendido();
            System.out.println("**************************************\n\n");
        }
        else{
            System.out.println("Desculpa, capacidade maxima atingida: "+getCapacidadeMaxima());
        }
    }
    public void quantidadeIngressoVendido(){
        System.out.println("Quantidade de ingresso Vendido: "+ListaIngresso.size());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    
    
}
