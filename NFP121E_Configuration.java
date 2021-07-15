package NFP121E;

public class Configuration {
	public double getAlpha() {
		return alpha;
	}

	private Character access;
	private String description;
	private String value;

	private double alpha = 0.85;
	private double epsilon = -1.0;
	private int indice = 150;
	private Mode mode = Mode.CREUSE;

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getEpsilon() {
		return epsilon;
	}

	public void setEpsilon(double epsilon) {
		this.epsilon = epsilon;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + indice + ", mode=" + mode;
	}
}
