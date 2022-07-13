
public class Serie {
	
	final int NUM_SEASONS_DEF=3;

	private String title;
	private int numSeasons;
	private boolean delivered;
	private String genres;
	private String director;
	
	public Serie() {
		this.title="";
		this.numSeasons=NUM_SEASONS_DEF;
		this.delivered = false;
		this.genres="";
		this.director="";
	}
	
	public Serie(String title,String director) {
		this.title=title;
		this.director=director;
		this.numSeasons=NUM_SEASONS_DEF;
		this.delivered=false;
		this.genres="";
	}
	
	public Serie(String title,int numSeasons,String genres,String director) {
		this.title=title;
		this.director=director;
		this.numSeasons=numSeasons;
		this.genres=genres;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumSeasons() {
		return numSeasons;
	}

	public void setNumSeasons(int numSeasons) {
		this.numSeasons = numSeasons;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "\nSerie [title=" + title + ", numSeasons=" + numSeasons + ", delivered=" + delivered + ", genres="
				+ genres + ", director=" + director + "]";
	}	
	
}
