# Respuestas, Puntos de Control y Autoevaluación
Documento: Interfaces y Enums en Java (Java 21 LTS)

---

## 1. Puntos de Control del Capítulo

### Punto de Control - Sección 1.2 y 1.3 (Página 4)
1. **¿Qué palabra clave usa una clase para "firmar" una interfaz?**
   - **Respuesta:** `implements`.
2. **¿Por qué el método de una interfaz termina en `;` y no tiene llaves?**
   - **Respuesta:** Porque en la definición clásica solo se declara la firma del contrato (nombre, parámetros y tipo de retorno); la implementación concreta la proporciona cada clase que firma el contrato.
3. **¿Es válido escribir `Sonoro s = new Sonoro();`? ¿Por qué?**
   - **Respuesta:** No, no es válido. Una interfaz es abstracta por definición y no puede instanciarse directamente; solo se utiliza como tipo de referencia para apuntar a objetos de clases que la implementen.

---

### Punto de Control - Sección 1.4 y 1.5 (Página 8)
1. **¿Cuántas clases puede extender una clase? ¿Cuántas interfaces puede implementar?**
   - **Respuesta:** Una clase solo puede extender una única clase (`extends`), pero puede implementar tantas interfaces como requiera separadas por coma (`implements`).
2. **Si `Volador v = new Pato();`, ¿puedes escribir `v.nadar()`?**
   - **Respuesta:** No directamente en tiempo de compilación, porque el tipo declarado de la variable es `Volador` y ese contrato no declara el método `nadar()`. Para invocarlo se requiere verificar o hacer cast al tipo real (por ejemplo con `if (v instanceof Pato p) p.nadar();`).
3. **¿Qué modificadores tiene implícitamente `int LIMITE = 5;` dentro de una interfaz?**
   - **Respuesta:** Es implícitamente `public static final`.

---

### Punto de Control - Sección 1.6 (Página 13)
1. **¿Cuántos métodos abstractos tiene una interfaz funcional?**
   - **Respuesta:** Exactamente uno (anotada preferiblemente con `@FunctionalInterface`). Puede tener métodos `default` y `static` adicionales.
2. **Reescribe como lambda: una `Function<Integer, Integer>` que devuelva el cuadrado.**
   - **Respuesta:** `Function<Integer, Integer> cuadrado = n -> n * n;`
3. **¿Qué interfaz de `java.util.function` usarías para "¿el número es positivo?"**
   - **Respuesta:** `Predicate<Integer>`, ya que recibe un valor y retorna un `boolean` (`n -> n > 0`).

---

### Punto de Control - Sección 1.7, 1.8 y 1.9 (Página 19)
1. **¿Qué devuelve `compareTo` si el objeto actual debe ir después del otro?**
   - **Respuesta:** Devuelve un número entero positivo (`> 0`).
2. **Tienes `Ave`, `Avion` y `Superheroe`. ¿Clase abstracta o interfaz para "volar"? ¿Por qué?**
   - **Respuesta:** Interfaz `Volador`. No comparten una jerarquía biológica o de familia ("es un"), sino una capacidad común que ejecutan de forma independiente ("puede volar").
3. **¿Qué ventaja da `sealed` al usar `switch`?**
   - **Respuesta:** Garantiza exhaustividad en tiempo de compilación. Como el compilador conoce todos los subtipos autorizados (`permits`), no se requiere cláusula `default` y si se agrega una subclase nueva, el compilador obliga a contemplarla.

---

### Punto de Control - Sección 2.3, 2.4 y 2.5 (Página 23)
1. **¿Por qué es seguro comparar enums con `==` en lugar de `equals`?**
   - **Respuesta:** Porque cada constante de un enum es un singleton inmutable en la JVM instanciado una sola vez durante la carga de clases; por ende, comparar identidades de memoria (`==`) es seguro, nulo-seguro y rápido.
