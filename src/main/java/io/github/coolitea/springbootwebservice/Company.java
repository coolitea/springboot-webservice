package io.github.coolitea.springbootwebservice;

public class Company {
	private String krxCode; 
	private String companyName; // 회사명 
    private long openPrice; // 현재가
    private long marketCap; // 시가총액 

    public Company(String krxCode, String companyName, long openPrice, long marketCap) {
        this.krxCode = krxCode;
        this.companyName = companyName;
        this.openPrice = openPrice;
        this.marketCap = marketCap;
    }

    public String getKrxCode() {
        return krxCode;
    }

    public String getCompanyName() {
        return companyName;
    }

	public long getOpenPrice() {
		return openPrice;
	}

	public long getMarketCap() {
		return marketCap;
	}
}
