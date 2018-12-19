var msg = "I am going to london"
var spaces= 0
var words =0

while (words<msg.length()){
if (msg.substring(words,words+1)==" "){
		println()
}
else {
	print(msg.substring(words,words+1))
}
words +=1 
}