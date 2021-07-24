public class TesteDeClasses {

    public static void main(String[] args) {
        Atributos at1 = new Atributos();

        at1.setNome("Força");
        at1.setValorDoAtributo(-1);
        System.out.println("O valor do de "+at1.getNome()+" o valor do atributo é "+at1.getValorDoAtributo()+" modificador é :"+at1.getModificador());
    }

}
