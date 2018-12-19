class dbconnection(password:String, user:String) {

def connection() = {
	println("password:" + password)
	println("user:" + user)
	}
	}
var ref= new dbconnection("abc","joao")
ref.connection()