class results {

private var phy:Int=0
private var che:Int=0
private var total:Int=0
var fail=0
var C=0
var B=0
var Agrade=0

def physics(A:Int)= {

if (A>=0 && A<=150){
phy=A
println("physics mark " + phy)
	if(A<70){
	fail= +1
	println("failed grade")
	}
	if(A<70 && A>=0){
	C= +1 
	println("C grade")
	}
	if(A>80 && A<90){
	B= +1
	println("B grade")
	}
	if(A>90) {
	Agrade= +1
	println("A grade")
	}
	
}

else{
println("sorry invalid physics marks")
}

}

def chemistry(A:Int)= {
if (A>=0 && A<=150){ 
che=A
println("chemistry mark " + che)
	if(A<70){
	fail= +1
	println("Failed grade")
	}
	if(A>70 && A>=0){
	C= +1
	println("C grade")
	}
	if(A>80 && A<90){
	B= +1
	println("B grade")
	}
	if(A>90){
	Agrade= +1
	println("A grade")
	}
}
else {
println("sorry invalid chemistry marks")
}
}

private def calculations()= {
total=phy+che
}

def showresults() ={
calculations()
if (total<300)
if (fail==0)
println("you have passed the course")
println("totalmarks " + total)
if (fail==2)
println("you have failed the exams")
else if (fail==1)
println("you need to retake an exam")
else if (fail==0)
println("you have passed the course")
}

}

var joao = new results()
	joao.physics(95)
	joao.chemistry(30)
	joao.showresults()
