var physics=90
var chemistry=95
var maths=90
var total=(physics+chemistry+maths)
var per=(total*100/450)
var fail=0

if (physics<=89) {
fail = fail +1 
}

if (chemistry<=89) {
fail = fail + 1
}

if (maths<=89) {
fail = fail + 1
}

if (fail == 0) {
println("the total amount of marks is " + total)
println("the percentage is " + per)
}

if (fail == 1) {
println("retake test")
}
if (fail == 2) {
println("retake course")
}
if (fail == 3) {
println("go home")
}	
	