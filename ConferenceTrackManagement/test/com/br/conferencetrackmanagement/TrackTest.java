package com.br.conferencetrackmanagement;

import com.br.conferencetrackmanagement.Track;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giorgy
 */
public class TrackTest {
    Track track;
    
    public TrackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.track = new Track("testTrackName", 30);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Track.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Track instance = new Track("testTrackName", 30);
        String expResult = this.track.getName();
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Track.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "tesNameTwo";
        Track instance = new Track();
        instance.setName(name);
        
        String expResult = name;
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTime method, of class Track.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Track instance = new Track("testeName", 30);
        int expResult = 30;
        int result = instance.getTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTime method, of class Track.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = 30;
        Track instance = new Track();
        instance.setTime(time);
        
        int expResult = time;
        int result = instance.getTime();
        assertEquals(expResult, result);

    }
    /**
     * Test of toString method, of class Track.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "Track{name= testTrackName, time= 30}";
        String result = this.track.toString();
        assertEquals(expResult, result);

    }
    
}
