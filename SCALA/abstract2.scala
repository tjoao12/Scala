abstract class draw{

	def drawing()
	}
	
	class line extends draw {
	
	override def drawing() = {
		println("draw circle")
		}
		}
		
	class circle extends draw{
		override def drawing()={
		println("draw line")
		}
		}
		
	var L=new line()
	letsdodrawing(L)
	var C= new circle()
	letsdodrawing(C)
	
	def letsdodrawing(x:draw){
	x.drawing()
	}