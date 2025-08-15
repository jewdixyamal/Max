package defpackage;

import android.net.Uri;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: yt6  reason: default package */
public final class yt6 implements a53 {
    public static final yt6 m = new yt6(0, Uri.parse("error"), -1, -1, false, -1, false, (Uri) null, (jic) null, (String) null, (Uri) null, 3584);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final Uri h;
    public final jic i;
    public final rsc j;
    public final String k;
    public final Uri l;

    public yt6(long j2, Uri uri, int i2, int i3, boolean z, int i4, boolean z2, Uri uri2, jic jic, String str, Uri uri3, int i5) {
        int i6 = i5;
        Uri uri4 = null;
        jic jic2 = (i6 & 256) != 0 ? null : jic;
        ssc ssc = ssc.l;
        String str2 = (i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str;
        uri4 = (i6 & 2048) == 0 ? uri3 : uri4;
        this.a = j2;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = z2;
        this.h = uri2;
        this.i = jic2;
        this.j = ssc;
        this.k = str2;
        this.l = uri4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt6)) {
            return false;
        }
        yt6 yt6 = (yt6) obj;
        return this.a == yt6.a && tpa.f(this.b, yt6.b) && this.c == yt6.c && this.d == yt6.d && this.e == yt6.e && this.f == yt6.f && this.g == yt6.g && tpa.f(this.h, yt6.h) && tpa.f(this.i, yt6.i) && tpa.f(this.j, yt6.j) && tpa.f(this.k, yt6.k) && tpa.f(this.l, yt6.l);
    }

    public final int hashCode() {
        int d2 = ms2.d(k7d.e(this.f, ms2.d(k7d.e(this.d, k7d.e(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31), 31, this.g);
        int i2 = 0;
        Uri uri = this.h;
        int hashCode = (d2 + (uri == null ? 0 : uri.hashCode())) * 31;
        jic jic = this.i;
        int hashCode2 = (this.j.hashCode() + ((hashCode + (jic == null ? 0 : jic.hashCode())) * 31)) * 31;
        String str = this.k;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri2 = this.l;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String i() {
        return this.k;
    }

    public final String toString() {
        return "ImageAttachConfig(photoId=" + this.a + ", uri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", isGif=" + this.e + ", maxImageViewHeight=" + this.f + ", isAutoLoadImageDisabled=" + this.g + ", lowResUri=" + this.h + ", resizeOptions=" + this.i + ", scaleType=" + this.j + ", attachId=" + this.k + ", gifUri=" + this.l + ")";
    }
}
