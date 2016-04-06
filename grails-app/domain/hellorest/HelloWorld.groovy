package hellorest
import grails.rest.*

@Resource(uri='/Names', formats=['json','xml'])
class HelloWorld {

	String name
	
    static constraints = {
	name blank:false
    }
}
