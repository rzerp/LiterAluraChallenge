package com.mixidev.literalurachallenge.principal;

public class MostrarTerm {

    public void menu() {
        String menu = """
                \n
                ==============================================
                Bienvenido al librero (LiterAluraChallenge)
                1. Buscar libro por título
                2. Listar libros registrados
                3. Listar autores registrados
                4. Listar autores vivos año
                5. Listar libros por idioma
                6. Ver estadísticas
                7. Top 10 libros mas descargados
                8. Buscar autor por nombre
                9. Salir
                ===============================================
                Elige una opción (1 - 9):
                """;
        System.out.println(menu);
    }

    public void menuIdioma(){
        String msjIdioma = """
                ______________________
                Idiomas
                  -en  (Inglés)
                  -es  (Español)
                  -fr  (Francés)
                  -de  (Alemán)
                  -it  (Italiano)
                  -pt  (Portugués)
                  -ja  (Japonés)
                __________________________
                """;
        System.out.println(msjIdioma);
    }
}
