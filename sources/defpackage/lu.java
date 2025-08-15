package defpackage;

/* renamed from: lu  reason: default package */
public final class lu extends gle {
    public boolean c;
    public long o;

    public lu(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("success")) {
            this.c = lz7.H(gy8);
        } else if (!str.equals("updateTime")) {
            gy8.z();
        } else {
            this.o = lz7.M(gy8, 0);
        }
    }

    public final String toString() {
        boolean z = this.c;
        long j = this.o;
        return "Response{success=" + z + ", updateTime=" + j + "}";
    }
}
