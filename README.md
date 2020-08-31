Certificación Aplicativo web Choucair Testing
Descripción y contexto
Este proyecto tiene la finalidad de certificar el proceso de consultar Servicios para poder gestionar la información de los usuarios, teniendo en cuenta esto se realizan pruebas automatizadas donde se realizaran diferentes validaciones con el fin de cumplir con los criterios de aceptación determinados por el product owner.

La sección de servicios provee un menu con las diferentes opciones que los usuarios pueden consultar, allí se detallan: Capacidades, Cómo lo hacemos, Portafolio de soluciones. Estas acciones seran evaludas realizando diferentes casos de prueba donde se analizara los aspectos importantes como calculos, existencia de elementos, guardado de datos, llenado de formularios.

El framework
Se utiliza BDD como framework de automatización para la automatización de cada uno de los escenarios de prueba. Se escriben funcionalidades que verifiquen resultados para el negocio.

Gherkin
es un lenguaje común, que lo puede escribir alguien sin conocimientos en programación, pero que lo puede comprender un programa, de forma tal que se pueda utilizar como especificación de pruebas. Estas pruebas se almacenan en archivos “.feature” los cuales deberían ser versionados junto al código fuente que se está probando. Gherkin es considerado un lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

Para empezar a hacer BDD, sólo se necesita conocer 5 palabras con lo que vamos a describir las funcionalidades: Feature: Nombre de la funcionalidad que vamos a probar. Scenario: habrá uno por cada prueba que quiera especificar para esta funcionalidad Given: precondiciones When: acciones que se van a ejecutar Then: Se especifica el resultado esperado, las verificaciones a realizar. Una feature puede contener varios escenarios de prueba.

Cucumber
Es una de las herramientas framework que podemos utilizar para automatizar nuestras pruebas BDD, permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizada.

Compilador
Se crea el proyecto sobre Gradle, es una herramienta de automatización de la construcción de nuestro código, es la versión mejorada de Maven, pero intenta llevarlo todo un paso más allá. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. Por otro lado, dispone de una gran flexibilidad que permite trabajar con ella utilizando otros lenguajes y no solo Java.

Patrones de desarrollo
Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo: Variables: camelCase Funciones: camelCase Clases: PascalCase Paquetes: camelCase

Camel Case: El nombre viene porque se asemeja a las dos jorobas de un camello, y se puede dividir en dos tipos: – Upper Camel Case, cuando la primera letra de cada una de las palabras es mayúscula. También denominado Pascal Case. Ejemplo: EjemploDeNomenclatura. – Lower Camel Case, igual que la anterior con la excepción de que la primera letra es minúscula. Ejemplo: ejemploDeNomenclatura. Es muy usada en los #hashTags de Twitter o en lenguajes como Java, PHP, C#…

Prácticas de automatización
Un proyecto donde se ejemplifica el uso del patrón serenity screenplay  con cucumber y gradle.

ScreenPlay, es una evolución del modelo POM que Este modelo lo vamos a trabajar con el conjunto de librerías de SerenityBDD. Las capas de la arquitectura son:

-Task(Tareas): son un grupo de interacciones (Acciones de Alto Nivel). o Acciones de Alto Nivel: Una acción de Alto nivel se caracteriza porque no habla en términos de clic o select, es simplemente un verbo amplio. Ejm: Login, Comprar, Buscar. -Interactions: Las interacciones es donde sí decimos clic, select, etc.

Questions: Hacemos los Assert, verificación del resultado
User Interface: Indica el mapeo de los objetos con TARGET
utils: utilidades que son necesarias dentro de todo el proyecto.
Herramienta de automatización utilizado
Se utiliza lo siguiente: IDE de IntelliJ para el desarrollo de la automatización.

Estrategia de automatización
Se identifican cada una de las transacciones que se utilizan para realizar pruebas E2E con los diferentes productos.

El navegador y la versión utilizada
Actualmente todo el proceso corre sobre la version 9.4 de MyExtra Para correr el proyecto se necesita Java JDK 1.81 y Gradle preferiblemente con la versión 4.8.1

Comandos para ejecutar automatización desde consola
Para correr las automatizaciones desde la consola se utiliza el compilador Gradle mediante el siguiente comando.

Ejecutar Runner específico:

gradlew clean -Dtest.single = "indicar nombre runner" test --info
Ejecutar paquete o funcionalidad completa:

gradlew clean test --info