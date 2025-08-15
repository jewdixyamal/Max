package defpackage;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: xp7  reason: default package */
public final class xp7 {
    public static final /* synthetic */ int h = 0;
    public final av0 a;
    public final ox3 b;
    public final hq7 c;
    public final kke d;
    public final ContextScope e;
    public final p4d f;
    public Map g = oz4.a;

    public xp7(av0 av0, ox3 ox3, m7b m7b, hq7 hq7, kke kke, ContentResolver contentResolver, zi5 zi5) {
        this.a = av0;
        this.b = ox3;
        this.c = hq7;
        this.d = kke;
        w9a w9a = (w9a) kke;
        ContextScope a2 = j1e.a(w9a.a());
        this.e = a2;
        p7b p7b = (p7b) m7b;
        this.f = new p4d(p7b.c, p7b.e, new imc(contentResolver, zi5, false, 22));
        od2.L(od2.F(new zn5(((fz6) hq7).w0, new vp7(this, (Continuation) null), 5), w9a.a()), j1e.F(a2, ox3));
    }

    public final List a(String str) {
        nz4 nz4 = nz4.a;
        if (str == null) {
            return nz4;
        }
        if (str.equals("SELECTED_MEDIA_ALBUM")) {
            p4d p4d = this.f;
            p4d.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = p4d.a.iterator();
            while (it.hasNext()) {
                r4d r4d = (r4d) it.next();
                if (r4d.f) {
                    arrayList.add(r4d.a);
                }
            }
            return arrayList;
        }
        b86 b86 = (b86) this.g.get(str);
        if (b86 == null) {
            return nz4;
        }
        List<zp7> c2 = ((fz6) this.c).c(b86.a);
        ArrayList arrayList2 = new ArrayList(z53.S(c2, 10));
        for (zp7 H : c2) {
            arrayList2.add(ay7.H(H));
        }
        return arrayList2;
    }
}
