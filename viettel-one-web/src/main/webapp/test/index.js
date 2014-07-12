lancamento = {
    empresa: {id: 2, name: "Teste"},
    partidas: [
      {conta: 
      	{codigo:"1.02.0002", nome: "Compras"}, natureza: "1"}, 
      {conta: 
      	{codigo:"1.02.0001", nome: "Banco"}, natureza: "-1"}
    ],
    description: "Teste", 
    value: "125,67", 
    date: "12/03/1999"
  };

data = {
		fullName: "Mario Izquierdo",
		
		address: {
			city: "San Francisco",
			state: {
				name: "California",
				abbr: "CA"
			}
		},

		jobbies: ["code", "climbing"],

		projects: [
		           { 
		        	   name: "serializeJSON", 
		        	   language: "javascript", 
		        	   popular: "1",
		        	   test : {
		        		   id : 123,
		        		   value: "Mot hai ba"
		        	   }
		           },
		           { 
		        	   name: "tinytest.js",
		        	   language: "javascript",
		        	   popular: "0",
		        	   test : {
		        		   id : 456,
		        		   value: "Bon nam sau"
		        	   }
		        	}
		],
		
		checkbox : [ 0, 2 ],
		
		multipleselect : [ "B", "E" ],
		
		select : "D",
		
		radio : 2
	};

$(document).ready(function(){
	
	/*$('#jsonform').bind('submit', function() {
		$(this).populate(lancamento, function(json) {
			if(console) console.log("callback", json);
		});
  	
		return false;
	});*/
  
  /*jQuery("form[name='jsonform']").bind('submit', function() {
    	$(this).populate(lancamento, true);
    
    	return false;
  	});*/

});

function loadForm() {
	$('#jsonform').populate(lancamento, true);
}

function getForm() {
	$('#json').val(JSON.stringify($('#jsonform').getJSON(true)));
}

function loadForm2() {
	$('#my-profile').populate(data, false);
}

function getForm2() {
	$('#json').val(JSON.stringify($('#my-profile').serializeJSON()));
}