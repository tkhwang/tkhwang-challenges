fun main() {
//    fun part1(input: List<Int>): Int {
//        val length = input.size;
//        var count = 0;
//
//        for (i in 1..length-1) {
//            val prv = input[i-1];
//            val cur = input[i];
//
//            if (prv < cur) count += 1;
//        }
//
//        return count;
//    }

    fun part1(input: List<Int>): Int {
        return input.windowed(2).count {
            it.first() < it.last()
        }
    }

    fun part2(input: List<Int>):Int {
        return input.windowed(4).count {
            it.first() < it.last()
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInputAsInts("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInputAsInts("Day01")
    println(part1(input))
    println(part2(input))
}
