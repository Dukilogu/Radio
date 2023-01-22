package ru.netology.radio;

public class Radio {

    private int currentNumberStation;
    private int currentSoundVolume;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextStation() {
        this.currentNumberStation = currentNumberStation + 1;
        if (currentNumberStation > 9) {
            this.currentNumberStation = 0;
        }
    }

    public void prevStation() {
        this.currentNumberStation = currentNumberStation - 1;
        if (currentNumberStation == -1) {
            this.currentNumberStation = 9;
        }
    }

    public void stationNumberSelection(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public void soundVolumeUp() {
        if (currentSoundVolume < 10) {
            this.currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void soundVolumeDown() {
        this.currentSoundVolume = currentSoundVolume - 1;
        if (currentSoundVolume <= 0) {
            this.currentSoundVolume = 0;
        }
    }
}