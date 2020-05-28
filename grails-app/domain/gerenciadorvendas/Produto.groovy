package gerenciadorvendas

class Produto {

    String descricao;
    String nome;
    double valor;

    static constraints = {
        descricao nullable: true;
    }
}
