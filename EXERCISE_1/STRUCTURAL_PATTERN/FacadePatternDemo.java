
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play() {
        System.out.println("DVD Player is playing");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }
}


class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        dvdPlayer.on();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.play();
    }

    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}


public class FacadePatternDemo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
