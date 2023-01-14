package ru.netology.radioman;

public class Radio {
    private int maxStation = 9;
    private int minStation;
    private int currentStation = minStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int volumeControl;


    public Radio() {
        maxStation = getMaxStation();
    }

    public Radio(int stationsAmount) {
        maxStation = stationsAmount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        currentStation = currentStation - 1;
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
    }


    public int getVolumeControl() {
        return volumeControl;
    }

    public void setVolumeControl(int newVolumeControl) {
        volumeControl = newVolumeControl;
    }

    public void volumeUp() {
        if (volumeControl < maxVolume) {
            volumeControl = volumeControl + 1;
        } else {
            return;
        }
    }

    public void volumeDown() {
        if (volumeControl > minVolume) {
            volumeControl = volumeControl - 1;
        } else {
            return;
        }

    }

}
