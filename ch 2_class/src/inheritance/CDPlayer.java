package inheritance;

public class CDPlayer extends Player {

    int currentTrack;

    @Override
    void paly(int pos) {
        System.out.println("CD Play");
    }

    @Override
    void stop() {
        System.out.println("CD Stop");
    }

    void newTrack() {
        currentTrack++;
    }

    void prevTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        }
    }
}
