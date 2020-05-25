package gerenciadorvendas

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ComissaoServiceSpec extends Specification {

    ComissaoService comissaoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Comissao(...).save(flush: true, failOnError: true)
        //new Comissao(...).save(flush: true, failOnError: true)
        //Comissao comissao = new Comissao(...).save(flush: true, failOnError: true)
        //new Comissao(...).save(flush: true, failOnError: true)
        //new Comissao(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //comissao.id
    }

    void "test get"() {
        setupData()

        expect:
        comissaoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Comissao> comissaoList = comissaoService.list(max: 2, offset: 2)

        then:
        comissaoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        comissaoService.count() == 5
    }

    void "test delete"() {
        Long comissaoId = setupData()

        expect:
        comissaoService.count() == 5

        when:
        comissaoService.delete(comissaoId)
        sessionFactory.currentSession.flush()

        then:
        comissaoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Comissao comissao = new Comissao()
        comissaoService.save(comissao)

        then:
        comissao.id != null
    }
}
