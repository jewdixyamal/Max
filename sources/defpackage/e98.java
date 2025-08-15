package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: e98  reason: default package */
public final class e98 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ai8 e;

    public e98(Context context, ai8 ai8) {
        this.e = ai8;
        Object obj = ai8.b;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.a = mediaController;
        if (ai8.a() == null) {
            c98 c98 = new c98((Handler) null);
            c98.b = new WeakReference(this);
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, (Bundle) null, c98);
        }
    }

    public final void a() {
        pr6 a2 = this.e.a();
        if (a2 != null) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ba8 ba8 = (ba8) it.next();
                d98 d98 = new d98(ba8);
                this.d.put(ba8, d98);
                ba8.c = d98;
                try {
                    a2.g0(d98);
                    ba8.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                }
            }
            arrayList.clear();
        }
    }

    public final void b(ba8 ba8) {
        MediaController mediaController = this.a;
        b98 b98 = ba8.a;
        b98.getClass();
        mediaController.unregisterCallback(b98);
        synchronized (this.b) {
            pr6 a2 = this.e.a();
            if (a2 != null) {
                try {
                    d98 d98 = (d98) this.d.remove(ba8);
                    if (d98 != null) {
                        ba8.c = null;
                        a2.W(d98);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.c.remove(ba8);
            }
        }
    }
}
