package org.RadioGroup;

public class RadioService {

    private int currentStation;
    private int maxQuantityStation = 10;
    private int maxStation = maxQuantityStation - 1;
    private int minStation = 0;

    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;

    // Конструкторы:

    public RadioService() {

    }

    public RadioService( int newMaxStationQuantity ) {

        this.maxQuantityStation = newMaxStationQuantity;
        this.maxStation = maxQuantityStation - 1;
    }


    // Методы работы со станциями:

    public int getMaxQuantityStation() {
        return maxQuantityStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

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
            currentStation = minStation;
        }
    }

    public void setPrevStation() {
        currentStation--;
        if ( currentStation < minStation ) {
            currentStation = maxStation;
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
