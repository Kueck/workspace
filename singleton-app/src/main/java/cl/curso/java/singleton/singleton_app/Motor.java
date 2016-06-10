package cl.curso.java.singleton.singleton_app;

public class Motor {

	private static Motor _motor;

	private Motor() {
		// TODO Auto-generated constructor stub
	}

	public Motor getInstance() {
		if ( null == this._motor ) {
			this._motor = new Motor();
		}
		return this._motor;
	}

}
