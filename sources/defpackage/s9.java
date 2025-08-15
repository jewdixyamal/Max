package defpackage;

/* renamed from: s9  reason: default package */
public final class s9 {
    public final nv4 a;

    public s9(nv4 nv4) {
        this.a = nv4;
    }

    public final void a(pv4 pv4) {
        uv4 uv4 = (uv4) pv4;
        uv4.a.remove(this.a);
        uv4.invalidate();
    }
}
