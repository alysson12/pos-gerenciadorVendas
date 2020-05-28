package gerenciadorvendas

class Comissao {

//    Venda venda;
    double valorVenda;
    double percentualComissao;
    double valorComissao;
    Date dataComissao;

    static belongsTo = [venda:Venda];
//    static hasOne = [venda:Venda];

    static constraints = {
    }
}
