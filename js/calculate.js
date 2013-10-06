/* Function for calculating cost per person*/

var distance, mpg, cpg, people, total, rounded;

//Grab the form inputs and remove commas
function setValues(){
	distance = (document.getElementById("distance").value).replace(/\,/g,'');
	mpg = (document.getElementById("mpg").value).replace(/\,/g,'');
	cpg = (document.getElementById("cpg").value).replace(/\,/g,'');
	people = (document.getElementById("people").value).replace(/\,/g,'');
}



// Calculate total value
function calc() {
	setValues(); // Import variables
	total = (distance * cpg) / (mpg * people)
	rounded = Math.round(total * 100) / 100
	document.getElementById("total").value = rounded
	validate();
}


// Validate inputs
function validate() {
	//Check for blank values
	javascript:$('#calculator').parsley('validate');
	
	//Remove any commas to allow for easy calculation
	parseFloat('100,000.00'.replace(/,/g, ''))
	
	//Don't show NaN in the total field
	if (isNaN(rounded)) {
		document.getElementById("total").value = "";
	}
}
