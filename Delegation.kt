interface Delegation
{
    fun show()
}
interface Delegation1
{
    fun display()
}

class Delegate(private val str: String) : Delegation, Delegation1
{
    override fun show() {
        println("inside show function and displaying $str")
    }
    override fun display() {
        println("inside display function and displaying $str")
    }

}
class Main(private val D: Delegation, private val D1: Delegation1) : Delegation by D,Delegation1 by D1

    /* override fun show() {
        D.show()
    }

    override fun display() {
        D1.display()
    }*/



fun main()
{
    val m = Main(Delegate("string1"), Delegate("String2"))
    m.show()
    m.display()
}