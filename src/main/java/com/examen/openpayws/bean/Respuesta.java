package com.examen.openpayws.bean;

import jakarta.persistence.*;

@Entity(name = "respuesta")
public class Respuesta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String code;
    @Column
    private String status;
    @Column
    private String copyright;
    @Column
    private String attributionText;
    @Column
    private String attributionHTML;
    //@OneToOne
    //private Data data;
    @Column
    private String etag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }
/*
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
*/
public String getEtag() {
        return etag;
    }
   public void setEtag(String etag) {
        this.etag = etag;
    }
}
