package gerenciadorvendas

class Comissao {

    Venda venda;
    double valorComissao;

    static belongsTo = [venda:Venda];
    static hasOne = [venda:Venda];

    static constraints = {
    }
}
