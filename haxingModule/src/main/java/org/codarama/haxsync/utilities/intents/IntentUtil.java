package org.codarama.haxsync.utilities.intents;


import android.app.Activity;

import java.util.List;

/**
 * Created by Tishun on 5.9.2015 г..
 */
public class IntentUtil {

    public static IntentBuilder getIntentBuilder(Activity activity) {
        throw new RuntimeException("Not yet developed");
    }

    public static IntentBuilder getFallbackBuilder() {
        throw new RuntimeException("Not yet developed");
    }

    public static NameList getApps(Activity activity) {
        throw new RuntimeException("Not yet developed");
    }

    public static class NameList {
        public List<Character> namesAvail;
        public List<Character> pkgsAvail;
    }
}
