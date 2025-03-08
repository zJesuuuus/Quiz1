**Instrucción:** Desarrolla un programa en Java que determine si dos números enteros positivos son "números amigos". El programa debe:

1. Solicitar al usuario dos números enteros positivos
2. Calcular la suma de los divisores propios de cada número (todos los divisores excepto el propio número)
3. Determinar si los números son amigos y mostrar el resultado

Dos números son considerados "amigos" si la suma de los divisores propios del primer número es igual al segundo número, y la suma de los divisores propios del segundo número es igual al primer número.
Por ejemplo:

- Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 (suma: 284)
- Los divisores propios de 284 son: 1, 2, 4, 71, 142 (suma: 220)
- Como la suma de los divisores de 220 es 284 y la suma de los divisores de 284 es 220, estos números son amigos.

El programa debe implementar una función para calcular la suma de los divisores propios de un número y usar solo operaciones aritméticas básicas, condicionales y bucles.
Ejemplo de ejecución:
Ingrese el primer número: 220
Ingrese el segundo número: 284
Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
La suma de los divisores propios de 220 es: 284
Los divisores propios de 284 son: 1, 2, 4, 71, 142
La suma de los divisores propios de 284 es: 220
¡220 y 284 son números amigos!
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Se importaria un scanner para poder leer lo ingresado por el usuario.
Se imprimira en pantalla que ingrese los dos numeros y estos se leeran con el input.nextInt.
Se crearian variables tipo entero para almacenar los dos numeros ingresados.
Se pondria una condicion para validar que los dos numeros ingresados sean positivos, esto con un if (numero ingresado > 0 && numero ingresado2 > 0).
Se crearia un for para hacer un sumador para dividir el numero ingresado por cada numero del 1 al 100.
Se pondria una condicion de if para validar si el numero ingresado es divisible por el numero en el sumador.
Se crearia una variable para almacenar cada numero divisible por el numero ingresado.
Se crea un if para sumar los numeros divisibles por los numeros ingresados.