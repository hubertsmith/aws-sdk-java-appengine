package com.amazonaws.http.appengine;

public final class GAEUtils {

    private GAEUtils() {
    }

    /**
     * Indicates if current JVM is running on Google App Engine.
     * @see <a href="http://code.google.com/appengine/docs/java/runtime.html#The_Environment">GAE documentation</a>
     * @return true if running in GAE mode.
     */
    public static boolean isGaeMode() {
        return System.getProperty("com.google.appengine.runtime.environment") != null;
    }
}
