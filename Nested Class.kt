class Outer
{
    private val i :Int =10
    class Inner
    {
        fun add(): Int
        {
            return 5 * Outer().i
        }
    }
}
fun main()
{
    val obj = Outer.Inner().add()
    print(obj)
}