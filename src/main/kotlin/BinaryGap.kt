class BinaryGap(){
    
    fun solution(n: Int): Int {
        var num = n
        var gap = 0
        var gapFlag = false
        var i = 0
        while (num > 0) {
            if (num % 2 == 0) {
                i++
            } else {
                if (i > gap && gapFlag) {
                    gap = i
                }
                gapFlag = true
                i = 0
            }
            num /= 2
        }
        return gap
    }
}