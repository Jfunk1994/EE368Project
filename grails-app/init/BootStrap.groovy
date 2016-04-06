//package hellorest

import hellorest.HelloWorld

class BootStrap {

    def init = { servletContext ->
		new HelloWorld(name:"Bishop").save()
		new HelloWorld(name:"Tim").save()
		new HelloWorld(name:"Adam").save()
		new HelloWorld(name:"Joe").save()
		new HelloWorld(name:"David").save()
		new HelloWorld(name:"Jack").save()
    }
    def destroy = {
    }
}
