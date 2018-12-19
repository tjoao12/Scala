var bill=2
var paid= 8
var balance=(paid-bill)
var one =0
var two =0
var five =0
var ten =0
var twenty =0
var fifty =0 

println("your change is £" + balance)

if (balance>=50){
	fifty = fifty + (balance/50)
	balance = balance - (fifty*50)
	println("you receive £50: " + fifty)
}
if (balance>=20) {
twenty = twenty + (balance/20)
balance = balance - (twenty*20)
println("you receive £20: " + twenty)
}
if (balance>=10) {
ten = ten + (balance/10)
balance = balance - (ten*10)
println("you receive £10: " + ten)
}
if(balance>=5) {
five = five + (balance/5)
balance = balance - (five*5)
println("you receive £5: " + five)
}
if(balance>=2) {
two = two + (balance/2)
balance = balance - (two*2)
println("you receive £2: " + two)
}
if(balance>=1) {
one = one + (balance/1)
balance = balance - (one*1)
println("you receive £1: " + one)
}