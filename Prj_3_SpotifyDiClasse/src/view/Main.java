package view;

import controller.PlaylistCtrl;
import model.Brano;
import model.Playlist;

public class Main {

	public static void main(String[] args) {
		
		Playlist miaPlaylist=new Playlist("Rock '70");
//		Brano nuovobrano= new Brano("Immigrant song", "Led Zeppelin", 4.5);
//		Brano nuovobrano2= new Brano("Brothoe", "Pink Floid", 5.2);
//		miaPlaylist.addbrano(nuovobrano);
//		miaPlaylist.addbrano(nuovobrano2);
		
//		PlaylistCtrl database=new PlaylistCtrl();
//		database.caricaCanzoni();
//		database.stampaBraniPL();
		
//		miaPlaylist.infoPlaylist();
		PlaylistCtrl db= new PlaylistCtrl();
		db.caricaCanzoniDaFile();
		db.stampaBraniPL();
	}
	
}
