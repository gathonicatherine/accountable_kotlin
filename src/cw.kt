//
//fun main() {
//    var a= 1
//    while (a<=10){
//        println("It is a chilly morning")
//      a++
//    }
//    var oddNum = 100
//        while(oddNum<12){
//            if (oddNum%2==0){
//            }
//            println(oddNum)
//        oddNum--
//
//    }
//    var x = 1
//    while (x<=100){
////    condition is met first
//        println(x)
//        x++
//    }
//    do{
//        println(x)
////        condition is met after/evaluating
//        x++
//    }while (x<=100)
////    use a do while loop to print out the squares of all positive int to a maximum square of 1800
//
//square()
//}
//fun square(){
//    var num=1
//    do{
//        println(num*num)
//        num++
//    }while (num*num<=1800)
//    var names= listOf("You","Them","They","What")
//    for (name in names){
//        if (name=="What"){
////            println("Found what!?!?!?!?!")
//            break
//        }
//        println(name)
//    }
//    var noisy = listOf("Jane","Fred","Kate","Elizabeth","Mary")
//    for(name in noisy){
//        if (name=="Mary"){
//            continue
//        }
//        println(name)
//    }
//    var noise = listOf("Wangui","Ian","Rue","Jane")
//    for (name in noise){
//       if(name=="Rue"){
//            continue
//        }
//        println(name)
//    }
////}
//fun main() {
//leapYear()
//}
//fun leapYear(){
//
//val year = 1900
//var leap = false
//
//if (year % 4 == 0) {
//    if (year % 100 == 0) {
//        leap = year % 400 == 0
//    } else
//        leap = true
//} else
//leap = false
//
//println(if (leap) "$year is a leap year." else "$year is not a leap year.")
//}

fun leapYear(year:Int){
    if (year % 4 ==0){
        print("${year} is a leap year")
    }else{
        print("${year} is not a leap year")
    }


}
fun checkAlphabets(i:Array<String>){
    var i = "a"
    if (i in "a".."z"|| i in "A".."Z"){
        print("$i is an alphabet")
    }else {
        print("$i is not an alphabet")
    }


}
fun numbers(){
    for (a in 1..100){
        if (a %3==0 && a %5==0){
            println("FizzBuzz")
        }else if (a%3==0) {
            println("Buzz")
        }else if (a%5==0){
            println("Fizz")
        }else
            println(a)

    }
}
fun multiple(){
    for (i in 1..1000)
        if (i%6==0 && i%8==0){
            println("Bingo")
        }else if (i%6==0){
            println("{i} is a multiple of 6")
        }else if(i%8==0) {
            println("{i} is a multiple of 8")
        }else{
            println("{i} is not a multiple of both 6 and 8")
        }



}
fun main() {
    leapYear(2022)
    checkAlphabets(arrayOf("q","a","kq"))
    numbers()
    multiple()
}
