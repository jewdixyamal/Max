package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: cr4  reason: default package */
public final class cr4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<cr4> CREATOR = new f73(12);
    public final ar4[] a;
    public int b;
    public final String c;
    public final int o;

    public cr4(String str, ArrayList arrayList) {
        this(str, false, (ar4[]) arrayList.toArray(new ar4[0]));
    }

    public final cr4 a(String str) {
        return maf.a(this.c, str) ? this : new cr4(str, false, this.a);
    }

    public final int compare(Object obj, Object obj2) {
        ar4 ar4 = (ar4) obj;
        ar4 ar42 = (ar4) obj2;
        UUID uuid = bw0.a;
        return uuid.equals(ar4.b) ? uuid.equals(ar42.b) ? 0 : 1 : ar4.b.compareTo(ar42.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cr4.class != obj.getClass()) {
            return false;
        }
        cr4 cr4 = (cr4) obj;
        return maf.a(this.c, cr4.c) && Arrays.equals(this.a, cr4.a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ar4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cr4(java.lang.String r1, boolean r2, defpackage.ar4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            ar4[] r3 = (defpackage.ar4[]) r3
        L_0x000e:
            r0.a = r3
            int r1 = r3.length
            r0.o = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr4.<init>(java.lang.String, boolean, ar4[]):void");
    }

    public cr4(Parcel parcel) {
        this.c = parcel.readString();
        ar4[] ar4Arr = (ar4[]) parcel.createTypedArray(ar4.CREATOR);
        int i = maf.a;
        this.a = ar4Arr;
        this.o = ar4Arr.length;
    }
}
