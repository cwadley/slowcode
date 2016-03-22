public class Chirp {
    public static boolean isChirpy(int n) {
    	return (n % 7) == 0;
    }

    public static boolean isNirpy(int n) {
    	return (n > 0) ? true : false;
    }

    public static int schnirpyLevel(int n) {
    	int toReturn = (Integer.MAX_VALUE - n) / 2;
    	return toReturn % 10;
    }
}
