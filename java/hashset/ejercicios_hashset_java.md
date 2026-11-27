# Ejercicios Progresivos de `HashSet` en Java
## Enfocados en situaciones reales de industria

---

# Nivel Fácil

---

# 1. Correos únicos para campaña de marketing

Una empresa va a enviar una campaña de correos a sus usuarios.

El problema es que muchos correos vienen repetidos desde distintos sistemas.

Tu tarea será construir un programa que elimine automáticamente los duplicados.

---

## Lo que debes practicar
- Crear un `HashSet`
- Usar `add()`
- Recorrer elementos con `for-each`
- Ver cómo `HashSet` evita duplicados automáticamente

---

## Guía

### Paso 1
Crea un `HashSet<String>` llamado `correos`.

```java
HashSet<String> correos = new HashSet<>();
```

---

### Paso 2
Agrega varios correos.

Recuerda:
- `add()` agrega elementos.
- Si el elemento ya existe, simplemente NO se repite.

Ejemplo:

```java
correos.add("ana@gmail.com");
correos.add("carlos@gmail.com");
correos.add("ana@gmail.com");
```

---

### Paso 3
Recorre el `HashSet`.

Puedes usar:

```java
for(String correo : correos){
    System.out.println(correo);
}
```

---

## Así debería verse el programa

```text
Correos registrados:

ana@gmail.com
carlos@gmail.com
maria@gmail.com

Total únicos: 3
```

---

## Pregunta de análisis
¿Por qué este problema aparece mucho cuando distintas bases de datos se sincronizan?

---

# 2. Dispositivos conectados a una aplicación

Una aplicación móvil registra dispositivos que se conectan durante el día.

Un mismo dispositivo puede conectarse muchas veces.

El sistema necesita saber:
- cuáles dispositivos únicos entraron,
- y verificar rápidamente si un dispositivo ya estaba registrado.

---

## Lo que debes practicar
- `add()`
- `contains()`
- `size()`

---

## Guía

### Paso 1
Crea un `HashSet<String>` llamado `dispositivos`.

---

### Paso 2
Agrega varios IDs.

Ejemplo:

```java
dispositivos.add("DEV-100");
dispositivos.add("DEV-200");
dispositivos.add("DEV-100");
```

---

### Paso 3
Usa `contains()` para validar existencia.

`contains()` permite buscar rápidamente.

Ejemplo:

```java
System.out.println(dispositivos.contains("DEV-200"));
```

---

### Paso 4
Muestra cuántos dispositivos únicos existen.

Ayuda:
```java
dispositivos.size()
```

---

## Resultado esperado

```text
¿Existe DEV-200? true
¿Existe DEV-999? false

Dispositivos únicos conectados: 3
```

---

## Tip
En sistemas reales puede haber millones de consultas de búsqueda por segundo.

Por eso la velocidad de `HashSet` es tan valiosa.

---

# Nivel Intermedio

---

# 3. Sistema de cupones de e-commerce

Una tienda online quiere evitar que un cupón se use dos veces.

Cada vez que un usuario intenta usar un cupón:
- si ya fue usado → rechazar,
- si no existe → permitir.

---

## Lo que debes practicar
- `contains()`
- `add()`
- estructuras `if`

---

## Guía

### Paso 1
Crea un `HashSet<String>` llamado `cuponesUsados`.

---

### Paso 2
Simula el ingreso de un cupón.

Ejemplo:

```java
String cupon = "SAVE10";
```

---

### Paso 3
Usa `contains()` antes de agregar.

Piensa algo como:

```java
if(cuponesUsados.contains(cupon)){
    // rechazar
}else{
    // permitir
}
```

---

### Paso 4
Si el cupón no existe:
- agrégalo,
- muestra mensaje de éxito.

---

## Así podría verse la consola

```text
Ingrese cupón:
SAVE10

Cupón aplicado correctamente
```

Segundo intento:

```text
Ingrese cupón:
SAVE10

Cupón rechazado: ya fue usado
```

---

## Pregunta de análisis
¿Qué pérdidas económicas podría sufrir la empresa si no controlara duplicados?

---

# 4. Palabras prohibidas en un chat

Una plataforma necesita detectar palabras ofensivas rápidamente.

Cada mensaje debe validarse en tiempo real.

---

## Lo que debes practicar
- búsquedas rápidas con `contains()`
- recorridos
- comparación de texto

---

## Guía

### Paso 1
Crea un `HashSet<String>` con palabras bloqueadas.

Ejemplo:

