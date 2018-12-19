class math {

def addition(A:Int, B:Int) {
var result = A+B
println("Result: " + (A+B))
}
}

class math2 extends math {

def multiply(A: Int, B:Int)={
var result = A*B 
println("Result: " + (A*B))
}
}

class math3 extends math2 {
def divide(A: Int, B:Int)={
var result = A/B 
println("Result: " + (A/B))
}
def substraction(A: Int, B:Int)={
var result = A-B 
println("Result: " + (A-B))
}
}

var ref=new math3()
ref.multiply(20,10)
ref.divide(20,10)
ref.substraction(20,10)
ref.addition(20,10)