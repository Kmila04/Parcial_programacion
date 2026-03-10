# Parcial_programacion

**Camila Rodriguez Ordoñez**
---

## Estructura del proyecto Maven

```
biblioteca/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/biblioteca/
                ├── Libro.java
                ├── LibroTexto.java
                ├── LibroTextoUNIAC.java
                ├── Novela.java
                └── Main.java
```

---

## Jerarquía de herencia

```
Libro
 ├── LibroTexto  (hereda de Libro)
 │    └── LibroTextoUNIAC  (hereda de LibroTexto)
 └── Novela  (hereda de Libro)
```

---

## Punto 0.5 - Dos situaciones donde NO se puede aplicar herencia

### Situación 1: Clase declarada como "final"
Si la clase Libro se declara con la palabra "final", ninguna clase puede heredar de ella.

```java
// Fragmento con falla:
public final class Libro {  // <-- el "final" no permite herencia
    ...
}

// Esto causaria error en:
public class LibroTexto extends Libro { // ERROR: no se puede heredar de una clase final
    ...
}
```

### Situación 2: Constructor privado
Si el constructor de Libro es privado, las subclases no pueden llamar a super() y no se puede inicializar la herencia.

```java
// Fragmento con falla:
public class Libro {
    private Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) { // <-- private no permite que las subclases lo llamen
        ...
    }
}

// Esto causaria error en:
public class LibroTexto extends Libro {
    public LibroTexto(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados); // ERROR: el constructor de Libro es privado
        ...
    }
}
```

---

## Punto 0.5 - Dos nuevos atributos y un metodo adicional

### Atributo 1: anioPublicacion (int)
Año en que fue publicado el libro. Tiene sentido porque en una biblioteca real es importante saber si un libro es reciente o antiguo.

### Atributo 2: isbn (String)
Código único que identifica cada libro en el mundo. Sirve para buscar libros sin equivocarse con titulos parecidos.

### Metodo adicional: estaDisponible()
Retorna true si hay al menos un ejemplar disponible para prestar, false si no hay ninguno. Es util para verificar rapido si se puede prestar antes de intentarlo.

```java
public boolean estaDisponible() {
    int disponibles = numEjemplares - numEjemplaresPrestados;
    if (disponibles > 0) {
        return true;
    } else {
        return false;
    }
}
```