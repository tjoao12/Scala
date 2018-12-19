class asda {
var product = " "
var quantity = 0
var price = 0.0 

def showbill = {
	var vat = price/100*15
	var bill = quantity*price
	var aftervat = quantity*price+vat
	println("product: " + product)
	println("the bill is " + bill)
	println("the vat is " + vat)
	println("the total price is " + aftervat)	
}
}
	var biscuits = new asda()
	biscuits.product = "biscuits"
	biscuits.quantity= 5
	biscuits.price= 2
	biscuits.showbill