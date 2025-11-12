Análisis Orientado a Objetos - EcoFumigaciones
1. Identificación del Dominio

Nombre del negocio: EcoFumigaciones S.A.S.
Tipo: Empresa de fumigación y control de plagas.
Descripción:
EcoFumigaciones se dedica a ofrecer servicios de fumigación, desinfección y control de plagas para hogares, restaurantes, edificios y empresas. Su objetivo es garantizar espacios libres de insectos, roedores y otros agentes que afecten la salubridad, mediante servicios eficientes, seguros y certificados.

2. Objetos Identificados
    Objeto Principal: ServicioFumigacion

¿Qué es?:
Representa un servicio de fumigación solicitado por un cliente, donde se especifican detalles como el tipo de plaga, el área tratada, el costo y el estado del servicio.

Atributos identificados:

codigoServicio: String – Código único que identifica el servicio.

tipoPlaga: String – Tipo de plaga a eliminar (cucarachas, roedores, termitas, etc.).

cliente: String – Nombre del cliente o empresa que solicita el servicio.

areaMetrosCuadrados: double – Tamaño del área a tratar.

costoPorMetro: double – Precio por metro cuadrado de fumigación.

completado: boolean – Indica si el servicio ha sido completado.

Métodos identificados:

mostrarInformacion(): Muestra todos los datos del servicio en consola.

calcularCostoTotal(): Retorna el costo total del servicio según el área tratada.

getCodigoServicio(): Devuelve el código del servicio.

setCompletado(boolean): Cambia el estado del servicio a “completado” o “pendiente”.

 Objeto Secundario: ClienteFumigacion

¿Qué es?:
Representa al cliente que solicita los servicios de fumigación, ya sea una persona natural o jurídica.

Atributos identificados:

nitCliente: String – NIT o cédula del cliente.

nombreCliente: String – Nombre del cliente o empresa.

direccion: String – Dirección del lugar donde se realiza la fumigación.

correoContacto: String – Correo electrónico para comunicación.

serviciosSolicitados: int – Número de servicios contratados por el cliente.

Métodos identificados:

mostrarInformacion(): Muestra los datos principales del cliente.

registrarServicio(): Incrementa el número de servicios solicitados.

esClienteFrecuente(): Verifica si el cliente ha contratado más de 5 servicios.

3. Relación entre Objetos

Tipo de relación: Asociación (uno a muchos).
Descripción:
Un ClienteFumigacion puede tener varios ServiciosFumigacion, ya que puede solicitar múltiples fumigaciones a lo largo del tiempo.
Cada ServicioFumigacion está asociado a un cliente específico (por nombre o identificador).

Ejemplo:
“El cliente Restaurante El Sabor puede solicitar varios servicios de fumigación (para cocina, bodega, comedor, etc.), y cada servicio debe registrar a qué cliente pertenece.”

4. Justificación del Diseño

¿Por qué elegí estos objetos?
Porque representan las dos entidades principales del negocio: el cliente (quien solicita el servicio) y el servicio (que es la acción principal de la empresa).

¿Por qué estos atributos son importantes?

tipoPlaga y areaMetrosCuadrados permiten calcular el costo total.

completado permite hacer seguimiento al estado de los servicios.

serviciosSolicitados sirve para determinar la fidelidad del cliente.

correoContacto y direccion permiten la comunicación y la logística del servicio.

¿Por qué estos métodos son necesarios?

calcularCostoTotal() automatiza la estimación de precios.

registrarServicio() facilita el conteo y seguimiento de clientes activos.

esClienteFrecuente() permite aplicar descuentos o promociones automáticas.

mostrarInformacion() es útil para generar reportes o comprobantes del servicio.

5. Comparación: POO vs Programación Estructurada

Sin POO (Estructurado):
Tendríamos que manejar muchas variables globales (cliente1_nombre, servicio1_area, etc.) y funciones sueltas para cada acción, lo que generaría confusión, duplicación de código y dificultad para mantener el sistema.

Con POO:
Podemos agrupar los datos y comportamientos relacionados en clases. Esto mejora la organización, permite reutilizar código, facilita la expansión del sistema (nuevos tipos de servicios, nuevos clientes) y hace que el mantenimiento sea más sencillo.

Ventajas específicas en mi dominio:

Cada servicio y cliente tiene su propio comportamiento encapsulado.

Es posible registrar y controlar varios servicios de forma ordenada.

Permite añadir más funcionalidades fácilmente (por ejemplo, facturación, historial de plagas o control de materiales usados).

6. Diagrama de Clases (EcoFumigaciones)

         +--------------------------+
         |     ClienteFumigacion    |
         +--------------------------+
         | - nitCliente: String     |
         | - nombreCliente: String  |
         | - direccion: String      |
         | - correoContacto: String |
         | - serviciosSolicitados: int |
         +--------------------------+
         | + mostrarInformacion()   |
         | + registrarServicio()    |
         | + esClienteFrecuente(): boolean |
         | + getNombreCliente(): String   |
         +--------------------------+
                    1
                    |
                    | tiene varios
                    |
                    ▼
         +--------------------------+
         |    ServicioFumigacion    |
         +--------------------------+
         | - codigoServicio: String |
         | - tipoPlaga: String      |
         | - cliente: String        |
         | - areaMetrosCuadrados: double |
         | - costoPorMetro: double  |
         | - completado: boolean    |
         +--------------------------+
         | + mostrarInformacion()   |
         | + calcularCostoTotal(): double |
         | + getCodigoServicio(): String  |
         | + setCompletado(boolean)       |
         +--------------------------+
