package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void selectStationNull() {
        Radio station = new Radio();

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectStationOne() {
        Radio station = new Radio();

        station.setCurrentStation(1);

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectStationEight() {
        Radio station = new Radio();

        station.setCurrentStation(8);

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectStationNine() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationFromMiddle() {
        Radio station = new Radio();

        station.setCurrentStation(6);

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOverRange() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBelowRange() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNextFromMinimum() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationFromMid() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.nextStation();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaximum() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        station.nextStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationOverRange() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationFromMax() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationFromMid() {
        Radio station = new Radio();

        station.setCurrentStation(4);
        station.prevStation();

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationMinimum() {
        Radio station = new Radio();

        station.setCurrentStation(1);
        station.prevStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationFromMinimum() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void callStationNull() {
        Radio station = new Radio(30);

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calltStationOne() {
        Radio station = new Radio(30);

        station.setCurrentStation(1);

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void callStationFromMiddle() {
        Radio station = new Radio(30);

        station.setCurrentStation(15);

        int expected = 15;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationCallBeforeMax() {
        Radio station = new Radio(30);

        station.setCurrentStation(28);

        int expected = 28;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void callStationMaximum() {
        Radio station = new Radio(30);

        station.setCurrentStation(29);

        int expected = 29;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void callStationOverRange() {
        Radio station = new Radio(30);

        station.setCurrentStation(30);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void callStationBelowRange() {
        Radio station = new Radio(30);

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNextFromMin() {
        Radio station = new Radio(30);

        station.setCurrentStation(0);
        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationFromMidl() {
        Radio station = new Radio(30);

        station.setCurrentStation(17);
        station.nextStation();

        int expected = 18;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        Radio station = new Radio(30);

        station.setCurrentStation(28);
        station.nextStation();

        int expected = 29;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStatOverRange() {
        Radio station = new Radio(30);

        station.setCurrentStation(29);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFromMax() {
        Radio station = new Radio(30);

        station.setCurrentStation(29);
        station.prevStation();

        int expected = 28;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFromMid() {
        Radio station = new Radio(30);

        station.setCurrentStation(17);
        station.prevStation();

        int expected = 16;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinimum() {
        Radio station = new Radio();

        station.setCurrentStation(1);
        station.prevStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFromMinimum() {
        Radio station = new Radio(30);

        station.setCurrentStation(0);
        station.prevStation();

        int expected = 29;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeUp() {
        Radio volume = new Radio();

        volume.setVolumeControl(0);
        volume.volumeUp();

        int expected = 1;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpFromMidl() {
        Radio volume = new Radio();

        volume.setVolumeControl(58);
        volume.volumeUp();

        int expected = 59;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpToMax() {
        Radio volume = new Radio();

        volume.setVolumeControl(99);
        volume.volumeUp();

        int expected = 100;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpAboveMaximum() {
        Radio volume = new Radio();

        volume.setVolumeControl(100);
        volume.volumeUp();

        int expected = 100;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownFromMax() {
        Radio volume = new Radio();

        volume.setVolumeControl(100);
        volume.volumeDown();

        int expected = 99;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownFromMidl() {
        Radio volume = new Radio();

        volume.setVolumeControl(47);
        volume.volumeDown();

        int expected = 46;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownToMin() {
        Radio volume = new Radio();

        volume.setVolumeControl(1);
        volume.volumeDown();

        int expected = 0;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownBelowMin() {
        Radio volume = new Radio();

        volume.setVolumeControl(0);
        volume.volumeDown();

        int expected = 0;
        int actual = volume.getVolumeControl();

        Assertions.assertEquals(expected, actual);
    }

}
