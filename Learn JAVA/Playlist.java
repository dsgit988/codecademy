import java.util.ArrayList;

public class Playlist {

    public static void main(String[] args){
        ArrayList<String> desertIslandPlaylist =  new ArrayList<String>();
        desertIslandPlaylist.add("For the First Time");
        desertIslandPlaylist.add("Hits Different");
        desertIslandPlaylist.add("This Is New York");
        desertIslandPlaylist.add("If I Were a Fish");
        desertIslandPlaylist.add("Miracle");
        desertIslandPlaylist.add("Last Night");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(1);
        System.out.println(desertIslandPlaylist);

        int indexA = desertIslandPlaylist.indexOf("This Is New York");
        int indexB = desertIslandPlaylist.indexOf("Miracle");

        String tempA = "This Is New York";
        desertIslandPlaylist.set(indexA, "Miracle");
        desertIslandPlaylist.set(indexB, tempA);




    }
}
