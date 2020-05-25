package gerenciadorvendas

class Item {

    Produto produto;
    int quantidade;
    double valorItem;

//    static belongsTo = [venda:Venda];
    static hasOne = [Produto];

    static constraints = {
    }
}
