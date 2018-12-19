class AbsencesException extends Exception {}
class amountofabsences extends Exception {}

def salaryCalculations(Salary:Int, Absences:Int):Int = {

	var net=0
	if(Absences>=6 && Absences<=29){
	var x= new AbsencesException()
	throw x
	}
	
	else if(Absences>=30){
	var y= new amountofabsences()
	throw y
	}
	
	else { 
	net=(Salary*15)/100
	println(net)
	}
	return net
	}
	try{
		salaryCalculations(1000, 60)
	}

catch{
	case x:AbsencesException=> { 
	println("too many absences")
}
	case y:amountofabsences=> { 
	println("you have made a mistake, can not have more than 30 days absent")
}
}
