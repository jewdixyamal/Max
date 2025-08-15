package defpackage;

import android.util.CloseGuard;

/* renamed from: h43  reason: default package */
public final class h43 implements i43 {
    public final CloseGuard a = new CloseGuard();

    public final void a() {
        this.a.warnIfOpen();
    }

    public final void b(String str) {
        this.a.open(str);
    }

    public final void close() {
        this.a.close();
    }
}
