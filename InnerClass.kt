class InnerClass
{
    private val i : Int = 19

    inner class Inner
    {
        fun show(): Int {
            return i+i
        }
    }
}

fun main()
{
    val o = InnerClass().Inner().show()
    print(o)
}