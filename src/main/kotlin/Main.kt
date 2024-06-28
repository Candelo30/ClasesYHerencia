package org.example

fun main() {
    val diasSemana: List<String> = listOf("Lunes", "Lunes", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo", "Juernes")

    // Algunos Metodos de las listas

    diasSemana.size
    diasSemana.get(3)
    diasSemana.first()
    diasSemana.last()

    // Metodo Para poder filtrar items en la lista

    val a = diasSemana.filter {it == "Lunes" || it == "Viernes"}.size
    println("Esto muestra el filtro de los dias que pedimos: " + a)

//    var listaMutable: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
//
//    listaMutable.add("Domingo")
//    listaMutable.add(0, "Semana: ")
//
//    println(listaMutable)

//    var listaMutable: MutableList<String> = mutableListOf()
//
//    listaMutable.none()
//    listaMutable.firstOrNull()
//    listaMutable.elementAtOrNull(2)
//    listaMutable.lastOrNull()
//
//    print(listaMutable.elementAtOrNull(2))

//    var listaMutable: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
//
//    for (item in listaMutable) {
//        print(item)
//    }
//}

//    var listaMutable: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
//
//    for ((indice, item) in listaMutable.withIndex()) {
//        println("La posición $indice contiene $item")
//    }

    val listaMutable: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
    val nuevaListaVacia: MutableList<String> = mutableListOf()

    listaMutable.forEach {
        nuevaListaVacia.add(it+":")
    }

    print(nuevaListaVacia)
}