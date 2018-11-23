/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.conferencetrackmanagement;

/**
 *
 * @author giorgy
 */
public class Main {

    public static void main(String[] args) {

        ReadInputFile read = new ReadInputFile();
        read.readInputFile("src/com/br/conferencetrackmanagement/input.txt");
        TrackList trackList = read.getTrackList();
        trackList.sort();
        
        ConferenceTrackManagement conferenceTrackManagement;
        conferenceTrackManagement = new ConferenceTrackManagement(trackList);
        conferenceTrackManagement.createTrackTrail();
        System.out.println(conferenceTrackManagement.toString());
        }
    }
        
    
    
