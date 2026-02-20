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

## Ejercicios

### Anadir filtro

Permitir que el endpoint soporte filtros opcionales:

`GET /orders?from=YYYY-MM-DD&to=YYYY-MM-DD&status=STATUS`

Requisitos:

- `from` es opcional
- `to` es opcional
- `status` es opcional
- Si no se envían parámetros, debe devolver todos los pedidos
- Si los parámetros son inválidos, debe devolver una lista vacía

### Actualizar estado de un pedido

Crear un endpoint:

`PUT /orders/{id}/status`

Body:

```json
{
  "status": "COMPLETED"
}
```

Requisitos:

- Validar que el pedido existe
- Validar que el estado es válido
- Actualizar el archivo `orders.txt`
- Devolver códigos HTTP adecuado
