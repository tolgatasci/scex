
package com.tolgatasci.scex.model.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SearchResponse {

    @SerializedName("collection")
    private List<Collection> mCollection;
    @SerializedName("facets")
    private List<Facet> mFacets;
    @SerializedName("next_href")
    private String mNextHref;
    @SerializedName("query_urn")
    private String mQueryUrn;
    @SerializedName("total_results")
    private Long mTotalResults;

    public List<Collection> getCollection() {
        return mCollection;
    }

    public void setCollection(List<Collection> collection) {
        mCollection = collection;
    }

    public List<Facet> getFacets() {
        return mFacets;
    }

    public void setFacets(List<Facet> facets) {
        mFacets = facets;
    }

    public String getNextHref() {
        return mNextHref;
    }

    public void setNextHref(String nextHref) {
        mNextHref = nextHref;
    }

    public String getQueryUrn() {
        return mQueryUrn;
    }

    public void setQueryUrn(String queryUrn) {
        mQueryUrn = queryUrn;
    }

    public Long getTotalResults() {
        return mTotalResults;
    }

    public void setTotalResults(Long totalResults) {
        mTotalResults = totalResults;
    }

}
