package defpackage;

/* renamed from: wm5  reason: default package */
public final class wm5 {
    public final sy4 a;
    public final vm5 b;

    /* JADX WARNING: type inference failed for: r0v2, types: [ja6, vm5] */
    public wm5(qq9 qq9, n5b n5b) {
        if (n5b.d > 0) {
            this.b = new ja6(qq9, n5b, rq9.o());
            this.a = new sy4(15, (Object) this);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final v84 a(int i) {
        return o43.p0((byte[]) this.b.get(i), this.a, o43.Y);
    }
}
