var http = require('http');
var   fs = require('fs');
var  url = require('url');

//funcion que muestra mensaje de error 404
function error404(response){

		response.writeHead(404 , {"Context-Tupe" : "text/plain"});
		response.write("<h1>ERROR 404 Archivo no encontrado </h1>" + "<h2>las opciones disponibles son </h2>");
		response.write("<h3> http://localhost:8888/?json=json</h3>");
		response.write("<h3> http://localhost:8888/?xml=xml<h3>");
		response.end();
}

var contador = 0;
var contadorJson = 0;
var contadorXML = 0;
function escuchando(request , response){

	if (request.method == 'GET' && request.url == '/'){

		contador = contador + 1;
		console.log("La pagina web se cargo " + contador + " veses" + request.url);
		fs.createReadStream("./web/index.html").pipe(response);
		response.writeHead(200,{"Context-Tupe":"text/plain"});
		response.write("<h1>Clase 9 tarea 0 - Bien Venidos en el servidor domestico de BObiSOft Corp </h1>" + "<h2> La Pagina se cargo " + contador + " veses</h2>");
		response.end();

	}else {

		var urlQuery = url.parse(request.url , true).query;
		
		if(urlQuery.json == 'json'){
			//contador
			contadorJson = contadorJson + 1;
			//abrir arhivo json
			fs.createReadStream("./web/dato.json").pipe(response);
			//mostrar mensjae
			console.log("Archovo JSON se cargo "+ contadorJson + " veses " + request.url);
		
		}else if (urlQuery.xml == 'xml'){
			//contador
			contadorXML = contadorXML + 1;
			//cargar archivo XML
			fs.createReadStream("./web/dato.xml").pipe(response);
			//mostrar mensjae
			console.log("Archovo XML se cargo "+ contadorXML + " veses " + request.url);


		}else{
			error404(response);
		}

	};
}

http.createServer(escuchando).listen(8888);
console.log("El servidor esta en marcha");