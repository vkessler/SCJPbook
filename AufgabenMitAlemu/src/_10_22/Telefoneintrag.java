package _10_22;

public class Telefoneintrag implements Comparable<Telefoneintrag> {
	private String name;
	private String nummer;
	private int age;
	/**
	 * @param name
	 * @param nummer
	 */
	public Telefoneintrag(String name, String nummer) {
		super();
		this.name = name;
		this.nummer = nummer;
	}
	/**
	 * @return the name
	 */
	public  String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public  void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the nummer
	 */
	public  String getNummer() {
		return nummer;
	}
	/**
	 * @param nummer the nummer to set
	 */
	public  void setNummer(String nummer) {
		this.nummer = nummer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[name=" + name + ", nummer=" + nummer + "]" + "\n";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nummer == null) ? 0 : nummer.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefoneintrag other = (Telefoneintrag) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nummer == null) {
			if (other.nummer != null)
				return false;
		} else if (!nummer.equals(other.nummer))
			return false;
		return true;
	}
	
	@Override
	//return 0;// - 0 +
	public int compareTo(Telefoneintrag o) {
		//		if(this.age == o.age) return 0;
		//		if(this.age < o.age) return -1;
		//		return 1;
	return	this.getName().compareTo(o.getName());
	
	}
	

}
