package hellorest

import grails.rest.*

class HelloController extends RestfulController{

	static responseFormats=['json','xml']
	HelloController(){
		super(HelloWorld)
	}
	
	
	def index()
	{
		//respond HelloWorld.list()
	
		Random rand = new Random()
        respond HelloWorld.get(Math.abs(new Random().nextInt(HelloWorld.count()) + 1))
		
	}
	
	/*def save(HelloWorld h)
	{
		if (!h.hasErrors())
		{
			HelloWorld.add(HelloWorld.count()+1,h)
			respond HelloWorld.get(HelloWorld.count()), status: 201
		}	
		else
			respond h
	}*/
	/*def show(HelloWorld h)
	{
		respond HelloWorld.get(h)
	}*/
	
	/*def display() 
	{
		Random rand = new Random()
        respond HelloWorld.get(Math.abs(new Random().nextInt() % HelloWorld.count()))
	}*/
	
	
}
