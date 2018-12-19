class MyExp extends Exception {}

var First=10
var Second=12

try {
	if(Second>First){
	var Ref= new MyExp
	throw Ref
	}	
}
catch{
	case x:MyExp=> 
	println("that is not allowed")
	
	}

