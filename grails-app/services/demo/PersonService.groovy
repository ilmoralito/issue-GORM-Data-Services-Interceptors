package demo

import grails.gorm.services.Service

@Service(Person)
interface PersonService {

    List<Person> list()
}

/* class PersonService {
    
    List<Person> list() {
        Person.list()
    }
} */