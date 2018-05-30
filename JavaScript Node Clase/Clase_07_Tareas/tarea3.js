// Crea un programa que llame repetidamente, cada 5 segundos a una funcion
// que imprima por consola el directorio y el nombre del archivo
// Ademas tiene que guardar en el sistema de archivos del scrip que ejecuta
var cont = 1
var aaa = setInterval(function(){
	var nombreDeDirectorio = __dirname
	var nombreDeArchivo = __filename
	console.log(nombreDeDirectorio);
	console.log(nombreDeArchivo);

	var fs = require('fs');

	fs.appendFileSync("Historial.txt","\n Directorio \n " + nombreDeDirectorio + "\n Nombre de archivo \n " + nombreDeArchivo);

	console.log(fs.readFileSync("Historial.txt").toString());

 cont = cont + 1
console.log(cont)
if (cont == 3){
clearInterval(aaa);
}
},5000)




