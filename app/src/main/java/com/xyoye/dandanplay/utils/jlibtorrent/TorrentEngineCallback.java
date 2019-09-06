package com.xyoye.dandanplay.utils.jlibtorrent;

public interface TorrentEngineCallback {

    void onTorrentAdded(String hash);

    void onTorrentStateChanged(String hash);

    void onTorrentFinished(String hash);

    void onTorrentRemoved(String hash);

    void onTorrentPaused(String hash);

    void onTorrentResumed(String hash);

    void onEngineStarted();

    void onTorrentMoved(String hash, boolean success);

    void onTorrentError(String hash, String errorMsg);

    void onSessionError(String errorMsg);
}