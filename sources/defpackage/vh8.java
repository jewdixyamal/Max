package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.util.List;

/* renamed from: vh8  reason: default package */
public abstract class vh8 implements th8 {
    public final MediaSession a;
    public final uh8 b;
    public final ai8 c;
    public final Object d = new Object();
    public final Bundle e;
    public final RemoteCallbackList f = new RemoteCallbackList();
    public i3b g;
    public List h;
    public hd8 i;
    public int j;
    public int k;
    public t68 l;

    public vh8(Context context, String str, Bundle bundle) {
        MediaSession b2 = b(context, str, bundle);
        this.a = b2;
        uh8 uh8 = new uh8((wh8) this);
        this.b = uh8;
        this.c = new ai8(b2.getSessionToken(), uh8);
        this.e = bundle;
        b2.setFlags(3);
    }

    public abstract MediaSession b(Context context, String str, Bundle bundle);

    public final void c(t68 t68, Handler handler) {
        synchronized (this.d) {
            try {
                this.l = t68;
                this.a.setCallback(t68 == null ? null : (sh8) t68.b, handler);
                if (t68 != null) {
                    t68.I(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t68 getCallback() {
        t68 t68;
        synchronized (this.d) {
            t68 = this.l;
        }
        return t68;
    }
}
