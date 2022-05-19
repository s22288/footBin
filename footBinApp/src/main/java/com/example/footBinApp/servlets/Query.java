package com.example.footBinApp.servlets;

public class Query {
    private String unknown;
    private String querystring;

    public Query() {
    }

    public Query(String unknown, String querystring) {
        this.unknown = unknown;
        this.querystring = querystring;
    }



    public String getUnknown() {
        return unknown;
    }

    public void setUnknown(String unknown) {
        this.unknown = unknown;
    }

    public String getQuerystring() {
        return querystring;
    }

    public void setQuerystring(String querystring) {
        this.querystring = querystring;
    }

    @Override
    public String toString() {
        return "Query{" +
                "unknown='" + unknown + '\'' +
                ", querystring='" + querystring + '\'' +
                '}';
    }
}
