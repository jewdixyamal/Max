package defpackage;

/* renamed from: rob  reason: default package */
public final class rob implements xaf {
    public boolean a = false;
    public boolean b = false;
    public kf5 c;
    public final qob d;

    public rob(qob qob) {
        this.d = qob;
    }

    public final xaf b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.c(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final xaf c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
