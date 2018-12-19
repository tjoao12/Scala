var msg = "I am going to london"
var words = ""
var i = msg.length()-1

while (i>=0){
if (msg.substring(i,i+1)==" "){
		println(words)
		words= " "
}
else {
	words=(msg.substring(i,i+1)+ words)
}
i=i-1
}
print(words)
