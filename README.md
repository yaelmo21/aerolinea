# Aerolínea

Este es la API de la Aeroínea "iAero"

## Para Comenzar

Es necesario que se cuente con una conexión a internet para consumir el servicio 


### API

Peticiones soportadas por la API v2.0


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

**Ejemplo de petición**

```


<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
	<Body>
		<VuelosRequest xmlns="http://www.example.org/aerolinea">
			<origin>Monterrey</origin>
			<destination>Ciudad de México</destination>
			<date>2020-04-15</date>
		</VuelosRequest>
	</Body>
</Envelope>

```

**Asientos**: Número y ID`s de los asientos disponibles en determinado vuelo.

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idVuelo` | **Int** identificador del vuelo |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `idAsiento` | **String** Número unico de asiento|
| `asientosDisponibles` | **Int** Número total de asientos disponibles|

**Ejemplo de petición**

```


<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
	<Body>
		<AsientosRequest xmlns="http://www.example.org/aerolinea">
			<idVuelo>1</idVuelo>
		</AsientosRequest>
	</Body>
</Envelope>

```

**Compra**: Solicita la compra de un boleto en determinado vuelo con un asiento disponible

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `idVuelo` | **Int** Número unico de vuelo|
| `idAsiento` | **String** Número unico de asiento|
| `nameClient` | **String** Nombre de la persona quien viajará|
| `edadClient` | **Int** Edad de la persona que viajrá|
| `phoneClient` | **Double** Número de teléfono de la persona que viajrá|
| `emailClient` | **String** Correo electrónico de la persona que viajrá|

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `status` | **Boolean** Estado de la transacción|
| `origin` | **String** Ciudad de origen|
| `destination` | **String** Ciudad de destino|
| `date` | **String** Fecha de salida *YYYY-MM-DD* |
| `time` | **String** Hora de salida *HH:MM* |
| `noTicket` | **Int** Número unico de compra |
| `noVuelo` | **Int** Identificador de vuelo |
| `alert` |  **String** Mensaje de error |

**Ejemplo de petición**

```


<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
	<Body>
		<CompraRequest xmlns="http://www.example.org/aerolinea">
			<idVuelo>1</idVuelo>
			<idAsiento>A01</idAsiento>
			<nameClient>GUILLERMO SALVATIERRA MALLO</nameClient>
			<edadClient>20</edadClient>
			<phoneClient>2298765400</phoneClient>
			<emailClient>correo@correo.com</emailClient>
		</CompraRequest>
	</Body>
</Envelope>

```

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

**Ejemplo de petición**

```

<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <CancelCompraRequest xmlns="http://www.example.org/aerolinea">
            <noTicket>6</noTicket>
            <description>Motivo</description>
        </CancelCompraRequest>
    </Body>
</Envelope>

```

**Consultar Compra**: Muestra los datos de una compra 

Datos que recibe: 

| Parametros | Descripción |
| --- | --- |
| `noTicket` | **Int** Número unico de compra |

Datos que se regresan:

| Parametros | Descripción |
| --- | --- |
| `status` | **Boolean** Estado de la transacción|
| `origin` | **String** Ciudad de origen|
| `destination` | **String** Ciudad de destino|
| `date` | **String** Fecha de salida *YYYY-MM-DD* |
| `time` | **String** Hora de salida *HH:MM* |
| `noTicket` | **Int** Número unico de compra |
| `noVuelo` | **Int** Identificador de vuelo |
| `alert` |  **String** Mensaje de error |

**Ejemplo de petición**

```


<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
	<Body>
		<ConsultarCompraRequest xmlns="http://www.example.org/aerolinea">
			<noTicket>3</noTicket>
		</ConsultarCompraRequest>
	</Body>
</Envelope>


```

