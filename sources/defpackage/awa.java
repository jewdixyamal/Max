package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: awa  reason: default package */
public final class awa implements Parcelable {
    public static final Parcelable.Creator<awa> CREATOR = new fn9(22);
    public final Uri X;
    public final Uri a;
    public final Uri b;
    public final nz3 c;
    public final ov4 o;

    public awa(Uri uri, Uri uri2, nz3 nz3, ov4 ov4, Uri uri3) {
        this.a = uri;
        this.b = uri2;
        this.c = nz3;
        this.o = ov4;
        this.X = uri3;
    }

    public static Uri a(awa awa, up7 up7) {
        if (awa == null) {
            return Uri.parse(up7.a());
        }
        Uri uri = awa.b;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = awa.a;
        return uri2 != null ? uri2 : Uri.parse(up7.a());
    }

    public static boolean b(awa awa, up7 up7) {
        if (awa == null) {
            return false;
        }
        return (awa.o == null && awa.c == null && a(awa, up7).equals(Uri.parse(up7.a()))) ? false : true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || awa.class != obj.getClass()) {
            return false;
        }
        awa awa = (awa) obj;
        if (Objects.equals(this.a, awa.a) && Objects.equals(this.b, awa.b) && Objects.equals(this.c, awa.c) && Objects.equals(this.o, awa.o)) {
            return Objects.equals(this.X, awa.X);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        nz3 nz3 = this.c;
        int hashCode3 = (hashCode2 + (nz3 != null ? nz3.hashCode() : 0)) * 31;
        ov4 ov4 = this.o;
        int hashCode4 = (hashCode3 + (ov4 != null ? ov4.hashCode() : 0)) * 31;
        Uri uri3 = this.X;
        if (uri3 != null) {
            i = uri3.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.X, i);
    }
}
