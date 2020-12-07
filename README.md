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
	        implementation 'com.github.tolgatasci:scex:1.3'
	}
	
## Example Code

### Call Class
	SCex yt = new SCex(getApplicationContext(),"cliend_id need");
	# add user_id parametre api
	SCex yt = new SCex(getApplicationContext(),"cliend_id need","sc_a_id parametre");
	
### Suggest
	yt.Suggest("Suggest", new CallbackApi.ResData<ResponseQuery>() {
            @Override
            public void data(ResponseQuery response) {
              Log.e("work",response.getCollection().size() + "");
            }
        });
		
	yt.Suggest("tarkan", (CallbackApi.ResData<ResponseQuery>) response -> Log.e("work",response.getCollection().size() + ""));
		
### Tracks

	# multiple id insert sample 7119603,93675143
	yt.Tracks("7119603", new CallbackApi.ResData<List<TrackItem>>() {
            @Override
            public void data(List<TrackItem> response) {
               Log.e("work",response.size()+ "");
            }
        });
		
	yt.Tracks("7119603", (CallbackApi.ResData<List<TrackItem>>) response -> Log.e("work",response.size()+ ""));	
### Get File
	yt.Doc("url", new CallbackApi.ResData<ResponseDoc>() {
            @Override
            public void data(ResponseDoc response) {
               Log.e("work",response.getUrl() + "");
            }
        });
		
	yt.Doc("url", (CallbackApi.ResData<ResponseDoc>) response -> Log.e("work",response.getUrl() + ""));
		
### Playlist
	yt.Playlist(159147470, new CallbackApi.ResData<Playlist>() {
            @Override
            public void data(Playlist response) {
               Log.e("work",response.getTitle()+ "");
            }
        });
		
	yt.Playlist(159147470, (CallbackApi.ResData<Playlist>) response -> Log.e("work",response.getTitle()+ ""));
	
### Track Comments
	yt.Comments(335233410, new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().get(0).getBody()+ "");
            }
        });		
	yt.Comments(335233410, (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().get(0).getBody()+ ""));
	
### User
	yt.User(4816305, new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().get(0).getTrack().getTitle()+ "");
            }
        });
	yt.User(4816305, (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().get(0).getTrack().getTitle()+ ""));
	
### Search
	yt.Search("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });	
	yt.Search("tarkan", (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().size() + ""));
	
### More every method
	yt.more(response.getNextHref(), response, new CallbackApi.ResData<SearchResponse>() {
                    @Override
                    public void data(SearchResponse response) {
                        Log.e("work 2",response.getCollection().size() + "");
                    }
		});
	yt.more(response.getNextHref(), response, (CallbackApi.ResData<SearchResponse>) response1 -> Log.e("work 2", response1.getCollection().size() + ""));	
### Search Albums
	yt.SearchAlbum("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });
	yt.SearchAlbum("tarkan", (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().size() + ""));
	
### Search Tracks
	yt.SearchTracks("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {
               Log.e("work",response.getCollection().size() + "");
            }
        });		
	yt.SearchTracks("tarkan", (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().size() + ""));
	
### Search Users		
	yt.SearchUser("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {

               Log.e("work",response.getCollection().size() + "");
            }
        });
	yt.SearchUser("tarkan", (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().size() + ""));
	
### Search Playlist		
	yt.SearchPlaylist("tarkan", new CallbackApi.ResData<SearchResponse>() {
            @Override
            public void data(SearchResponse response) {

               Log.e("work",response.getCollection().size() + "");
            }
        });
	yt.SearchPlaylist("tarkan", (CallbackApi.ResData<SearchResponse>) response -> Log.e("work",response.getCollection().size() + ""));
	
### Add Client ID
	try {
		// result  https://www.domain.com/?client_id=example
		String new_url =  yt.add_client_id("https://www.domain.com/");
    } catch (URISyntaxException e) {
            e.printStackTrace();
    }
