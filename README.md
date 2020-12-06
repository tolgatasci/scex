# SCex
 SoundCloud v2 Api Java Library
## Install
Add it in your root build.gradle at the end of repositories:

	allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
	
	}	

Add the dependency

	dependencies {
	        implementation 'com.github.tolgatasci:scex:v3'
	}
	
## Example Code

### Call Class
	YTex yt = new YTex(getApplicationContext(),"cliend_id need");
	# add user_id parametre api
	YTex yt = new YTex(getApplicationContext(),"cliend_id need","sc_a_id parametre");
### Tracks

	# multiple id insert sample 7119603,93675143
	yt.Tracks("7119603", new CallbackApi.ResData<List<TrackItem>>() {
            @Override
            public void data(List<TrackItem> response) {
               Log.e("work",response.size()+ "");
            }
        });
		
### Playlist
	yt.Playlist(159147470, new CallbackApi.ResData<Playlist>() {
            @Override
            public void data(Playlist response) {
               Log.e("work",response.getTitle()+ "");
            }
        });
### Track Comments
	yt.Comments(335233410, new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().get(0).getBody()+ "");
            }
        });		
### User
	yt.User(4816305, new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().get(0).getTrack().getTitle()+ "");
            }
        });		
### Search
	yt.Search("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });	
### More every method
	yt.more(response.getNextHref(), response, new CallbackApi.ResData<SearchResponse>() {
                    @Override
                    public void data(SearchResponse response) {
                        Log.e("work 2",response.getCollection().size() + "");
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
### Search Playlist		
	yt.SearchPlaylist("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {

               Log.e("work",response.getCollection().size() + "");
            }
        });
### Add Client ID
	try {
		// result  https://www.domain.com/?client_id=example
		String new_url =  yt.add_client_id("https://www.domain.com/");
    } catch (URISyntaxException e) {
            e.printStackTrace();
    }
