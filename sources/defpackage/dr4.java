package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: dr4  reason: default package */
public final class dr4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<dr4> CREATOR = new f73(13);
    public final br4[] a;
    public int b;
    public final String c;
    public final int o;

    public dr4(String str, ArrayList arrayList) {
        this(str, false, (br4[]) arrayList.toArray(new br4[0]));
    }

    public final dr4 a(String str) {
        return oaf.a(this.c, str) ? this : new dr4(str, false, this.a);
    }

    public final int compare(Object obj, Object obj2) {
        br4 br4 = (br4) obj;
        br4 br42 = (br4) obj2;
        UUID uuid = ew0.a;
        return uuid.equals(br4.b) ? uuid.equals(br42.b) ? 0 : 1 : br4.b.compareTo(br42.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dr4.class != obj.getClass()) {
            return false;
        }
        dr4 dr4 = (dr4) obj;
        return oaf.a(this.c, dr4.c) && Arrays.equals(this.a, dr4.a);
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: br4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dr4(java.lang.String r1, boolean r2, defpackage.br4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            br4[] r3 = (defpackage.br4[]) r3
        L_0x000e:
            r0.a = r3
            int r1 = r3.length
            r0.o = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr4.<init>(java.lang.String, boolean, br4[]):void");
    }

    public dr4(Parcel parcel) {
        this.c = parcel.readString();
        br4[] br4Arr = (br4[]) parcel.createTypedArray(br4.CREATOR);
        int i = oaf.a;
        this.a = br4Arr;
        this.o = br4Arr.length;
    }
}