```java
HashSet<String> bloqueadas = new HashSet<>();
```

---

### Paso 2
Agrega palabras prohibidas.

```java
bloqueadas.add("spam");
bloqueadas.add("hack");
bloqueadas.add("fake");
```

---

### Paso 3
Simula un mensaje recibido.

```java
String palabra = "hack";
```

---

### Paso 4
Usa `contains()` para validar.

---

## Resultado esperado

```text
Mensaje bloqueado: contiene palabra prohibida
```

o

```text
Mensaje permitido
```

---

## Tip
Las aplicaciones de chat no pueden recorrer listas enormes lentamente cada vez que llega un mensaje.

---

# Nivel Intermedio Alto

---

# 5. Registro único de empleados

Una empresa quiere evitar empleados duplicados.

Dos empleados con el mismo ID deben considerarse iguales.

---

## Lo que debes practicar
- `HashSet` con objetos
- `equals()`
- `hashCode()`

---

## Guía

### Paso 1
Crea una clase `Empleado`.

Debe tener:
- `id`
- `nombre`

---

### Paso 2
Crea constructor y `toString()`.

Ejemplo esperado al imprimir:

```text
Empleado{id=1, nombre='Ana'}
```

---

### Paso 3
Implementa `equals()`.

Debes comparar solamente el `id`.

Idea:

```java
return this.id == otro.id;
```

---

### Paso 4
Implementa `hashCode()`.

Ayuda:

```java
return Objects.hash(id);
```

---

### Paso 5
Agrega empleados repetidos al `HashSet`.

---

## Así debería verse

```text
Empleados registrados:

Empleado{id=1, nombre='Ana'}
Empleado{id=2, nombre='Carlos'}

Total únicos: 2
```

---

## Pregunta de análisis
¿Por qué `HashSet` necesita BOTH `equals()` y `hashCode()` para funcionar correctamente?

---

# Nivel Avanzado

---

# 6. Sistema antifraude bancario

Un banco recibe miles de transacciones por minuto.

Cada transacción tiene un código único.

Si una transacción ya fue procesada:
- debe rechazarse inmediatamente.

---

## Lo que debes practicar
- objetos en `HashSet`
- validaciones rápidas
- diseño orientado a problemas reales

---

## Guía

### Paso 1
Crea una clase `Transferencia`.

Atributos:
- `codigo`
- `monto`

---

### Paso 2
Implementa:
- `equals()`
- `hashCode()`

La igualdad debe depender SOLO del código.

---

### Paso 3
Crea un `HashSet<Transferencia>`.

---

### Paso 4
Antes de agregar:
- valida con `contains()`.

Idea general:

```java
if(transacciones.contains(t)){
    // rechazar
}else{
    // procesar
}
```

---

## Resultado esperado

```text
Procesando transferencia TX-100...

Transferencia aprobada
```

Segundo intento:

```text
Procesando transferencia TX-100...

Transferencia rechazada: duplicada
```

---

## Tip
En sistemas financieros:
- duplicar operaciones puede costar millones,
- y la velocidad de validación es crítica.

---

# Ejercicio Retador

# 7. ¿Qué estructura usarías?

Para cada caso:
- decide si usarías `HashSet`,
- y explica por qué.

---

## Caso A
Guardar usuarios únicos conectados.

---

## Caso B
Guardar mensajes manteniendo el orden exacto y permitiendo repetidos.

---

## Caso C
Validar millones de IDs rápidamente.

---

## Caso D
Guardar productos repetidos en un carrito de compras.

---

## Caso E
Guardar elementos únicos PERO manteniendo orden de inserción.

---

# Mini Proyecto Integrador

## Plataforma de Streaming

Construye un sistema por consola que permita:

---

## Requisitos

### Usuarios conectados
Guardar usuarios únicos.

---

### Películas vistas
Evitar repetir películas vistas por un usuario.

---

### Tokens bloqueados
Verificar rápidamente si un token está prohibido.

---

### Palabras prohibidas
Bloquear mensajes ofensivos.

---

## Debes usar
- `add()`
- `contains()`
- `remove()`
- `size()`
- recorridos con `for-each`

---

## Así podría verse la consola

```text
===== STREAMING APP =====

1. Conectar usuario
2. Ver película
3. Validar token
4. Enviar mensaje
5. Mostrar estadísticas

Seleccione opción:
```

---

## Desafío extra
Explica en comentarios:
- por qué elegiste `HashSet`,
- qué problema evita,
- qué ventaja ofrece frente a una lista.
