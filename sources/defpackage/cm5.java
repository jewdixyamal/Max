package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: cm5  reason: default package */
public abstract class cm5 extends hpa {
    public final c c;
    public he0 d = null;
    public final mw7 e = new mw7(10);
    public final boolean f;
    public final HashMap g;
    public a h;

    public cm5(n16 n16) {
        new qqd(17, (byte) 0);
        this.g = new HashMap();
        this.h = null;
        this.c = n16;
        this.f = false;
    }

    public void a(ViewGroup viewGroup, int i, a aVar) {
        String str;
        he0 he0 = this.d;
        c cVar = this.c;
        if (he0 == null) {
            cVar.getClass();
            this.d = new he0(cVar);
        }
        HashMap hashMap = this.g;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            if (aVar.equals((a) hashMap.get(str))) {
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            boolean o0 = aVar.o0();
            mw7 mw7 = this.e;
            if (!o0) {
                mw7.e(str);
            } else {
                mw7.d(str, new bm5(str, cVar.b0(aVar)));
            }
            hashMap.remove(str);
        }
        this.d.h(aVar);
    }

    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    bm5 bm5 = (bm5) parcelable2;
                    this.e.d(bm5.a, bm5);
                }
            }
            i(bundle);
        }
    }

    public final void f(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract a g(int i);

    public abstract String h(int i);

    public void i(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("f")) {
                try {
                    a H = this.c.H(str, bundle);
                    if (H != null) {
                        H.Z0(false);
                        this.g.put(str.substring(1), H);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
