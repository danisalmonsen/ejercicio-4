

public static void main(String[] args) {
    int numeroIf = -8;
    int numeroWhile = 0;
    int numeroDoWhile = 3;
    int numeroFor = 2;
    String estacion = "OTOÑO";

    System.out.println("SOLUCION EJERCICIO 1 - IF"); //Me parecio conveniente poner titulos en todos los ejercicios para que se entienda la respuesta
    if (numeroIf > 0) {
        System.out.println("El Valor es POSITIVO");
    } else if (numeroIf < 0){
        System.out.println("El Valor es NEGATIVO");
    } else{
        System.out.println("El Valor es 0");
    }

    System.out.println("SOLUCION EJERCICIO 2 - WHILE");
    if (numeroWhile >= 3){ //Me parecio conveniente poner un if anterior para que muestre un mensaje si no entra al bucle
        System.out.println("Ha ingresado un numero mayor o igual a 3 por lo tanto no ha entrado al Bucle");
    }else {
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println("La variable While ahora es: " + numeroWhile);
        }
    }

    System.out.println("SOLUCION EJERCICIO 3 - DO WHILE");
    do{
        numeroDoWhile = numeroDoWhile + 1;
        System.out.println("La Variable DoWhile ahora es: " + numeroDoWhile);
    }while(numeroDoWhile < 3);

    System.out.println("SOLUCION EJERCICIO 4 - FOR");

    if (numeroFor <= 3){ //Me parecio conveniente poner un if anterior para que muestre un mensaje si no entra al bucle

        for (;numeroFor <= 3; numeroFor++) {
            System.out.println("La variable For ahora es: " + numeroFor);
        }

    } else{
        System.out.println("Ha ingresado un numero mayor a 3 por lo tanto no ha entrado al Bucle");
    }

    switch(estacion) {

        case "VERANO":
            System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
            System.out.println("Es VERANO");
        break;

        case "INVIERNO":
            System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
            System.out.println("Es INVIERNO");
        break;

        case "PRIMAVERA":
            System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
            System.out.println("Es PRIMAVERA");
        break;

        case "OTOÑO":
            System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
            System.out.println("Es OTOÑO");
            break;

        default:
            System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
            System.out.println("NO HA INGRESADO UNA ESTACION O INGRESO EN MINUSCULAS");

    }

}

}