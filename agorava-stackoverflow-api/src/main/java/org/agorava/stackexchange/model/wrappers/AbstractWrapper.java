package org.agorava.stackexchange.model.wrappers;

import java.util.LinkedList;
import java.util.List;

@javax.annotation.Generated(date = "2012-07-28T10:40:41.612+02:00", comments = "generated by http://jsongen.byingtondesign.com/", value = {"https://api.stackexchange.com/2.0/info?site=stackoverflow"})
public abstract class AbstractWrapper<WrappedData> {

    private int backoff;
    private boolean has_more;
    private List<WrappedData> items = new LinkedList<WrappedData>();
    private int quota_max;
    private int quota_remaining;
    private int error_id;
    private int error_message;
    private String error_name;
    private int page;
    private int page_size;
    private int total;
    private int type;

    public boolean getHas_more() {
        return this.has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public List<WrappedData> getItems() {
        return this.items;
    }

    public void setItems(List<WrappedData> items) {
        this.items = items;
    }

    public Number getQuota_max() {
        return this.quota_max;
    }

    public void setQuota_max(Number quota_max) {
        this.quota_max = quota_max.intValue();
    }

    public Number getQuota_remaining() {
        return this.quota_remaining;
    }

    public void setQuota_remaining(Number quota_remaining) {
        this.quota_remaining = quota_remaining.intValue();
    }

    public Number getBackoff() {
        return backoff;
    }

    public void setBackoff(Number backoff) {
        this.backoff = backoff.intValue();
    }

    public int getError_id() {
        return error_id;
    }

    public void setError_id(int error_id) {
        this.error_id = error_id;
    }

    public String getError_name() {
        return error_name;
    }

    public void setError_name(String error_name) {
        this.error_name = error_name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getError_message() {
        return error_message;
    }

    public void setError_message(int error_message) {
        this.error_message = error_message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
