// ErrorReporting/ForEachLine.kt
import java.io.*
import errorreporting.*
import atomictest.*

fun main(args: Array<String>) {
  localFile("ForEachLine.kt").forEachLine {
    if(it.startsWith("//"))
      trace(it)
  }
  trace eq "// ErrorReporting/ForEachLine.kt"
}
