package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: rd6  reason: default package */
public final class rd6 implements ol7 {
    public final Uri X;
    public final wm3 Y;
    public final List Z;
    public final long a;
    public final CharSequence b;
    public final w6b c;
    public final w6b o;
    public final boolean s0;
    public final int t0 = z8a.p;
    public final long u0;

    public rd6(long j, String str, w6b w6b, w6b w6b2, Uri uri, wm3 wm3, wz wzVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = w6b;
        this.o = w6b2;
        this.X = uri;
        this.Y = wm3;
        this.Z = wzVar;
        this.s0 = z;
        this.u0 = j;
    }

    public final long getItemId() {
        return this.u0;
    }

    public final int l() {
        return this.t0;
    }
}
