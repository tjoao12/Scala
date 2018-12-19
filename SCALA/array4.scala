var countries = List ("UK", "USA", "Portugal")

var capitals = countries.map(findCapital)

def findCapital(C:String):String= {

var city= ""

if (C=="UK") {
	city= "London"
	}

if (C=="USA") {
	city= "New York"
	}

if (C=="Portugal") {
	city= "Lisbon"
	}
return city
}
print(countries)
print(capitals)

