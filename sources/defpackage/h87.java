package defpackage;

/* renamed from: h87  reason: default package */
public abstract class h87 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else if (this.b != i) {
            StringBuilder n = rh4.n(i, "Given job ID ", " is different than previous ");
            n.append(this.b);
            throw new IllegalArgumentException(n.toString());
        }
    }

    public void b() {
    }
}
