# SCex
 SoundCloud v2 Api Java Library
 
## Example Code

### Call Class
	YTex yt = new YTex(getApplicationContext(),"cliend_id need");
	# add user_id parametre api
	YTex yt = new YTex(getApplicationContext(),"cliend_id need","user_id parametre");
### Tracks

	# multiple id insert sample 7119603,93675143
	yt.Tracks("7119603", new CallbackApi.ResData<List<TrackItem>>() {
            @Override
            public void data(List<TrackItem> response) {
               Log.e("work",response.size()+ "");
            }
        });
### Search
	yt.Search("tarkan", new CallbackApi.ResData() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });	
### Search More 		
	yt.Search(response.getNextHref(), true, new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });
### Search Albums
	yt.SearchAlbum("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });
### Search Tracks
	yt.SearchTracks("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });		
		
### Search Users		
	yt.SearchUser("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {

               Log.e("work",response.getCollection().size() + "");
            }
        });