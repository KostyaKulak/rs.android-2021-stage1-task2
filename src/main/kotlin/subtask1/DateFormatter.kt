package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.ResolverStyle
import java.util.Locale

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            LocalDate.parse(
                "$year-$month-$day",
                DateTimeFormatter.ofPattern("uuuu-M-d")
                    .withResolverStyle(ResolverStyle.STRICT)
            ).format(
                DateTimeFormatter.ofPattern(
                    "dd MMMM, EEEE",
                    Locale("ru")
                )
            )
        } catch (e: Exception) {
            println(e)
            "Такого дня не существует"
        }
    }
}
