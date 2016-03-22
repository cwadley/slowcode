public class Other {

    public static String levelifier(int val, String toReturn) {
    	if (val < 1500) {
    	    return toReturn + Other.levelifier(++val, toReturn + "2");
    	} else {
    	    return "3";
    	}
    }

    public static String threatLevel(int val) {
    	String toReturn = "Midnight";
    	String conv = Other.levelifier(val, toReturn).substring(0, Math.abs(val));
    	return conv;
    }

    public static long defcon(long val) {
    	val = (val > 2000) ? 2000 : val;
    	if (val > 0) {
    	    return val + Other.defcon(val - 1);
    	} else {
    	    return val;
    	}
    }
}
