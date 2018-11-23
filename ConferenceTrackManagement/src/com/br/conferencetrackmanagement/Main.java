
package com.br.conferencetrackmanagement;
/*
 * Teste desenvolvido para Empresa NeoGrid
 * Data: 23/11/2018
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
        
    
    
