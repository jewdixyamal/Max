package defpackage;

/* renamed from: ax5  reason: default package */
public final class ax5 extends qw8 {
    public static volatile ax5[] i;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";

    public ax5() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long j = this.a;
        int h2 = j != 0 ? y43.h(1, j) : 0;
        if (!this.b.equals("")) {
            h2 += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += y43.l(3, this.c);
        }
        if (!this.d.equals("")) {
            h2 += y43.l(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            h2 += y43.h(5, j2);
        }
        if (!this.f.equals("")) {
            h2 += y43.l(6, this.f);
        }
        if (!this.g.equals("")) {
            h2 += y43.l(7, this.g);
        }
        return !this.h.equals("") ? h2 + y43.l(8, this.h) : h2;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = x43.q();
            } else if (s == 18) {
                this.b = x43.r();
            } else if (s == 26) {
                this.c = x43.r();
            } else if (s == 34) {
                this.d = x43.r();
            } else if (s == 40) {
                this.e = x43.q();
            } else if (s == 50) {
                this.f = x43.r();
            } else if (s == 58) {
                this.g = x43.r();
            } else if (s == 66) {
                this.h = x43.r();
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        long j = this.a;
        if (j != 0) {
            y43.x(1, j);
        }
        if (!this.b.equals("")) {
            y43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            y43.E(3, this.c);
        }
        if (!this.d.equals("")) {
            y43.E(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            y43.x(5, j2);
        }
        if (!this.f.equals("")) {
            y43.E(6, this.f);
        }
        if (!this.g.equals("")) {
            y43.E(7, this.g);
        }
        if (!this.h.equals("")) {
            y43.E(8, this.h);
        }
    }
}
