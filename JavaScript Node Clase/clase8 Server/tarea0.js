
var http  = require('http');
var fs = require('fs');
var contador = 0

function error404(response){
	response.writeHead(404,{"Context-Tupe":"text/plain"});
	response.write("<h3>Error 404 la pagina web no exsiste o no esta disponible <\h3>" );
	response.end();

	}

function llamadaDeRetorno(request , response){

	if (request.method == 'GET' && request.url == '/'){

		contador = contador + 1;
		console.log("La pagina web se cargo " + contador + " veses" + request.url);
		fs.createReadStream("./web/index.html").pipe(response);
		//
		response.writeHead(200,{"Context-Tupe":"text/plain"});
		response.write("<h1>Bien Venidos en el servidor domestico de BObiSOft Corp </h1>" + 
			"<h2> La Pagina se cargo " + contador + " veses</h2>");
		//response.write("<h2>La Pagina se cargo " + contador + " veses<\h2>" );
		response.end();

	}else {
		error404(response);
	}
}


http.createServer(llamadaDeRetorno).listen(8888);
console.log("El servidor esta arrancado");