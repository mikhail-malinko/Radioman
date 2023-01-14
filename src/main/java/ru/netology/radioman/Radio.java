package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int volumeControl;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolumeControl() {
        return volumeControl;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setVolumeControl(int newVolumeControl) {
        volumeControl = newVolumeControl;
    }


    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        currentStation = currentStation - 1;
        if (currentStation < 0) {
            currentStation = 9;
        }
    }

    public void volumeUp() {
        if (volumeControl < 10) {
            volumeControl = volumeControl + 1;
        }
    }

    public void volumeDown() {
        if (volumeControl > 0) {
            volumeControl = volumeControl - 1;
        }
    }

}
