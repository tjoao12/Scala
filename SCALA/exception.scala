try {
var x= 4/0
println("the result of division is " + x)
}
catch {
    case a:ArithmeticException=> 
	println("don't divide by 0")

}