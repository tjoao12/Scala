abstract class bank {

	def showbalance()
	def deposit(A:Int)
	def withdraw(A:Int)
	}
	
	class HSBC extends bank{
	
	override def showbalance()={
		println("balance");
	}
	
	override def deposit(A:Int)={
		println(A+ " deposited")
		}
	
	override def withdraw(A:Int)= {
		println(A+" withdrawn")
		}
	
	}
	var ref= new HSBC()
	Banking(ref)
	
	def Banking(B:bank)={
	
	B.showbalance()
	B.deposit(200)
	B.withdraw(500)
	}