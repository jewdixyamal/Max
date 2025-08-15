package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: fb5  reason: default package */
public final class fb5 implements ol7 {
    public final CharSequence X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final Uri b;
    public final boolean c;
    public final boolean o;
    public final CharSequence s0;

    public fb5(long j, Uri uri, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, boolean z3, CharSequence charSequence3) {
        this.a = j;
        this.b = uri;
        this.c = z;
        this.o = z2;
        this.X = charSequence;
        this.Y = charSequence2;
        this.Z = z3;
        this.s0 = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5 = (fb5) obj;
        return this.a == fb5.a && tpa.f(this.b, fb5.b) && this.c == fb5.c && this.o == fb5.o && tpa.f(this.X, fb5.X) && tpa.f(this.Y, fb5.Y) && this.Z == fb5.Z && tpa.f(this.s0, fb5.s0);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Uri uri = this.b;
        int f = rh4.f(this.X, ms2.d(ms2.d((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.o), 31);
        CharSequence charSequence = this.Y;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.s0.hashCode() + ms2.d((f + i) * 31, 31, this.Z);
    }

    public final int l() {
        int i = this.Z ? p8a.u : p8a.v;
        int i2 = vs2.a;
        return i;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        u2 u2Var = null;
        fb5 fb5 = ol7 instanceof fb5 ? (fb5) ol7 : null;
        if (fb5 != null) {
            u2Var = new u2(7);
            boolean f = tpa.f(this.b, fb5.b);
            boolean z = true;
            BitSet bitSet = (BitSet) u2Var.b;
            bitSet.set(0, !f);
            bitSet.set(1, this.c != fb5.c);
            bitSet.set(2, !tpa.f(this.X, fb5.X));
            bitSet.set(3, !tpa.f(this.Y, fb5.Y));
            bitSet.set(4, this.Z != fb5.Z);
            bitSet.set(5, !tpa.f(this.s0, fb5.s0));
            if (this.o == fb5.o) {
                z = false;
            }
            bitSet.set(6, z);
        }
        return u2Var;
    }

    public final String toString() {
        return "FakeChatModel(contactId=" + this.a + ", avatar=" + this.b + ", isOnline=" + this.c + ", isVerified=" + this.o + ", title=" + this.X + ", subtitle=" + this.Y + ", isRegistered=" + this.Z + ", abbreviation=" + this.s0 + ")";
    }
}
