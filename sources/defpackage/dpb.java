package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.EglBase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dpb  reason: default package */
public final class dpb extends qw8 {
    public bpb[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public cpb[] f;
    public Protos.Attaches g;
    public long h;
    public Protos.MessageElements i;
    public boolean j;
    public long k;

    public dpb() {
        if (bpb.o == null) {
            synchronized (y37.b) {
                try {
                    if (bpb.o == null) {
                        bpb.o = new bpb[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = bpb.o;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = 0;
        if (cpb.e == null) {
            synchronized (y37.b) {
                try {
                    if (cpb.e == null) {
                        cpb.e = new cpb[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f = cpb.e;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.j = false;
        this.k = 0;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i2;
        bpb[] bpbArr = this.a;
        int i3 = 0;
        if (bpbArr != null && bpbArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                bpb[] bpbArr2 = this.a;
                if (i4 >= bpbArr2.length) {
                    break;
                }
                bpb bpb = bpbArr2[i4];
                if (bpb != null) {
                    i2 += y43.i(1, bpb);
                }
                i4++;
            }
        } else {
            i2 = 0;
        }
        if (!this.b.equals("")) {
            i2 += y43.l(2, this.b);
        }
        long j2 = this.c;
        if (j2 != 0) {
            i2 += y43.h(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            i2 += y43.h(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            i2 += y43.h(5, j4);
        }
        cpb[] cpbArr = this.f;
        if (cpbArr != null && cpbArr.length > 0) {
            while (true) {
                cpb[] cpbArr2 = this.f;
                if (i3 >= cpbArr2.length) {
                    break;
                }
                cpb cpb = cpbArr2[i3];
                if (cpb != null) {
                    i2 = y43.i(6, cpb) + i2;
                }
                i3++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            i2 += y43.i(7, attaches);
        }
        long j5 = this.h;
        if (j5 != 0) {
            i2 += y43.h(8, j5);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            i2 += y43.i(9, messageElements);
        }
        if (this.j) {
            i2 += y43.a(10);
        }
        long j6 = this.k;
        return j6 != 0 ? i2 + y43.h(11, j6) : i2;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            switch (s) {
                case 0:
                    break;
                case 10:
                    int w = nd7.w(x43, 10);
                    bpb[] bpbArr = this.a;
                    int length = bpbArr == null ? 0 : bpbArr.length;
                    int i2 = w + length;
                    bpb[] bpbArr2 = new bpb[i2];
                    if (length != 0) {
                        System.arraycopy(bpbArr, 0, bpbArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        bpb bpb = new bpb();
                        bpbArr2[length] = bpb;
                        x43.j(bpb);
                        x43.s();
                        length++;
                    }
                    bpb bpb2 = new bpb();
                    bpbArr2[length] = bpb2;
                    x43.j(bpb2);
                    this.a = bpbArr2;
                    continue;
                case 18:
                    this.b = x43.r();
                    continue;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                    this.c = x43.q();
                    continue;
                case 32:
                    this.d = x43.q();
                    continue;
                case SavedMessagesIconDrawable.SMALL_SIZE:
                    this.e = x43.q();
                    continue;
                case 50:
                    int w2 = nd7.w(x43, 50);
                    cpb[] cpbArr = this.f;
                    int length2 = cpbArr == null ? 0 : cpbArr.length;
                    int i3 = w2 + length2;
                    cpb[] cpbArr2 = new cpb[i3];
                    if (length2 != 0) {
                        System.arraycopy(cpbArr, 0, cpbArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        cpb cpb = new cpb();
                        cpbArr2[length2] = cpb;
                        x43.j(cpb);
                        x43.s();
                        length2++;
                    }
                    cpb cpb2 = new cpb();
                    cpbArr2[length2] = cpb2;
                    x43.j(cpb2);
                    this.f = cpbArr2;
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new Protos.Attaches();
                    }
                    x43.j(this.g);
                    continue;
                case EglBase.EGL_OPENGL_ES3_BIT /*64*/:
                    this.h = x43.q();
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new Protos.MessageElements();
                    }
                    x43.j(this.i);
                    continue;
                case 80:
                    this.j = x43.f();
                    continue;
                case 88:
                    this.k = x43.q();
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
        bpb[] bpbArr = this.a;
        int i2 = 0;
        if (bpbArr != null && bpbArr.length > 0) {
            int i3 = 0;
            while (true) {
                bpb[] bpbArr2 = this.a;
                if (i3 >= bpbArr2.length) {
                    break;
                }
                bpb bpb = bpbArr2[i3];
                if (bpb != null) {
                    y43.y(1, bpb);
                }
                i3++;
            }
        }
        if (!this.b.equals("")) {
            y43.E(2, this.b);
        }
        long j2 = this.c;
        if (j2 != 0) {
            y43.x(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            y43.x(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            y43.x(5, j4);
        }
        cpb[] cpbArr = this.f;
        if (cpbArr != null && cpbArr.length > 0) {
            while (true) {
                cpb[] cpbArr2 = this.f;
                if (i2 >= cpbArr2.length) {
                    break;
                }
                cpb cpb = cpbArr2[i2];
                if (cpb != null) {
                    y43.y(6, cpb);
                }
                i2++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            y43.y(7, attaches);
        }
        long j5 = this.h;
        if (j5 != 0) {
            y43.x(8, j5);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            y43.y(9, messageElements);
        }
        boolean z = this.j;
        if (z) {
            y43.r(10, z);
        }
        long j6 = this.k;
        if (j6 != 0) {
            y43.x(11, j6);
        }
    }
}
