package com.learn.portfolioservice.model;

public class Holding {
	
	private String uesrId;
	private String ticker;
	private int numberOfShares;
	public String getUesrId() {
		return uesrId;
	}
	public void setUesrId(String uesrId) {
		this.uesrId = uesrId;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	@Override
	public String toString() {
		return "Holding [uesrId=" + uesrId + ", ticker=" + ticker + ", numberOfShares=" + numberOfShares + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfShares;
		result = prime * result + ((ticker == null) ? 0 : ticker.hashCode());
		result = prime * result + ((uesrId == null) ? 0 : uesrId.hashCode());
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
		Holding other = (Holding) obj;
		if (numberOfShares != other.numberOfShares)
			return false;
		if (ticker == null) {
			if (other.ticker != null)
				return false;
		} else if (!ticker.equals(other.ticker))
			return false;
		if (uesrId == null) {
			if (other.uesrId != null)
				return false;
		} else if (!uesrId.equals(other.uesrId))
			return false;
		return true;
	}
	
	
	
}
