package gerenciadorvendas

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ComissaoController {

    ComissaoService comissaoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond comissaoService.list(params), model:[comissaoCount: comissaoService.count()]
    }

    def show(Long id) {
        respond comissaoService.get(id)
    }

    def create() {
        respond new Comissao(params)
    }

    def save(Comissao comissao) {
        if (comissao == null) {
            notFound()
            return
        }

        try {
            comissaoService.save(comissao)
        } catch (ValidationException e) {
            respond comissao.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'comissao.label', default: 'Comissao'), comissao.id])
                redirect comissao
            }
            '*' { respond comissao, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond comissaoService.get(id)
    }

    def update(Comissao comissao) {
        if (comissao == null) {
            notFound()
            return
        }

        try {
            comissaoService.save(comissao)
        } catch (ValidationException e) {
            respond comissao.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'comissao.label', default: 'Comissao'), comissao.id])
                redirect comissao
            }
            '*'{ respond comissao, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        comissaoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'comissao.label', default: 'Comissao'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'comissao.label', default: 'Comissao'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
