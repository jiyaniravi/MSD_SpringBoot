package com.af.msd

import spock.lang.Shared
import spock.lang.Specification

class HelloControllerShould extends Specification {

    @Shared def helloController = new HelloController();

    def 'say hello to user when index() API called'(){
        given   : 'Nothing'
        when    : 'helloControllerShould.index() called'
                    def result = helloController.index();
        then    : 'result should match with expected result'
                    result == expectedResult
        where   :
                    _   ||  expectedResult
                    _   ||  'Hello to Spring Boot App !'
    }

}
