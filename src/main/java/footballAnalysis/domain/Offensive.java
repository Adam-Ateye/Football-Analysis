package footballAnalysis.domain;

public class Offensive {
	
	private int goals;
	private int assists;
	private float spg;
	private float keyP;
	
	public Offensive(int goals, int assists, float spg, float keyP) {
		super();
		this.goals = goals;
		this.assists = assists;
		this.spg = spg;
		this.keyP = keyP;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public float getSpg() {
		return spg;
	}

	public void setSpg(float spg) {
		this.spg = spg;
	}

	public float getKeyP() {
		return keyP;
	}

	public void setKeyP(float keyP) {
		this.keyP = keyP;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assists;
		result = prime * result + goals;
		result = prime * result + Float.floatToIntBits(keyP);
		result = prime * result + Float.floatToIntBits(spg);
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
		Offensive other = (Offensive) obj;
		if (assists != other.assists)
			return false;
		if (goals != other.goals)
			return false;
		if (Float.floatToIntBits(keyP) != Float.floatToIntBits(other.keyP))
			return false;
		if (Float.floatToIntBits(spg) != Float.floatToIntBits(other.spg))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Offensive [goals=" + goals + ", assists=" + assists + ", spg=" + spg + ", keyP=" + keyP + "]";
	}
	
	
	
	

}
