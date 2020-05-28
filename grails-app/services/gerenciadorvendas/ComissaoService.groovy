package gerenciadorvendas

import grails.gorm.services.Service

@Service(Comissao)
interface ComissaoService {

    Comissao get(Serializable id)

    List<Comissao> list(Map args)

    Long count()

    void delete(Serializable id)

    Comissao save(Comissao comissao)

}