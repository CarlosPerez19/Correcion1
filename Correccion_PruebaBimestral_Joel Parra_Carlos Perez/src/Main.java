public class Main {
    public static void main(String[] args) {

        // Tarea: Correcion_PruebaBimestral_Joel Parra_Carlos Perez
        // Creacion de instancias de Hoteles

        Hoteles hoteles_1 = new Hoteles();
        Hoteles hoteles_2 = new Hoteles();
        Hoteles hoteles_3 = new Hoteles();
        Hoteles hoteles_4 = new Hoteles();
        Hoteles hoteles_5 = new Hoteles();
        Hoteles hoteles_6 = new Hoteles();
        Hoteles hoteles_7 = new Hoteles();
        Hoteles hoteles_11 = new Hoteles();

        hoteles_1.getNombreHotel();
        hoteles_1.getUbicacion_hotel();
        hoteles_1.getNum_estrellas_hotel();
        hoteles_1.getReseñas();
        hoteles_1.getNumero_habitaciones();

        hoteles_1.setNombreHotel("Andalucia");
        hoteles_1.setUbicacion_hotel("Quito");
        hoteles_1.setNum_estrellas_hotel(5);
        hoteles_1.setReseñas("Buen servicio");
        hoteles_1.setNumero_habitaciones(500);

        hoteles_2.getNombreHotel();
        hoteles_2.getUbicacion_hotel();
        hoteles_2.getNum_estrellas_hotel();
        hoteles_2.getReseñas();
        hoteles_2.getNumero_habitaciones();

        hoteles_2.setNombreHotel("Lilith");
        hoteles_2.setUbicacion_hotel("Japon");
        hoteles_2.setNum_estrellas_hotel(5);
        hoteles_2.setReseñas("Excelente servicio");
        hoteles_2.setNumero_habitaciones(550);

        hoteles_3.getNombreHotel();
        hoteles_3.getUbicacion_hotel();
        hoteles_3.getNum_estrellas_hotel();
        hoteles_3.getReseñas();
        hoteles_3.getNumero_habitaciones();

        hoteles_3.setNombreHotel("Manta");
        hoteles_3.setUbicacion_hotel("Guayaquil");
        hoteles_3.setNum_estrellas_hotel(4);
        hoteles_3.setReseñas("Organizado");
        hoteles_3.setNumero_habitaciones(150);

        hoteles_4.getNombreHotel();
        hoteles_4.getUbicacion_hotel();
        hoteles_4.getNum_estrellas_hotel();
        hoteles_4.getReseñas();
        hoteles_4.getNumero_habitaciones();

        hoteles_4.setNombreHotel("Carson");
        hoteles_4.setUbicacion_hotel("España");
        hoteles_4.setNum_estrellas_hotel(3);
        hoteles_4.setReseñas("Personal amable");
        hoteles_4.setNumero_habitaciones(250);

        hoteles_5.getNombreHotel();
        hoteles_5.getUbicacion_hotel();
        hoteles_5.getNum_estrellas_hotel();
        hoteles_5.getReseñas();
        hoteles_5.getNumero_habitaciones();

        hoteles_5.setNombreHotel("Bella Vista");
        hoteles_5.setUbicacion_hotel("Manta");
        hoteles_5.setNum_estrellas_hotel(4);
        hoteles_5.setReseñas("Hotel limpio");
        hoteles_5.setNumero_habitaciones(150);

        // Hoteles Nulos Y posterior seteo de valores

        hoteles_6.getNombreHotel();
        hoteles_6.getUbicacion_hotel();
        hoteles_6.getNum_estrellas_hotel();
        hoteles_6.getReseñas();
        hoteles_6.getNumero_habitaciones();

        hoteles_6.ImprimirDatosHoteles();

        hoteles_6.setNombreHotel("Cuarson");
        hoteles_6.setUbicacion_hotel("Brasil");
        hoteles_6.setNum_estrellas_hotel(3);
        hoteles_6.setReseñas("Falta Personal");
        hoteles_6.setNumero_habitaciones(250);


        hoteles_7.getNombreHotel();
        hoteles_7.getUbicacion_hotel();
        hoteles_7.getNum_estrellas_hotel();
        hoteles_7.getReseñas();
        hoteles_7.getNumero_habitaciones();

        hoteles_7.ImprimirDatosHoteles();

        hoteles_7.setNombreHotel("Bellion");
        hoteles_7.setUbicacion_hotel("Costa Rica");
        hoteles_7.setNum_estrellas_hotel(3);
        hoteles_7.setReseñas("Habitaciones pequeñas");
        hoteles_7.setNumero_habitaciones(250);

        // Nuevo Hotel
        hoteles_11.getNombreHotel();
        hoteles_11.getUbicacion_hotel();
        hoteles_11.getNum_estrellas_hotel();
        hoteles_11.getReseñas();
        hoteles_11.getNumero_habitaciones();

        hoteles_11.ImprimirDatosHoteles();

        hoteles_11.setNombreHotel("Emperador");
        hoteles_11.setUbicacion_hotel("Ecuador");
        hoteles_11.setNum_estrellas_hotel(3);
        hoteles_11.setReseñas("Habitaciones pequeñas");
        hoteles_11.setNumero_habitaciones(20);


        // Se mostraran todos los objetos con sus repectivos valores

        hoteles_1.ImprimirDatosHoteles();
        hoteles_2.ImprimirDatosHoteles();
        hoteles_3.ImprimirDatosHoteles();
        hoteles_4.ImprimirDatosHoteles();
        hoteles_5.ImprimirDatosHoteles();
        hoteles_6.ImprimirDatosHoteles();
        hoteles_7.ImprimirDatosHoteles();
        hoteles_11.ImprimirDatosHoteles();

        // Llamada a la funcion que modificara los valores del hotel
        hoteles_7.ModificarDatosHoteles();

        // Hoteles con valores nulos que seran seteados

        Hoteles hoteles_8 = new Hoteles();
        hoteles_8.ImprimirDatosHoteles();

        Hoteles hoteles_9 = new Hoteles();
        hoteles_9.ImprimirDatosHoteles();

        Hoteles hoteles_10 = new Hoteles();
        hoteles_10.ImprimirDatosHoteles();

        // Hoteles con valores nulos
        hoteles_8.HotelesNull();
        hoteles_9.HotelesNull();
        hoteles_10.HotelesNull();

    }
}