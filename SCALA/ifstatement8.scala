def tax (salary:Int):Int = {
		
		var taxamount= 0
		
		if (salary<=1000) {
		taxamount =0
		println("your tax is " + taxamount)
		}
		
		if (salary>=1000 && salary<=2000) {
		taxamount=salary/100*15
		println("your tax is " + taxamount)
		}
		
		if (salary>=2000 && salary<=3000) {
		taxamount=salary/100*17
		println("your tax is " + taxamount)
		}
		
		if (salary>3000) {
		taxamount=salary/100*21
		println("your tax is " + taxamount)
		}
		return taxamount
		}
		
		tax(2000)
	