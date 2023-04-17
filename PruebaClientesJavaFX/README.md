# Esqueleto gradle con las dependencias para JavaFX

#### Autor: José Ramón Jiménez Reyes

#### Descripción

En este repositorio encontrarás el esqueleto de un proyecto para **Eclipse** (aunque podría utilizarse en otros IDEs).

Dicho proyecto contiene las dependencias **gradle** para trabajar con **JavaFX** y para empaquetarlo correctamente.

También contiene una clase pricipal de ejemplo `Main` y la correspondiente clase lanzadora `LanzadoraMain`.

#### Uso

Lo primero que debes hacer es clonar el repositorio en Eclipse. 

Ahora deberás desconectarte de este repositorio ya que es una plantilla (en el futuro lo conectarás al repositorio que desees) pulsando con el botón derecho sobre el proyecto y seleccionando la opción `Team | Disconnect`. Pero esto no borra el repositorio, por lo que debes borrarlo mostrando la vista de repositorios de git, mediante el menú `Window | Show View | Other` y en la categoría `Git` escoges la opción `Git Repositories`. Esto te mostrará todos los repositorios y seleccionarás este en cuestión y con el botón derecho escogerás la opción `Delete Repository`, marcando sólo la primera opción etiquetada como `Delete Git repository data and history`. Hecho esto ya nos hemos desconectado del repositorio y lo hemos borrado, vamos ahora a renombrarlo.

Deberás cambiar el nombre del proyecto para adecuarlo a tus preferencias. Para ello pincha con el botón derecho sobre el proyecto y elije la opción `Refactor | Rename`.

Finalmente deberás abrir el archivo `settings.gradle` y cambiar el nombre de proyecto ahí también, ya que eso no lo hace Eclipse en la refactorización. Por último, pincha con el botón derecho sobre el proyecto y elige la opción `Gradle | Refresh Gradle Project`.

#### Ejecución

Utiliza la tarea `run` asociada para ejecutarlo o desde la línea de comandos puedes utilizar el comando `./gradlew run`.

