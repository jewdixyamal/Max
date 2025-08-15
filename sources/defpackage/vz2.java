package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: vz2  reason: default package */
public final class vz2 extends pi0 {
    public final mg4 X;
    public final oi0 Y;
    public final boolean Z;
    public final Collection b;
    public final boolean c;
    public final boolean o;
    public final Set s0;

    public vz2(List list, boolean z) {
        this(list, z, false, (mg4) null, (h9b) null, 124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz2)) {
            return false;
        }
        vz2 vz2 = (vz2) obj;
        return tpa.f(this.b, vz2.b) && this.c == vz2.c && this.o == vz2.o && this.X == vz2.X && tpa.f(this.Y, vz2.Y) && this.Z == vz2.Z && tpa.f(this.s0, vz2.s0);
    }

    public final int hashCode() {
        int hashCode = (this.X.hashCode() + ms2.d(ms2.d(this.b.hashCode() * 31, 31, this.c), 31, this.o)) * 31;
        oi0 oi0 = this.Y;
        return this.s0.hashCode() + ms2.d((hashCode + (oi0 == null ? 0 : oi0.hashCode())) * 31, 31, this.Z);
    }

    public final String toString() {
        return "ChatsUpdateEvent(chatIds=" + this.b + ", orderChange=" + this.c + ", initialDataLoaded=" + this.o + ", itemType=" + this.X + ", error=" + this.Y + ", replaceDuplicate=" + this.Z + ", chatServerIds=" + this.s0 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz2(Collection collection, boolean z, boolean z2, mg4 mg4, h9b h9b, int i) {
        this(collection, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? mg4.REGULAR : mg4, (i & 16) != 0 ? null : h9b, false, wz4.a);
    }

    public vz2(Collection collection, boolean z, boolean z2, mg4 mg4, oi0 oi0, boolean z3, Set set) {
        this.b = collection;
        this.c = z;
        this.o = z2;
        this.X = mg4;
        this.Y = oi0;
        this.Z = z3;
        this.s0 = set;
    }

    public vz2(gi9 gi9) {
        this(oag.D(gi9), true, false, (mg4) null, (h9b) null, 124);
    }
}
