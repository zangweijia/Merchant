package com.bopinjia.merchant.Bean;

/**
 * Created by Administrator on 2016/12/14 0014.
 */

public class ProductBaseBean {

    public String getP_salenumber() {
        return p_salenumber;
    }

    public void setP_salenumber(String p_salenumber) {
        this.p_salenumber = p_salenumber;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_sale_price() {
        return p_sale_price;
    }

    public void setP_sale_price(String p_sale_price) {
        this.p_sale_price = p_sale_price;
    }

    public String getP_market_price() {
        return p_market_price;
    }

    public void setP_market_price(String p_market_price) {
        this.p_market_price = p_market_price;
    }

    public String getP_thumbnails() {
        return p_thumbnails;
    }

    public void setP_thumbnails(String p_thumbnails) {
        this.p_thumbnails = p_thumbnails;
    }

    private String p_name;
    private String p_salenumber;
    private String p_sale_price;
    private String p_market_price;
    private String p_thumbnails;


}
