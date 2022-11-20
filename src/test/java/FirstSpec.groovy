import spock.lang.Specification

class FirstSpec extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 2

        when:
        int result = left + right

        then:
        result == 4
    }

    def "should be able to remove from list"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(0)

        then:
        list == [2, 3, 4]
    }

    def "should get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        def exception = thrown(IndexOutOfBoundsException)
        exception.message == 'Index: 20, Size: 4'
        list.size() == 4
    }

    def "numbers to the power of two"(int base, int exponent, int result) {
        expect:
        Math.pow(base, exponent) == result

        where:
        base | exponent | result
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }
}
