enum class EnumAnonymous(val str:String) {
    Number1("one")
    {
        override fun show()
        {
            println("number 1")
        }
    },
    Number2("two")
    {
        override fun show()
        {
            println("number 2")
        }
    },
    Number3("three")
    {
        override fun show()
        {
            println("number 3")
        }
    };
    abstract fun show()
}

fun main()
{
    EnumAnonymous.Number1.show()
    EnumAnonymous.Number2.show()
    EnumAnonymous.Number3.show()
}