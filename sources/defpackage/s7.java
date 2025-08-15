package defpackage;

import android.os.SystemClock;

/* renamed from: s7  reason: default package */
public final class s7 {
    public long a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public void a() {
        if (this.b) {
            this.b = false;
            p7 p7Var = (p7) this.e;
            if (p7Var != null) {
                long j = this.a;
                ((wte) ((vte) this.c)).getClass();
                ((a66) this.d).invoke(p7Var, Long.valueOf(SystemClock.elapsedRealtime() - j));
            }
        }
    }
}
