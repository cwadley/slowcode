public class SlowCode {

    private static int checkValue(String x) {
	    return Integer.parseInt(x) - 1;
    }

    public static void main(String[] args) {
    	System.out.print("Loading...");
    	try {
    	    // Modify this value to increase loading time
    	    // (in ms)
    	    Thread.sleep(10000);
    	} catch (Exception lolex) {
    	    // We're living on the edge
    	}
    	System.out.println("DONE!");


        if (args.length != 1) {
    	    System.out.println("Just one argument, buddy!");
    	    System.exit(1);
    	}

    	int val = checkValue(args[0]);

    	System.out.println("=6(MUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(EFGIMUFGIMUGIMUHLSIMUJOYKRLSMUNXOYPQRSTUVWXYZA=6(B@;2CA=6(DCA=6(E");

    	System.out.println("Statistics of value " + val + ":");
    	System.out.println("Chirpy Number? " + Chirp.isChirpy(val));
    	System.out.println("Nirpy Number? " + Chirp.isNirpy(val));
    	System.out.println("Schnirpiness Level " + Chirp.schnirpyLevel(val));
    	System.out.println("Threat Level: " + Other.threatLevel(val));
    	System.out.println("DEFCON: " + Other.defcon(val));
    }
}
