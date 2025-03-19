# Día 9: Herencia en Java - Clase Planta y sus subclases

## 📌 Enunciado
Se debe crear una clase base `Planta` con los siguientes atributos:
- Nombre
- Alto del tallo
- Tiene hojas (boolean)
- Clima ideal

### 🚀 Clases hijas
Cada una de estas clases hereda de `Planta` y agrega atributos propios:

#### 🌳 **Árbol**
- Variedad
- Tipo de tronco
- Radio del tronco
- Color
- Tipo de hojas

#### 🌺 **Flor**
- Color de pétalos
- Cantidad promedio de pétalos
- Color del pistilo
- Variedad de flor
- Estación en la que florece

#### 🌿 **Arbusto**
- Ancho del arbusto
- Es doméstico (boolean)
- Variedad del arbusto
- Color de hojas
- Se poda o no (boolean)

### 📂 Archivos
- `Planta.java` → Clase base.
- `Árbol.java` → Clase hija con método `mostrarMensaje()`.
- `Flor.java` → Clase hija con método `mostrarMensaje()`.
- `Arbusto.java` → Clase hija con método `mostrarMensaje()`.
- `Main.java` → Creación de objetos y ejecución de métodos.