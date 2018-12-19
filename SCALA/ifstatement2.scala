var physics=60
var chemistry=70
var maths=80
var total=(physics+chemistry+maths)
var per=(total*100/450)
if (per<59) {
	println("the total amount of marks is " + total)
	println("the percentage is " + per +" you have failed the exams")
}
if (per>=59) {
	println("the total amount of marks is " + total) 
	println ("the percentage is " + per +" you have passed the exams")

}