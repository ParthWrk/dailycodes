 fun Sum(n: Int): Int {
     var n = n
     var sum = 0
     while (n != 0) {
         sum = sum + n % 10
         n = n / 10
     }
     return sum
 }

 fun main(args: Array<String>) {
     val n = 25
     println(Sum(n))
 }
