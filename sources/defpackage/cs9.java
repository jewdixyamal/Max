package defpackage;

/* renamed from: cs9  reason: default package */
public final class cs9 extends gle {
    public fr7 X;
    public long c;
    public String o;

    public cs9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1109191185:
                if (str.equals("deviceId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = lz7.M(gy8, 0);
                return;
            case 1:
                this.o = lz7.P(gy8);
                return;
            case 2:
                this.X = fr7.a(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        String str = this.o;
        fr7 fr7 = this.X;
        StringBuilder j2 = z7b.j("Response{userId=", j, ", deviceId='", str);
        j2.append("', location=");
        j2.append(fr7);
        j2.append("}");
        return j2.toString();
    }
}
