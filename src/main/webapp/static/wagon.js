$(document).ready(function(){
  $("#calcBtn").click(function(){
	  wrapper = {}
	  trip = {}
	  trip['mpg'] = $('#mpg_input').val();
	  trip['ppg'] = $('#ppg_input').val();
	  trip['miles'] = $('#mi_input').val();
	  trip['riderCount'] = $('#riders_input').val();
	  wrapper['trip'] = trip;
	  
	  $.ajax({
		  type: "POST",
		  url: "rest/calculator/adhoc",
		  contentType:"application/json; charset=utf-8",
		  data: JSON.stringify(wrapper),
		  dataType: "json",
		  success:function(data) { $("#number").text(data['charge']['amount'])},
		  error:function() {}
	  });
  });
});