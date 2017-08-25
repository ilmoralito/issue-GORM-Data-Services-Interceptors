package demo


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PersonInterceptor)
class PersonInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test person interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"person")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
