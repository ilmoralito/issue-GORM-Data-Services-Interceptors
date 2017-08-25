package demo

class BootStrap {

    def init = { servletContext ->
        List<Map> people = [
            [fullName: 'Naito Tetsuya', email: 'naito.tetsuya@domain.com'],
            [fullName: 'Katsuyori Shibata', email: 'Katsuyori.shibata@domain.com'],
            [fullName: 'Kenny Omega', email: 'kenny.omega@domain.com']
        ]

        people.collect { Map person ->
            new Person(fullName: person.fullName, email: person.email).save(failOnError: true)
        }

        assert Person.count() == people.size()
    }
    def destroy = {
    }
}
