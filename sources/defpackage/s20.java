package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: s20  reason: default package */
public final class s20 extends cm5 {
    public final c i;
    public final ArrayList j = new ArrayList();
    public final List k;
    public final Context l;
    public final boolean m;
    public final boolean n;
    public final HashMap o = new HashMap();
    public String p;
    public String q;

    public s20(n16 n16, List list, Context context, boolean z, boolean z2) {
        super(n16);
        this.i = n16;
        this.k = list;
        this.l = context;
        this.m = z;
        this.n = z2;
    }

    public final void a(ViewGroup viewGroup, int i2, a aVar) {
        super.a(viewGroup, i2, aVar);
        mpa l2 = l(i2);
        if (l2 != null) {
            this.o.remove(((l20) l2.a).r);
        }
    }

    public final int b() {
        return this.j.size();
    }

    public final int c(a aVar) {
        int indexOf;
        if (!(aVar instanceof FrgAttachView) || (indexOf = this.j.indexOf(((FrgAttachView) aVar).D1.r)) == -1) {
            return -2;
        }
        return indexOf;
    }

    public final a g(int i2) {
        a aVar;
        String str;
        mpa l2 = l(i2);
        Object obj = l2.a;
        l20 l20 = (l20) obj;
        boolean z = l20.t;
        g20 g20 = g20.c;
        Object obj2 = l2.b;
        if (z || (l20.a != g20 && !s5c.N(l20))) {
            l20 l202 = (l20) obj;
            boolean z2 = l202.t;
            g20 g202 = g20.o;
            if (z2 || (l202.a != g202 && !s5c.P(l202))) {
                if (l202.t) {
                    vl vlVar = vl.o;
                    int i3 = zqe.a;
                    g20 g203 = l202.a;
                    str = g203 == g202 ? vlVar.getString(jpc.V) : g203 == g20 ? vlVar.getString(jpc.U) : vlVar.getString(jpc.T);
                } else {
                    str = this.l.getString(jpc.h3);
                }
                FrgAttachUnknown frgAttachUnknown = new FrgAttachUnknown();
                Bundle s1 = FrgAttachView.s1(l202, (es8) obj2, false, false, false);
                s1.putString("ru.ok.tamtam.extra.TEXT", str);
                frgAttachUnknown.X0(s1);
                aVar = frgAttachUnknown;
            } else {
                boolean equals = TextUtils.equals(l202.r, this.q);
                if (equals) {
                    this.q = null;
                }
                Bundle s12 = FrgAttachView.s1(l202, (es8) obj2, false, l202.r.equals(this.p), false);
                s12.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", equals);
                aVar = new FrgAttachVideo();
                aVar.X0(s12);
            }
        } else {
            l20 l203 = (l20) obj;
            boolean equals2 = l203.r.equals(this.p);
            Bundle s13 = FrgAttachView.s1(l203, (es8) obj2, false, equals2, equals2 && this.m);
            aVar = new FrgAttachPhoto();
            aVar.X0(s13);
        }
        aVar.Z.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", this.n);
        this.o.put(((l20) obj).r, new WeakReference(aVar));
        return aVar;
    }

    public final String h(int i2) {
        return (String) this.j.get(i2);
    }

    public final void i(Bundle bundle) {
        Bundle bundle2;
        l20 a;
        super.i(bundle);
        for (String str : bundle.keySet()) {
            if (!TextUtils.isEmpty(str) && str.startsWith("f")) {
                a H = this.i.H(str, bundle);
                if (!(!(H instanceof FrgAttachView) || (bundle2 = H.Z) == null || (a = iz7.a(bundle2.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"))) == null)) {
                    this.o.put(a.r, new WeakReference((FrgAttachView) H));
                }
            }
        }
    }

    public final void j(List list, boolean z) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((es8) list.get(i2)).a.z0.i();
        }
        List<es8> list2 = this.k;
        if (z) {
            list2.addAll(list);
        } else {
            list2.addAll(0, list);
        }
        ArrayList arrayList = this.j;
        arrayList.clear();
        for (es8 es8 : list2) {
            for (int i3 = 0; i3 < es8.a.z0.i(); i3++) {
                arrayList.add(es8.a.z0.h(i3).r);
            }
        }
    }

    public final FrgAttachView k(String str) {
        WeakReference weakReference = (WeakReference) this.o.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (FrgAttachView) weakReference.get();
    }

    public final mpa l(int i2) {
        int i3 = 0;
        for (es8 es8 : this.k) {
            if (es8 != null) {
                cu8 cu8 = es8.a;
                if (!cu8.n()) {
                    continue;
                } else {
                    for (int i4 = 0; i4 < cu8.z0.i(); i4++) {
                        l20 h = cu8.z0.h(i4);
                        if (i3 == i2) {
                            if (h.g()) {
                                c20 c20 = h.g;
                                if (c20.a()) {
                                    h = c20.g;
                                }
                            }
                            return new mpa(h, es8);
                        }
                        i3++;
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
