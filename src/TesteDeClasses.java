public class TesteDeClasses {

    public static void main(String[] args) {
        Atributos at1 = new Atributos();
        Pericias pe1 = new Pericias(at1);

        at1.setNome("Força");
        at1.setValorDoAtributo(16);
        System.out.println(""+at1.getNome()
                +" o valor do atributo é "+at1.getValorDoAtributo()+" modificador é :"
                +at1.getModificador());

        pe1.setNome("Teste de resistência");
        pe1.setProeficiencia(true);


        System.out.println("Pericia "+pe1.getNome()
                +" o valor é "+pe1.getTesteProeficiencia());


    }

}
