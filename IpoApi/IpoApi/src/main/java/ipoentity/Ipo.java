package ipoentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name="ipo")

public class Ipo {
	
	@Column
	private long ipoID;
	
	@Column
	private String companyName;
	
	@Column
	private String stockExchange;
	
	@Column
	private long numberOfShares;
	
	@Column
	private String openDateTime;
	
	@Column
	private String remarks;

	public long getiD() {
		return ipoID;
	}

	public void setiD(long ipoID) {
		this.ipoID = ipoID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public long getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(long numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public String getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Ipo [iD=" + ipoID + ", companyName=" + companyName + ", stockExchange=" + stockExchange
				+ ", numberOfShares=" + numberOfShares + ", openDateTime=" + openDateTime + ", remarks=" + remarks
				+ "]";
	}
	
	
}
