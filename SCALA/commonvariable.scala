class bank{

	def amount(x:Int)= {
		println("Amount: " + (x*bank.Dollar))
		}
	def setDollar(x:Int)={
		bank.Dollar=x
		}
	}

object bank {
	var Dollar=95
		}
		
	var HSBC = new bank()
	var Natwest = new bank()
	var Barclays = new bank()
	HSBC.amount(5)
	Natwest.amount(3)
	Barclays.amount(2)