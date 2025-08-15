package defpackage;

/* renamed from: o26  reason: default package */
public abstract class o26 {
    public final hle a;
    public final o45 b;
    public int c;
    public int d;
    public fef e;

    public o26(hle hle, o45 o45) {
        this.a = hle;
        this.b = o45;
    }

    public void a(fef fef, int i, int i2) {
        if (!fef.equals(this.e)) {
            this.e = fef;
            this.c = i;
            this.d = i2;
        }
    }
}
