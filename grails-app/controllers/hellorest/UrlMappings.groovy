package hellorest

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
		//"/hello"(resources: "helloRest")
		
		"/hello"(controller:"HelloController",action:"index",method:"GET")
		"/hello/${id}"(controller:"HelloController",action:"show",method:"GET")
		"/hello/create"(controller:"HelloController",action:"create",method:"GET")
		"/hello/${id}/edit"(controller:"HelloController",action:"edit",method:"GET")
		"/hello"(controller:"HelloController",action:"save",method:"POST")
		"/hello/${id}"(controller:"HelloController",action:"update",method:"PUT")
		"/hello/${id}"(controller:"HelloController",action:"delete",method:"DELETE")
		
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
