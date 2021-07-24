public class Pericias extends Configuracoes {

    private String nome;
    private Long descricao;
    private int valorDaProeficiencia = 0;
    private boolean proeficiencia = false;
    private Atributos atributo;

    public Pericias( Atributos atributo){
        this.atributo = atributo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getDescricao() {
        return descricao;
    }

    public void setDescricao(Long descricao) {
        this.descricao = descricao;
    }

    public int getValorDaProeficiencia() {
        return valorDaProeficiencia;
    }

    public void setValorDaProeficiencia(int valorDaProeficiencia) {
        this.valorDaProeficiencia = valorDaProeficiencia;
    }

    public boolean isProeficiencia() {
        return proeficiencia;
    }

    public void setProeficiencia(boolean proeficiencia) {
        this.proeficiencia = proeficiencia;
    }

    public int getTesteProeficiencia(){
        return (this.isProeficiencia() ? super.getValorBaseProeficiencia():0)  + this.valorDaProeficiencia + atributo.getModificador();
    }


}
