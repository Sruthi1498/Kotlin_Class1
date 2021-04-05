inline fun inline(f: () -> Unit)
{
    f()
    println("inline function")
}
fun main() = inline{ println("function calling")}