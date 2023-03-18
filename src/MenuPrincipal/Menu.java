package MenuPrincipal;

import javax.swing.*;

public class Menu {
	public static void main(String[] args) {

		Conversor.SeleccionDeConversion conversion = new Conversor.SeleccionDeConversion();
		boolean seguir = true;
		while (seguir) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Monedas" }, "Elegir").toString();

			switch (opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");

				if (Validador(input)) {

					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Continuar");
					} else {
						seguir = false;
						JOptionPane.showMessageDialog(null, "Programa finalizado");

					}
				}

			}
		}

	}

	public static boolean Validador(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x > 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ocurrio un error " + ex);
			return false;
		}

	}
}
