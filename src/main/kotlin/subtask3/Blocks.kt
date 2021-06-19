package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        val selectedOfClassB = mutableListOf<Any>()
        for (a in blockA) {
            if (a!!::class == blockB) {
                selectedOfClassB.add(a)
            }
        }
        return when (blockB) {
            Int::class -> selectedOfClassB.sumBy { it as Int }
            String::class -> selectedOfClassB.joinToString("")
            LocalDate::class -> selectedOfClassB.map { it as LocalDate }
                .reduce { x, y -> if (x.isAfter(y)) x else y }.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            else -> ""
        }
    }
}
