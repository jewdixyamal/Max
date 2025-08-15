package defpackage;

/* renamed from: oz1  reason: default package */
public final class oz1 extends iv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b(int i, pv1 pv1) {
        switch (this.a) {
            case 1:
                i99 i99 = (i99) this.b;
                synchronized (i99.a) {
                    try {
                        if (!i99.X) {
                            i99.t0.put(pv1.getTimestamp(), new qv1(pv1));
                            i99.e();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                for (l9f l9f : ((aqf) this.b).a) {
                    fad fad = l9f.n;
                    for (iv1 b2 : fad.g.e) {
                        b2.b(i, new ik5(pv1, fad.g.g, -1));
                    }
                }
                return;
            default:
                return;
        }
    }

    public void d(int i) {
        switch (this.a) {
            case 0:
                ju0.D().execute(new cu1(7, this));
                return;
            default:
                return;
        }
    }
}
