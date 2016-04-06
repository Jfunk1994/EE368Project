package myawesomeproject

class HelloController {
/*def world = {
render "Hello World!"
}*/
    def random = {
        Random rand = new Random()
        def list = ["Tim", "Joe", "Zach", "Bishop", "Adam", "David"]

        render list.get(Math.abs(new Random().nextInt() % list.size()))
    }
}