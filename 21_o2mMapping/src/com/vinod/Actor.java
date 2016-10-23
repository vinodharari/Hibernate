package com.vinod;

import java.util.Set;

public class Actor {
	private int Aid;
	private String Actorname;
	private Set<Movies> Movies;
	public Set<Movies> getMovies() {
		return Movies;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getActorname() {
		return Actorname;
	}
	public void setActorname(String actorname) {
		Actorname = actorname;
	}
	public void setMovies(Set<Movies> set) {
		Movies=set;
	}
}
