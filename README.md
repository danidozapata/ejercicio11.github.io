# Venta de Make Up
***Realizaremos el desarrollo de una aplicacion que nos permita evaluar el producto mas vendido segun los productos que tengamos disponibles en nuestra tienda.***

*Como informacion basica solicitaremos el nombre del cliente y la identificacion.*

## ***Aclaracion importante:***

- *Solicitaremos de nuestro proyecto calcular el producto mas vendido segun nuestro catalogo de Make Up.*
- *Para mantener la simplicidad del proyecto no se contemplan manejar persistencia en el almacenamiento de los datos.*
- *No se realiza validacion, ni se verifica calidad en los datos registrados.*

 
## ***Analisis del ejercicio:***

![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/6fe31925-b998-4baa-a490-b255176ff611)


## ***Aproximacion casos de uso:***

![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/eba73ae4-0897-4904-b835-40eef4ebd0db)


## ***Aproximacion diagrama de flujo:***

![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/4bdad138-05e2-4598-b86d-f20c2d904930)
![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/0cda295e-0dc8-4b19-803d-7a135417c707)
![image](https://github.com/danidozapata/ejercicio11.github.io/assets/132966451/5ea18168-796a-4b27-beff-bebb2d30bbd2)


## ***Aproximacion Seudocodigo:***


var Paleta_Sombras = 0

var Base = 0

var Brillo = 0

var Primer = 0

var Rubor = 0

var Iluminador = 0

var comprar = 0

var nombre = prompt("Digite su Nombre = ")

var identificacion = prompt("Digite su Identificacion = ")

do{
    var opciones = prompt("Digite la opcion que desea comprar = \n 1.Paleta_Sombras \n 2.Base \n 3.Brillo \n 4.Primer \n 5.Rubor \n 6.Iluminador")
   
    if(opciones == 1){
        Paleta_Sombras = Paleta_Sombras + 1
        
    }if(opciones == 2){
        Base = Base + 1
        
    }if(opciones == 3){
        Brillo = Brillo + 1
        
    }if(opciones == 4){
        Primer = Primer + 1}

    if(opciones == 5){
            Rubor = Rubor + 1}

    if(opciones == 6){
            Iluminador = Iluminador + 1}

    comprar = prompt("Quieres seguir comprando? \n 1.Si \n 0.No ")

    if(comprar == 0){

        if(Paleta_Sombras > Base && Paleta_Sombras > Brillo && Paleta_Sombras > Primer && Paleta_Sombras > Rubor && Paleta_Sombras > Iluminador )
        {
           
                alert("Sombras es el producto mas vendido = " + Paleta_Sombras)
           
        }
        else if(Base > Paleta_Sombras && Base > Brillo && Base > Primer && Base > Rubor && Base > Iluminador)
        {
            alert("Bases es el producto mas vendido = " +  Base)

        }
        else if(Brillo > Paleta_Sombras && Brillo> Base && Brillo> Primer && Brillo> Rubor && Brillo> Iluminador){
            alert("Brillos es el producto mas vendido = " + Brillo)

        }
        else if(Primer > Paleta_Sombras && Primer> Base && Primer> Brillo && Primer> Rubor && Primer> Iluminador){
            alert("Primer es el producto mas vendido = " + Primer)

        }
        else if(Rubor > Paleta_Sombras && Rubor> Base && Rubor> Brillo && Rubor> Primer && Rubor> Iluminador){
            alert("Rubor es el producto mas vendido = " + Rubor)

        }
        else if(Iluminador > Paleta_Sombras && Iluminador> Base && Iluminador> Brillo && Iluminador> Rubor && Iluminador> Primer){
            alert("Iluminador es el producto mas vendido = " + Iluminador)
        }
    }

}while(comprar == 1 )

