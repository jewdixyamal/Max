package defpackage;

import android.content.Context;

/* renamed from: o36  reason: default package */
public final class o36 implements xde {
    public final boolean X;
    public final khe Y = new khe(new ie(2, (Object) this));
    public boolean Z;
    public final Context a;
    public final String b;
    public final l0f c;
    public final boolean o;

    public o36(Context context, String str, l0f l0f, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = l0f;
        this.o = z;
        this.X = z2;
    }

    public final void close() {
        khe khe = this.Y;
        if (khe.a()) {
            ((n36) khe.getValue()).close();
        }
    }

    public final k36 getReadableDatabase() {
        return ((n36) this.Y.getValue()).a(false);
    }

    public final k36 getWritableDatabase() {
        return ((n36) this.Y.getValue()).a(true);
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        khe khe = this.Y;
        if (khe.a()) {
            ((n36) khe.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.Z = z;
    }
}
