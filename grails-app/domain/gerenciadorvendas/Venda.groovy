package gerenciadorvendas

class Venda {

    Usuario usuario;
    List<Item> itens;
    Date dataVenda;
    double valorVenda;
    Comissao comissao;

    static hasMany = [itens:Item];
    static hasOne = [comissao:Comissao];

    static constraints = {
        usuario nullable: true;
        comissao unique: true;
    }
}
