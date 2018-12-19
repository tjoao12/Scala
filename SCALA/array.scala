var numbers=  Array(2,7,8,10,100,4,6,89)

var i=0
var max=numbers(0)
var second=numbers(0)


while(i<numbers.length){
	
	if (max<numbers(i)) {
	second=max
	max=numbers(i)
    }
	
	if (second<numbers(i) && max>numbers(i)) {
	second=numbers(i)
	}

	if (second==max){
	second=numbers(i)
	}
	
	i=i+1

	}
	println("the max value is: " + max)
	println("the second highest value is: " + second)