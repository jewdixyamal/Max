package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ghg  reason: default package */
public final class ghg extends n3 {
    public static final Parcelable.Creator<ghg> CREATOR = new ufg(10);
    public final rhg X;
    public final ghg Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ghg(int i, String str, String str2, String str3, ArrayList arrayList, ghg ghg) {
        if (ghg == null || ghg.Y == null) {
            this.a = i;
            this.b = str;
            this.c = str2;
            AbstractCollection abstractCollection = null;
            this.o = str3 == null ? ghg != null ? ghg.o : null : str3;
            AbstractCollection abstractCollection2 = arrayList;
            if (arrayList == null) {
                AbstractCollection abstractCollection3 = ghg != null ? ghg.X : abstractCollection;
                abstractCollection2 = abstractCollection3;
                if (abstractCollection3 == null) {
                    phg phg = rhg.b;
                    abstractCollection2 = shg.X;
                }
            }
            phg phg2 = rhg.b;
            Object[] array = abstractCollection2.toArray();
            int length = array.length;
            int i2 = 0;
            while (i2 < length) {
                if (array[i2] != null) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                    sb.append("at index ");
                    sb.append(i2);
                    throw new NullPointerException(sb.toString());
                }
            }
            this.X = length == 0 ? shg.X : new shg(length, array);
            this.Y = ghg;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (defpackage.ghg) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.ghg
            r1 = 0
            if (r0 == 0) goto L_0x0041
            ghg r4 = (defpackage.ghg) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x0041
            java.lang.String r0 = r3.b
            java.lang.String r2 = r4.b
            boolean r0 = defpackage.tpa.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r3.c
            java.lang.String r2 = r4.c
            boolean r0 = defpackage.tpa.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r3.o
            java.lang.String r2 = r4.o
            boolean r0 = defpackage.tpa.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            ghg r0 = r3.Y
            ghg r2 = r4.Y
            boolean r0 = defpackage.tpa.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            rhg r3 = r3.X
            rhg r4 = r4.X
            boolean r3 = defpackage.tpa.f(r3, r4)
            if (r3 == 0) goto L_0x0041
            r3 = 1
            return r3
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o, this.Y});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (eae.o0(str2, str, false)) {
                sb.append(str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.o;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.Q(parcel, 3, this.b);
        ay7.Q(parcel, 4, this.c);
        ay7.Q(parcel, 6, this.o);
        ay7.P(parcel, 7, this.Y, i);
        ay7.S(parcel, this.X, 8);
        ay7.W(parcel, T);
    }
}
