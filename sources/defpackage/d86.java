package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: d86  reason: default package */
public final class d86 implements Parcelable {
    public static final Parcelable.Creator<d86> CREATOR = new f73(27);
    public static final d86 t0 = new d86(true, true, true, false, nz4.a, false, false);
    public final List X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean s0;

    public d86(boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.X = list;
        this.Y = z5;
        this.Z = z6;
        this.s0 = !z2;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.d86) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.d86
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            d86 r5 = (defpackage.d86) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.o
            boolean r3 = r5.o
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            java.util.List r1 = r4.X
            java.util.List r3 = r5.X
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0033
            return r2
        L_0x0033:
            boolean r1 = r4.Y
            boolean r3 = r5.Y
            if (r1 == r3) goto L_0x003a
            return r2
        L_0x003a:
            boolean r4 = r4.Z
            boolean r5 = r5.Z
            if (r4 == r5) goto L_0x0041
            return r2
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d86.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + ms2.d(k7d.g(this.X, ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31), 31, this.Y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryMode(needCameraView=");
        sb.append(this.a);
        sb.append(", useVideos=");
        sb.append(this.b);
        sb.append(", multiSelectionEnabled=");
        sb.append(this.c);
        sb.append(", isMessageEdit=");
        sb.append(this.o);
        sb.append(", selectedItems=");
        sb.append(this.X);
        sb.append(", profileCreation=");
        sb.append(this.Y);
        sb.append(", useTopInset=");
        return au1.j(sb, this.Z, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        List<Parcelable> list = this.X;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }
}
