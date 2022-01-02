
public class Cliente implements Autenticavel {

	private AutenticadorUtilitario autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticadorUtilitario();
	}
	
	@Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
    	return this.autenticador.autentica(senha);
    }
}
