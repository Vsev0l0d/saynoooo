fun calculateBugMentions(input:List<String>): Int{
    var count:Int = 0
    for (c in input){
        if (c.equals("BUG")) count++
    }
    return count
}