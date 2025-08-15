package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: tra  reason: default package */
public final class tra extends n3 {
    public static final Parcelable.Creator<tra> CREATOR = new ufg(19);
    public final int a;
    public final Float b;

    public tra(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        fp3.g("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.tra) r5;
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
            boolean r1 = r5 instanceof defpackage.tra
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tra r5 = (defpackage.tra) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L_0x001d
            java.lang.Float r4 = r4.b
            java.lang.Float r5 = r5.b
            boolean r4 = defpackage.s36.l(r4, r5)
            if (r4 == 0) goto L_0x001d
            return r0
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tra.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.a);
        ay7.N(parcel, 3, this.b);
        ay7.W(parcel, T);
    }
}
