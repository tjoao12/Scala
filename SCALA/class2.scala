class results {
var phy = 0
var che = 0
var mat = 0 

def showresults = {
var total = phy+che+mat
var per = total*100/450
	if (per<=40){
	println("the percentage is " + per)
	println("you have failed the exam " + per)
}
	if (per>40) {
	println("the percentage is " + per)
	println("you have passed the exam " + per)
}
}
}

var peter = new results()
peter.phy=100
peter.che=100
peter.mat=45
peter.showresults
