/**
 * 
 */
package com.universe.bluestone.dto;

/**
 * @author Administrator
 *
 */
public class Bank {
	
	private Long id;
	private String name;
	private String originBank;
	private String country;
	private String location;
	private String code;
	private Double netWorth;
	
	//===========================================
	
	public Bank(Long id, String name, String originBank, String country, String location, String code,
			Double netWorth) {
		super();
		this.id = id;
		this.name = name;
		this.originBank = originBank;
		this.country = country;
		this.location = location;
		this.code = code;
		this.netWorth = netWorth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginBank() {
		return originBank;
	}

	public void setOriginBank(String originBank) {
		this.originBank = originBank;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(Double netWorth) {
		this.netWorth = netWorth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((netWorth == null) ? 0 : netWorth.hashCode());
		result = prime * result + ((originBank == null) ? 0 : originBank.hashCode());
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
		Bank other = (Bank) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (netWorth == null) {
			if (other.netWorth != null)
				return false;
		} else if (!netWorth.equals(other.netWorth))
			return false;
		if (originBank == null) {
			if (other.originBank != null)
				return false;
		} else if (!originBank.equals(other.originBank))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", originBank=" + originBank + ", country=" + country
				+ ", location=" + location + ", code=" + code + ", netWorth=" + netWorth + "]";
	}
	

	
	
	

}
