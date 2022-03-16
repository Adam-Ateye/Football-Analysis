package footballAnalysis.domain;

public class Player {
	
	private String name;
	private int apps;
	private float mins;
	private String pos;
	
	public Player(String name, int apps, float mins, String pos) {
		super();
		this.name = name;
		this.apps = apps;
		this.mins = mins;
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getApps() {
		return apps;
	}

	public void setApps(int apps) {
		this.apps = apps;
	}

	public float getMins() {
		return mins;
	}

	public void setMins(float mins) {
		this.mins = mins;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apps;
		result = prime * result + Float.floatToIntBits(mins);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pos == null) ? 0 : pos.hashCode());
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
		Player other = (Player) obj;
		if (apps != other.apps)
			return false;
		if (Float.floatToIntBits(mins) != Float.floatToIntBits(other.mins))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", apps=" + apps + ", mins=" + mins + ", pos=" + pos + "]";
	}
	

}
