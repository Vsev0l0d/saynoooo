fun calculateWordStat(input:String): String{
    return input.split(" ").groupingBy { it }.eachCount().maxBy { it.value }?.key.toString()
}