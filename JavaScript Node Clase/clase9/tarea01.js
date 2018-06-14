
var http = require('http');
var fs   = require('fs');
var url  = require('url');

function error404(response){
	
		console.log("Error encontrado ");
		fs.createReadStream("./web/index.html").pipe(response);
		response.writeHead(404,{"Context-Tupe":"text/plain"});
		response.write("<h3>Erro encontrado </h3");
		response.end();
}

/*function paginaCargada(request , response){
	if (request.method == 'GET' && request.url == '/'){

		console.log("La pagina web se cargo " + request.url);
		fs.createReadStream("./web/index.html").pipe(response);
		response.writeHead(200,{"Context-Tupe":"text/plain"});
		response.write("<h1>Clase 9 tarea 1 - Bien Venidos en el servidor domestico de BObiSOft Corp </h1>" + "<h2> La Pagina se cargo </h2>");
		response.end();

	}else{
			error404(response);
		}
}*/

function callback( request , response){

	if (request.method == 'GET'){
		
	var dirURL = url.parse(request.url, true).query;
		console.log(dirURL);
		
		if(dirURL.user == 'premium' && dirURL.sessionToken == 'asdjfhkl297uk2uguy23'){

			response.writeHead(200, {"Context-Tupe":"text/json"});
			fs.createReadStream("./web/dato.json").pipe(response);
			
			
		}else {
			
		console.log("La pagina web se cargo " + request.url);
		fs.createReadStream("./web/index.html").pipe(response);
		response.writeHead(200,{"Context-Tupe":"text/plain"});
		response.write("<h1>Clase 9 tarea 1 - Bien Venidos en el servidor domestico de BObiSOft Corp </h1>" + "<h2> ?user=premium&sessionToken=asdjfhkl297uk2uguy23  </h2>");
		response.end();
		}
	}
	
}
http.createServer(callback).listen(8888);
console.log("Serividor en marcha");