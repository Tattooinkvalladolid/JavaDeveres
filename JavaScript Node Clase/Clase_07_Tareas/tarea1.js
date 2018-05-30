
//Tarea 1: Crea un object Factory
//Implementa en un programa

module.exports = function() {

	return { funcEnVuelo: function( a , b ){
				return console.log("El resultado de a + b es :" , a + b);
				}
			}
};

