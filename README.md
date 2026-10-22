# Elecciones al Parlamento de Andalucía · Práctica en Java

Programa en Java que modela un sistema de elecciones: partidos, candidaturas, provincias y mesas electorales. Es un proyecto del Grado en Ingeniería Informática (Universidad Pablo de Olavide).

🌐 **Pruébalo en el navegador:** https://alvarogarciadiaz.github.io/elecciones.html

## Qué hace

`Principal` crea unos partidos de ejemplo, los ordena, registra candidaturas en varias provincias, añade mesas electorales y muestra todo el sistema por consola.

```
PARTIDOS ORDENADOS:
AC - ALTERNATIVA CIUDADANA
PVA - PARTIDO VERDE ANDALUZ
PVB - PARTIDO VERDE ANDALUZ
USA - UNION SOCIAL ANDALUZA

=== SISTEMA DE ELECCIONES AL PARLAMENTO DE ANDALUCÍA ===

PROVINCIAS REGISTRADAS:
- PROVINCIA: SEVILLA <18 escaños>
-> CANDIDATURA: María López (12345678A) - 45 años
 ---> Partido: PARTIDO VERDE ANDALUZ
 ---> Votos: 125430
...
```

## Estructura

| Clase | Qué representa |
| --- | --- |
| `Persona` | Clase abstracta con nombre, DNI y edad |
| `Candidatura` | Hereda de `Persona` e implementa `Votable`; guarda partido, votos y escaños |
| `Votable` | Interfaz con el máximo de votos permitido |
| `Partido` | Implementa `Comparable`: se ordena por siglas y, si empatan, por nombre |
| `Provincia` | Tiene un número de escaños y un vector de candidaturas con tamaño máximo |
| `MesaElectoral` | Municipio, censo y participación |
| `SistemaElecciones` | Reúne provincias y mesas y las muestra |
| `Principal` | Programa principal |

## Conceptos que practica

- Herencia, clases abstractas e interfaces
- Encapsulación y validación en los setters
- `Comparable` y ordenación de vectores con `Arrays.sort`
- Constructor de copia
- Vectores de tamaño fijo con control de capacidad

## Cómo ejecutarlo

Necesitas tener instalado el JDK. Desde la carpeta del proyecto:

```bash
javac -encoding UTF-8 -d out src/elecciones/*.java
java -cp out elecciones.Principal
```

También puedes abrir la carpeta `src` en NetBeans, IntelliJ IDEA o VS Code y ejecutar `Principal`.

## Autor

Álvaro García Díaz
