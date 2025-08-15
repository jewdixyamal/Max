package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Base64;
import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: o20  reason: default package */
public final class o20 implements t00 {
    public final Context a;
    public final y00 b;
    public final vxc c;
    public final HashMap d = new HashMap();
    public final Map e = Collections.synchronizedMap(new i56(200, 0));
    public final LruCache f = new LruCache(200);
    public final HashSet g = new HashSet();
    public final hc3 h = new Object();

    /* JADX WARNING: type inference failed for: r1v6, types: [hc3, java.lang.Object] */
    public o20(Context context, y00 y00, vxc vxc) {
        this.a = context;
        this.b = y00;
        this.c = vxc;
    }

    public final Uri a(l20 l20) {
        x10 x10;
        y00 y00 = this.b;
        y00.getClass();
        Uri uri = (Uri) y00.d.get(l20.r);
        if (uri != null) {
            return uri;
        }
        boolean i = l20.i();
        s10 s10 = l20.j;
        if (i || s5c.P(l20)) {
            return j47.N((s5c.P(l20) ? s10.d.d : l20.d).d);
        } else if (l20.f() || s5c.N(l20)) {
            return j47.N((s5c.N(l20) ? s10.d.b : l20.b).a());
        } else if (!l20.g() || (x10 = l20.g.f) == null) {
            return uri;
        } else {
            return j47.N(x10 != null ? x10.a() : null);
        }
    }

    public final BitmapDrawable b(l20 l20, boolean z) {
        l20 l202;
        n20 n20 = new n20(l20.r, z);
        Map map = this.e;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) map.get(n20);
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        s10 s10 = l20.j;
        if (!(s10 == null || (l202 = s10.d) == null)) {
            l20 = l202;
        }
        byte[] D = s5c.D(l20);
        if (D == null || D.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e2) {
                hm9.p("o20", "AttachmentsPreviewCache:", e2);
            }
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(D, 0, D.length);
        if (decodeByteArray == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.a.getResources(), decodeByteArray);
        map.put(n20, bitmapDrawable2);
        return bitmapDrawable2;
    }

    public final Uri c(l20 l20, boolean z) {
        l20 l202;
        n20 n20 = new n20(l20.r, z);
        LruCache lruCache = this.f;
        Uri uri = (Uri) lruCache.get(n20);
        if (uri != null) {
            return uri;
        }
        s10 s10 = l20.j;
        if (!(s10 == null || (l202 = s10.d) == null)) {
            l20 = l202;
        }
        byte[] D = s5c.D(l20);
        if (D == null || D.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e2) {
                hm9.p("o20", "AttachmentsPreviewCache:", e2);
            }
        }
        String encodeToString = Base64.encodeToString(D, 2);
        Uri parse = Uri.parse("data:image/png;base64," + encodeToString);
        lruCache.put(n20, parse);
        return parse;
    }
}
