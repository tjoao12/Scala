var regno= new Array[Int](3)
var name= new Array[String](3) 
var marks= new Array[Int](3)
var i= 0
var max= 0


while(i<marks.length){
	println("Type regno : ")
    regno(i) = scala.io.StdIn.readInt()
    
	println("Type name : ")
    name(i) = scala.io.StdIn.readLine()
	
	println("Type marks : ")
    marks(i) = scala.io.StdIn.readInt()
	
	if (max<marks(i)) {
	max=(i)
    }
	i=i+1
    
	}
	println("the person with the highest marks is: " + name(max))