# Día 8: Clase Película

## 📌 Enunciado
Se debe modelar una clase `Pelicula` con los siguientes atributos:
- **Nombre:** Nombre de la película (`String`)
- **Director:** Nombre del director (`String`)
- **Género:** Enumerado con valores `ACCION, COMEDIA, DRAMA, SUSPENSO`
- **Duración:** En minutos (`int`)
- **Año:** Año de lanzamiento (`int`)
- **Calificación:** Valoración de usuarios (`double`)

## 🚀 Requisitos
1. Definir un **constructor** para inicializar los atributos.
2. Implementar **métodos get públicos** y **métodos set privados**.
3. Métodos requeridos:
   - `imprimir()`: Muestra los valores en pantalla.
   - `esPeliculaEpica()`: **Privado**. Retorna `true` si la duración es ≥ 180 min.
   - `calcularValoracion()`: **Privado**. Retorna la valoración basada en la tabla.
   - `esSimilar()`: **Privado**. Compara dos películas y retorna `true` si tienen el mismo género y valoración.
4. En `main`, crear **dos películas** y mostrar:
   - Si son épicas.
   - Su valoración.
   - Si son similares.
