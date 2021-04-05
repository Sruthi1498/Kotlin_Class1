
typealias l = Pair<String,String>

typealias Number<T> = (T) -> Boolean

fun main()
{
    val o = l("alice","girl")
    val o1 = l("bob", "boy")
 
    println(o)
    println(o1)

    val x : Number<Int> = {it%2 == 0}
    println(listOf(7,9,5,3,6,2,0,1).filter(x))

}