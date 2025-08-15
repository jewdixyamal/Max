package defpackage;

/* renamed from: c70  reason: default package */
public final /* synthetic */ class c70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c70(e70 e70, boolean z, int i) {
        this.a = i;
        this.b = e70;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                e70 e70 = this.b;
                int s = au1.s(e70.g);
                if (s == 0) {
                    e70.b.set((Object) null);
                    e70.c.set(false);
                    e70.g = 2;
                    e70.a.execute(new c70(e70, this.c, 1));
                    e70.d();
                    return;
                } else if (s == 2) {
                    throw new AssertionError("AudioSource is released");
                } else {
                    return;
                }
            default:
                e70 e702 = this.b;
                int s2 = au1.s(e702.g);
                if (s2 == 0 || s2 == 1) {
                    boolean z = e702.r;
                    boolean z2 = this.c;
                    if (z != z2) {
                        e702.r = z2;
                        if (e702.g == 2) {
                            e702.a();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (s2 == 2) {
                    throw new AssertionError("AudioSource is released");
                } else {
                    return;
                }
        }
    }
}
