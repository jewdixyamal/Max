package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: do0  reason: default package */
public final class do0 implements ww0 {
    public final String a;
    public final jic b;
    public final anc c;
    public final ju6 d;
    public final ww0 e;
    public final String f;
    public Object g;
    public final int h;

    public do0(String str, jic jic, anc anc, ju6 ju6, ww0 ww0, String str2) {
        this.a = str;
        this.b = jic;
        this.c = anc;
        this.d = ju6;
        this.e = ww0;
        this.f = str2;
        this.h = ((((ju6.hashCode() + ((anc.hashCode() + (((str.hashCode() * 31) + (jic != null ? jic.hashCode() : 0)) * 31)) * 31)) * 31) + (ww0 != null ? ww0.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    public final boolean a(Uri uri) {
        return w9e.p0(this.a, uri.toString(), false);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!do0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        do0 do0 = (do0) obj;
        return tpa.f(this.a, do0.a) && tpa.f(this.b, do0.b) && tpa.f(this.c, do0.c) && tpa.f(this.d, do0.d) && tpa.f(this.e, do0.e) && tpa.f(this.f, do0.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
