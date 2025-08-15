package defpackage;

import java.util.List;

/* renamed from: v92  reason: default package */
public final class v92 implements ol7 {
    public final long X;
    public final od0 Y;
    public final List Z;
    public final jqe a;
    public final jqe b;
    public final String c;
    public final CharSequence o;
    public final int s0;
    public final long t0;

    public v92(jqe jqe, jqe jqe2, String str, CharSequence charSequence, long j, od0 od0, List list) {
        this.a = jqe;
        this.b = jqe2;
        this.c = str;
        this.o = charSequence;
        this.X = j;
        this.Y = od0;
        this.Z = list;
        this.s0 = mda.e;
        this.t0 = (long) Integer.hashCode(mda.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v92)) {
            return false;
        }
        v92 v92 = (v92) obj;
        return tpa.f(this.a, v92.a) && tpa.f(this.b, v92.b) && tpa.f(this.c, v92.c) && tpa.f(this.o, v92.o) && this.X == v92.X && tpa.f(this.Y, v92.Y) && tpa.f(this.Z, v92.Z);
    }

    public final long getItemId() {
        return this.t0;
    }

    public final int hashCode() {
        int f = k7d.f(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (f + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.o;
        int m = h4f.m((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.X);
        od0 od0 = this.Y;
        if (od0 != null) {
            i = od0.hashCode();
        }
        return this.Z.hashCode() + ((m + i) * 31);
    }

    public final int l() {
        return this.s0;
    }

    public final String toString() {
        return "ChatDescriptionViewListItem(title=" + this.a + ", subtitle=" + this.b + ", avatarUrl=" + this.c + ", avatarPlaceholder=" + this.o + ", avatarPlaceholderId=" + this.X + ", avatarOverlayDrawable=" + this.Y + ", descriptionList=" + this.Z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v92(jqe jqe, eqe eqe, String str, CharSequence charSequence, long j, List list, int i) {
        this(jqe, (jqe) eqe, str, charSequence, j, (od0) null, (i & 64) != 0 ? nz4.a : list);
    }
}
