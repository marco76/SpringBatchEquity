package ch.genidea.otr.importer.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * This class represent the company record that can be downloaded from nasdaq.com
 */

@Entity(name = "equities")
public class Equity implements Serializable{

    @Id
    @Column
    private String symbol;

    @Column
    private String name;

    private String lastSale;
    private String marketCap;
    private String adrTso;

    @Column
    private String ipoYear;


    @Column
    private String sector;

    @Column
    private String industry;

    @Column
    private String summaryQuote;

    @Column
    private Boolean optionsFound;

    @Column
    private Boolean excludedFromShowing = Boolean.FALSE;

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


    public Boolean isOptionsFound() {
        return optionsFound;
    }

    public void setOptionsFound(Boolean optionsFound) {
        this.optionsFound = optionsFound;
    }

    public Boolean getOptionsFound() {
        return optionsFound;
    }

    public Boolean getExcludedFromShowing() {
        return excludedFromShowing;
    }

    public void setExcludedFromShowing(Boolean excludedFromShowing) {
        this.excludedFromShowing = excludedFromShowing;
    }
}
