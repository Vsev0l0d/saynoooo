fun calculateEvenDigits(input:String): Int{
    var res: Int = 0
    for (c in input){
        if (c.toString().toInt() % 2 == 0) res += c.toString().toInt()
    }
    return res
}