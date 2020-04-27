fun calcNullValues(input: Array<Int?>):Array<Int> = arrayOf(input.count { it == null},input.filterNotNull().sum())
