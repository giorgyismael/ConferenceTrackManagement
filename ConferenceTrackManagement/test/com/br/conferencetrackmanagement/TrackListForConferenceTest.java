/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.conferencetrackmanagement;

import java.util.Date;
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
public class TrackListForConferenceTest {
    
    public TrackListForConferenceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTrackDay method, of class TrackListForConference.
     */
    @Test
    public void testAddTrackDay() {
        System.out.println("addTrackDay");
        int day = 0;
        TrackListForConference instance = new TrackListForConference();
        instance.addTrackDay(day);
        

    }

    /**
     * Test of addEmpityEspace method, of class TrackListForConference.
     */
    @Test
    public void testAddEmpityEspace() {
        System.out.println("addEmpityEspace");
        TrackListForConference instance = new TrackListForConference();
        instance.addEmpityEspace();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTrack method, of class TrackListForConference.
     */
    @Test
    public void testAddTrack_Date_Track() {
        System.out.println("addTrack");
        Date date = null;
        Track track = null;
        TrackListForConference instance = new TrackListForConference();
        instance.addTrack(date, track);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTrack method, of class TrackListForConference.
     */
    @Test
    public void testAddTrack_Date_String() {
        System.out.println("addTrack");
        Date date = null;
        String nameTrack = "";
        TrackListForConference instance = new TrackListForConference();
        instance.addTrack(date, nameTrack);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatToNorthAmerica method, of class TrackListForConference.
     */
    @Test
    public void testFormatToNorthAmerica() {
        System.out.println("formatToNorthAmerica");
        Date dateConvert = null;
        TrackListForConference instance = new TrackListForConference();
        String expResult = "";
        String result = instance.formatToNorthAmerica(dateConvert);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrackListForConference.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TrackListForConference instance = new TrackListForConference();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
