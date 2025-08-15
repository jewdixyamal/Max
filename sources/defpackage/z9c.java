package defpackage;

/* renamed from: z9c  reason: default package */
public final class z9c extends gle {
    public String c;
    public boolean o = true;

    public z9c(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("tls")) {
            this.o = gy8.u0();
        } else if (!str.equals("redirectHost")) {
            gy8.z();
        } else {
            this.c = lz7.P(gy8);
        }
    }

    public final String c() {
        int indexOf;
        if (oag.t(this.c) || (indexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        String str = this.c;
        return str.substring(indexOf + 1, str.length());
    }

    public final String toString() {
        String str = this.c;
        boolean z = this.o;
        return "{redirectHost='" + str + "', tls=" + z + "}";
    }
}
