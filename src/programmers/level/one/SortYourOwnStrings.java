package programmers.level.one;

public class SortYourOwnStrings {
    public static void main(String[] args) {
        
      String[] strings = {"sun", "bed", "car"};
      int n 1;
      List<String> stringsList = new ArrayList<>();
      String[] result = new String[strings.length];
      for(int i = 0; i < strings.length; i++) {
        stringsList.add(strings[i]);
      }
        
      Collections.sort(stringsList, new AlphabetComparator(n));
        
      for(int i = 0; i < strings.length; i++) {
        result[i] = stringsList.get(i);
      }
        
      return result;
    }

    public static class AlphabetComparator implements Comparator<String> {
      
      private int n;
      AlphabetComparator(int n) {
        this.n = n;
      }    
      @Override
      public int compare(String s1, String s2) {
            
        if(s1.charAt(n) > s2.charAt(n)) {
          return 1;
        } else if(s1.charAt(n) == s2.charAt(n)) {
          return s1.compareTo(s2);  
        } else {
          return -1;
        }
      }
    }
}
