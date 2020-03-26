# Aerolínea

Este es la API de la Aeroínea "iAero"

## Para Comenzar

Es necesario que se cuente con una conexión a internet para consumir el servicio 


### API

Peticiones soportadas por la API v1.0


**Vuelos**: Conoce los vuelos que ofrece nuestra aerolínea.

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `origin` | **String** Ciudad de origen|
| `destination` | **String** Ciudad de destino|
| `date` | **String** Fecha de salida *YYYY-MM-DD* |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `idVuelo` | **Int** Número unico de vuelo|
| `origin` | **String** Ciudad de origen|
| `destination` | **String** Ciudad de destino|
| `date` | **String** Fecha de salida *YYYY-MM-DD* |
| `time` | **String** Hora de salida|
| `Price` | **Float** Costo del vuelo|


**Asientos**: Número y ID`s de los asientos disponibles en determinado vuelo.

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idVuelo` | **String** Ciudad de origen|

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `idAsiento` | **String** Número unico de asiento|
| `asientosDisponibles` | **Int** Número total de asientos disponibles|


**Compra**: Solicita la compra de un boleto en determinado vuelo con un asiento disponible

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idVuelo` | **Int** Número unico de vuelo|
| `idAsiento` | **String** Número unico de asiento|
| `nameClient` | **String** Nombre de la persona quien viajara|

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `status` | **Boolean** Estado de la transacción|
| `origin` | **String** Ciudad de origen|
| `destination` | **String** Ciudad de destino|
| `date` | **String** Fecha de salida *YYYY-MM-DD* |
| `noTicket` | **Int** Número unico de compra |


**Cancelar Compra**: Si la compra se ha completado con éxito, es posible solicitar una cancelación

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `noTicket` | **Int** Número unico de compra |
| `description` | **String** Motivo por el cual solicita la cancelación|

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `status` | **Boolean** Estado de la transacción|
| `menssage` | **String** Descripción del estado de la transacción|


