
package com.br.conferencetrackmanagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Objetivo: Classe contem uma listagem de objetos track 
 * Realiza o Controle da Lista
 * @author giorgy
 */
public class TrackList {
    private List<Track> trackList;
    
    public TrackList(){
        this.trackList = new LinkedList<Track>();
    }
    
    //Criar um Objeto Track e adiciona a tracklist. 
    public void addTrack(String name, int time){
        this.trackList.add(new Track(name, time));
    }
    
    //Adicionar a tracklist um Objeto Track
    public void addTrack(Track track){
        this.trackList.add(track);
    }
    
    //remove track da tracklist
    public void removeTrack(Track track) {
        for (int i = 0; i < this.trackList.size(); i++) {
            Track trackAux = (Track) this.trackList.get(i);
            if (trackAux.equals(track)) {
                this.trackList.remove(i);
            }
        }
    }

    //Retorna tamanho da lista
    public int getSize(){
        return this.trackList.size();
    }

    //Retorna track conforme tempo informado
    public Track getTrackForTime(int time){
        for (Track track : this.trackList) {
            if (track.getTime() == time) {
                return track;
            }
        }
        return null;
    }

    //Retorna Track com tempo menor que o tempo informado
    public Track getTracklessTime(int time){
        for (Track track : this.trackList) {
            if (track.getTime() <= time) {
                return track;
            }
        }
        return null;
    }
    
    //Retorna a lista
    public List getTrackList(){
        return this.trackList;
    }
    
    //Retorna o tamanho da  lista
    public int getTrackSize(){
        return this.trackList.size();
    }
    
    //Ordena a lista pelo tempo
    public void sort(){
        Collections.sort(this.trackList);
    }

    //Retorna uma String com todas as posições da tracklist
    public String toString() {
        String trackList = "";

        for (Track track : this.trackList) {
            trackList += track.toString() + "\n";
        }
        return trackList;
    }
}



