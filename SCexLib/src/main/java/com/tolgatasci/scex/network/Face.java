package com.tolgatasci.scex.network;

import com.tolgatasci.scex.model.response.Playlist;
import com.tolgatasci.scex.model.response.ResponseDoc;
import com.tolgatasci.scex.model.response.SearchResponse;
import com.tolgatasci.scex.model.response.TrackItem;
import com.tolgatasci.scex.model.response.query.ResponseQuery;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface Face {

    @GET
    Call<ResponseDoc> getDoc(@Url String url);

    @GET("search/queries?&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<ResponseQuery> getSuggest(@Query("q") String q, @Query("limit") int limit);

    @GET("tracks?%5Bobject%20Object%5D=&app_version=1607091168&app_locale=en")
    Call<List<TrackItem>> getTracks(@Query("ids") String ids, @Query("limit") int limit);

    @GET("playlists/{playlist_id}?representation=full&app_version=1607091168&app_locale=en")
    Call<Playlist> getPlaylist(@Path(value = "playlist_id", encoded = true) int id, @Query("limit") int limit);
    @GET
    Call<Playlist> getMorePlaylist(@Url String url);
    @GET("stream/users/{user_id}?offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getUser(@Path(value = "user_id", encoded = true) int id, @Query("limit") int limit);

    @GET("mixed-selections?&limit=10&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getHomeList();
	
	@GET("tracks/{id}/related?linked_partitioning=1&app_version=1610452435&app_locale=en")
    Call<SearchResponse> getRelated(@Path(value = "id", encoded = true) int id, @Query("limit") int limit);

    /* Track Comments */
    @GET("tracks/{track_id}/comments?threaded=1&filter_replies=0&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getComments(@Path(value = "track_id", encoded = true) int id,@Query("limit") int limit);

    /* Search */
    @GET("search?variant_ids=&facet=model&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getSearch(@Query("q") String q,@Query("limit") int limit);
    @GET
    Call<SearchResponse> getMore(@Url String url);
    @GET("search/albums?variant_ids=&facet=genre&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getSearchAlbums(@Query("q") String q,@Query("limit") int limit);
    @GET("search/tracks?variant_ids=&facet=genre&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getSearchTracks(@Query("q") String q,@Query("limit") int limit);
    @GET("search/users?variant_ids=&facet=place&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getSearchUsers(@Query("q") String q,@Query("limit") int limit);
    @GET("search/playlists_without_albums?variant_ids=&facet=genre&offset=0&linked_partitioning=1&app_version=1607091168&app_locale=en")
    Call<SearchResponse> getSearchPlaylist(@Query("q") String q,@Query("limit") int limit);

}
