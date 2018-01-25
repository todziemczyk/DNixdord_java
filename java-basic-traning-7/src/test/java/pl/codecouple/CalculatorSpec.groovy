package pl.codecouple

import spock.lang.Specification
import spock.lang.Unroll

import java.lang.Void as Should

class CalculatorSpec extends Specification {

    Calculator calculator = new Calculator()

    Should "add two numbers" () {
        given:
           // Calculator calculator = new Calculator()
        when:
            def result = calculator.add (10,10)
        then:
            result == 20
    }
    @Unroll
    Should "subtract #a from #b is #expectedResult" () {
       when:
            def result = calculator.subtract (a,b)
        then:
            result == expectedResult
        where:
            a | b || expectedResult
            0 | 0 || 0
            1 | 2 || -1
    }

    Should "thrown DividingByZero exception when divide by zero" () {
        given:

        when:
            def result = calculator.divide (10,0)
        then:
            thrown(DividingByZero.class)
    }

    Should "multiply two numbers" () {
        when:
            def result = calculator.multiple (10,0)
        then
            result == 0
    }
}