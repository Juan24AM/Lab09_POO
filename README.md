# Lab09_POO

Laboratorio 8 - 4to ciclo. Polimorfismo y Tratamiento de excepciones

## EJERCICIO PROPUESTO
Construya una clase abstracta de nombre `Estudiante` que tiene los siguientes atributos: **código**, **apellidos**, **nombres**, **semestre de ingreso (2010-I o 2011-II)** e incluya sus constructores. 
Además construya sus métodos getter y setter (Encapsulamiento) y también declare los `métodos abstractos` como pago parcial de pensión y descuentos, 
además construya `métodos no abstractos` como cálculo del pago final de pensión que será igual a: pago parcial de pensión - descuentos. 
Implemente dicha clase con la interface Serializable.   	

Construya una interface que permita manejar las siguientes constantes el descuento de porcentajes del 19% del IGV. Que será implementada en la clase Estudiante	

Luego construya una subclase `Estudiante de Pregrado` de la clase Estudiante que tendrá los atributos como: **Categoría (A o B)**, **Promedio ponderado**, **colegio de Procedencia (Estatal o Particular)** y **contador de atributo estático**. 
Construya su constructor que actualizará los datos de las clase padre así como actualizara el atributo código, heredado de la Clase Estudiante con un código autogenerado y sus métodos getter y setter. 
Para esta clase desarrolle los métodos abstractos heredados y que permitan hacer lo siguiente: 	

- Calcular el pago parcial de pensiones en función a la categoría y el colegio de procedencia tal y como se muestra en la tabla
  ![image](https://github.com/Juan24AM/Lab09_POO/assets/119544309/867e28a1-03c2-40e3-91c4-a52a2e7ae53b)
  
- Calcular el descuento sobre el pago parcial de pensiones de acuerdo al promedio ponderado  como sigue a continuación
![image](https://github.com/Juan24AM/Lab09_POO/assets/119544309/4c1b521d-3e85-4bdf-a6f8-8e43208372a2)

- Tendrá su metodo propio que permita generar un código con la siguiente característica: EPRE0001, EPRE0002.

Luego construya la subclase `Estudiante de Postgrado` de la clase Estudiante que tiene los siguientes atributos: **grado académico (Bachiller Titulado)** y **contador con atributo estático**.
Construya su constructor que actualizará los datos de las clase padre así como actualizar el atributo código, heredado de la Clase Estudiante con un código autogenerado y sus métodos getter y setter. 
Para esta clase desarrolle los métodos abstractos heredados y que permitan hacer lo siguiente:
- El sueldo base se calcula de la siguiente tabla
  
| Grado académico | Pago parcial de Pensiones |
|-----------------|---------------------------|
| Bachiller       | 400                       |
| Titulado        | 350                       |

- Los Estudiantes de Postgrado no gozan de descuentos.
- Tendrá su método propio que permita generar un código con la siguiente característica: EPOS0001, EPOS0002.

  > **NOTA**: Ambas clases tendrán métodos recargados para mostrar la información de sus datos adicionales.
