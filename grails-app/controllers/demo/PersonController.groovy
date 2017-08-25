package demo

import demo.PersonService

class PersonController {

    @Autowired PersonService personService

    def index() {
        render personService.list()
    }
}
