
var fs = require('fs');

fs.writeFileSync("Archivo.txt","Contennido del archivo");

console.log(fs.readFileSync("Archivo.txt").toString());