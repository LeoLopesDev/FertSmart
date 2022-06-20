package br.com.fertsmart.entities;

import java.time.LocalDateTime;

public class Recomendation {

    private Long id;
    private LocalDateTime date;
    private String culture;
    private Double expectedProductivity;
    private Double clayContent;
    private String methodology;
    private Long userId;

    public Recomendation(){
    }

    public Recomendation(Long id, LocalDateTime date, String culture, Double expectedProductivity, Double clayContent, String methodology, Long userId) {
        this.id = id;
        this.date = date;
        this.culture = culture;
        this.expectedProductivity = expectedProductivity;
        this.clayContent = clayContent;
        this.methodology = methodology;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public Double getExpectedProductivity() {
        return expectedProductivity;
    }

    public void setExpectedProductivity(Double expectedProductivity) {
        this.expectedProductivity = expectedProductivity;
    }

    public Double getClayContent() {
        return clayContent;
    }

    public void setClayContent(Double clayContent) {
        this.clayContent = clayContent;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
