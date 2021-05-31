package com.learn.portfolioservice.model;

import java.util.List;

public class GetHoldingsResponse {
	
	private List<Holding> hodings;
	private String userId;
	public List<Holding> getHodings() {
		return hodings;
	}
	public void setHodings(List<Holding> hodings) {
		this.hodings = hodings;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hodings == null) ? 0 : hodings.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		GetHoldingsResponse other = (GetHoldingsResponse) obj;
		if (hodings == null) {
			if (other.hodings != null)
				return false;
		} else if (!hodings.equals(other.hodings))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GetHoldingsResponse [hodings=" + hodings + ", userId=" + userId + "]";
	}
	
	
	
	

}
