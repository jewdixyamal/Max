package defpackage;

import android.content.Context;

/* renamed from: xp  reason: default package */
public final class xp implements up {
    public final fig b;

    public xp(Context context) {
        hgf hgf;
        synchronized (tfg.class) {
            try {
                if (tfg.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    tfg.a = new hgf(new y7f(4, applicationContext != null ? applicationContext : context));
                }
                hgf = tfg.a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.b = (fig) ((ifg) hgf.a).r();
    }
}
