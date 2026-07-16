package weeklyAsssignment;

interface camera{
	
	void takePhoto(); 
	}
interface MusicPlayer 
{ 
	void playMusic(); 
	}

interface SmartFeatures {
	
	void connectToWifi(); 
	}

class smartDevice implements camera, MusicPlayer, SmartFeatures{

	@Override
	public void connectToWifi() {
		System.out.println("Connected to WIFI");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music...");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Photo captured successfully");
		
	}
	
}

public class Assignment8_SmartDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smartDevice s = new smartDevice();
		s.takePhoto();
		s.playMusic();
		s.connectToWifi();
		
		

	}

}
