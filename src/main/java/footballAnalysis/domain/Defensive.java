package footballAnalysis.domain;

public class Defensive {
	
	private float tackles;
	private float interceptions;
	private float fouls;
	private float clearances;
	
	public Defensive(float tackles, float interceptions, float fouls, float clearances) {
		super();
		this.tackles = tackles;
		this.interceptions = interceptions;
		this.fouls = fouls;
		this.clearances = clearances;
	}

	public float getTackles() {
		return tackles;
	}

	public void setTackles(float tackles) {
		this.tackles = tackles;
	}

	public float getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(float interceptions) {
		this.interceptions = interceptions;
	}

	public float getFouls() {
		return fouls;
	}

	public void setFouls(float fouls) {
		this.fouls = fouls;
	}

	public float getClearances() {
		return clearances;
	}

	public void setClearances(float clearances) {
		this.clearances = clearances;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(clearances);
		result = prime * result + Float.floatToIntBits(fouls);
		result = prime * result + Float.floatToIntBits(interceptions);
		result = prime * result + Float.floatToIntBits(tackles);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Defensive other = (Defensive) obj;
		if (Float.floatToIntBits(clearances) != Float.floatToIntBits(other.clearances))
			return false;
		if (Float.floatToIntBits(fouls) != Float.floatToIntBits(other.fouls))
			return false;
		if (Float.floatToIntBits(interceptions) != Float.floatToIntBits(other.interceptions))
			return false;
		if (Float.floatToIntBits(tackles) != Float.floatToIntBits(other.tackles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Defensive [tackles=" + tackles + ", interceptions=" + interceptions + ", fouls=" + fouls
				+ ", clearances=" + clearances + "]";
	}
	

}
