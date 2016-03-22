public class Other {

    public static String levelifier() {
        StringBuilder toReturn = new StringBuilder("Midnight");
        StringBuilder addTo = new StringBuilder("Midnight");
        for (int i = 0; i < 46; i++)
        {
            addTo.append("2");
            toReturn.append(addTo.toString());
        }
        
        return toReturn.toString();
    }
    
    public static String threatLevel(int val) {
        String conv = levelifier();
        
        if (val < 0)
            conv = conv.substring(0, conv.length() - 2);
        else
            conv = conv.substring(0, conv.length() - 4);

        conv = conv.substring(0, Math.abs(val));
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
