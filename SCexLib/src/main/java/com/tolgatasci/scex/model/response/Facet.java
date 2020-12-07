
package com.tolgatasci.scex.model.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Facet {

    @SerializedName("count")
    private Long mCount;
    @SerializedName("facets")
    private List<Facet> mFacets;
    @SerializedName("filter")
    private String mFilter;
    @SerializedName("name")
    private String mName;
    @SerializedName("value")
    private String mValue;

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public List<Facet> getFacets() {
        return mFacets;
    }

    public void setFacets(List<Facet> facets) {
        mFacets = facets;
    }

    public String getFilter() {
        return mFilter;
    }

    public void setFilter(String filter) {
        mFilter = filter;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
