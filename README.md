# Llanquihue Tour - Sistema de Gestion

## Descripcion del Proyecto
Prototipo de software orientado a objetos desarrollado en Java para la agencia de turismo Llanquihue Tour (Región de Los Lagos). El sistema organiza de forma modular a las personas vinculadas a la empresa (clientes y guias turísticos).

## Estructura de Paquetes y Clases
* app: Contiene la clase ejecutable Main.
* model: Contiene las clases del dominio:
  * Persona: Clase base con atributos privados y relación de composición con Direccion.
  * Direccion: Modela la ubicación geográfica de los actores del sistema.
  * Guia: Clase derivada que extiende de Persona incorporando atributos específicos.

## Instrucciones para Compilar y Ejecutar
1. Clonar o descargar el repositorio en tu entorno de desarrollo (ej. NetBeans).
2. Asegurarse de que reconozca la estructura de carpetas (src/app y src/model).
3. Ejecutar la clase principal Main.java ubicada en el paquete app.
