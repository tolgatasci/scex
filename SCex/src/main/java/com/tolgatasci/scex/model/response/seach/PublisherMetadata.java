package com.tolgatasci.scex.model.response.seach;

import com.google.gson.annotations.SerializedName;

public class PublisherMetadata{

	@SerializedName("p_line_for_display")
	private String pLineForDisplay;

	@SerializedName("artist")
	private String artist;

	@SerializedName("isrc")
	private String isrc;

	@SerializedName("c_line")
	private String cLine;

	@SerializedName("upc_or_ean")
	private String upcOrEan;

	@SerializedName("p_line")
	private String pLine;

	@SerializedName("urn")
	private String urn;

	@SerializedName("explicit")
	private boolean explicit;

	@SerializedName("c_line_for_display")
	private String cLineForDisplay;

	@SerializedName("contains_music")
	private boolean containsMusic;

	@SerializedName("writer_composer")
	private String writerComposer;

	@SerializedName("id")
	private int id;

	@SerializedName("album_title")
	private String albumTitle;

	@SerializedName("release_title")
	private String releaseTitle;

	public String getPLineForDisplay(){
		return pLineForDisplay;
	}

	public String getArtist(){
		return artist;
	}

	public String getIsrc(){
		return isrc;
	}

	public String getCLine(){
		return cLine;
	}

	public String getUpcOrEan(){
		return upcOrEan;
	}

	public String getPLine(){
		return pLine;
	}

	public String getUrn(){
		return urn;
	}

	public boolean isExplicit(){
		return explicit;
	}

	public String getCLineForDisplay(){
		return cLineForDisplay;
	}

	public boolean isContainsMusic(){
		return containsMusic;
	}

	public String getWriterComposer(){
		return writerComposer;
	}

	public int getId(){
		return id;
	}

	public String getAlbumTitle(){
		return albumTitle;
	}

	public String getReleaseTitle(){
		return releaseTitle;
	}
}