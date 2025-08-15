package defpackage;

/* renamed from: o07  reason: default package */
public final class o07 extends qw8 {
    public static volatile o07[] f;
    public String a = "";
    public String b = "";
    public int c = 0;
    public zw5 d = null;
    public q07[] e = q07.a();

    public o07() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = 0;
        int l = !this.a.equals("") ? y43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l += y43.l(2, this.b);
        }
        int i2 = this.c;
        if (i2 != 0) {
            l += y43.n(3, i2);
        }
        zw5 zw5 = this.d;
        if (zw5 != null) {
            l += y43.i(4, zw5);
        }
        q07[] q07Arr = this.e;
        if (q07Arr != null && q07Arr.length > 0) {
            while (true) {
                q07[] q07Arr2 = this.e;
                if (i >= q07Arr2.length) {
                    break;
                }
                q07 q07 = q07Arr2[i];
                if (q07 != null) {
                    l = y43.i(17, q07) + l;
                }
                i++;
            }
        }
        return l;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = x43.r();
            } else if (s == 18) {
                this.b = x43.r();
            } else if (s == 24) {
                this.c = x43.p();
            } else if (s == 34) {
                if (this.d == null) {
                    this.d = new zw5(1);
                }
                x43.j(this.d);
            } else if (s == 138) {
                int w = nd7.w(x43, 138);
                q07[] q07Arr = this.e;
                int length = q07Arr == null ? 0 : q07Arr.length;
                int i = w + length;
                q07[] q07Arr2 = new q07[i];
                if (length != 0) {
                    System.arraycopy(q07Arr, 0, q07Arr2, 0, length);
                }
                while (length < i - 1) {
                    q07 q07 = new q07();
                    q07Arr2[length] = q07;
                    x43.j(q07);
                    x43.s();
                    length++;
                }
                q07 q072 = new q07();
                q07Arr2[length] = q072;
                x43.j(q072);
                this.e = q07Arr2;
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
        int i = this.c;
        if (i != 0) {
            y43.G(3, i);
        }
        zw5 zw5 = this.d;
        if (zw5 != null) {
            y43.y(4, zw5);
        }
        q07[] q07Arr = this.e;
        if (q07Arr != null && q07Arr.length > 0) {
            int i2 = 0;
            while (true) {
                q07[] q07Arr2 = this.e;
                if (i2 < q07Arr2.length) {
                    q07 q07 = q07Arr2[i2];
                    if (q07 != null) {
                        y43.y(17, q07);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
