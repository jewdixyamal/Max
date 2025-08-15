package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: pr6  reason: default package */
public interface pr6 extends IInterface {
    void B0(ja8 ja8);

    void T(String str, Bundle bundle, zh8 zh8);

    void W(mr6 mr6);

    void adjustVolume(int i, int i2, String str);

    void fastForward();

    void g0(mr6 mr6);

    Bundle getExtras();

    long getFlags();

    PendingIntent getLaunchPendingIntent();

    hd8 getMetadata();

    String getPackageName();

    i3b getPlaybackState();

    List getQueue();

    CharSequence getQueueTitle();

    int getRatingType();

    int getRepeatMode();

    Bundle getSessionInfo();

    int getShuffleMode();

    String getTag();

    upa getVolumeAttributes();

    boolean isCaptioningEnabled();

    boolean isTransportControlEnabled();

    void j(h5c h5c, Bundle bundle);

    void k0(ja8 ja8);

    void m(h5c h5c);

    void next();

    void pause();

    void play();

    void playFromMediaId(String str, Bundle bundle);

    void playFromSearch(String str, Bundle bundle);

    void playFromUri(Uri uri, Bundle bundle);

    void prepare();

    void prepareFromMediaId(String str, Bundle bundle);

    void prepareFromSearch(String str, Bundle bundle);

    void prepareFromUri(Uri uri, Bundle bundle);

    void previous();

    void removeQueueItemAt(int i);

    void rewind();

    void seekTo(long j);

    void sendCustomAction(String str, Bundle bundle);

    boolean sendMediaButton(KeyEvent keyEvent);

    void setCaptioningEnabled(boolean z);

    void setPlaybackSpeed(float f);

    void setRepeatMode(int i);

    void setShuffleMode(int i);

    void setVolumeTo(int i, int i2, String str);

    void skipToQueueItem(long j);

    void stop();

    void t0(ja8 ja8, int i);
}
