var physics=60
var chemistry=70
var maths=80
var total=(physics+chemistry+maths)
var per=(total*100/450)
if (per>=90) {
	println("the total amount of marks is " + total)
	println("the percentage is " + per +" you have passed the exams")
	println("the grade is A")
}
if (per>=80 && per<90) {
	println("the total amount of marks is " + total) 
	println ("the percentage is " + per +" you have passed the exams")
	println("the grade is B")


}
if (per>=70 && per<80) {
	println("the total amount of marks is " + total) 
	println ("the percentage is " + per +" you have passed the exams")
	println("the grade is C")
}
if (per>=60 && per<70) {
	println("the total amount of marks is " + total) 
	println ("the percentage is " + per +" you have passed the exams")
	println("the grade is D")
}
if (per<=59) {
	println("the total amount of marks is " + total) 
	println ("the percentage is " + per +" you have failed the exams")
	println("the grade is fail")
}