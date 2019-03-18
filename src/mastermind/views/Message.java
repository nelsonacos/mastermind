package mastermind.views;

enum Message {
	TURN("#turn intento(s): "),
	SECRET("*"),
	RESUME("�Deseas continuar?"),
	SAVE("�Quieres guardar la partida?"),
	NAME("Nombre: "),
	RESULT(" --> #blacks negros y #whites blancos"),
	PROPOSED_COMBINATION("Prop�n una combinaci�n: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("Victoria!!! ;-)"),
	LOOSER("Has agotado nuestra paciencia!!! :-(");

	private String message;
	
	private Message(String message) {
		this.message = message;
	}
	
	String getMessage() {
		return this.message;
	}

}
