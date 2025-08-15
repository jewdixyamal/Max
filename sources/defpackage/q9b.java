package defpackage;

import android.os.Handler;

/* renamed from: q9b  reason: default package */
public final class q9b implements eh7 {
    public static final q9b s0 = new q9b();
    public Handler X;
    public final gh7 Y = new gh7(this);
    public final nn6 Z = new nn6(29, this);
    public int a;
    public int b;
    public boolean c = true;
    public boolean o = true;

    public final gh7 Q() {
        return this.Y;
    }

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i != 1) {
            return;
        }
        if (this.c) {
            this.Y.d(eg7.ON_RESUME);
            this.c = false;
            return;
        }
        this.X.removeCallbacks(this.Z);
    }
}
