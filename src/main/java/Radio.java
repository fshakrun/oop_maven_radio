public class Radio {
    private int getVolume;
    private int currentStation; // Номер текущей радиостанции
    private int currentVolume; //Громкость звука

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9 || currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation <= 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }//метод prev для одноименной кнопки

    public int getVolume() {
        return currentVolume;
    } //получение текущего уровня звука

    public void setVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }//установка уровня звука

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }//увеличение громкости

    public void lessVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }//уменьшение громкости
}