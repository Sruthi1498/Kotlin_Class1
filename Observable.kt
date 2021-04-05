import kotlin.properties.Delegates

class Observable
{
    var name: String by Delegates.observable("name")
    {
            _, old, new ->
        println("$old -> $new")
    }
}
fun main()
{
    val o = Observable()
    o.name = "alice"
    o.name = "bob"
}