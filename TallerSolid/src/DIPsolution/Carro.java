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
public class Carro implements Movimientos {
    private LlantaParaCarro llanta1;
	private LlantaParaCarro llanta2;
	private LlantaParaCarro llanta3;
	private LlantaParaCarro llanta4;
	private AsientoParaCarro asiento1;
	private AsientoParaCarro asiento2;
	
    public Carro(LlantaParaCarro llanta1,LlantaParaCarro llanta2,LlantaParaCarro llanta3,LlantaParaCarro llanta4,AsientoParaCarro asiento1,AsientoParaCarro asiento2) {
        this.llanta1 = llanta1;
        this.llanta2 = llanta2;
        this.llanta3 = llanta3;
        this.llanta4 = llanta4;
        this.asiento1 = asiento1;
        this.asiento2 = asiento2;
		
    }
    @Override
    public void girarIzquierda() {
        llanta1.girarIzquierda();
        llanta2.girarIzquierda();
    }

    @Override
    public void girarDerecha() {
        llanta1.girarDerecha();
        llanta2.girarDerecha();
    }

}
