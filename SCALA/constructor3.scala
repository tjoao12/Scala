class boom{
	println("hello")
	def this(A:Int, B:Int, C:Int)= {
	this()
	println("second constructor")
	}
	
	def this(A:Int, B:Int) = {
	this()
	println("I am the 3rd construction")
	}
	}
	
	var x= new boom(2,4,8)