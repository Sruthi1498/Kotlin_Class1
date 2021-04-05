interface Anonymous
{
    fun show()
}
fun main()
{
    val obj: Anonymous = object : Anonymous {
        override fun show() {
            print("inside anonymous class")
        }
    }
    obj.show()
}