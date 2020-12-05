# scex
 SoundCloud v2 Api Java Library
 
## Example Code
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