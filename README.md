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
Como estudiante de **DAM**, esta práctica ha sido un "viaje" de los que te enseñan de verdad cómo funciona esto de la informática fuera de la teoría. Al principio, reconozco que ver tantas librerías y configurar el **JDK 26** me hizo sentir que me faltaban manos; pelearme con Maven para que descargara las dependencias correctas fue mi primer gran reto de la tarea.
Lo que más me ha "volado la cabeza" ha sido el patrón **Page Object Model (POM)**. En clase siempre nos hablan de modularidad y de no repetir código, pero no es hasta que ves cómo una clase `LoginPage` limpia tu código de test cuando entiendes su valor real. He pasado de tener un código caótico lleno de localizadores `By.id` a tener unos tests que se leen casi como una conversación. Ver que, si la web cambia, solo tengo que tocar un archivo y no veinte, me ha hecho ver la diferencia entre ser un "picacodigo" y un desarrollador con criterio.
También me llevo una lección importante sobre la frustración y la atención al detalle. Estuve un buen rato bloqueado porque un test fallaba, repasando el código una y otra vez, para terminar descubriendo que el error era que yo buscaba el texto "Contraseña incorrecta" y la web, al estar en inglés, me contestaba con "Epic sadface...". Eso me enseñó que en la automatización no puedes dar nada por hecho y que la inspección del DOM es nuestra mejor aliada.
En conclusión, ver cómo el navegador se abre solo, realiza las acciones y por fin me devuelve esa fila de **checks verdes en IntelliJ** ha sido una de las experiencias más satisfactorias de lo que llevo de curso. Me voy con la seguridad de que puedo montar una base de pruebas profesional y con la satisfacción de haber domado a Selenium (aunque me haya costado algún que otro dolor de cabeza).
---
**Autor:** lordo0174  
**Repositorio:** [PruebaSeleniumDesde0](https://github.com/lordo0174/PruebaSeleniumDesde0.git)
