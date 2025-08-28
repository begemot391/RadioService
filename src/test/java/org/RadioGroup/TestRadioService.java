//package org.RadioGroup;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestRadioService {
//
//
//    // Тесты станций:
//
//    @Test
//    public void testGetCurrentStation() {
//
//        RadioService radio = new RadioService();
//
//        int exp = 0;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void setNewStationCorrectMaxParam() {
//
//        RadioService radio = new RadioService();
//        radio.setNewStation( 9 );
//
//        int exp = 9;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act);
//
//    }
//
//    @Test
//    public void setNewStationCorrectMinParam() {
//
//        RadioService radio = new RadioService();
//        radio.setNewStation( 0 );
//
//        int exp = 0;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//
//    }
//
//    @Test
//    public void setNewStationUpMaxParam() {
//
//        RadioService radio = new RadioService();
//        radio.setNewStation( 10 );
//
//        int exp = 0;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//
//    }
//
//    @Test
//    public void setNewStationBelowMinParam() {
//
//        RadioService radio = new RadioService();
//        radio.setNewStation( -1 );
//
//        int exp = 0;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//
//    }
//
//    @Test
//    public void testSetNextStationFromStart() {
//
//        RadioService radio = new RadioService();
//        radio.setNextStation();
//
//        int exp = 1;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetNextStationFromEnd() {
//
//        RadioService radio = new RadioService();
//        radio.setNewStation( 9 );
//        radio.setNextStation();
//
//        int exp = 0;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testPrevStationFromStart() {
//
//        RadioService radio = new RadioService();
//        radio.setPrevStation();
//
//        int exp = 9;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//
//    }
//
//    @Test
//    public void testPrevStationFromEnd() {
//
//        RadioService radio = new RadioService();
//        radio.setNewStation( 9 );
//        radio.setPrevStation();
//
//        int exp = 8;
//        int act = radio.getCurrentStation();
//
//        Assertions.assertEquals( exp, act );
//
//    }
//
//    // Тесты звука:
//
//    @Test
//    public void testGetCurrentSoundLevel() {
//
//        RadioService radio = new RadioService();
//
//
//        int exp = 50;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetSoundLevelParamBelowMax() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( 50 );
//
//        int exp = 50;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetMaxSoundLevel() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( 100 );
//
//        int exp = 100;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetMinSoundLevel() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( 0 );
//
//        int exp = 0;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetUpMaxSoundLevel() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( 1001 );
//
//        int exp = 50;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetBelowMinSoundLevel() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( -1001 );
//
//        int exp = 50;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetUpSoundLevelByOne() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoundUpOne();
//
//        int exp = 51;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetUpSoundLevelByOneOverMax() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( 100 );
//        radio.setNewSoundUpOne();
//
//        int exp = 100;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetOneBelowSoundLevelByOneBelowMin() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoudLevel( 0 );
//        radio.setNewSoundBelowOne();
//
//        int exp = 0;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    @Test
//    public void testSetOneBelowSoundLCorretParams() {
//
//        RadioService radio = new RadioService();
//        radio.setNewSoundBelowOne();
//
//        int exp = 49;
//        int act = radio.getCurrentSoundLevel();
//
//        Assertions.assertEquals( exp, act );
//    }
//
//    // Тесты конструкторов:
//
//    @Test
//    public void testSetMaxQuantityStationByConstr() {
//        RadioService newrad = new RadioService( 30 );
//
//        int exp = 30;
//        int act = newrad.getMaxQuantityStation();
//
//        Assertions.assertEquals( exp, act);
//    }
//
//    @Test
//    public void testSetMaxStationByConstr() {
//        RadioService newrad = new RadioService( 30 );
//
//        int exp = 29;
//        int act = newrad.getMaxStation();
//
//        Assertions.assertEquals( exp, act);
//    }
//
//    @Test
//    public void testNextStationByConstrOverMaxStation() {
//        RadioService newrad = new RadioService( 30 );
//        newrad.setNewStation(29);
//        newrad.setNextStation();
//
//        int exp = 0;
//        int act = newrad.getCurrentStation();
//
//        Assertions.assertEquals( exp, act);
//    }
//
//    @Test
//    public void testPrevStationByConstrBelowMinStation() {
//        RadioService newrad = new RadioService( 30 );
//        newrad.setNewStation(0);
//        newrad.setPrevStation();
//
//        int exp = 29;
//        int act = newrad.getCurrentStation();
//
//        Assertions.assertEquals( exp, act);
//    }
//
//    @Test
//    public void testSetNewStationByConstrOverMaxStation() {
//        RadioService newrad = new RadioService( 30 );
//        newrad.setNewStation(30);
//
//        int exp = 0;
//        int act = newrad.getCurrentStation();
//
//        Assertions.assertEquals( exp, act);
//    }
//
//    @Test
//    public void testSetNewStationByConstrBelowMinStation() {
//        RadioService newrad = new RadioService( 30 );
//        newrad.setNewStation(-1);
//
//        int exp = 0;
//        int act = newrad.getCurrentStation();
//
//        Assertions.assertEquals( exp, act);
//    }
//}
