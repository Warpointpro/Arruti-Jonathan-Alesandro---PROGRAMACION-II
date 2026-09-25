Tema 2: Sobreescritura de métodos y reutilización con super 


Ejercicio 1 (básico-intermedio). Sobreescribir calcularSueldo() en EmpleadoPorHoras (horas × valor hora) y en EmpleadoAsalariado (sueldo básico + bono), cada una con @Override. Instanciar un objeto de cada subclase y mostrar, para cada uno, el sueldo calculado. 



Ejercicio 2 (intermedio). En la jerarquía Vehiculo (marca, modelo, año) con subclases Auto (cantidad de puertas) y Moto (cilindrada), sobreescribir toString() en ambas subclases de forma que reutilicen super.toString() para la parte común y solo agreguen su atributo específico, sin repetir marca/modelo/año en el texto.