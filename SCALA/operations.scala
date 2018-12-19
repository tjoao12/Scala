def operations(Joao:(Int, Int)=>Unit) {

Joao(10,10)
}

def add(A:Int, B:Int)={
var result = A+B
println("result: " + (result))
}

def multiply(A:Int, B:Int)={
var result = A*B
println("result: " + (result))
}

operations(add)
operations(multiply)