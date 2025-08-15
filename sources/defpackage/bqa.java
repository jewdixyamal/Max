package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: bqa  reason: default package */
public final class bqa implements go7 {
    public final zpa X;
    public volatile Object Y;
    public final long a = yn7.b.getAndIncrement();
    public final a34 b;
    public final int c;
    public final u1e o;

    public bqa(t24 t24, Uri uri, int i, zpa zpa) {
        Map emptyMap = Collections.emptyMap();
        fm9.m(uri, "The uri must be set.");
        a34 a34 = new a34(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
        this.o = new u1e(t24);
        this.b = a34;
        this.c = i;
        this.X = zpa;
    }

    public final void a() {
    }

    public final void load() {
        this.o.b = 0;
        w24 w24 = new w24((t24) this.o, this.b);
        try {
            w24.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.Y = this.X.a(uri, w24);
        } finally {
            oaf.h(w24);
        }
    }
}
