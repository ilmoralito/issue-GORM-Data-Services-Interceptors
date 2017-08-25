package demo

import demo.PersonService

class PersonInterceptor {

    PersonService personService

    boolean before() {
        println personService.list()

        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
