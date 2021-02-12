package example

class Holla {
    companion object {
        fun a() {println("Hello, World!")}
    }
    fun main(args : Array<String>) {
        println("Hello, World!")
    }

    fun result(foo: String, bar: String, Function:(String, String) -> String): String{
        val result = Function(foo, bar)
        return """<h1>$foo</h1><br>h1>$bar</h1><br>$result"""
    }

    fun marinafunc(foo: String, bar: String): String="Σ="+(Integer.valueOf(foo)+Integer.valueOf(bar)).toString()
    fun guest(a: String, b: String): String=""

    fun callmarina(){
        val foo = "3"
        val bar = "7"
        println(result(foo,bar, ::marinafunc))
        println(result(foo,bar, ::guest))
    }

}