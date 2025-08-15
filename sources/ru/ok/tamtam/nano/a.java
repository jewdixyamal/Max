package ru.ok.tamtam.nano;

import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

public final class a extends qw8 {
    public static volatile a[] m;
    public String a = "";
    public String b = "";
    public String c = "";
    public long[] d;
    public long[] e;
    public String[] f;
    public boolean g;
    public Protos.MessageElements h;
    public long i;
    public zw5 j;
    public zw5 k;
    public zw5 l;

    public a() {
        long[] jArr = nd7.d;
        this.d = jArr;
        this.e = jArr;
        this.f = nd7.f;
        this.g = false;
        this.h = null;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long[] jArr;
        long[] jArr2;
        int i2 = 0;
        int l2 = !this.a.equals("") ? y43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l2 += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            l2 += y43.l(3, this.c);
        }
        long[] jArr3 = this.d;
        if (jArr3 != null && jArr3.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                jArr2 = this.d;
                if (i3 >= jArr2.length) {
                    break;
                }
                i4 += y43.k(jArr2[i3]);
                i3++;
            }
            l2 = l2 + i4 + jArr2.length;
        }
        long[] jArr4 = this.e;
        if (jArr4 != null && jArr4.length > 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                jArr = this.e;
                if (i5 >= jArr.length) {
                    break;
                }
                i6 += y43.k(jArr[i5]);
                i5++;
            }
            l2 = l2 + i6 + jArr.length;
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.f;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i8++;
                    int q = y43.q(str);
                    i7 = y43.j(q) + q + i7;
                }
                i2++;
            }
            l2 = l2 + i7 + i8;
        }
        if (this.g) {
            l2 += y43.a(7);
        }
        Protos.MessageElements messageElements = this.h;
        if (messageElements != null) {
            l2 += y43.i(8, messageElements);
        }
        long j2 = this.i;
        if (j2 != 0) {
            l2 += y43.h(9, j2);
        }
        zw5 zw5 = this.j;
        if (zw5 != null) {
            l2 += y43.i(10, zw5);
        }
        zw5 zw52 = this.k;
        if (zw52 != null) {
            l2 += y43.i(11, zw52);
        }
        zw5 zw53 = this.l;
        return zw53 != null ? l2 + y43.i(12, zw53) : l2;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            switch (s) {
                case 0:
                    break;
                case 10:
                    this.a = x43.r();
                    continue;
                case 18:
                    this.b = x43.r();
                    continue;
                case 26:
                    this.c = x43.r();
                    continue;
                case 32:
                    int w = nd7.w(x43, 32);
                    long[] jArr = this.d;
                    int length = jArr == null ? 0 : jArr.length;
                    int i2 = w + length;
                    long[] jArr2 = new long[i2];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        jArr2[length] = x43.q();
                        x43.s();
                        length++;
                    }
                    jArr2[length] = x43.q();
                    this.d = jArr2;
                    continue;
                case 34:
                    int e2 = x43.e(x43.p());
                    int c2 = x43.c();
                    int i3 = 0;
                    while (x43.b() > 0) {
                        x43.q();
                        i3++;
                    }
                    x43.t(c2);
                    long[] jArr3 = this.d;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i4 = i3 + length2;
                    long[] jArr4 = new long[i4];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i4) {
                        jArr4[length2] = x43.q();
                        length2++;
                    }
                    this.d = jArr4;
                    x43.d(e2);
                    continue;
                case SavedMessagesIconDrawable.SMALL_SIZE:
                    int w2 = nd7.w(x43, 40);
                    long[] jArr5 = this.e;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i5 = w2 + length3;
                    long[] jArr6 = new long[i5];
                    if (length3 != 0) {
                        System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i5 - 1) {
                        jArr6[length3] = x43.q();
                        x43.s();
                        length3++;
                    }
                    jArr6[length3] = x43.q();
                    this.e = jArr6;
                    continue;
                case 42:
                    int e3 = x43.e(x43.p());
                    int c3 = x43.c();
                    int i6 = 0;
                    while (x43.b() > 0) {
                        x43.q();
                        i6++;
                    }
                    x43.t(c3);
                    long[] jArr7 = this.e;
                    int length4 = jArr7 == null ? 0 : jArr7.length;
                    int i7 = i6 + length4;
                    long[] jArr8 = new long[i7];
                    if (length4 != 0) {
                        System.arraycopy(jArr7, 0, jArr8, 0, length4);
                    }
                    while (length4 < i7) {
                        jArr8[length4] = x43.q();
                        length4++;
                    }
                    this.e = jArr8;
                    x43.d(e3);
                    continue;
                case 50:
                    int w3 = nd7.w(x43, 50);
                    String[] strArr = this.f;
                    int length5 = strArr == null ? 0 : strArr.length;
                    int i8 = w3 + length5;
                    String[] strArr2 = new String[i8];
                    if (length5 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length5);
                    }
                    while (length5 < i8 - 1) {
                        strArr2[length5] = x43.r();
                        x43.s();
                        length5++;
                    }
                    strArr2[length5] = x43.r();
                    this.f = strArr2;
                    continue;
                case 56:
                    this.g = x43.f();
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new Protos.MessageElements();
                    }
                    x43.j(this.h);
                    continue;
                case 72:
                    this.i = x43.q();
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new zw5(0);
                    }
                    x43.j(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new zw5(2);
                    }
                    x43.j(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new zw5(1);
                    }
                    x43.j(this.l);
                    continue;
                default:
                    if (!x43.u(s)) {
                        break;
                    } else {
                        continue;
                    }
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
        long[] jArr = this.d;
        int i2 = 0;
        if (jArr != null && jArr.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr2 = this.d;
                if (i3 >= jArr2.length) {
                    break;
                }
                y43.x(4, jArr2[i3]);
                i3++;
            }
        }
        long[] jArr3 = this.e;
        if (jArr3 != null && jArr3.length > 0) {
            int i4 = 0;
            while (true) {
                long[] jArr4 = this.e;
                if (i4 >= jArr4.length) {
                    break;
                }
                y43.x(5, jArr4[i4]);
                i4++;
            }
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    y43.E(6, str);
                }
                i2++;
            }
        }
        boolean z = this.g;
        if (z) {
            y43.r(7, z);
        }
        Protos.MessageElements messageElements = this.h;
        if (messageElements != null) {
            y43.y(8, messageElements);
        }
        long j2 = this.i;
        if (j2 != 0) {
            y43.x(9, j2);
        }
        zw5 zw5 = this.j;
        if (zw5 != null) {
            y43.y(10, zw5);
        }
        zw5 zw52 = this.k;
        if (zw52 != null) {
            y43.y(11, zw52);
        }
        zw5 zw53 = this.l;
        if (zw53 != null) {
            y43.y(12, zw53);
        }
    }
}
