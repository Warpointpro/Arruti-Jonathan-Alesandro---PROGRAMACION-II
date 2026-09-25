CLASE 6 — PILARES DE LA POO: HERENCIA 

Tema 1: Jerarquías con extends y constructores con super()


Ejercicio 1 (básico). Convertir Empleado (Clase 5) en superclase de dos subclases: EmpleadoPorHoras (horas trabajadas, valor hora) y EmpleadoAsalariado (sueldo básico, bono), cada una con su propio constructor que invoque super(nombre, legajo) para inicializar los atributos heredados sin duplicarlos. 


Ejercicio 2 (intermedio). Modelar la jerarquía Figura (nombre) con subclases Circulo (radio) y Rectangulo (base, altura), cada una con constructor propio que invoque a super(nombre) pasando el nombre correspondiente (“Círculo”, “Rectángulo”). Documentar en un comentario si se decidió o no impedir la instanciación directa de Figura en esta clase, y por qué (la herramienta formal para eso, la clase abstracta, recién se ve en la Clase 7).