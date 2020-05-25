package gerenciadorvendas

class Usuario {

    String nome;
    String nomeDeUsuario;
    String email;
    String senha;
    String endereco;
    long cpf;
//    double percentComissao;

//    static hasMany = [venda:Venda];

    static constraints = {
        email email: true;
    }
}
