package dia7_videojuegos;

import java.util.ArrayList;
import java.util.List;

public class DIA7_VideoJuegos {

    public static void main(String[] args) {
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        listaVideoJuegos.add(new VideoJuego("001", "Super Mario 64", "Nintendo 64", 1, "Plataforma"));
        listaVideoJuegos.add(new VideoJuego("002", "The Legend of Zelda: Ocarina of Time", "Nintendo 64", 1, "Aventura"));
        listaVideoJuegos.add(new VideoJuego("003", "God of War", "PlayStation 4", 1, "Acción"));
        listaVideoJuegos.add(new VideoJuego("004", "FIFA 23", "PlayStation 5", 2, "Deportes"));
        listaVideoJuegos.add(new VideoJuego("005", "Halo Infinite", "Xbox Series X", 2, "FPS"));
// Mostrar todos los videojuegos
        System.out.println("🎮 Lista de Videojuegos:");
        for (VideoJuego lista : listaVideoJuegos) {
            lista.datosVideoJuego();
        }

        // Modificar el nombre y la cantidad de jugadores de dos videojuegos
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        listaVideoJuegos.get(2).setTitulo("God of War: Ragnarok");
        listaVideoJuegos.get(2).setCantidadJugadores(1);

        listaVideoJuegos.get(4).setTitulo("Halo Infinite Multiplayer");
        listaVideoJuegos.get(4).setCantidadJugadores(4);
        // Mostrar los videojuegos después del cambio
        System.out.println("🔄 Lista después de las modificaciones:");
        for (VideoJuego lista : listaVideoJuegos) {
            lista.datosVideoJuego();
        }
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        // Filtrar y mostrar videojuegos de "Nintendo 64"
        System.out.println("🎮 Videojuegos de Nintendo 64:");
        for (VideoJuego lista : listaVideoJuegos) {
            if (lista.getConsola().equalsIgnoreCase("Nintendo 64")) {
                lista.datosVideoJuego();

            }
        }

    }

}
