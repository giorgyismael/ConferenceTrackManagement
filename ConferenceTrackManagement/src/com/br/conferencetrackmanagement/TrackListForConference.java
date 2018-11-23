
package com.br.conferencetrackmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 * Objeto criado para conter os itens necessários para a listagem final des trilhas
 * @author giorgy
 */
public class TrackListForConference {

    private List<String> trackListFinal;
    int trackDay;

    public TrackListForConference() {
        this.trackListFinal = new LinkedList<String>();
        this.trackDay = 0;

    }

    //Adiciona o a variavel trackDay na lista da conferencia
    public void addTrackDay(int day) {
        String track;
        this.trackDay += day;
        track = "Track " + this.trackDay  + ":";
        
        this.trackListFinal.add(track);
    }
 
    //Adiciona Espaço em branco na lista
    public void addEmpityEspace() {
   
        this.trackListFinal.add("");
    }

    //Adiciona uma track na lista da conferencia
    public void addTrack(Date date, Track track) {
        String trackAux;
        trackAux = formatToNorthAmerica(date) + " " + track.getName() + track.getTime() + "min";
        this.trackListFinal.add(trackAux);
    }
   
    //Adiciona uma track na lista da conferencia
    public void addTrack(Date date, String nameTrack) {
        String trackAux;
        trackAux = formatToNorthAmerica(date) + " " + nameTrack;
        this.trackListFinal.add(trackAux);
    }

    //Recebe um Objeto date e Retorna uma String com a data formatada no padrão Norte Americano
    public String formatToNorthAmerica(Date dateConvert) {
        String response;

        SimpleDateFormat TrackTime = new SimpleDateFormat("hh:mmaa");
        response = TrackTime.format(dateConvert);
        return response;
    }

    //Retorna uma String com todas as posições da tracklist
    public String toString() {
        String trackList = "";

        for (String track : this.trackListFinal) {
            trackList += track.toString() + "\n";
        }

        return trackList;
    }
}