2. **¿Qué imprime `DiaSemana.DOMINGO.ordinal()`?**
   - **Respuesta:** Imprime `6` (la numeración es base 0: LUNES=0, ..., DOMINGO=6).
3. **¿Qué pasa si en una expresión `switch` sobre `DiaSemana` olvidas el caso `JUEVES` y no hay `default`?**
   - **Respuesta:** Error de compilación: `the switch expression does not cover all possible input values`.

---

### Punto de Control - Sección 2.10, 2.11 y 2.12 (Páginas 29-30)
1. **¿En qué orden deben ir las constantes y los atributos dentro de un enum?**
   - **Respuesta:** Primero la lista de constantes (terminada en `;`), seguida de los atributos de instancia, el constructor y finalmente los métodos.
2. **¿Puede un enum usar `extends`? ¿Y `implements`?**
   - **Respuesta:** `extends` no es permitido (todo enum hereda implícitamente de `java.lang.Enum`), pero sí puede usar `implements` con múltiples interfaces.
3. **¿Por qué `EnumMap` imprime las claves en orden de la semana?**
   - **Respuesta:** Porque internamente mantiene las claves indexadas según el `ordinal()` de declaración en el enum.

---

## 2. Autoevaluación (Sección 3.4, Páginas 35-36)

1. **¿Qué modificadores tiene implícitamente un método abstracto de una interfaz?**
   - **Opción correcta:** b) `public abstract`
   - *Justificación:* En Java, todo método sin cuerpo en una interfaz es público y abstracto por omisión.

2. **¿Cuál línea compila si `Sonoro` es una interfaz y `Perro` la implementa?**
   - **Opción correcta:** c) `Sonoro s = new Perro();`
   - *Justificación:* Las interfaces no se pueden instanciar con `new Sonoro()`. Se usa el tipo interfaz a la izquierda y el objeto concreto a la derecha.

3. **Una clase implementa dos interfaces con el mismo método default. ¿Qué ocurre?**
   - **Opción correcta:** c) Error: la clase debe sobrescribirlo
   - *Justificación:* Ocurre el problema del diamante. Para evitar ambigüedad, el compilador exige resolver la colisión sobrescribiendo el método.

4. **¿Cuál es una interfaz funcional válida para usar con lambda?**
   - **Opción correcta:** b) Una con un método abstracto y tres `default`
   - *Justificación:* Una interfaz funcional requiere exactamente un método abstracto; la cantidad de métodos `default` o `static` no la invalida.

5. **¿Qué interfaz de `java.util.function` recibe un valor y no devuelve nada?**
   - **Opción correcta:** c) `Consumer`
   - *Justificación:* `Consumer<T>` expone el método `void accept(T t)`.

6. **¿Qué imprime `DiaSemana.MIERCOLES.ordinal()` con el enum del capítulo?**
   - **Opción correcta:** b) 2
   - *Justificación:* LUNES=0, MARTES=1, MIERCOLES=2.

7. **¿Qué lanza `DiaSemana.valueOf("Lunes")`?**
   - **Opción correcta:** c) `IllegalArgumentException`
   - *Justificación:* `valueOf` es sensible a mayúsculas y minúsculas; al no encontrar "Lunes" exacto, lanza esta excepción.

8. **¿Cuál afirmación sobre el constructor de un enum es correcta?**
   - **Opción correcta:** b) Es siempre privado
   - *Justificación:* No puede invocarse desde fuera de la definición del enum; escribir `public` genera error de compilación.

9. **¿Qué debes guardar en una base de datos para representar una constante de enum?**
   - **Opción correcta:** c) `name()` o un código propio
   - *Justificación:* Guardar el `ordinal()` es frágil ante reordenamientos o inserciones intermedias de constantes.

