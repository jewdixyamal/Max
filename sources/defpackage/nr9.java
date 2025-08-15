package defpackage;

/* renamed from: nr9  reason: default package */
public final class nr9 extends gle {
    public long X;
    public String Y;
    public long c;
    public long o;

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1274507337:
                if (str.equals("fileId")) {
                    c2 = 0;
                    break;
                }
                break;
            case -661256303:
                if (str.equals("audioId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 2;
                    break;
                }
                break;
            case 452782838:
                if (str.equals("videoId")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.X = lz7.M(gy8, 0);
                return;
            case 1:
                this.c = lz7.M(gy8, 0);
                return;
            case 2:
                this.Y = lz7.P(gy8);
                return;
            case 3:
                this.o = lz7.M(gy8, 0);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        long j3 = this.X;
        String str = this.Y;
        StringBuilder k = au1.k(j, "{audioId=", ", videoId=");
        k.append(j2);
        au1.q(j3, ", fileId=", ", error='", k);
        return zr6.l(k, str, "'}");
    }
}
