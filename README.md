# JScrollPane - JavaSwing

<img title="" src="https://www.jrebel.com/sites/default/files/image/2019-11/image-blog-pick-right-java-executors.jpg" alt="" width="361" data-align="inline">

##### JScrollPane se utiliza para agregar barras de desplazamiento a otros componentes, como JTextArea, JTable, JList, y otros, cuando su contenido es más grande que el área visible en la pantalla.

##### La principal función de JScrollPane es permitir la visualización y navegación de contenido que no cabe completamente dentro del área visible del componente subyacente. Un JScrollPane proporciona tanto barras de desplazamiento horizontales como verticales (o solo una de ellas, dependiendo de las necesidades) y envuelve el componente al que se le desea agregar la funcionalidad de desplazamiento.

---

###### Las características más importantes de un `JScrollPane` en Swing son las siguientes:

1. **Barras de desplazamiento**: `JScrollPane` proporciona barras de desplazamiento vertical y horizontal (según sea necesario) que permiten al usuario desplazarse a través del contenido cuando este es más grande que el área visible de la ventana.

2. **Envuelve contenido**: Puedes agregar cualquier componente Swing como contenido del `JScrollPane`, como un `JTextArea`, `JTable`, `JList`, u otro. El `JScrollPane` envuelve este componente y proporciona las barras de desplazamiento necesarias.

3. **Personalización**: Puedes personalizar el comportamiento del `JScrollPane` según tus necesidades. Por ejemplo, puedes especificar si se deben mostrar barras de desplazamiento horizontal o vertical o ambas, y puedes ajustar el comportamiento de desplazamiento.

4. **Vistas y ventanas gráficas**: Un `JScrollPane` puede tener una vista y una ventana gráfica. La vista es el componente contenido que muestra el contenido completo, mientras que la ventana gráfica es la parte del contenido visible a través del área de visualización del `JScrollPane`. Esto permite tener una representación visual del área visible en relación con el contenido completo.

5. **Desplazamiento programático**: Además de permitir al usuario desplazarse con las barras, puedes realizar desplazamientos programáticos utilizando métodos como `setVerticalScrollBar`, `setHorizontalScrollBar`, `getVerticalScrollBar`, `getHorizontalScrollBar`, entre otros.

6. **Eventos de desplazamiento**: `JScrollPane` emite eventos de desplazamiento que puedes escuchar y responder a través de controladores de eventos para realizar acciones específicas cuando el usuario interactúa con las barras de desplazamiento.

7. **Bordes y decoraciones**: Puedes personalizar la apariencia del `JScrollPane` al agregar bordes y decoraciones. Esto te permite integrar el `JScrollPane` en el diseño general de tu interfaz de usuario.

8. **Zoom y escalado**: Puedes utilizar `JScrollPane` para implementar funcionalidades de zoom o escalado de contenido, permitiendo al usuario ver detalles específicos o una vista más amplia según sea necesario.

9. **Integración con otros componentes**: `JScrollPane` se integra fácilmente con otros componentes Swing, lo que te permite crear interfaces de usuario más complejas que admiten el desplazamiento de contenido enriquecido, como tablas grandes, áreas de texto extensas y listas largas.

---

###### Pasos para implementar JScrollPane

1. **Importa las clases necesarias**:

   Asegúrate de importar las clases necesarias de Swing. Estas son algunas de las clases comunes que se utilizan junto con `JScrollPane`:

`import javax.swing.*;`

2. **Crea tu componente de contenido**:

   Primero, crea el componente de Swing que deseas envolver con un `JScrollPane`. Esto puede ser un `JTextArea`, `JTable`, `JList`, o cualquier otro componente que necesite barras de desplazamiento para mostrar su contenido.

   Por ejemplo, si deseas usar un `JTextArea`: 

`JTextArea textArea = new JTextArea(10, 30);`

3. **Crea un `JScrollPane` y agrega tu componente de contenido**:

   A continuación, crea una instancia de `JScrollPane` y agrega tu componente de contenido al `JScrollPane`. Esto envolverá el componente de contenido y proporcionará las barras de desplazamiento necesarias.

` JScrollPane scrollPane = new JScrollPane(textArea); `

4. **Personaliza el comportamiento (opcional)**:

   Puedes personalizar el comportamiento del `JScrollPane` según tus necesidades. Por ejemplo, puedes especificar si se deben mostrar barras de desplazamiento vertical, horizontal o ambas. También puedes configurar otros aspectos del comportamiento de desplazamiento, como las políticas de desplazamiento.

Personaliza el comportamiento (opcional)

`scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);`

`scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);`

5. **Agrega el `JScrollPane` a tu contenedor principal**:

Finalmente, agrega el `JScrollPane` al contenedor principal de tu interfaz de usuario (por lo general, un `JFrame` o un `JPanel`).

