package ru.netology.radio;

public class Radio {
    private int currentNumberStation;
    private int currentSoundVolume;
    private int minNumberStation = 0;
    private int maxNumberStation;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public Radio() {

        this.maxNumberStation = 9;
    }

    public Radio(int amountStation) {
        this.maxNumberStation = amountStation - 1;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < minNumberStation) {
            return;
        }
        if (currentNumberStation > maxNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextStation() {
        this.currentNumberStation = currentNumberStation + 1;
        if (currentNumberStation > maxNumberStation) {
            this.currentNumberStation = 0;
        }
    }

    public void prevStation() {
        this.currentNumberStation = currentNumberStation - 1;
        if (currentNumberStation < minNumberStation) {
            this.currentNumberStation = 9;
        }
    }

    public void stationNumberSelection(int currentNumberStation) {
        if (currentNumberStation < minNumberStation) {
            return;
        }
        if (currentNumberStation > maxNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void soundVolumeUp() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume + 1;
    }

    public void soundVolumeDown() {
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume - 1;
    }
}
