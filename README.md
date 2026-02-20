# Orders API

## Requisitos

- Java 17 instalado


## Ejecución

### En Linux/Mac:
```sh
./mvnw spring-boot:run
```

### En Windows:
**PowerShell**
```powershell
.\mvnw.cmd spring-boot:run
```

El servidor embebido (Tomcat) quedará disponible en:

- http://localhost:8080

Para detener el servidor, presiona `Ctrl + C` en la terminal donde lo ejecutaste.

## Endpoint disponible

- `GET /orders`  ([http://localhost:8080/orders](http://localhost:8080/orders))
  Devuelve una lista de órdenes leídas desde el archivo `orders.txt` en la raíz del proyecto.

## Notas

- No requiere base de datos.
- El archivo `orders.txt` debe estar en la raíz del proyecto.
- Líneas mal formateadas se ignoran silenciosamente.
