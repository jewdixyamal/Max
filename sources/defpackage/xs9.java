package defpackage;

/* renamed from: xs9  reason: default package */
public final class xs9 extends gle {
    public long X;
    public long c;
    public s7b o;

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1276666629:
                if (str.equals("presence")) {
                    c2 = 0;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = s7b.a(gy8);
                return;
            case 1:
                this.c = gy8.w0();
                return;
            case 2:
                this.X = gy8.w0();
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        s7b s7b = this.o;
        long j2 = this.X;
        return "{userId=" + j + ", presence=" + s7b + ", time=" + j2 + "}";
    }
}
