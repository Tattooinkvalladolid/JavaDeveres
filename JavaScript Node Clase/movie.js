/*
Tarea 1
Crea una clase que tenga 5 métodos y 3 propiedades.
Utilizando el diccionario por defecto modules.exports exporta
(o expón públicamente) 2 métodos y una de estas variables o propiedades.
Uno de los métodos debe devolver el valor de una variable que debe permanecer “privada".
requiere Importa el módulo que has creado y ejecuta la aplicación en un archivo diferente. Ej: app.js
*/
//


function peliculasDeCine(){

    function skaryMovie(){
      console.log("skaryMovie1");
      console.log("skaryMovie2");
      console.log("skaryMovie3");
      // var title = "Mostrando titulos de peliculas de cine"
      

      function blabla(){
        console.log("holamola")

      };
      module.exports.tralala = blabla
    };

    function epicMovie(){
      console.log("epicMovie1");
      console.log("epicMovie2");
      console.log("epicMovie3");
    };

    function deatMovie(){
      console.log("deatMovie1");
      console.log("deatMovie2");
      console.log("deatMovie3");
    };

    function desaterMovie(){
      console.log("desaterMovie1");
      console.log("desaterMovie2");
      console.log("desaterMovie3");
    };

    function spanishMovie(){
      console.log("spanishMovie1");
      console.log("spanishMovie2");
      console.log("spanishMovie3");
    };

    peliculaFavorita: "deatMovie1"
    artistaFavorito: "Angelina Jolie"
    generoFavorito: "Action"

    module.exports.scarymovie = skaryMovie
    module.exports.deatmovie = deatMovie
    
}
 

var peliculas = peliculasDeCine();
