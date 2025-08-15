package defpackage;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.util.Log;

/* renamed from: xi8  reason: default package */
public final class xi8 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile xi8 d;
    public ui8 a;

    /* JADX WARNING: type inference failed for: r1v1, types: [xi8, java.lang.Object] */
    public static xi8 a(Context context) {
        xi8 xi8;
        if (context != null) {
            synchronized (c) {
                try {
                    if (d == null) {
                        Context applicationContext = context.getApplicationContext();
                        ? obj = new Object();
                        ui8 ui8 = new ui8(applicationContext);
                        MediaSessionManager mediaSessionManager = (MediaSessionManager) applicationContext.getSystemService("media_session");
                        obj.a = ui8;
                        d = obj;
                    }
                    xi8 = d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return xi8;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public final boolean b(vi8 vi8) {
        if (vi8 != null) {
            return this.a.b(vi8.a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
