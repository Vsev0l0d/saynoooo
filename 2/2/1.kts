fun getYearEra(year: Int): String{
    var st:String
    when {
        year < 1970 -> st = "before"
        year == 1970 -> st = "equals"
        year in 1971..2000 -> st = "after (XX century)"
        year in 2001..2100 -> st = "after (XXI century)"
        year >= 2101 -> st = "distant future"
        else -> st = "error"
    }
    return st
}