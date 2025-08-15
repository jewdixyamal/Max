package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* renamed from: a78  reason: default package */
public final class a78 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b78 b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ gaa o;

    public a78(gaa gaa, c78 c78, String str, ResultReceiver resultReceiver) {
        this.o = gaa;
        this.b = c78;
        this.c = resultReceiver;
    }

    public final void run() {
        ResultReceiver resultReceiver = this.c;
        gaa gaa = this.o;
        b78 b78 = this.b;
        switch (this.a) {
            case 0:
                s68 s68 = (s68) ((cj8) gaa.a).X.get(((c78) b78).a.getBinder());
                if (s68 != null) {
                    cj8 cj8 = (cj8) gaa.a;
                    cj8.getClass();
                    cj8.Y = s68;
                    if (true && true) {
                        resultReceiver.send(-1, (Bundle) null);
                    } else {
                        Bundle bundle = new Bundle();
                        int i = MediaBrowserCompat.MediaItem.FLAG_BROWSABLE;
                        bundle.putParcelable("media_item", (Parcelable) null);
                        resultReceiver.send(0, bundle);
                    }
                    cj8.Y = null;
                    return;
                }
                return;
            default:
                s68 s682 = (s68) ((cj8) gaa.a).X.get(((c78) b78).a.getBinder());
                if (s682 != null) {
                    cj8 cj82 = (cj8) gaa.a;
                    cj82.getClass();
                    cj82.Y = s682;
                    resultReceiver.send(-1, (Bundle) null);
                    cj82.Y = null;
                    return;
                }
                return;
        }
    }

    public a78(gaa gaa, c78 c78, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.o = gaa;
        this.b = c78;
        this.c = resultReceiver;
    }
}
