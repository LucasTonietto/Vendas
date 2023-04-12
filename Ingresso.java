public abstract class Ingresso {
    private String nome;
    private String CPF;
    private Evento evento;
    private int capacidadeMaxima;
    
    public Ingresso(String nome, String CPF, Evento evento) {
        this.nome = nome;
        this.CPF = CPF;
        this.evento = evento;
    }
    
    public double calcularValorIngresso(){
        return getEvento().getValorUnico();
    }
    public void mostrarResumo(){
        System.out.println("Nome: "+getNome() + "\nCpf: "+getCPF() + "\nNome do Evento: "+getEvento().getNome() + "\nData: "+getEvento().getData() + "\nCapacidade Maxima do Evento: "+getEvento().getCapacidadeMaxima());
    }
    public void imprimirValor(){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Evento getEvento() {
        return evento;
    }

}
