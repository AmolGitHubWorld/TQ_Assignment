package Test4_Inheritance_abstractclass_interface_30thAp;

interface MusicalInstrument{
	void play();
	static void learnInstrument() {
		System.out.println("welcome to learning session");
	}
}

abstract class Sound{
	abstract void listenSound();
}

class PercussionInstrument extends Sound implements MusicalInstrument{
	public void play() {
		System.out.println("play percussion instrument now");
	}
	
	public void listenSound() {
		System.out.println("da dha ta dha tha da dhe dhum");
	}
}

class StringedInstrument extends Sound implements MusicalInstrument{
	public void play() {
		System.out.println("play stringed instrument now");
	}
	
	public void listenSound() {
		System.out.println("i i a o o oo i i ai o");
	}
}
public class MusicMain {

	public static void main(String[] args) {
		PercussionInstrument tabla = new PercussionInstrument();
		MusicalInstrument.learnInstrument();
		tabla.play();
		tabla.listenSound();
		
		StringedInstrument violin = new StringedInstrument();
		MusicalInstrument.learnInstrument();
		violin.play();
		violin.listenSound();

	}

}
