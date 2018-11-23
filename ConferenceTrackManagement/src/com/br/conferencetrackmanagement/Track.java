package com.br.conferencetrackmanagement;

/**
 * Esta classe representa cada atividade "Track" . tem dois atributos, nome e
 tempo. Retorna um objeto do tipo Track
 */
public class Track implements Comparable<Track>{

    private 
        String name;
        int time;

    public Track() {
        this.name = null;
        this.time = 0;
    }
    
    public Track(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    //Impressão do Objeto
    @Override
    public String toString() {
       return String.format("Track{name= %s, time= %d}", this.name, this.time);
    }
    
    //Ordena o objeto pelo tempo
    @Override
    public int compareTo(Track track) {
    
        if (this.time > track.getTime()) {
              return -1;
            }
        if (this.time > track.getTime()) {
              return 1;
            }
         return 0;
         
        
    }
}
    