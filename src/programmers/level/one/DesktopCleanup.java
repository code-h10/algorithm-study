package programmers.level.one;

public class DesktopCleanup {
    public static void main(String[] args) {
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        int[] answer = new int[4];
        int minY = wallpaper.length;
        int minX = wallpaper[0].length();
        
        int maxY = 0;
        int maxX = 0;
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                
                minY = Math.min(minY, i);
                maxY = Math.max(maxY, i);
                
                for(int j = 0; j < wallpaper[i].length(); j++) {
                    if(wallpaper[i].charAt(j) == '#') {
                        minX = Math.min(minX, j);
                        maxX = Math.max(maxX, j);
                    }
                }               
            }
        }
        
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY + 1;
        answer[3] = maxX + 1;
        
        return answer;
    }
}
