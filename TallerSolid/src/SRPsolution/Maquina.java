/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRPsolution;

/**
 *
 * @author user
 */
public class Maquina {
    private double energiaRestante; //Valor entre 00.00 y 100.00
	
	public Maquina() {
		this.energiaRestante = 100.00;
	}
	
	public Maquina(double energiaRestante) {
		this.energiaRestante = energiaRestante;
	}
}
