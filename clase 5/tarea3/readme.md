Tema 2: Encapsulamiento y validación en setters 


Ejercicio 1 (básico). Modelar la clase CuentaBancaria con atributos privados titular, numeroCuenta y saldo, todos accesibles solo mediante getters, y setters que validen: el titular no puede ser una cadena vacía, y el saldo no puede fijarse directamente en un valor negativo. Verificar en un main que intentar asignar un titular vacío o un saldo negativo mediante el setter correspondiente lanza una excepción en vez de aceptar el valor silenciosamente. 


Ejercicio 2 (intermedio). Agregar a CuentaBancaria los métodos depositar(double monto) y extraer(double monto), ambos con su propia validación (monto positivo; en extraer, además, saldo suficiente), de forma que ninguna validación quede en main sino encapsulada en el método correspondiente. Probar en un main una secuencia de al menos cuatro operaciones (dos válidas y dos que deberían fallar) y capturar las excepciones esperadas mostrando un mensaje por cada una.