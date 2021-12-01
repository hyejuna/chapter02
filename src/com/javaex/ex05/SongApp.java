package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song s1 = new Song();
		s1.setArtist("아이유");
		s1.setTitle("좋은날");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.setComposer("이민수");
		s1.showInfo();
		System.out.println(s1.toString());
		
		Song s2 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007);
		s2.setTrack(2);
		s2.showInfo();
		
		Song s3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
	
		s3.showInfo();
		

	}

}
