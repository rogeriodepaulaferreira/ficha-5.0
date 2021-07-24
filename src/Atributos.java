public class Atributos {

    private String nome;
    private Long descricao;
    private int valorDoAtributo;
    private Configuracoes config;

    public Atributos(){
        config = new Configuracoes();
    }

    public String getNome() {
        return nome;
    }

    public Long getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(Long descricao) {
        this.descricao = descricao;
    }
    
    public int getValorDoAtributo() {
        return valorDoAtributo;
    }

    public void setValorDoAtributo(int valorDoAtributo) {
        this.valorDoAtributo = Math.max(valorDoAtributo, 0);
    }

    public double getModificador(){

        double modificador = (
                this.valorDoAtributo - config.getValorBaseAtributoModificador()
        ) / config.getValorBaseCalculoModificador();

        return Math.floor(modificador);
    }
}
