package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ts6  reason: default package */
public final class ts6 implements c99 {
    public static final Parcelable.Creator<ts6> CREATOR = new dj6(5);
    public final boolean X;
    public final int Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    public ts6(int i, int i2, String str, String str2, String str3, boolean z) {
        np8.d(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = z;
        this.Y = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ts6 a(java.util.Map r12) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r5 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            int r5 = r5 * 1000
            if (r5 <= 0) goto L_0x001f
            r1 = r2
            goto L_0x0030
        L_0x001f:
            java.lang.String r6 = "Invalid bitrate: "
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0033 }
            int r8 = r7.length()     // Catch:{ NumberFormatException -> 0x0033 }
            if (r8 == 0) goto L_0x002e
            r6.concat(r7)     // Catch:{ NumberFormatException -> 0x0033 }
        L_0x002e:
            r1 = r3
            r5 = r4
        L_0x0030:
            r6 = r5
            goto L_0x0046
        L_0x0032:
            r5 = r4
        L_0x0033:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "Invalid bitrate header: "
            r6.concat(r1)
        L_0x0042:
            r1 = r3
            goto L_0x0030
        L_0x0044:
            r1 = r3
            r6 = r4
        L_0x0046:
            java.lang.String r5 = "icy-genre"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            r7 = 0
            if (r5 == 0) goto L_0x005a
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r8 = r1
            r1 = r2
            goto L_0x005b
        L_0x005a:
            r8 = r7
        L_0x005b:
            java.lang.String r5 = "icy-name"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x006e
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r2
            goto L_0x006f
        L_0x006e:
            r9 = r7
        L_0x006f:
            java.lang.String r5 = "icy-url"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0082
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r2
            goto L_0x0083
        L_0x0082:
            r10 = r7
        L_0x0083:
            java.lang.String r5 = "icy-pub"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x009c
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = "1"
            boolean r1 = r1.equals(r5)
            r11 = r1
            r1 = r2
            goto L_0x009d
        L_0x009c:
            r11 = r3
        L_0x009d:
            java.lang.String r5 = "icy-metaint"
            java.lang.Object r12 = r12.get(r5)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x00d5
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = (java.lang.String) r12
            int r3 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x00c8 }
            if (r3 <= 0) goto L_0x00b5
            r4 = r3
            goto L_0x00c6
        L_0x00b5:
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00c3 }
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r5 == 0) goto L_0x00c5
            r0.concat(r2)     // Catch:{ NumberFormatException -> 0x00c3 }
            goto L_0x00c5
        L_0x00c3:
            r4 = r3
            goto L_0x00c8
        L_0x00c5:
            r2 = r1
        L_0x00c6:
            r1 = r2
            goto L_0x00d5
        L_0x00c8:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r2 = r12.length()
            if (r2 == 0) goto L_0x00d5
            r0.concat(r12)
        L_0x00d5:
            if (r1 == 0) goto L_0x00df
            ts6 r12 = new ts6
            r5 = r12
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r7 = r12
        L_0x00df:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts6.a(java.util.Map):ts6");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ts6.class != obj.getClass()) {
            return false;
        }
        ts6 ts6 = (ts6) obj;
        return this.a == ts6.a && maf.a(this.b, ts6.b) && maf.a(this.c, ts6.c) && maf.a(this.o, ts6.o) && this.X == ts6.X && this.Y == ts6.Y;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.X ? 1 : 0)) * 31) + this.Y;
    }

    public final void p(dd8 dd8) {
        String str = this.c;
        if (str != null) {
            dd8.E = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            dd8.C = str2;
        }
    }

    public final String toString() {
        String str = this.c;
        int e = rh4.e(80, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(e, str2));
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(this.a);
        sb.append(", metadataInterval=");
        sb.append(this.Y);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        int i2 = maf.a;
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y);
    }

    public ts6(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readString();
        int i = maf.a;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt();
    }
}
