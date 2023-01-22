package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void stationNumberWithin() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void stationNumberOutMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void stationNumberOutMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void nextStationNumberUp() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(3);
        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void nextStationNumberUpMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void nextStationNumberUpMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void prevStationNumberDown() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(6);
        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void prevStationNumberDownMax() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void prevStationNumberDownMin() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void stationNumberSelectionOwh() {
        Radio radio = new Radio();
        int currentNumberStation = 4;
        radio.stationNumberSelection(currentNumberStation);

        int expected = 4;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void stationNumberSelectionOutMin() {
        Radio radio = new Radio();
        int currentNumberStation = -1;
        radio.stationNumberSelection(currentNumberStation);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void stationNumberSelectionOutMax() {
        Radio radio = new Radio();
        int currentNumberStation = 10;
        radio.stationNumberSelection(currentNumberStation);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void currentSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(7);

        int expected = 7;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void currentSoundVolumeOutMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(11);

        int expected = 11;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void SoundVolumeUpWithin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.soundVolumeUp();

        int expected = 6;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void SoundVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.soundVolumeUp();

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void SoundVolumeUpMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.soundVolumeUp();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void SoundVolumeDownWithin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.soundVolumeDown();

        int expected = 4;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void SoundVolumeDownMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.soundVolumeDown();

        int expected = 9;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void SoundVolumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.soundVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }
}