Agrega el JScrollPane al contenedor principal (por ejemplo, un JFrame)

` frame.add(scrollPane);`

[Estructura basica](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/basic/EjemploJScrollPane.java)

---

> :beginner: setViewportView()

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del `JScrollPane`. El componente `view` será el contenido que se envuelve y se desplazará.

- Sintaxis

scrollPane.setViewportView(textArea);

- Nota

Por lo general, se pasa el componente que deseas hacer desplazable, como un JTextArea o un JPanel.

`JScrollPane scrollPane = new JScrollPane();`

`JTextArea textArea = new JTextArea(10, 20);`

//Se agrega el componente

`scrollPane.setViewportView(textArea);`

- Ejemplo

[ setViewportView]( https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: getViewport()

- Descripción

Este método devuelve el área de visualización o "Viewport" asociada a ese `JScrollPane`. El `Viewport` es la parte del `JScrollPane` que muestra el contenido desplazable, como un `JTextArea`, una tabla o cualquier otro componente que pueda ser más grande que el área de visualización del `JScrollPane`.

- Sintaxis

scrollPane.getViewport();

- Nota

Para ver el funciónamiento del método, es necesario no solo recibir el parametro si no, evidenciar tanto los datos obtenidos como manipularlos 

// Crear un JScrollPane y agregar el JTextArea a él 

`JScrollPane scrollPane = new JScrollPane(textArea); `

// Obtener el Viewport del JScrollPane 

`JViewport viewport = scrollPane.getViewport();`

// Cambiar el color de fondo del Viewport 

`viewport.setBackground(Color.lightGray);`

- Ejemplo

[getViewport](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/ScrollPaneViewportExample.java)

---

> :beginner: setHorizontalScrollBarPolicy()  &  setVerticalScrollBarPolicy()

- Descripción

Estos métodos permiten controlar cuándo se mostrarán las barras de desplazamiento y cómo se comportarán en función de las necesidades de la aplicación.

- Sintaxis

JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED  

o

JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED

- Nota

`setHorizontalScrollBarPolicy(int policy)`

Este método se utiliza para establecer la política de visualización de la barra de desplazamiento horizontal en un JScrollPane. Toma un argumento de tipo entero que especifica la política y puede ser uno de los siguientes valores:

- `JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED`: La barra de desplazamiento horizontal se mostrará automáticamente cuando sea necesario, es decir, cuando el contenido sea más ancho que el área visible en el JScrollPane.

- `JScrollPane.HORIZONTAL_SCROLLBAR_NEVER`: La barra de desplazamiento horizontal nunca se mostrará, incluso si el contenido es más ancho que el área visible. Esto puede ser útil si no deseas permitir el desplazamiento horizontal en absoluto.

- `JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS`: La barra de desplazamiento horizontal se mostrará siempre, independientemente de si el contenido es más ancho que el área visible o no.

`setVerticalScrollBarPolicy(int policy)`: Este método es similar al anterior, pero se utiliza para establecer la política de visualización de la barra de desplazamiento vertical en el JScrollPane. También toma un argumento de tipo entero que puede ser uno de los siguientes valores:

- `JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED`: La barra de desplazamiento vertical se mostrará automáticamente cuando sea necesario, es decir, cuando el contenido sea más alto que el área visible en el JScrollPane.

- `JScrollPane.VERTICAL_SCROLLBAR_NEVER`: La barra de desplazamiento vertical nunca se mostrará, incluso si el contenido es más alto que el área visible.

- `JScrollPane.VERTICAL_SCROLLBAR_ALWAYS`: La barra de desplazamiento vertical se mostrará siempre, independientemente de si el contenido es más alto que el área visible o no.

- Ejemplo

[setHorizontalScrollBarPolicy() & setVerticalScrollBarPolicy()](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneScrollbar.java)

---

> :beginner: getVerticalScrollBar()  &  getHorizontalScrollBar()

- Descripción

Estos métodos te permiten acceder a los objetos `JScrollBar` correspondientes a las barras de desplazamiento vertical y horizontal, respectivamente. Puedes personalizar sus propiedades, como su valor actual, su rango, etc.

- Sintaxis

JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();

JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();

- Nota

`getVerticalScrollBar()`: Este método se utiliza para obtener una referencia a la barra de desplazamiento vertical de un componente. Por lo general, se llama en un objeto JScrollPane para acceder a su barra de desplazamiento vertical.

`JScrollPane scrollPane = new JScrollPane();`

`JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();`

`getHorizontalScrollBar()`: Similar al método anterior, este se utiliza para obtener una referencia a la barra de desplazamiento horizontal de un componente.

`JScrollPane scrollPane = new JScrollPane();` 

`JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();`

- Ejemplo

[getVerticalScrollBar() & getHorizontalScrollBar()](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/CustomScrollBarExample.java)

---

> :beginner: setWheelScrollingEnabled()

- Descripción

Este método permite habilitar o deshabilitar el desplazamiento con la rueda del ratón en el `JScrollPane`.

- Sintaxis

scrollPane.setWheelScrollingEnabled(true | false);

- Nota

Cuando está habilitado, los usuarios pueden usar la rueda del ratón para desplazarse hacia arriba o hacia abajo en el contenido dentro del `JScrollPane`. Cuando está deshabilitado, la rueda del ratón no tendrá efecto en el `JScrollPane`, y el desplazamiento solo se puede realizar a través de las barras de desplazamiento si están presentes.

Para el uso del metodo se debe instanciar JScrollpane, posteriormente llamar la variable asignada y agregar .setWheelScrollingEnabled()

`JScrollPane scrollPane = new JScrollPane();`

// Habilitar el desplazamiento mediante la rueda del ratón

`scrollPane.setWheelScrollingEnabled(true);`

// O deshabilitar el desplazamiento mediante la rueda del ratón

`scrollPane.setWheelScrollingEnabled(false);`

- Ejemplo

[setWheelScrollingEnabled](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/SetWheelScrolling.java)

---

> :beginner: setBorder()

- Descripción

Utiliza este método para establecer un borde alrededor del `JScrollPane` para personalizar su apariencia.

- Sintaxis

scrollPane.setBorder(border);

- Nota

Este método toma como argumento un objeto que implementa la interfaz `Border`, que puede ser una de las clases proporcionadas por la biblioteca Swing, como `LineBorder`, `EtchedBorder`, `BevelBorder`, `TitledBorder`, entre otras, o puedes crear una clase personalizada que implemente la interfaz `Border`.

.::`LineBorder` ::.

Es una clase proporcionada por la biblioteca Swing de Java que se utiliza para crear un borde simple de línea alrededor de un componente. Puedes usar `LineBorder` con el método `setBorder` para darle a un componente un borde de línea con un color y grosor específicos.

`LineBorder lineBorder = new LineBorder(Color.BLUE, 2);`

Puedes personalizar las siguientes propiedades del `LineBorder` según tus preferencias:

1. **Color**: Puedes especificar el color del borde mediante el constructor de `LineBorder`. En el ejemplo anterior, usamos `Color.BLUE`.

2. **Grosor**: Puedes definir el grosor del borde en píxeles. En el ejemplo, usamos un grosor de 2 píxeles mediante `new LineBorder(Color.BLUE, 2)`.

3. **RoundedCorners**: Puedes habilitar o deshabilitar las esquinas redondeadas del borde utilizando un tercer argumento en el constructor. Por ejemplo, `new LineBorder(Color.BLUE, 2, true)` habilitaría las esquinas redondeadas.

4. 

`LineBorder lineBorder = new LineBorder(Color.BLUE, 2,true);`

.::`EtchedBorder`::.

Es una clase proporcionada por la biblioteca Swing de Java que se utiliza para crear un borde con efecto de relieve o grabado alrededor de un componente. Puedes usar `EtchedBorder` con el método `setBorder` para darle a un componente un aspecto en relieve, que puede ser útil para resaltar o separar visualmente ciertos componentes en tu interfaz de usuario.

`EtchedBorder etchedBorder = new EtchedBorder(EtchedBorder.RAISED);`

Puedes personalizar las siguientes propiedades del `EtchedBorder` según tus preferencias:

1. **Tipo de relieve (`RAISED` o `LOWERED`)**: Puedes elegir el tipo de relieve que deseas aplicar al borde, ya sea `EtchedBorder.RAISED` para un efecto de relieve o `EtchedBorder.LOWERED` para un efecto de hundimiento.

2. **Color del borde**: Puedes especificar el color del borde del relieve o hundimiento utilizando el constructor de la clase `EtchedBorder`. 

3. **Color del sombreado**: Para personalizar el color del sombreado en el relieve o hundimiento

`EtchedBorder border=new EtchedBorder(EtchedBorder.LOWERED,Color.BLUE,Color.green);`

.::`EmptyBorder`::.

Es una clase proporcionada por la biblioteca Swing de Java que se utiliza para crear un borde vacío o sin decoración alrededor de un componente. Puedes usar `EmptyBorder` con el método `setBorder` para establecer un espacio en blanco alrededor del componente sin ningún tipo de línea o decoración visual.

`EmptyBorder emptyBorder = new EmptyBorder(10, 20, 10, 20);`

En el ejemplo anterior, hemos creado un `EmptyBorder` con márgenes personalizados de 10 píxeles en la parte superior, 20 píxeles a la derecha, 10 píxeles en la parte inferior y 20 píxeles a la izquierda. Puedes ajustar estos valores según tus necesidades para crear un espacio en blanco alrededor del componente.

.:: `BevelBorder`::.

Es una clase proporcionada por la biblioteca Swing de Java que se utiliza para crear un borde con efecto de biselado alrededor de un componente. Puedes usar `BevelBorder` con el método `setBorder` para darle a un componente un aspecto de biselado, que puede ser útil para resaltar o separar visualmente ciertos componentes en tu interfaz de usuario.Los bordes biselados tienen una apariencia tridimensional que puede ayudar a resaltar y dar profundidad a los componentes.

La clase `BevelBorder` permite configurar si deseas un borde con un efecto de relieve o de hundimiento (biselado hacia arriba o hacia abajo). Tienes dos constantes principales para especificar el tipo de biselado:

**Tipo de borde (`RAISED` o `LOWERED`)**: Puedes especificar si el efecto de bisel debe ser "levantado" (`RAISED`) o "hundido" (`LOWERED`) utilizando el primer argumento en el constructor del `BevelBorder`.

**Colores personalizados**: Puedes especificar los colores que se utilizarán para el efecto de bisel en las esquinas superior izquierda (`highlightOuterColor`) e inferior derecha (`shadowOuterColor`) y en las esquinas inferior izquierda (`highlightInnerColor`) y superior derecha (`shadowInnerColor`). Estos colores se pasan como argumentos en el constructor.

BevelBorder customHighlightBorder = new BevelBorder(BevelBorder.RAISED o LOWERED,  highlightOuterColor,highlightInnerColor,shadowOuterColor, shadowInnerColor);

`BevelBorder border = new BevelBorder(BevelBorder.LOWERED,`

`Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW);`

.::`TitledBorder`::. 

Es una clase proporcionada por la biblioteca Swing de Java que se utiliza para agregar un título con borde a un componente, como un `JPanel`, `JScrollPane`, o cualquier otro componente que pueda recibir un borde. 

Esta clase permite personalizar la apariencia del título mediante varias propiedades.

1. **Texto del título (`title`)**: Puedes especificar el texto que aparecerá como título utilizando el constructor `TitledBorder(String title)`. Por ejemplo:
   
   ```java
   TitledBorder titledBorder = new TitledBorder("Mi Título");
   ```

2. **Posición del título (`titlePosition`)**: Puedes controlar la posición del título en relación con el componente contenedor utilizando el método `setTitlePosition(int titlePosition)`. Las posiciones comunes incluyen `TitledBorder.DEFAULT_POSITION`, `TitledBorder.ABOVE_TOP`, `TitledBorder.TOP`, `TitledBorder.BELOW_TOP`, `TitledBorder.ABOVE_BOTTOM`, `TitledBorder.BOTTOM` y `TitledBorder.BELOW_BOTTOM`. Por ejemplo:
   
   ```java
   titledBorder.setTitlePosition(TitledBorder.TOP);
   ```

3. **Alineación del título (`titleJustification`)**: Puedes especificar cómo se alineará el texto del título dentro del espacio proporcionado por el `TitledBorder`. Las alineaciones comunes incluyen `TitledBorder.LEFT`, `TitledBorder.CENTER`, `TitledBorder.RIGHT` y `TitledBorder.LEADING` (izquierda en entornos de escritura de izquierda a derecha) y `TitledBorder.TRAILING` (derecha en entornos de escritura de izquierda a derecha). Por ejemplo:
   
   ```java
   titledBorder.setTitleJustification(TitledBorder.CENTER);
   ```

4. **Color del título (`titleColor`)**: Puedes cambiar el color del texto del título utilizando el método `setTitleColor(Color titleColor)`. Por ejemplo:
   
   ```java
   titledBorder.setTitleColor(Color.BLUE);
   ```

5. **Fuente del título (`titleFont`)**: Puedes especificar la fuente que se utilizará para el texto del título mediante el método `setTitleFont(Font titleFont)`. Por ejemplo:
   
   ```java
   Font customFont = new Font("Arial", Font.BOLD, 14);
   titledBorder.setTitleFont(customFont);
   ```

6. **Borde del título (`titleBorder`)**: Puedes agregar un borde alrededor del título utilizando el método `setTitleBorder(Border titleBorder)`. Esto puede ayudar a separar visualmente el título del contenido del contenedor. Por ejemplo:
   
   ```java
   Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
   titledBorder.setBorder(lineBorder);
   ```

Estas son algunas de las propiedades más comunes que puedes utilizar al personalizar un `TitledBorder` en Java. Puedes combinar estas opciones según tus necesidades para crear títulos personalizados y atractivos para tus componentes gráficos.

- Ejemplo

[setTitle](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

---

:beginner: setComponentOrientation(()

- Descripción

Este método te permite establecer la orientación de los componentes dentro del `JScrollPane`. Esto es útil cuando trabajas con idiomas que se escriben de derecha a izquierda.

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[setTitle](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)
