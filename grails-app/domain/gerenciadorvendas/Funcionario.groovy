package gerenciadorvendas

//import grails.gorm.annotation.Entity
//import javax.persistence.DiscriminatorValue
//
//@Entity
//@DiscriminatorValue(value = "F")
class Funcionario extends Usuario{

    public static final boolean flcomissao = 1;
    public double percentComissao = 3;

    static constraints = {
        percentComissao editable:true;
    }
}
