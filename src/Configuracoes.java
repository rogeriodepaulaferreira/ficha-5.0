public abstract class Configuracoes {


    private int valorBaseAtributoModificador = 10;
    private int valorBaseCalculoModificador = 2;
    private int valorBaseProeficiencia = 2;

    public double getValorBaseAtributoModificador() {
        return valorBaseAtributoModificador;
    }

    public void setValorBaseAtributoModificador(int valorBaseAtributoModificador) {
        this.valorBaseAtributoModificador = valorBaseAtributoModificador;
    }

    public double getValorBaseCalculoModificador() {
        return valorBaseCalculoModificador;
    }

    public void setValorBaseCalculoModificador(int valorBaseCalculoModificador) {
        this.valorBaseCalculoModificador = valorBaseCalculoModificador;
    }

    public int getValorBaseProeficiencia() {
        return valorBaseProeficiencia;
    }

    public void setValorBaseProeficiencia(int valorBaseProeficiencia) {
        this.valorBaseProeficiencia = valorBaseProeficiencia;
    }

}
