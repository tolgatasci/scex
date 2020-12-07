package com.tolgatasci.scex.network;

import android.util.Log;

import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tolgatasci.scex.Config;
import com.tolgatasci.scex.YTex;
import com.tolgatasci.scex.model.response.Playlist;
import com.tolgatasci.scex.model.response.ResponseMp3;
import com.tolgatasci.scex.model.response.SearchResponse;
import com.tolgatasci.scex.model.response.TrackItem;
import com.tolgatasci.scex.model.response.query.ResponseQuery;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    public CallbackApi cb_api;
    public Face gerritAPI;
    public Api(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if(Config.DEBUG)
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        ClearableCookieJar cookieJar =
                new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(YTex.con));

        OkHttpClient client = new OkHttpClient.Builder()

                .addInterceptor(interceptor)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();

                        if(!request.url().equals("client_id")){
                            HttpUrl url = request.url().newBuilder().addQueryParameter("client_id",Config.CLIENT_ID).build();
                            request = request.newBuilder().url(url).build();
                        }
                        if(Config.SC_A_ID != null){
                            if(!request.url().equals("user_id")){
                                HttpUrl url = request.url().newBuilder().addQueryParameter("sc_a_id",Config.SC_A_ID).build();
                                request = request.newBuilder().url(url).build();
                            }
                        }

                        if(Config.DEBUG)
                            Log.e(Config.DEBUG_TAG,request.url().toString());
                        return chain.proceed(request);
                    }
                })
                .cookieJar(cookieJar)
                .build();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        gerritAPI = retrofit.create(Face.class);
    }
    public void get_tracks(String ids,CallbackApi callbackApi) {
        Call<List<TrackItem>> call = gerritAPI.getTracks(ids,30);
        call.enqueue(callbackApi);
    }
    public void get_mp3(String url,CallbackApi callbackApi) {
        Call<ResponseMp3> call = gerritAPI.getMp3(url);
        call.enqueue(callbackApi);
    }
    public void get_suggest(String query,CallbackApi callbackApi) {
        Call<ResponseQuery> call = gerritAPI.getSuggest(query,10);
        call.enqueue(callbackApi);
    }
    public void get_playlist(int id,CallbackApi callbackApi) {
        Call<Playlist> call = gerritAPI.getPlaylist(id,30);
        call.enqueue(callbackApi);
    }
    /* Playlist More */
    public void get_playlist_more(String url,CallbackApi callbackApi) {
        Call<Playlist> call =  gerritAPI.getMorePlaylist(url);
        call.enqueue(callbackApi);
    }
    public void get_user(int id,CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getUser(id,30);
        call.enqueue(callbackApi);
    }
    /* Search More */
    public void get_search_more(String url, CallbackApi callbackApi) {
        Call<SearchResponse> call =  (Call<SearchResponse>) gerritAPI.getMore(url);
        call.enqueue(callbackApi);
    }
    public void get_comments(int id, CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getComments(id,30);
        call.enqueue(callbackApi);
    }
    public void get_search(String query, CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getSearch(query,30);
        call.enqueue(callbackApi);
    }
    public void get_search_tracks(String query,CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getSearchTracks(query,30);
        call.enqueue(callbackApi);
    }
    public void get_search_albums(String query,CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getSearchAlbums(query,30);
        call.enqueue(callbackApi);
    }
    public void get_search_users(String query,CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getSearchUsers(query,30);
        call.enqueue(callbackApi);
    }
    public void get_search_playlist(String query,CallbackApi callbackApi) {
        Call<SearchResponse> call = gerritAPI.getSearchPlaylist(query,30);
        call.enqueue(callbackApi);
    }


}
