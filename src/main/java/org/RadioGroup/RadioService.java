package org.RadioGroup;

public class RadioService {

    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;


    // Методы работы со станциями:

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNewStation(int newStation ) {

        if ( newStation >= minStation && newStation <= maxStation ) {
            currentStation = newStation;
        }
    }

    public void setNextStation() {
        currentStation++;
        if ( currentStation > maxStation ) {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        currentStation--;
        if ( currentStation < minStation ) {
            currentStation = 9;
        }
    }


    // Методы работы со звуком:

    public int getCurrentSoundLevel() {
        return currentVolume;
    }

    public void setNewSoudLevel( int userSoundLevel ) {

        if ( userSoundLevel >= minVolume && userSoundLevel <= maxVolume ){
            currentVolume = userSoundLevel;
        }
    }

    public void setNewSoundUpOne() {

        currentVolume++;
        if ( currentVolume > maxVolume ) {
            currentVolume = maxVolume;
        }
    }

    public void setNewSoundBelowOne() {

        currentVolume--;
        if ( currentVolume < minVolume ) {
            currentVolume = minVolume;
        }
    }

}
