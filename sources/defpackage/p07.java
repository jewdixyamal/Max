package defpackage;

/* renamed from: p07  reason: default package */
public final class p07 extends qw8 {
    public o07[] a;

    public p07() {
        if (o07.f == null) {
            synchronized (y37.b) {
                try {
                    if (o07.f == null) {
                        o07.f = new o07[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = o07.f;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        o07[] o07Arr = this.a;
        int i = 0;
        if (o07Arr == null || o07Arr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            o07[] o07Arr2 = this.a;
            if (i >= o07Arr2.length) {
                return i2;
            }
            o07 o07 = o07Arr2[i];
            if (o07 != null) {
                i2 = y43.i(1, o07) + i2;
            }
            i++;
        }
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int w = nd7.w(x43, 10);
                o07[] o07Arr = this.a;
                int length = o07Arr == null ? 0 : o07Arr.length;
                int i = w + length;
                o07[] o07Arr2 = new o07[i];
                if (length != 0) {
                    System.arraycopy(o07Arr, 0, o07Arr2, 0, length);
                }
                while (length < i - 1) {
                    o07 o07 = new o07();
                    o07Arr2[length] = o07;
                    x43.j(o07);
                    x43.s();
                    length++;
                }
                o07 o072 = new o07();
                o07Arr2[length] = o072;
                x43.j(o072);
                this.a = o07Arr2;
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        o07[] o07Arr = this.a;
        if (o07Arr != null && o07Arr.length > 0) {
            int i = 0;
            while (true) {
                o07[] o07Arr2 = this.a;
                if (i < o07Arr2.length) {
                    o07 o07 = o07Arr2[i];
                    if (o07 != null) {
                        y43.y(1, o07);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
