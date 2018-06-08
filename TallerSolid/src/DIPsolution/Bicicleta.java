/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIPsolution;

/**
 *
 * @author Alex Macas
 */
public class Bicicleta implements Movimientos {
    private LlantaParaBicicleta llanta1;
    private LlantaParaBicicleta llanta2;
    private AsientoParaBicicleta asiento;
	
    public Bicicleta( LlantaParaBicicleta llanta1, LlantaParaBicicleta llanta2,AsientoParaBicicleta asiento) {
        this.llanta1 = llanta1;
        this.llanta2 = llanta2;
        this.asiento = asiento;
    }

    @Override
    public void girarIzquierda() {
        llanta1.girarIzquierda();
    }

    @Override
    public void girarDerecha() {
        llanta2.girarDerecha();
    }
}
