package com.javaex.ex05;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song() {
		System.out.println("Song(0)");
		
	}
	

		
	public Song(String title, String artist, String album, String composer, int year) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		//작곡가 이름이 최대 10글자 코드(100줄)
		this.composer = composer;
		//2021년 이후는 2021로 처리 코드(200줄)
		this.year = year;
		System.out.println("Song(5)");
	}

	//5개를 이용해서 4개를 만드는 방법 -> 마지막에 String은 "", int는 0
	public Song(String title, String artist, String album, String composer) {
		this(title, artist, album, composer,0 );
	}
	


	public Song(String title, String artist, String album, String composer, int year, int track) {
	
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(6)");
	}



	//메소드-g/s
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	//메소드-일반
	public void showInfo() {
		System.out.println(getArtist()+", "+getTitle()+" ( "+getAlbum()+", "+getYear()+", "+getTrack()+"번 track, "+getComposer()+" 작곡 )");
	}
	
	
	
	// 필드에 data가 제대로 들어가는지 확인하는 용도임!!!!
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	
	

}
