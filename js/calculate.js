/* Function for calculating cost per person*/

var distance
var mpg
var cpg
var people
var total

//Grab the form inputs
function setValues(){
	distance = Number(document.getElementById("distance").value);
	mpg = Number(document.getElementById("mpg").value);
	cpg = Number(document.getElementById("cpg").value);
	people = Number(document.getElementById("people").value);
}

// Calculate total value
function calc() {
	setValues()
	total = (distance * cpg) / (mpg * people)
	var rounded = Math.round(total * 100) / 100
	document.getElementById("total").value = rounded
}


// Validate that these are functions
function isNumber(n) {
	return !isNaN(parseFloat(n)) && isFinite(n);
}
