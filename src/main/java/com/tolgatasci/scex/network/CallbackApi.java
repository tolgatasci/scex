package com.tolgatasci.scex.network;

import com.tolgatasci.scex.model.response.SearchResponse;
import com.tolgatasci.scex.model.response.TrackItem;
import com.tolgatasci.scex.model.response.seach.ResponseAlbum;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public interface CallbackApi<T> extends Callback<T> {
    void onResponse(Call<T> call, Response<T> response);
    void onFailure(Call<T> call, Throwable t);

    public interface ResData<T> {
        void data(T response);
    }
}
