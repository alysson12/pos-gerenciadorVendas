package gerenciadorvendas

import grails.gorm.annotation.Entity

import javax.persistence.Column
import javax.persistence.DiscriminatorColumn
import javax.persistence.DiscriminatorType
import javax.persistence.DiscriminatorValue
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("U")
class Usuario {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String nome;
    String nomeDeUsuario;
    String email;
    String senha;
    String endereco;
    long cpf;
    Double percentComissao;


//    @Column(insertable=false, updatable=false)
//    String tipo;
//    double percentComissao;

//    static hasMany = [venda:Venda];

    static constraints = {
        email email: true;
        senha password:true;
//        tipo insertable:false;
//        tipo updatable:false;

    }
}
