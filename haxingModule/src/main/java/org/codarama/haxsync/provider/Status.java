package org.codarama.haxsync.provider;

public interface Status {
    String getMessage();

    long getTimestamp();

    String getPermalink();

    String getID();
}
