var num = 65
var binary= " "


println("the binary number for " + num + " is: ")
while (num >=1) { 

	if(num%2==0){
	binary=("0" + binary)
	}
	else{
    binary= ("1" + binary)
	}
	num= num/2
	}
	println(binary)
	
	
	
	
	