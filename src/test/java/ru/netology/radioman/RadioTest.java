package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void goToGivenStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationValueAboveMax() {
        Radio station = new Radio();

        station.setCurrentStation(15);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goToNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.nextStation();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goToPrevStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.prevStation();

        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberExceededMax() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberBelowMin() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allowableIncreaseVolume() {
        Radio volume = new Radio();

        volume.setVolumeControl(3);
        volume.volumeUp();

        int expected = 4;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreaseAboveMax() {
        Radio volume = new Radio();

        volume.setVolumeControl(10);
        volume.volumeUp();

        int expected = 10;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownAllowed() {
        Radio volume = new Radio();

        volume.setVolumeControl(1);
        volume.volumeDown();

        int expected = 0;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setVolumeControl(0);
        volume.volumeDown();

        int expected = 0;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

}
