package gerenciadorvendas

//import grails.persistence.Entity
//import javax.persistence.DiscriminatorValue
//
//@Entity
//@DiscriminatorValue(value = "A")
class Administrador extends Usuario {

    public static final boolean flcomissao = 0;
    public static final double percentComissao = 0;

    static constraints = {
    }
}
