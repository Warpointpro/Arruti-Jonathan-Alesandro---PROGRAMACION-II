Tema 3: Sobrecarga de constructores y composición de objetos 


Ejercicio 1 (básico-intermedio). Agregar a CuentaBancaria un segundo constructor que reciba solo titular y numeroCuenta, y delegue en el constructor parametrizado completo usando this(...) para inicializar el saldo en 0. Instanciar una cuenta con cada uno de los dos constructores y confirmar que ambas quedan en un estado consistente. 



Ejercicio 2 (avanzado). Modelar Vehiculo (marca, modelo, precio) y Concesionaria (nombre, y una colección de Vehiculo administrada con ArrayList), con métodos agregarVehiculo(Vehiculo), buscarPorMarca(String) (retorna el primer Vehiculo encontrado o null) y valorTotalStock(). Cargar al menos cinco vehículos de marcas distintas y ejercitar los tres métodos desde un main, incluyendo una búsqueda que no debería encontrar resultados.