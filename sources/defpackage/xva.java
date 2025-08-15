package defpackage;

/* renamed from: xva  reason: default package */
public final class xva extends lz {
    public final je7 c;
    public rx d;

    public xva(l20 l20, khe khe) {
        super(l20);
        this.c = khe;
    }

    public final void a() {
        b(this.d, new Throwable("cancelled"));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, mec] */
    public final qy9 d() {
        qy9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        ? obj = new Object();
        rx rxVar = this.d;
        obj.a = rxVar;
        if (rxVar != null) {
            return rxVar;
        }
        rx rxVar2 = new rx();
        this.d = rxVar2;
        obj.a = rxVar2;
        ((av6) this.c.getValue()).a(this.a.b.a(), new wva(this, 0, obj));
        return (qy9) obj.a;
    }
}
