class person() {

 private var _age = 0
 var name = ""
 def age = _age
 def age_= (value:Int)= _age = value
}

var info = new person()
info.age = 99
print(info.age)