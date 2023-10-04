public class SistemaIBGE {

	public static void main(String[] args) {
		
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   //System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
		
        System.out.println(ufSelecionado.getSigla());
		System.out.println(ufSelecionado.getNome());
        System.out.println(ufSelecionado.getNomeMaiusculo());
        System.out.println(ufSelecionado.getIbge());
	}
}