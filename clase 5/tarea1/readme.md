Enunciado

Sistema de liquidación de sueldos con herencia
Una empresa necesita modelar distintos tipos de empleados para calcular su sueldo de forma polimórfica.

Clase base Empleado

Definir una clase Empleado con:

•	Atributos protected: nombre (String) y legajo (int), accesibles desde subclases. 
•	Constructor que reciba e inicialice ambos atributos. 
•	Método calcularSueldo() que retorne double. En la clase base retorna 0 (valor por defecto, sin lógica de negocio propia — es la clase que las subclases deben sobreescribir). 

•	Método toString() sobreescrito que retorne una cadena con el formato:
nombre (legajo N) - $sueldo 
Clase derivada EmpleadoPorHoras
Definir EmpleadoPorHoras extends Empleado con:

•	Atributos private: horasTrabajadas y valorHora (ambos double). 
•	Constructor que invoque al constructor de la clase base mediante super(nombre, legajo) e inicialice los atributos propios. 
•	Sobreescritura (@Override) de calcularSueldo() con la fórmula: horasTrabajadas * valorHora. 
Prueba de polimorfismo

En el main de EmpleadoPorHoras, instanciar un objeto declarado como tipo Empleado pero construido como EmpleadoPorHoras, e imprimirlo con System.out.println.
Consigna para el alumno	
1.	Completar ambas clases según el código dado. 
2.	Explicar qué ocurre al ejecutar System.out.println(empleado) pese a que la referencia es de tipo Empleado: identificar qué mecanismo de enlace dinámico (dynamic binding, resolución del método a invocar en tiempo de ejecución según el tipo real del objeto) permite que se invoque calcularSueldo() de EmpleadoPorHoras y no el de Empleado. 
3.	Agregar una tercera clase EmpleadoPorComisiones (u otra variante a elección) que también extienda Empleado, sobreescriba calcularSueldo() con una fórmula distinta, y demostrar en un arreglo/lista de tipo Empleado[] que cada elemento invoca su propia implementación al recorrerse con toString().
