package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: aqa  reason: default package */
public final class aqa implements fo7 {
    public final ypa X;
    public volatile Object Y;
    public final long a;
    public final z24 b;
    public final int c;
    public final t1e o;

    public aqa(r24 r24, Uri uri, int i, ypa ypa) {
        Map emptyMap = Collections.emptyMap();
        if (uri != null) {
            z24 z24 = new z24(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
            this.o = new t1e(r24);
            this.b = z24;
            this.c = i;
            this.X = ypa;
            this.a = xn7.h.getAndIncrement();
            return;
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void a() {
    }

    public final void load() {
        this.o.b = 0;
        w24 w24 = new w24((r24) this.o, this.b);
        try {
            w24.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.Y = this.X.g(uri, w24);
        } finally {
            maf.h(w24);
        }
    }
}
