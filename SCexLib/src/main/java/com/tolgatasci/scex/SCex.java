package com.tolgatasci.scex;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.tolgatasci.scex.model.response.Playlist;
import com.tolgatasci.scex.model.response.ResponseDoc;
import com.tolgatasci.scex.model.response.SearchResponse;
import com.tolgatasci.scex.model.response.TrackItem;
import com.tolgatasci.scex.model.response.query.ResponseQuery;
import com.tolgatasci.scex.network.Api;
import com.tolgatasci.scex.network.CallbackApi;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class SCex {
    private Gson gson;
    public static Context con;
    public Api api;
    public SCex(Context contextx){
       con = contextx;
       api = new Api();
    }
    public SCex(Context contextx, String client_id){
        con = contextx;
        Config.CLIENT_ID = client_id;
        api = new Api();
    }
    public SCex(Context contextx, String client_id, String sc_a_id){
        con = contextx;
        Config.CLIENT_ID = client_id;
        Config.SC_A_ID   = sc_a_id;
        api = new Api();
    }
    /**
     *  Url add Query params
     *
     * @param  url  SoundCloud url
     * @return     url String
     */
    public String add_client_id(String url) throws  URISyntaxException {
        URI  tmp_url = new URI(url);
        String get_url =  new URI(tmp_url.getScheme(), tmp_url.getAuthority(), tmp_url.getPath(),
                tmp_url.getQuery() == null ? "client_id="+ Config.CLIENT_ID : tmp_url.getQuery() + "&" + "client_id="+ Config.CLIENT_ID, tmp_url.getFragment()).toString();
        return get_url;
    }
    /**
     *  Get Mp3
     *
     * @param  url  mp3 url
     * @param  callbackApi  new CallbackApi.ResData<ResponseDoc>(){}
     * @return      NULL because return callback
     */
    public String FileGet(String url , CallbackApi.ResData callbackApi){
        api.get_doc(url,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                ResponseDoc doc = (ResponseDoc) response.body();
                callbackApi.data(doc);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Get Suggest
     *
     * @param  query  Sample tark
     * @param  callbackApi  new CallbackApi.ResData<ResponseQuery>(){}
     * @return      NULL because return callback
     */
    public String Suggest(String query , CallbackApi.ResData callbackApi){
        api.get_suggest(query,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                ResponseQuery sug = (ResponseQuery) response.body();
                callbackApi.data(sug);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }

    /**
     *  Get tracks
     *
     * @param  ids  Sample 7119603,7119604
     * @param  callbackApi  new CallbackApi.ResData<List<TrackItem>>(){}
     * @return      NULL because return callback
     */
    public String Tracks(String ids , CallbackApi.ResData callbackApi){
        api.get_tracks(ids,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                List<TrackItem> tracks = (List<TrackItem>) response.body();
                callbackApi.data(tracks);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Get Playlist
     *
     * @param  id  Sample 159147470
     * @param  callbackApi  new CallbackApi.ResData<List<TrackItem>>(){}
     * @return      NULL because return callback
     */
    public String Playlist(int id , CallbackApi.ResData callbackApi){
        api.get_playlist(id,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                Playlist playlist = (Playlist) response.body();
                callbackApi.data(playlist);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Get User
     *
     * @param  id  Sample 4816305
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String User(int id , CallbackApi.ResData callbackApi){
        api.get_user(id,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse user = (SearchResponse) response.body();
                callbackApi.data(user);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Comments list
     *
     * @param  id  track id
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String Comments(int id , CallbackApi.ResData callbackApi){
        api.get_comments(id,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse comments = (SearchResponse) response.body();
                callbackApi.data(comments);
                Log.d(Config.DEBUG_TAG,"NEXT_URL:" + comments.getNextHref());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Search Only tracks
     *
     * @param  query  search keyword
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String SearchTracks(String query , CallbackApi.ResData callbackApi){
        api.get_search_tracks(query,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse search = (SearchResponse) response.body();
                callbackApi.data(search);
                Log.d(Config.DEBUG_TAG,"NEXT_URL:" + search.getNextHref());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Search Only Album
     *
     * @param  query  search keyword
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String SearchAlbum(String query , CallbackApi.ResData callbackApi){
        api.get_search_albums(query,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse search = (SearchResponse) response.body();
                callbackApi.data(search);
                Log.d(Config.DEBUG_TAG,"NEXT_URL:" + search.getNextHref());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Search Only User
     *
     * @param  query  search keyword
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String SearchUser(String query , CallbackApi.ResData callbackApi){
        api.get_search_users(query,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse search = (SearchResponse) response.body();
                callbackApi.data(search);
                Log.d(Config.DEBUG_TAG,"NEXT_URL:" + search.getNextHref());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Search Only Playlist
     *
     * @param  query  search keyword
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String SearchPlaylist(String query , CallbackApi.ResData callbackApi){
        api.get_search_playlist(query,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse search = (SearchResponse) response.body();
                callbackApi.data(search);
                Log.d(Config.DEBUG_TAG,"NEXT_URL:" + search.getNextHref());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Search tracks, albums, playlists
     *
     * @param  query  search keyword
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String Search(String query, CallbackApi.ResData callbackApi){
        api.get_search(query,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse search = (SearchResponse) response.body();
                callbackApi.data(search);
                Log.d(Config.DEBUG_TAG,"NEXT_URL:" + search.getNextHref());

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                if(Config.DEBUG)
                    Log.e(Config.DEBUG_TAG,t.getMessage(),t);
            }
        });
        return "";
    }
    /**
     *  Search more page
     *
     * @param  url  search data.getNextHref() MORE URL
     * @param  next true or false doesn't matter
     * @param  callbackApi  new CallbackApi.ResData<SearchResponse>(){}
     * @return      NULL because return callback
     */
    public String Search(String url,Boolean next,CallbackApi.ResData callbackApi){
        api.get_search_more(url,new CallbackApi() {
            @Override
            public void onResponse(Call call, Response response) {
                SearchResponse search = (SearchResponse) response.body();

                callbackApi.data(search);
                Log.e("next", search.getNextHref());
            }
            @Override
            public void onFailure(Call call, Throwable t) {
                Log.e("hata","",t);
            }
        });
        return "";
    }
    public String more(String url, Object veri, CallbackApi.ResData callbackApi){
        String veri_turu = veri.getClass().getSimpleName().toString();
        Log.e("verituru",veri_turu);
        switch (veri_turu){
            case "SearchResponse":
            api.get_search_more(url,new CallbackApi() {
                    @Override
                    public void onResponse(Call call, Response response) {
                        SearchResponse search = (SearchResponse) response.body();
                        callbackApi.data(search);
                    }
                    @Override
                    public void onFailure(Call call, Throwable t) {
                        Log.e("hata","",t);
                    }
                });
                break;
            case "Playlist" :
                api.get_playlist_more(url,new CallbackApi() {
                    @Override
                    public void onResponse(Call call, Response response) {
                        Playlist playlist = (Playlist) response.body();
                        callbackApi.data(playlist);
                    }
                    @Override
                    public void onFailure(Call call, Throwable t) {
                        Log.e("hata","",t);
                    }
                });
                break;

        }

        return "";
    }

    /**
     * @param duration
     * @ref https://stackoverflow.com/a/25815403
     */
    public String duration(long duration) {
        String out = null;
        long hours=0;
        try {
            hours = (duration / 3600000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return out;
        }
        long remaining_minutes = (duration - (hours * 3600000)) / 60000;
        String minutes = String.valueOf(remaining_minutes);
        if (minutes.equals(0)) {
            minutes = "00";
        }
        long remaining_seconds = (duration - (hours * 3600000) - (remaining_minutes * 60000));
        String seconds = String.valueOf(remaining_seconds);
        if (seconds.length() < 2) {
            seconds = "00";
        } else {
            seconds = seconds.substring(0, 2);
        }

        if (hours > 0) {
            out = hours + ":" + minutes + ":" + seconds;
        } else {
            out = minutes + ":" + seconds;
        }

        return out;

    }

}
