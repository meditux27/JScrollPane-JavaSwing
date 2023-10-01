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

:beginner: getViewport()

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

[getViewport](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

---

:beginner: setHorizontalScrollBarPolicy()  &  setVerticalScrollBarPolicy()

- Descripción

Estos métodos permiten establecer la política de visibilidad de las barras de desplazamiento vertical y horizontal respectivamente.

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

---

:beginner: getVerticalScrollBar()  &  getHorizontalScrollBar()

- Descripción

Estos métodos te permiten acceder a los objetos `JScrollBar` correspondientes a las barras de desplazamiento vertical y horizontal, respectivamente. Puedes personalizar sus propiedades, como su valor actual, su rango, etc.

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

---

:beginner: setWheelScrollingEnabled()

- Descripción

Este método permite habilitar o deshabilitar el desplazamiento con la rueda del ratón en el `JScrollPane`.

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

---

:beginner: setPreferredSize()

- Descripción

Puedes establecer el tamaño preferido del `JScrollPane` con este método, lo que afectará cómo se ajusta y se muestra el contenido.

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

---

:beginner: setBorder()

- Descripción

Utiliza este método para establecer un borde alrededor del `JScrollPane` para personalizar su apariencia.

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
