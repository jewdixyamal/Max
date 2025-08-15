package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bpb  reason: default package */
public final class bpb extends qw8 {
    public static volatile bpb[] o;
    public long a = 0;
    public String b = "";
    public String c = "";
    public int d = 0;
    public long e = 0;
    public String f = "";
    public long g = 0;
    public String h = "";
    public int i = 0;
    public int[] j = nd7.c;
    public String k = "";
    public apb l = null;
    public yob m = null;
    public Protos.Attaches.Attach n = null;

    public bpb() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int[] iArr;
        long j2 = this.a;
        int i2 = 0;
        int h2 = j2 != 0 ? y43.h(1, j2) : 0;
        if (!this.b.equals("")) {
            h2 += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += y43.l(3, this.c);
        }
        int i3 = this.d;
        if (i3 != 0) {
            h2 += y43.f(4, i3);
        }
        long j3 = this.e;
        if (j3 != 0) {
            h2 += y43.h(5, j3);
        }
        if (!this.f.equals("")) {
            h2 += y43.l(6, this.f);
        }
        long j4 = this.g;
        if (j4 != 0) {
            h2 += y43.h(7, j4);
        }
        if (!this.h.equals("")) {
            h2 += y43.l(8, this.h);
        }
        int i4 = this.i;
        if (i4 != 0) {
            h2 += y43.f(9, i4);
        }
        int[] iArr2 = this.j;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            while (true) {
                iArr = this.j;
                if (i2 >= iArr.length) {
                    break;
                }
                i5 += y43.g(iArr[i2]);
                i2++;
            }
            h2 = h2 + i5 + iArr.length;
        }
        if (!this.k.equals("")) {
            h2 += y43.l(12, this.k);
        }
        apb apb = this.l;
        if (apb != null) {
            h2 += y43.i(13, apb);
        }
        yob yob = this.m;
        if (yob != null) {
            h2 += y43.i(14, yob);
        }
        Protos.Attaches.Attach attach = this.n;
        return attach != null ? h2 + y43.i(15, attach) : h2;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [apb, qw8] */
    /* JADX WARNING: type inference failed for: r0v22, types: [qw8, yob] */
    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            switch (s) {
                case 0:
                    break;
                case 8:
                    this.a = x43.q();
                    continue;
                case 18:
                    this.b = x43.r();
                    continue;
                case 26:
                    this.c = x43.r();
                    continue;
                case 32:
                    this.d = x43.p();
                    continue;
                case SavedMessagesIconDrawable.SMALL_SIZE:
                    this.e = x43.q();
                    continue;
                case 50:
                    this.f = x43.r();
                    continue;
                case 56:
                    this.g = x43.q();
                    continue;
                case 66:
                    this.h = x43.r();
                    continue;
                case 72:
                    this.i = x43.p();
                    continue;
                case 88:
                    int w = nd7.w(x43, 88);
                    int[] iArr = this.j;
                    int length = iArr == null ? 0 : iArr.length;
                    int i2 = w + length;
                    int[] iArr2 = new int[i2];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        iArr2[length] = x43.p();
                        x43.s();
                        length++;
                    }
                    iArr2[length] = x43.p();
                    this.j = iArr2;
                    continue;
                case 90:
                    int e2 = x43.e(x43.p());
                    int c2 = x43.c();
                    int i3 = 0;
                    while (x43.b() > 0) {
                        x43.p();
                        i3++;
                    }
                    x43.t(c2);
                    int[] iArr3 = this.j;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i4 = i3 + length2;
                    int[] iArr4 = new int[i4];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i4) {
                        iArr4[length2] = x43.p();
                        length2++;
                    }
                    this.j = iArr4;
                    x43.d(e2);
                    continue;
                case 98:
                    this.k = x43.r();
                    continue;
                case 106:
                    if (this.l == null) {
                        ? qw8 = new qw8();
                        qw8.a = 0.0f;
                        qw8.b = 0.0f;
                        qw8.c = 0;
                        qw8.d = false;
                        qw8.cachedSize = -1;
                        this.l = qw8;
                    }
                    x43.j(this.l);
                    continue;
                case 114:
                    if (this.m == null) {
                        ? qw82 = new qw8();
                        qw82.a = "";
                        qw82.b = "";
                        qw82.c = "";
                        qw82.d = null;
                        qw82.e = "";
                        qw82.f = null;
                        qw82.cachedSize = -1;
                        this.m = qw82;
                    }
                    x43.j(this.m);
                    continue;
                case 122:
                    if (this.n == null) {
                        this.n = new Protos.Attaches.Attach();
                    }
                    x43.j(this.n);
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
        long j2 = this.a;
        if (j2 != 0) {
            y43.x(1, j2);
        }
        if (!this.b.equals("")) {
            y43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            y43.E(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            y43.w(4, i2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            y43.x(5, j3);
        }
        if (!this.f.equals("")) {
            y43.E(6, this.f);
        }
        long j4 = this.g;
        if (j4 != 0) {
            y43.x(7, j4);
        }
        if (!this.h.equals("")) {
            y43.E(8, this.h);
        }
        int i3 = this.i;
        if (i3 != 0) {
            y43.w(9, i3);
        }
        int[] iArr = this.j;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.j;
                if (i4 >= iArr2.length) {
                    break;
                }
                y43.w(11, iArr2[i4]);
                i4++;
            }
        }
        if (!this.k.equals("")) {
            y43.E(12, this.k);
        }
        apb apb = this.l;
        if (apb != null) {
            y43.y(13, apb);
        }
        yob yob = this.m;
        if (yob != null) {
            y43.y(14, yob);
        }
        Protos.Attaches.Attach attach = this.n;
        if (attach != null) {
            y43.y(15, attach);
        }
    }
}
