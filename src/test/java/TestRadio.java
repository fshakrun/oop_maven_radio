import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRadio {

    Radio radio = new Radio();

    @Test
    //переключение станций
    void shouldSwitchStation() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationLessMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationMoreMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStation() {
        radio.setCurrentStation(5);
        radio.Next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldSetMoreMaxStation1() {
        radio.setCurrentStation(9);
        radio.Next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetMoreMaxStation2() {
        radio.setCurrentStation(10);
        radio.Next();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStation() {
        radio.setCurrentStation(5);
        radio.Prev();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldLessMinStation1() {
        radio.setCurrentStation(0);
        radio.Prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldLessMinStation2() {
        radio.setCurrentStation(-1);
        radio.Prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldChangeVolume() {
        assertEquals(0, radio.getVolume(9));
        radio.setVolume(5);
        assertEquals(5, radio.getVolume(9));
    }

    @Test

    void shouldIncreaseVolume() {
        radio.setVolume(9);
        radio.increaseVolume(1);
        assertEquals(10, radio.getVolume(9));
    }
    @Test
    void shouldOverMaxVolume100() {
        radio.setVolume(100);
        radio.increaseVolume(1);
        assertEquals(100, radio.getVolume(100));
    }

    @Test
    void shouldOverMaxVolume101() {
        radio.setVolume(101);
        radio.increaseVolume(1);
        assertEquals(1, radio.getVolume(101));
    }

    @Test
    void shouldSetLessVolume() {
        radio.setVolume(6);
        radio.lessVolume();
        assertEquals(5, radio.getVolume(6));
    }

    @Test
    void shouldLessMinVolume0() {
        radio.setVolume(0);
        radio.lessVolume();
        assertEquals(0, radio.getVolume(0));
    }

    @Test
    void shouldLessMinVolumeMinus1() {
        radio.setVolume(-1);
        radio.lessVolume();
        assertEquals(0, radio.getVolume(-1));
    }

}