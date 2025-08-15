package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ja8  reason: default package */
public final class ja8 implements Parcelable {
    public static final Parcelable.Creator<ja8> CREATOR = new uk7(10);
    public final Bitmap X;
    public final Uri Y;
    public final Bundle Z;
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence o;
    public final Uri s0;
    public MediaDescription t0;

    public ja8(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = charSequence3;
        this.X = bitmap;
        this.Y = uri;
        this.Z = bundle;
        this.s0 = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ja8 a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x006b
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = defpackage.ha8.g(r13)
            java.lang.CharSequence r3 = defpackage.ha8.i(r13)
            java.lang.CharSequence r4 = defpackage.ha8.h(r13)
            java.lang.CharSequence r5 = defpackage.ha8.c(r13)
            android.graphics.Bitmap r6 = defpackage.ha8.e(r13)
            android.net.Uri r7 = defpackage.ha8.f(r13)
            android.os.Bundle r1 = defpackage.ha8.d(r13)
            if (r1 != 0) goto L_0x0025
        L_0x0023:
            r1 = r0
            goto L_0x002b
        L_0x0025:
            defpackage.bi8.a(r1)
            r1.isEmpty()     // Catch:{ BadParcelableException -> 0x0023 }
        L_0x002b:
            if (r1 == 0) goto L_0x0033
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r1)
            r1 = r8
        L_0x0033:
            if (r1 == 0) goto L_0x0059
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x0057
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L_0x0051
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L_0x0051
            r8 = r0
        L_0x004f:
            r0 = r9
            goto L_0x005a
        L_0x0051:
            r1.remove(r8)
            r1.remove(r10)
        L_0x0057:
            r8 = r1
            goto L_0x004f
        L_0x0059:
            r8 = r1
        L_0x005a:
            if (r0 == 0) goto L_0x005e
        L_0x005c:
            r9 = r0
            goto L_0x0063
        L_0x005e:
            android.net.Uri r0 = defpackage.ia8.a(r13)
            goto L_0x005c
        L_0x0063:
            ja8 r0 = new ja8
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.t0 = r13
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja8.a(java.lang.Object):ja8");
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.t0;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b2 = ha8.b();
        ha8.n(b2, this.a);
        ha8.p(b2, this.b);
        ha8.o(b2, this.c);
        ha8.j(b2, this.o);
        ha8.l(b2, this.X);
        ha8.m(b2, this.Y);
        ha8.k(b2, this.Z);
        ia8.b(b2, this.s0);
        MediaDescription a2 = ha8.a(b2);
        this.t0 = a2;
        return a2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.b + ", " + this.c + ", " + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}
