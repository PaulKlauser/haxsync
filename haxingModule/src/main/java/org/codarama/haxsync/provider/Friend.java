package org.codarama.haxsync.provider;

import java.util.ArrayList;


public interface Friend {
    String getName(boolean ignoreMiddleNames);

    String getUserName();

    String getPicURL();

    long getPicTimestamp();

    ArrayList<Status> getStatuses();
}
