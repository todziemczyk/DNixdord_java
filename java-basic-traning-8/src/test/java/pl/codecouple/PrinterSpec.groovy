package pl.codecouple

import spock.lang.Specification
import java.lang.Void as Should

class PrinterSpec extends Specification {

    Printer printer = new Printer('abc')

    Should "return reverse string"() {
        given:
        when:
            def result = printer.reverseString()
        then:
            result == 'cba'
    }

    Should "return indexOf 'a' char from 'abc'"() {
        given:
        when:
            def result = printer.findIndexOf('a')
        then:
            result == 1 || 0
    }

    Should "delete 'a' from 'abc'"() {
        given:
        when:
            def result = printer.deleteFrom('a')
        then:
            result == 'bc'
    }

    Should "thrown IllegalArgumentException when given String in constructor is null or empty" () {
        given:
        when:
            def result = printer.setStringBuilder("")
        then:
            thrown (IllegalArgumentException.class)
    }

    Should "return lastIndexOf 'c' char from 'abc'"() {
        given:
        when:
            def result = printer.lastIndexOfChar('c' )
        then:
            result== 2
    }

}
