package defpackage;

/* renamed from: yob  reason: default package */
public final class yob extends qw8 {
    public String a;
    public String b;
    public String c;
    public uob d;
    public String e;
    public wob f;

    public final int computeSerializedSize() {
        int l = !this.a.equals("") ? y43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            l += y43.l(3, this.c);
        }
        uob uob = this.d;
        if (uob != null) {
            l += y43.i(4, uob);
        }
        if (!this.e.equals("")) {
            l += y43.l(5, this.e);
        }
        wob wob = this.f;
        return wob != null ? l + y43.i(6, wob) : l;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [qw8, uob] */
    /* JADX WARNING: type inference failed for: r0v10, types: [qw8, wob] */
    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = x43.r();
            } else if (s == 18) {
                this.b = x43.r();
            } else if (s == 26) {
                this.c = x43.r();
            } else if (s == 34) {
                if (this.d == null) {
                    ? qw8 = new qw8();
                    qw8.a = null;
                    qw8.b = 0.0f;
                    qw8.c = nd7.e;
                    qw8.cachedSize = -1;
                    this.d = qw8;
                }
                x43.j(this.d);
            } else if (s == 42) {
                this.e = x43.r();
            } else if (s == 50) {
                if (this.f == null) {
                    ? qw82 = new qw8();
                    if (xob.f == null) {
                        synchronized (y37.b) {
                            try {
                                if (xob.f == null) {
                                    xob.f = new xob[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    qw82.a = xob.f;
                    if (tob.c == null) {
                        synchronized (y37.b) {
                            try {
                                if (tob.c == null) {
                                    tob.c = new tob[0];
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    qw82.b = tob.c;
                    qw82.c = null;
                    qw82.d = false;
                    qw82.cachedSize = -1;
                    this.f = qw82;
                }
                x43.j(this.f);
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        if (!this.a.equals("")) {
            y43.E(1, this.a);
        }
        if (!this.b.equals("")) {
            y43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            y43.E(3, this.c);
        }
        uob uob = this.d;
        if (uob != null) {
            y43.y(4, uob);
        }
        if (!this.e.equals("")) {
            y43.E(5, this.e);
        }
        wob wob = this.f;
        if (wob != null) {
            y43.y(6, wob);
        }
    }
}
