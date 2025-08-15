package defpackage;

/* renamed from: fe3  reason: default package */
public final class fe3 extends gle {
    public String c;
    public gaf o;

    public fe3(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("hash")) {
            this.c = gy8.z0();
        } else if (!str.equals("user")) {
            gy8.z();
        } else {
            this.o = tu0.E(gy8);
        }
    }

    public final String toString() {
        String str = this.c;
        gaf gaf = this.o;
        return "{hash='" + str + "', userSettings=" + gaf + "}";
    }
}
