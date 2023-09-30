# JScrollPane - JavaSwing



<img title="" src="https://www.jrebel.com/sites/default/files/image/2019-11/image-blog-pick-right-java-executors.jpg" alt="" width="361" data-align="inline">



##### JScrollPane se utiliza para agregar barras de desplazamiento a otros componentes, como JTextArea, JTable, JList, y otros, cuando su contenido es más grande que el área visible en la pantalla.

##### La principal función de JScrollPane es permitir la visualización y navegación de contenido que no cabe completamente dentro del área visible del componente subyacente.

##### Un JScrollPane proporciona tanto barras de desplazamiento horizontales como verticales (o solo una de ellas, dependiendo de las necesidades) y envuelve el componente al que se le desea agregar la funcionalidad de desplazamiento.

---

[Estructura basica](https://github.com/meditux27/JFrame-JavaSwing/blob/main/principal/MiVentana.java)



Las características más importantes de un `JScrollPane` en Swing son las siguientes:

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

`import java.awt.*;`



2. **Crea tu componente de contenido**:

   Primero, crea el componente de Swing que deseas envolver con un `JScrollPane`. Esto puede ser un `JTextArea`, `JTable`, `JList`, o cualquier otro componente que necesite barras de desplazamiento para mostrar su contenido.

   Por ejemplo, si deseas usar un `JTextArea`: 

`JTextArea textArea = new JTextArea(10, 30); // Crea un JTextArea con 10 filas y 30 columnas`



3. **Crea un `JScrollPane` y agrega tu componente de contenido**:

   A continuación, crea una instancia de `JScrollPane` y agrega tu componente de contenido al `JScrollPane`. Esto envolverá el componente de contenido y proporcionará las barras de desplazamiento necesarias.

` JScrollPane scrollPane = new JScrollPane(textArea); // Envuelve el JTextArea con un JScrollPane`



4. **Personaliza el comportamiento (opcional)**:

   Puedes personalizar el comportamiento del `JScrollPane` según tus necesidades. Por ejemplo, puedes especificar si se deben mostrar barras de desplazamiento vertical, horizontal o ambas. También puedes configurar otros aspectos del comportamiento de desplazamiento, como las políticas de desplazamiento.

 

Personaliza el comportamiento (opcional)

`scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);`

`scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);`



5. **Agrega el `JScrollPane` a tu contenedor principal**:

   Finalmente, agrega el `JScrollPane` al contenedor principal de tu interfaz de usuario (por lo general, un `JFrame` o un `JPanel`).

Agrega el JScrollPane al contenedor principal (por ejemplo, un JFrame)

` JFrame frame = new JFrame("Ejemplo de JScrollPane");`

`frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`

`frame.getContentPane().add(scrollPane); // Agrega el JScrollPane al contenido del JFrame`

` frame.setSize(400, 300);`

`frame.setVisible(true);`



---

> :beginner: Title()

- Descripción

Establece el título de la ventana 

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

<sub> Crear un JFrame</sub>  
`JFrame frame = new JFrame();`

<sub>Agregar setTitle </sub>  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[ setTitle]( https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

---

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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

:beginner: Title()

- Descripción

Establece el título de la ventana

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
