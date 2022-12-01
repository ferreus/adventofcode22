fun main() {
    fun part1(input: List<String>): Int {
        val elfs = mutableListOf<Int>()
        var current = 0
        for (line in input) {
            if (line.isEmpty()) {
                if (current>0) {
                    elfs.add(current)
                    current = 0
                }
            } else {
                current += line.toInt()
            }
        }

        return elfs.maxOf { it }
    }

    fun part2(input: List<String>): Int {
        val elfs = mutableListOf<Int>()
        var current = 0
        for (line in input) {
            if (line.isEmpty()) {
                if (current>0) {
                    elfs.add(current)
                    current = 0
                }
            } else {
                current += line.toInt()
            }
        }
        return elfs.sorted().takeLast(3).sum()
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
