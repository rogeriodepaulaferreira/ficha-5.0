public class Atributos extends Configuracoes {

    private String nome;
    private Long descricao;
    private int valorDoAtributo;

    public Atributos(){
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

    public int getModificador(){

        double modificador = (
                this.valorDoAtributo - super.getValorBaseAtributoModificador()
        ) / super.getValorBaseCalculoModificador();

        return (int) Math.floor(modificador);
    }
}
