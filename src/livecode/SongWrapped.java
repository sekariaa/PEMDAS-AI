package livecode;

import java.util.Scanner;

public class SongWrapped {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);

    String inputLine = scanner.nextLine();
    String[] songTitles = inputLine.split(",");

    for (int i = 0; i < songTitles.length; i++) {
        songTitles[i] = songTitles[i].trim();
    }

    if (allTitlesOccurOnce(songTitles)) {
      System.out.println("Semua judul muncul sekali.");
  } else {
    String mostFrequentTitle = findMostFrequentTitle(songTitles);
    String leastFrequentTitle = findLeastFrequentTitle(songTitles);

    // Menampilkan hasil
    System.out.println("Judul lagu paling banyak: " + mostFrequentTitle);
    System.out.println("Judul lagu paling sedikit: " + leastFrequentTitle);
  }
  }
  
  //COMPLETE ALL THE METHODS BELOW AND DO NOT REMOVE!!!
  private static String findMostFrequentTitle(String[] titles) {
    //Enter your code here
    String mostFrequentTitle = "";
    int mostFrequentCount = 0;

    for (int i = 0; i < titles.length; i++) {
        int count = countFrequency(titles, titles[i]);

        if (count > mostFrequentCount) {
            mostFrequentTitle = titles[i];
            mostFrequentCount = count;
        }
    }

    return mostFrequentTitle + " dengan total: " + mostFrequentCount;
  }  
  
  private static String findLeastFrequentTitle(String[] titles) {
    //Enter your code here.
    String leastFrequentTitle = "";
    int leastFrequentCount = Integer.MAX_VALUE;

    for (int i = 0; i < titles.length; i++) {
        int count = countFrequency(titles, titles[i]);

        if (count < leastFrequentCount) {
            leastFrequentTitle = titles[i];
            leastFrequentCount = count;
        }
    }

    return leastFrequentTitle + " dengan total: " + leastFrequentCount;
  }
  
  private static int countFrequency(String[] titles, String title) {
    //Enter your code here
    int count = 0;

    for (String t : titles) {
        if (t.equalsIgnoreCase(title)) {
            count++;
        }
    }

    return count;
  }
  
  private static boolean allTitlesOccurOnce(String[] titles) {
      //Enter your code here
    for (int i = 0; i < titles.length; i++) {
        int count = countFrequency(titles, titles[i]);
        if (count != 1) {
            return false;
        }
    }
    return true;
  }
}
