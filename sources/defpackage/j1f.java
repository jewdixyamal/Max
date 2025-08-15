package defpackage;

/* renamed from: j1f  reason: default package */
public final /* synthetic */ class j1f implements q3a {
    public final /* synthetic */ k1f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sf6 c;

    public /* synthetic */ j1f(k1f k1f, int i, sf6 sf6) {
        this.a = k1f;
        this.b = i;
        this.c = sf6;
    }

    public final void b(lv4 lv4, long j, qy5 qy5, boolean z) {
        int i = this.b;
        sf6 sf6 = this.c;
        k1f k1f = this.a;
        if (k1f.j.c) {
            synchronized (k1f.j.l) {
                try {
                    if (!k1f.j.m.P(k1f.a) || i != 2) {
                        if (!((mv4) k1f.c.a.get(k1f.a)).b) {
                            boolean z2 = true;
                            fm9.j("MediaItem duration required for sequence looping could not be extracted.", j != -9223372036854775807L);
                            k1f.i += j;
                            synchronized (k1f.j.q) {
                                if (z) {
                                    try {
                                        l1f l1f = k1f.j;
                                        l1f.v--;
                                    } catch (Throwable th) {
                                        while (true) {
                                            throw th;
                                        }
                                    }
                                }
                                if (k1f.j.v != 0) {
                                    z2 = false;
                                }
                                if (k1f.i > k1f.j.u || z2) {
                                    l1f l1f2 = k1f.j;
                                    l1f2.u = Math.max(k1f.i, l1f2.u);
                                    for (int i2 = 0; i2 < k1f.j.k.size(); i2++) {
                                        ((e6d) k1f.j.k.get(i2)).j(k1f.j.u, z2);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
        }
        sf6.b(lv4, j, qy5, z);
    }
}
