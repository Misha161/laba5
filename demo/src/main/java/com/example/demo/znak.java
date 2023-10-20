package com.example.demo;

public class znak {

    String   client, forma,full_name,id,nomer,organ,short_name,data;
    public String getClient() {
        return client;
    }

    public String getForma() {
        return forma;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getId() {
        return id;
    }

    public String getNomer() {
        return nomer;
    }

    public String getOrgan() {
        return organ;
    }

    public String getShort_name() {
        return short_name;
    }

    public String getData() {
        return data;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public void setData(String data) {
        this.data = data;
    }



    public znak(String client, String forma, String full_name, String id, String nomer, String organ, String short_name,String data) {
        this.client = client;
        this.forma = forma;
        this.full_name = full_name;
        this.id = id;
        this.nomer = nomer;
        this.organ = organ;
        this.short_name = short_name;
        this.data = data;


    }
}
