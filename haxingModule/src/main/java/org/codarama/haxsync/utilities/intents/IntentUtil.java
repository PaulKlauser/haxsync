package org.codarama.haxsync.utilities.intents;

import android.app.Activity;

import java.util.List;

/**
 * <p>High amount of magic happens here.</p>
 *
 * <p>This is a missing class from the original repo that I will try to recreate. Supposedly it should be used to build up Intents<p/>
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
