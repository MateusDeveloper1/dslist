package com.mateussilva.dslist.projections;

public interface GameMinProjection {
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	String getPosition();
}
