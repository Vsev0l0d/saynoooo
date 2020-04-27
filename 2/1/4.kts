fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    return cashAmount*(dayNumber*bugRank+42)
}
