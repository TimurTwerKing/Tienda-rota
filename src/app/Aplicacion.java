/**
 * 
 */
package app;

import leer.Leer;
import menu.Menu;

/**
 * @author Timur Bogach
 * @date 11 feb 2024
 * 
 * @param Clase Aplicacion: Clase principal que gestiona la aplicación y
 *              orquesta otras clases.
 */

public class Aplicacion {

	public static void main(String[] args) {

		Menu.Mensaje_Inicial();

		boolean continuar = true;

		do {

			Menu.Opciones_Menu();

			switch (Leer.datoInt()) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			default:
				continuar = false;
			}

		} while (continuar);

		Menu.Mensaje_Fin();

	}

}