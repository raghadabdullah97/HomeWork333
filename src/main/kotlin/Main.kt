import java.util.*

//Q1

fun main(args: Array<String>) {
    calculater()
}

private fun calculater() {
    val scanner = Scanner(System.`in`)  //إقراء من المستخدم يخليه يدخل قيم حطيته في متغير اسمو سكنر
    println("Enter first number: ")
    val first = scanner.nextDouble() // نوع البيانات المدخله حطيت دبل عشان الارقام ممكن تكون عشريه

    println("Enter second number: ")
    val second = scanner.nextDouble() // عشريه او غير عشريه راح تستقبلها الدبل

    println("Enter an operator (+, -, *, /,%): ") // إختار العمليه الي المستخدم راح يدخلها
    val operator = scanner.next()[0] // حطيتها كركتر عشان العلامات نوعها

    val result: Double
    if (operator == '+') { // نفحص القيمه الاوبريتور ب اف  , إذا كنت تساوي الزايد اطبع
        result = first + second
    } else if (operator == '-') {
        result = first - second

    } else if (operator == '*') {
        result = first * second

    } else if (operator == '/') {
        result = first / second
    } else if (operator == '%') {
        result = first % second
    } else {
        println("Error! operator is not correct") // واذا دخل علامه غير يطبع ذي
        return //  إذا كانت العمليه خاطئه , ماتكمل العمليه الي بعدها وقف هنا
    }

    println("$first $operator $second = $result")
}


















// Q2

private fun calculateSalary() {
    val scanner = Scanner(System.`in`)

    println("Insert current annual salary: ")
    val salary = scanner.nextDouble()

    println("choose the rating: \n(1=excellent, 2=good, and 3=poor)") //تقييم الموظف ,
    val rating = scanner.nextInt()


    val result: Double
    val raise: Double

    if (rating == 1) { // لو التقييم يساوي يساوي الواحد
        raise = 0.06 // لوكان 1؟؟ يتزود 6 من 100 , يعني مثال 1000 ضرب 6 من 100 ونجمعههعا على الراتب ال 1000 = 1060
        result = (salary * raise) + salary
    } else if (rating == 2) {
        raise = 0.04
        result = (salary * raise) + salary
    } else if (rating == 3) {
        raise = 0.015
        result = (salary * raise) + salary
    } else {
        println("Error! select correct rating from 1 to 3")
        return
    }

    println("Salary is: $salary \nraise is: $raise\nnew salary is: $result")
}

