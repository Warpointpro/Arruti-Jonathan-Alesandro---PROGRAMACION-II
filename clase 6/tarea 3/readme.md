Tema 3: Arreglos polimórficos y binding dinámico 



Ejercicio 1 (intermedio). Cargar un Empleado[] mezclando instancias de EmpleadoPorHoras y EmpleadoAsalariado, recorrerlo con un for-each usando exclusivamente la referencia de tipo Empleado, e invocar calcularSueldo() sobre cada elemento. Explicar en un comentario por qué, aunque la referencia declarada es Empleado, se ejecuta la fórmula correcta de cada subclase. 



Ejercicio 2 (avanzado). Repetir el mismo patrón con un Figura[] que mezcle Circulo y Rectangulo (agregando también un Triangulo con validación de desigualdad triangular en su constructor), calculando el área total de todas las figuras del arreglo con un único método que reciba Figura[] como parámetro y no conozca de antemano qué subtipos contiene.