10. **Tienes `Tarjeta`, `Nequi` y `Efectivo` sin estado en común y quieres agregar más en el futuro. ¿Qué usas?**
    - **Opción correcta:** b) Una interfaz `MetodoPago`
    - *Justificación:* Define una capacidad polimórfica abierta sin forzar una jerarquía de herencia única.

---

## 3. Estructura del Código Fuente Creado en el Proyecto

```text
src/
├── ejemplos/
│   ├── seccion1_interfaces/
│   │   ├── s1_2_primera_interfaz/        (Sonoro, Perro, Gato, Main)
│   │   ├── s1_3_anatomia_reglas/         (Figura, ReglasJuego, JuegoArcade, Main)
│   │   ├── s1_4_polimorfismo/
│   │   │   ├── granja/                   (Sonoro, Perro, Gato, Vaca, GranjaMain)
│   │   │   ├── multiple/                 (Volador, Nadador, Pato, Avion, Main)
│   │   │   └── herencia_interfaces/      (Encendible, Conectable, DispositivoInteligente, Parlante, Main)
│   │   ├── s1_5_metodos_interfaz/
│   │   │   ├── default_methods/          (Notificador, NotificadorEmail, NotificadorSMS, Main)
│   │   │   ├── diamante/                 (Cantante, Bailarin, Artista, Main)
│   │   │   └── static_private/           (Formateador, Mayusculas, Main)
│   │   ├── s1_6_funcionales_lambdas/
│   │   │   ├── basico/                   (Operacion, Main)
│   │   │   └── util_function/            (Main con Predicate, Function, Consumer, Supplier, etc.)
│   │   ├── s1_7_comparable_comparator/   (Estudiante, Main)
│   │   ├── s1_8_interfaz_vs_abstracta/   (Empleado, Bonificable, Desarrollador, Practicante, Main)
│   │   ├── s1_9_sealed_records/          (Figura sealed, Circulo, Rectangulo, Triangulo, Main)
│   │   └── s1_10_buenas_practicas/       (Imprimible, Escaneable, ImpresoraBasica, Multifuncional, Main)
│   └── seccion2_enums/
│       ├── s2_1_s2_2_primer_enum/        (DiaSemana, Main)
│       ├── s2_3_s2_4_metodos_enum/       (DiaSemana, Main)
│       ├── s2_5_enum_switch/             (DiaSemana, Main)
│       ├── s2_6_atributos_constructor/   (Moneda, Main)
│       ├── s2_7_comportamiento_constante/(Operador con método abstracto, Main)
│       ├── s2_8_enums_interfaces/        (Calculable, Impuesto, Main)
│       ├── s2_9_maquina_estados/         (EstadoPedido, Main)
│       ├── s2_10_enumset_enummap/        (DiaSemana, Main)
│       └── s2_11_singleton/              (Configuracion con Math.clamp, Main)
├── laboratorios/
│   ├── lab1_playlist/                    (Cancion con Comparable, Comparator, Predicate, Main)
│   ├── lab2_pasarela/                    (MetodoPago, TarjetaCredito, BilleteraDigital, Efectivo, Criptomoneda, Caja, Main)
│   ├── lab3_semaforo/                    (Semaforo, Main, SemaforoConIntermitente, MainRetoExtra)
│   └── lab4_cafeteria/                   (Bebida, Tamano, EstadoPedido, Promocion, Item record, Pedido, Main)
└── retos/
    ├── reto1_figuras_perimetro/          (Figura sealed con Cuadrado, perimetro() y area() con record patterns, Main)
    ├── reto2_baraja_espanola/            (Palo, Valor, Carta record, baraja de 48 con values() y shuffle, Main)
    ├── reto3_calculadora_lambdas/        (Operador con DoubleBinaryOperator, POTENCIA, MODULO, Main)
    ├── reto4_promociones_combinables/    (Promocion con método default y(Promocion otra), Main)
    └── reto5_permisos_enumset/           (Permiso, Rol con EnumSet, verificación puede(Permiso p), Main)
```
