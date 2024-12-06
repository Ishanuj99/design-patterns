package org.example.composite.FileSystem;

public class Main {
    public static void main(String[] args){
        Directory movieDirectory = new Directory("Movie");
        File intersteller = new File("Intersteller");
        movieDirectory.add(intersteller);
        Directory comedyMovies = new Directory("Comedy folder");
        FileSystem hangover = new File("Hangover");
        comedyMovies.add(hangover);
        movieDirectory.add(comedyMovies);

        movieDirectory.ls();
    }
}
