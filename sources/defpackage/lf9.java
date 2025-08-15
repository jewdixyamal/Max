package defpackage;

/* renamed from: lf9  reason: default package */
public final class lf9 extends gle {
    public String X;
    public fs8 c;
    public f52 o;

    public lf9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2091130755:
                if (str.equals("chatAccessToken")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 1;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.X = lz7.P(gy8);
                return;
            case 1:
                this.o = f52.a(gy8);
                return;
            case 2:
                this.c = tpa.z(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        fs8 fs8 = this.c;
        f52 f52 = this.o;
        return "Response{, message=" + fs8 + ", chat=" + f52 + "}";
    }
}
