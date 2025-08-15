package defpackage;

/* renamed from: ss9  reason: default package */
public final class ss9 extends gle {
    public long X;
    public f52 c;
    public long o;

    public ss9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2129294769:
                if (str.equals("startTime")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1607243192:
                if (str.equals("endTime")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = lz7.M(gy8, 0);
                return;
            case 1:
                this.X = lz7.M(gy8, 0);
                return;
            case 2:
                this.c = f52.a(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.o;
        long j2 = this.X;
        f52 f52 = this.c;
        StringBuilder k = au1.k(j, "{startTime=", ", endTime=");
        k.append(j2);
        k.append(", chat=");
        k.append(f52);
        k.append("}");
        return k.toString();
    }
}
