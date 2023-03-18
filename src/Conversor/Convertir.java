package Conversor;

import javax.swing.JOptionPane;

public class Convertir {
	
	public void ConvertirPesosArgentinoDolares(double valor) {
		double monedaDolar = valor / 201.23;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirPesosArgentinoEuros(double valor) {
		double monedaEuro = valor / 216.93;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesosArgentinoLibra(double valor) {
		double monedaLibra = valor / 245.14;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesosArgentinoYen(double valor) {
		double monedaYen = valor / 1.53;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	public void ConvertirPesosArgentinoWon(double valor) {
		double monedaWon = valor / 0.15;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	
	
	public void ConvertirDolaresPesosArgentino(double valor) {
		double monedaDolar = 201.23 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	public void ConvertirEurosPesosArgentino(double valor) {
		double monedaEuro = valor * 216.93;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
	}
	public void ConvertirLibraPesosArgentino(double valor) {
		double monedaLibra = valor * 245.14;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}
	public void ConvertirYenPesosArgentino(double valor) {
		double monedaYen = valor * 1.53;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
	}
	public void ConvertirWonPesosArgentino(double valor) {
		double monedaWon = valor * 0.15;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sur-coreano " + monedaWon + " en pesos");
	}

}