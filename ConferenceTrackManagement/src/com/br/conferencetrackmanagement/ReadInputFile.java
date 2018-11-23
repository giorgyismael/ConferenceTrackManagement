package com.br.conferencetrackmanagement;

import java.io.*;

/**
 * Classe análisa um arquivo de texto de dados. Objetivo é buscar os atributos:
 * nome, tempo de de duração. 
 * Cada linha do arquivo é analisado
 * Adiconace um objeto Track a trackLists 
 * Retornar uma lista com todas as tracks do arquivo de input.txt.
 */
public class ReadInputFile {

    private TrackList trackLists;

    public ReadInputFile() {
        this.trackLists = new TrackList();
    }

    //Recebe o caminho do arquivo e: (Abre, Lê, Formata, e adicona um Objeto Track na track Li)
    public void readInputFile(String pathFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            while (br.ready()) {
                String line = br.readLine();
                String stringFormat = formatLineInNameAndTime(line);
                Track newTrack = formatStringInTrack(stringFormat);
                this.trackLists.addTrack(newTrack);
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //Recebe uma string, Retorna uma String nava string formatda com nome e tempo
    public String formatLineInNameAndTime(String line) {
        String name = "";
        String nameAux = "";
        String time = "";

        for (char caracter : line.toCharArray()) {
            if (Character.isDigit(caracter)) {
                time += caracter;
            } else {
                name += caracter;
            }
        }

        nameAux = name.replaceAll("min", "");
        if (time == "") {time = "5";}

        return String.format("%s,%s", nameAux, time);
    }
    
    //Recebe string com nome e tempo, retorna um Objeto Trac
    public Track formatStringInTrack(String line) {
        String[] preTrack = line.split(",");
        Track track = new Track(preTrack[0], Integer.parseInt(preTrack[1]));
        return track;
    }
   
    //Retorna a TrackList
    public TrackList getTrackList(){
        return this.trackLists;
    }
    
    //Impressão da Lista
    public String toString() {
        return this.trackLists.toString();

    }
}
