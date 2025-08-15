package defpackage;

/* renamed from: yg5  reason: default package */
public final class yg5 extends gle {
    public String c;
    public Boolean o;

    public yg5(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("unsafe")) {
            this.o = Boolean.valueOf(lz7.H(gy8));
        } else if (!str.equals("url")) {
            gy8.z();
        } else {
            this.c = lz7.P(gy8);
        }
    }

    public final String toString() {
        String str = this.c;
        Boolean bool = this.o;
        return "{url='" + str + "'unsafe='" + bool + "'}";
    }
}
