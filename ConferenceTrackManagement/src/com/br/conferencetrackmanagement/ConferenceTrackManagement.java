
package com.br.conferencetrackmanagement;


import java.util.Date;
/**
 * Objeto criado para criar uma TrackListFinal contendo uma lista organizada de
 * Objetos Tracks conforme as regras descritas no teste
 * @author giorgy
 */
public class ConferenceTrackManagement {

    private TimeTrackingManager timeTrankiManager;
    TrackListForConference trackListFinal;
    TrackList trackList;

    public ConferenceTrackManagement(TrackList tracklist) {
        this.timeTrankiManager = new TimeTrackingManager(9, 0, 0);
        this.trackListFinal = new TrackListForConference();
        this.trackList = tracklist;
    }
    
    //Função Analisa a trackList e cria trackListFinal
    public void createTrackTrail() {

        while (this.trackList.getSize() >= 0) {

            checkAddTrackDay();
            checkAddTrack();

            if (this.trackList.getSize() == 0) {
                checkAddTrack();
                break;
            }
        }
    }
    
    //Verifica se deve adiconar um TrackDay novo na trackListFinal
    public void checkAddTrackDay() {
        int hour = this.timeTrankiManager.getHour();
        int minute = this.timeTrankiManager.getMinute();

        if (hour == 9 && minute == 00) {
            this.trackListFinal.addTrackDay(1);
        }
    }

    //Verifica qual a track deve ser adicionada na trackListFinal
    public void checkAddTrack() {
        this.trackList.sort();
        int time = this.timeTrankiManager.getTrackTimeOfNext();
        Date dateCorruent = this.timeTrankiManager.getTime();

        if (time > 0) {
            Track trackIndicated = this.trackList.getTracklessTime(time);
            if (trackIndicated != null) {
                this.trackListFinal.addTrack(dateCorruent, trackIndicated);
                this.trackList.removeTrack(trackIndicated);
                this.timeTrankiManager.addMinute(trackIndicated.getTime());
            } else {
                this.trackListFinal.addTrack(dateCorruent, "Networking Event");
                this.trackListFinal.addEmpityEspace();
                resetTimeTrackingManager();
            }
            
        } else if (time == -1) {
            this.trackListFinal.addTrack(dateCorruent, "Lunch");
            this.timeTrankiManager.addMinute(60);
        } else if (time == -2) {
            this.trackListFinal.addTrack(dateCorruent, "Networking Event");
            this.trackListFinal.addEmpityEspace();
            resetTimeTrackingManager();
        } else {
            this.trackListFinal.addTrack(dateCorruent, "Networking Event");
            resetTimeTrackingManager();
        }
    }

    //Reseta para hora inicial 
    public void resetTimeTrackingManager() {
        this.timeTrankiManager.setHour(9);
        this.timeTrankiManager.setMinute(0);
        this.timeTrankiManager.setSecond(0);
    }

    public String toString() {
        return this.trackListFinal.toString();
    }

}
