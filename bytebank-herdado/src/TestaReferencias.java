
public class TestaReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente( );
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		

		EditorVideo ev = new EditorVideo( );
		ev.setSalario(2500.0);
		
		Design d = new Design( );
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		System.out.println(controle.getSoma( ));
		
		
		

	}

}