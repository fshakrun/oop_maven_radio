public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int totalStation = 10;

    public Radio() {
    }

    public Radio(int countStation) {
        this.totalStation = countStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > totalStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (totalStation - 1 <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(totalStation - 1);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void lessVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}