package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        if (a.equals(b, ignoreCase = true)) {
            return "YES"
        }
        if (b.length > a.length) {
            return "NO"
        }
        var result = "YES"
        val charsA = a.toCharArray()
        val charsB = b.toCharArray()
        var offset = 0
        var remainder = ""
        for (i in charsB.indices) {
            while (i + offset < charsA.size - 1)
                if (!charsA[i + offset].equals(charsB[i], ignoreCase = true)) {
                    offset++
                } else {
                    break
                }
            if (i + offset > charsA.size - 1 || !charsA[i + offset].equals(charsB[i], ignoreCase = true)) {
                result = "NO"
            }
            if (i == charsB.size - 1) {
                remainder += charsA.slice(i + offset + 1 until charsA.size).joinToString()
            }
        }
        if (remainder.toLowerCase() != remainder) {
            result = "NO"
        }
        return result
    }
}
