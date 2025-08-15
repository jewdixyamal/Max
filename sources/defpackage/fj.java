package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fj  reason: default package */
public final class fj {
    public final AtomicReference a = new AtomicReference(xxc.b);
    public final HashMap b;

    static {
        nec.a(fj.class).b();
    }

    public fj() {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.b = new HashMap();
    }

    public final List a(CharSequence charSequence) {
        if ((charSequence instanceof Spanned) && charSequence.length() != 0) {
            HashMap hashMap = this.b;
            if (!hashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int length = charSequence.length();
                Object[] objArr = null;
                try {
                    Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                    if (spanned != null) {
                        objArr = spanned.getSpans(0, length, c4f.class);
                    }
                } catch (Throwable unused) {
                }
                c4f[] c4fArr = (c4f[]) objArr;
                if (c4fArr != null) {
                    for (c4f c4f : c4fArr) {
                        try {
                            au1.r(hashMap.get(charSequence.subSequence(((Spanned) charSequence).getSpanStart(c4f), ((Spanned) charSequence).getSpanEnd(c4f)).toString()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return x53.x0(arrayList, new fs4(7));
            }
        }
        return nz4.a;
    }
}
