package OperacaoBasica;
import java.util.HashSet;
import java.util.Set;
public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;
    //construtor, quando criarmos o valor() vazio e instanciamos o hashSet


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado ){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }

        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1214 );
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1215 );
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1215 ); //não será salvo porque é repetido
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1217 );

        conjuntoConvidados.exibirConvidado();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidado dentro do Set Convidado");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1215);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " dentro do Set Convidado");

        conjuntoConvidados.exibirConvidado();
    }
}

