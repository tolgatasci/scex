# SCex
 SoundCloud v2 Api Java Library
 
## Example Code

### Call Class
	YTex yt = new YTex(getApplicationContext(),"cliend_id need");
	# add user_id parametre api
	YTex yt = new YTex(getApplicationContext(),"cliend_id need","user_id parametre");
	
### Search
	yt.Search("tarkan", new CallbackApi.ResData() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });	
### Search More 		
	yt.Search(response.getNextHref(), true, new CallbackApi.ResData() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });
### Search Albums
	yt.SearchAlbum("tarkan", new CallbackApi.ResData() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });
### Search Tracks
	yt.SearchTracks("tarkan", new CallbackApi.ResData() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });		
		
### Search Users		
	yt.SearchUser("tarkan", new CallbackApi.ResData() {
            @Override
            public void data(SearchResponse response) {

               Log.e("work",response.getCollection().size() + "");
            }
        });