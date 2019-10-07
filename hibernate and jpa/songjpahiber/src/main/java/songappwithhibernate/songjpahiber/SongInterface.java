package songappwithhibernate.songjpahiber;

public interface SongInterface {
	
	public void SongData();
	
	Songs playAllSongs(int id);
	
	Songs updateSongs(String s);
	
	Songs deleteSongs(String s);
	
	Songs insertSongs(String s);
	
	Songs specificSongs();
	
	public void jdbcSpecificSongs();
	
	public void randomsong();
	
	
	
	
	

}
