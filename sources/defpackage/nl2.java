package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: nl2  reason: default package */
public final class nl2 implements ol7, vk6 {
    public final boolean A0;
    public final long B0;
    public final Long C0;
    public final long D0;
    public final CharSequence E0;
    public final boolean F0;
    public final boolean G0;
    public final int H0;
    public final long I0;
    public final CharSequence X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence o;
    public final String s0;
    public final boolean t0;
    public final boolean u0;
    public final long v0;
    public final ml2 w0;
    public final int x0;
    public final boolean y0;
    public final boolean z0;

    public nl2(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str, boolean z, boolean z2, long j2, ml2 ml2, int i, boolean z3, boolean z4, boolean z5, long j3, Long l, long j4, CharSequence charSequence6, boolean z6, boolean z7) {
        long j5 = j;
        long j6 = j3;
        this.a = j5;
        this.b = uri;
        this.c = charSequence;
        this.o = charSequence2;
        this.X = charSequence3;
        this.Y = charSequence4;
        this.Z = charSequence5;
        this.s0 = str;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = j2;
        this.w0 = ml2;
        this.x0 = i;
        this.y0 = z3;
        this.z0 = z4;
        this.A0 = z5;
        this.B0 = j6;
        this.C0 = l;
        this.D0 = j4;
        this.E0 = charSequence6;
        this.F0 = z6;
        this.G0 = z7;
        this.H0 = j6 != 0 ? vs2.b : vs2.a;
        this.I0 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl2)) {
            return false;
        }
        nl2 nl2 = (nl2) obj;
        return this.a == nl2.a && tpa.f(this.b, nl2.b) && tpa.f(this.c, nl2.c) && tpa.f(this.o, nl2.o) && tpa.f(this.X, nl2.X) && tpa.f(this.Y, nl2.Y) && tpa.f(this.Z, nl2.Z) && tpa.f(this.s0, nl2.s0) && this.t0 == nl2.t0 && this.u0 == nl2.u0 && this.v0 == nl2.v0 && this.w0 == nl2.w0 && this.x0 == nl2.x0 && this.y0 == nl2.y0 && this.z0 == nl2.z0 && this.A0 == nl2.A0 && this.B0 == nl2.B0 && tpa.f(this.C0, nl2.C0) && this.D0 == nl2.D0 && tpa.f(this.E0, nl2.E0) && this.F0 == nl2.F0 && this.G0 == nl2.G0;
    }

    public final long getId() {
        return this.a;
    }

    public final long getItemId() {
        return this.I0;
    }

    public final boolean h(ol7 ol7) {
        return this.I0 == ol7.getItemId();
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Uri uri = this.b;
        int f = rh4.f(this.c, (hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        CharSequence charSequence = this.o;
        int f2 = rh4.f(this.X, (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.Y;
        int hashCode2 = (f2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Z;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.s0;
        int m = h4f.m(ms2.d(ms2.d(ms2.d(k7d.e(this.x0, (this.w0.hashCode() + h4f.m(ms2.d(ms2.d((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.t0), 31, this.u0), 31, this.v0)) * 31, 31), 31, this.y0), 31, this.z0), 31, this.A0), 31, this.B0);
        Long l = this.C0;
        if (l != null) {
            i = l.hashCode();
        }
        return Boolean.hashCode(this.G0) + ms2.d(rh4.f(this.E0, h4f.m((m + i) * 31, 31, this.D0), 31), 31, this.F0);
    }

    public final long k() {
        return this.v0;
    }

    public final int l() {
        return this.H0;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        u2 u2Var = null;
        nl2 nl2 = ol7 instanceof nl2 ? (nl2) ol7 : null;
        if (nl2 != null) {
            u2Var = new u2(7);
            boolean z = false;
            boolean z2 = this.t0 != nl2.t0;
            BitSet bitSet = (BitSet) u2Var.b;
            bitSet.set(0, z2);
            bitSet.set(1, !tpa.f(this.b, nl2.b) || this.D0 != nl2.D0 || !tpa.f(this.E0, nl2.E0));
            bitSet.set(2, !tpa.f(this.c, nl2.c));
            bitSet.set(3, !tpa.f(this.o, nl2.o));
            bitSet.set(4, !tpa.f(this.X, nl2.X) || !tpa.f(this.Y, nl2.Y));
            bitSet.set(5, !tpa.f(this.Z, nl2.Z));
            bitSet.set(6, !tpa.f(this.s0, nl2.s0));
            bitSet.set(7, this.v0 != nl2.v0);
            bitSet.set(8, this.w0 != nl2.w0);
            bitSet.set(9, this.x0 != nl2.x0);
            bitSet.set(10, this.y0 != nl2.y0);
            bitSet.set(11, this.z0 != nl2.z0);
            bitSet.set(12, this.A0 != nl2.A0);
            bitSet.set(13, this.B0 != nl2.B0);
            if (this.G0 != nl2.G0) {
                z = true;
            }
            bitSet.set(14, z);
        }
        return u2Var;
    }

    public final String toString() {
        String x = pag.x(this.c);
        return "ChatModel(chatId=" + this.a + ", title=" + x + ", time=" + this.v0 + ")";
    }
}
