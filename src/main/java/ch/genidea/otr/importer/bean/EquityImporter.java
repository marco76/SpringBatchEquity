package ch.genidea.otr.importer.bean;


/**
 * This class represent the company record that can be downloaded from nasdaq.com
 */

public class EquityImporter {
    private String symbol;
    private String name;
    private String lastSale;
    private String marketCap;
    private String adrTso;
    private String ipoYear;
    private String sector;
    private String industry;
    private String summaryQuote;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastSale() {
        return lastSale;
    }

    public void setLastSale(String lastSale) {
        this.lastSale = lastSale;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getAdrTso() {
        return adrTso;
    }

    public void setAdrTso(String adrTso) {
        this.adrTso = adrTso;
    }

    public String getIpoYear() {
        return ipoYear;
    }

    public void setIpoYear(String ipoYear) {
        this.ipoYear = ipoYear;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSummaryQuote() {
        return summaryQuote;
    }

    public void setSummaryQuote(String summaryQuote) {
        this.summaryQuote = summaryQuote;
    }
}
