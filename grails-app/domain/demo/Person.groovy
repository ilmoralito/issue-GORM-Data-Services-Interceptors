package demo

class Person {

    String fullName
    String email

    static constraints = {
        fullName blank: false
        email blank: false, email: true, unique: true
    }
}
