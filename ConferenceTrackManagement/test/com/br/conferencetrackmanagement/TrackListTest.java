package com.br.conferencetrackmanagement;

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
public class TrackListTest {
    TrackList trackList;
    
    public TrackListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Track track00 = new Track("Track00", 30);
        Track track01 = new Track("Track00", 45);
        Track track02 = new Track("Track00", 60);
        Track track03 = new Track("Track00", 05);
        
        this.trackList = new TrackList();
        this.trackList.addTrack(track00);
        this.trackList.addTrack(track01);
        this.trackList.addTrack(track02);
        this.trackList.addTrack(track03);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTrack method, of class TrackList.
     */
    @Test
    public void testAddTrack_String_int() {
        System.out.println("addTrack");
        String name = "";
        int time = 0;
        TrackList instance = new TrackList();
        instance.addTrack(name, time);
        assertEquals(instance.getSize(), 1);
  
    }

    /**
     * Test of addTrack method, of class TrackList.
     */
    @Test
    public void testAddTrack_Track() {
        System.out.println("addTrack");
        Track track = null;
        TrackList instance = new TrackList();
        instance.addTrack(track);
        assertEquals(instance.getSize(), 1);
    }

    /**
     * Test of removeTrack method, of class TrackList.
     */
    @Test
    public void testRemoveTrack() {
        System.out.println("removeTrack");
        Track track = null;
        TrackList instance = new TrackList();
        instance.removeTrack(track);
        assertEquals(instance.getSize(), 0);
    }

    /**
     * Test of getTrackForTime method, of class TrackList.
     */
    @Test
    public void testGetTrackForTime() {
        System.out.println("getTrackForTime");
        int time = 30;
        TrackList instance = new TrackList();
        int expResult = 30;
        int result =  this.trackList.getTrackForTime(time).getTime();
        assertEquals(expResult, result);

    }

    
}
