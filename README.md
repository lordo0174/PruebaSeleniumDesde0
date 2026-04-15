# Automatización SauceDemo con Selenium y JUnit 5

Este proyecto implementa la automatización de pruebas para la plataforma de e-commerce de prueba **SauceDemo**. Se ha utilizado Java 26, Selenium WebDriver y el patrón de diseño **Page Object Model (POM)** para garantizar un código limpio, mantenible y escalable.

## Estructura del Proyecto
El proyecto sigue una estructura organizada dentro de la carpeta de pruebas (`src/test/java`) para centralizar la lógica de automatización y los casos de prueba:

* **`pages/`**: Contiene las clases de objetos de página que encapsulan los selectores y las interacciones.
    * `LoginPage.java`: Gestiona el acceso y mensajes de error.
    * `InventoryPage.java`: Gestiona la selección de productos y validación del carrito.
* **`test/`**: Contiene los scripts de prueba que ejecutan las validaciones.
    - `LoginTest.java`: Pruebas de autenticación.
    - `InventoryTest.java`: Pruebas de funcionalidad de inventario.

## Tecnologías Utilizadas
- **Java 26**: Lenguaje de programación base.
- **Selenium WebDriver 4.25.0**: Motor de automatización del navegador.
- **JUnit 5**: Framework para la orquestación y aserción de pruebas.
- **WebDriverManager 6.1.0**: Gestión automatizada de binarios de ChromeDriver.
- **Maven**: Gestión de dependencias y ciclo de vida del proyecto.

## Casos de Prueba Automatizados (Mínimo 5)
1.  **loginCorrecto**: Valida que un usuario estándar puede acceder y es redirigido a la sección de inventario.
2.  **loginIncorrecto**: Verifica que el sistema muestra el mensaje de error adecuado ante credenciales inválidas.
3.  **anadirUnProductoAlCarrito**: Añade un producto y confirma que el contador del carrito marca "1".
4.  **anadirDosProductosAlCarrito**: Añade dos productos y confirma que el contador sube a "2".
5.  **botonCambiaTrasAnadirProducto**: Verifica que tras añadir un ítem, el botón de la UI cambia dinámicamente de "Add to cart" a "Remove".

## Ejecución de Pruebas
Para ejecutar la suite de pruebas completa:
1. Asegúrate de tener instalado Maven y el JDK 26.
2. Ejecuta en la terminal:
   ```bash
   mvn test
   ```
   Este es el resultado que devuelve si todos los test son correctos, como es el caso.
   
   <img width="640" height="340" alt="image" src="https://github.com/user-attachments/assets/9dd3fa07-badf-432a-89c0-3cb4f68882a9" />

## Apreciación y Reflexión Personal

Como estudiante de DAM, esta práctica ha sido un "viaje", pues se me ha complicado la configuración del JDK 26; Sobre el Page Object Model (POM), tuve otra clase de problemas con las versiones de las dependencias, pues al principio usé versiones más nuevas. Las acabé resolviendo con ayuda de mis compañeros de clase.

En conclusión, al acabar las pruebas unitarias con resultado correcto en todas, puedo dar por finalizada esta tarea de manera satisfactoria.

---
**Autor:** lordo0174  
**Repositorio:** [PruebaSeleniumDesde0](https://github.com/lordo0174/PruebaSeleniumDesde0.git)
