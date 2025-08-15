package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lh1  reason: default package */
public final class lh1 extends pnf {
    public boolean A0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final String b;
    public final boolean c;
    public final List o;
    public final q0e s0;
    public final w7c t0;
    public final q0e u0;
    public final w7c v0;
    public final q0e w0;
    public final w7c x0;
    public final w7c y0;
    public final s35 z0 = new s35(0);

    public lh1(String str, boolean z, List list) {
        je7 je7 = yi1.a;
        khe d = zi1.a.getAccessor().d(ida.class);
        je7 c2 = yi1.c();
        this.b = str;
        this.c = z;
        this.o = list;
        this.X = d;
        this.Y = c2;
        q0e a = r0e.a(new jh1((Integer) null, k37.a, (CharSequence) null));
        this.Z = a;
        q0e a2 = r0e.a(new eqe(b8a.n0));
        this.s0 = a2;
        this.t0 = new w7c(a2);
        q0e a3 = r0e.a(r());
        this.u0 = a3;
        this.v0 = new w7c(a3);
        q0e a4 = r0e.a(nz4.a);
        this.w0 = a4;
        this.x0 = new w7c(a4);
        qw qwVar = new qw(a, 23);
        Boolean bool = Boolean.FALSE;
        this.y0 = od2.X(qwVar, this.a, wld.a, bool);
    }

    public static ArrayList q(boolean z) {
        List<y4c> list;
        if (z) {
            y4c.b.getClass();
            list = y53.M(y4c.VIDEO_FREEZES, y4c.VIDEO_QUALITY, y4c.VIDEO_SYNC, y4c.VIDEO_CALL_INTERRUPTION, y4c.USERS_FREEZES, y4c.OTHER);
        } else {
            y4c.b.getClass();
            list = y53.M(y4c.AUDIO_FREEZES, y4c.AUDIO_CALL_INTERRUPTION, y4c.VOICE_COMMUNICATION_PROBLEM, y4c.AUDIO_QUALITY, y4c.AUDIO_ECHO, y4c.OTHER);
        }
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (y4c C : list) {
            arrayList.add(f8.C(C, false));
        }
        return arrayList;
    }

    public final List r() {
        Integer num = ((jh1) this.Z.getValue()).a;
        boolean z = false;
        boolean z2 = num == null;
        s4c s4c = z2 ? s4c.b : s4c.a;
        int i = y7a.z0;
        int i2 = y7a.y0;
        int i3 = y7a.x0;
        je7 je7 = this.X;
        v4c v4c = new v4c(i, s4c, ((ida) je7.getValue()).j.e("😍"), z2 || (num != null && num.intValue() == i));
        v4c v4c2 = new v4c(i2, s4c, ((ida) je7.getValue()).j.e("😐"), z2 || (num != null && num.intValue() == i2));
        CharSequence e = ((ida) je7.getValue()).j.e("😡");
        if (z2 || (num != null && num.intValue() == i3)) {
            z = true;
        }
        return y53.M(v4c, v4c2, new v4c(i3, s4c, e, z));
    }

    public final void s(String str, boolean z) {
        long j;
        Collection collection;
        String str2;
        if (!this.A0) {
            this.A0 = true;
            String str3 = (str == null || str.length() == 0) ^ true ? str : null;
            q0e q0e = this.Z;
            if (z) {
                j = 0;
            } else {
                Integer num = ((jh1) q0e.getValue()).a;
                int i = y7a.z0;
                if (num != null && num.intValue() == i) {
                    j = 3;
                } else {
                    int i2 = y7a.y0;
                    if (num != null && num.intValue() == i2) {
                        j = 2;
                    } else {
                        int i3 = y7a.x0;
                        if (num != null && num.intValue() == i3) {
                            j = 1;
                        } else {
                            return;
                        }
                    }
                }
            }
            bi9 bi9 = ((jh1) q0e.getValue()).b;
            int[] iArr = bi9.b;
            long[] jArr = bi9.a;
            int length = jArr.length - 2;
            char c2 = 7;
            if (length >= 0) {
                int i4 = 0;
                loop0:
                while (true) {
                    long j2 = jArr[i4];
                    if ((((~j2) << c2) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j2 & 255) < 128) {
                                int i7 = iArr[(i4 << 3) + i6];
                                y4c.b.getClass();
                                if (qq9.l(i7) == y4c.OTHER) {
                                    collection = nz4.a;
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    c2 = 7;
                }
            }
            kl7 l = j1e.l();
            List list = this.o;
            if (list != null) {
                l.addAll(list);
            }
            bi9 bi92 = ((jh1) q0e.getValue()).b;
            int[] iArr2 = bi92.b;
            long[] jArr2 = bi92.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr2[i8];
                    if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j3 & 255) < 128) {
                                int i11 = iArr2[(i8 << 3) + i10];
                                y4c.b.getClass();
                                y4c l2 = qq9.l(i11);
                                if (!(l2 == null || (str2 = l2.a) == null)) {
                                    l.add(str2);
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length2) {
                        break;
                    }
                    i8++;
                }
            }
            collection = j1e.d(l);
            if (!(!collection.isEmpty())) {
                collection = null;
            }
            String obj = collection != null ? collection.toString() : null;
            bt1 bt1 = (bt1) this.Y.getValue();
            bt1.getClass();
            bt1.c(bt1, "CALL_REVIEW", this.b, obj, Long.valueOf(j), str3, (String) null, false, 96);
            pnf.o(this.z0, fh1.a);
        }
    }
}
