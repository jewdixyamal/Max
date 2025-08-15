package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.HashSet;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: jf7  reason: default package */
public final /* synthetic */ class jf7 implements a8 {
    public final /* synthetic */ es8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ jf7(es8 es8, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = es8;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final void a(znc znc) {
        s10 s10;
        l20 l20;
        Activity F = ay7.F(znc);
        es8 es8 = this.a;
        long j = es8.a.t0;
        HashSet hashSet = ActAttachesView.z1;
        Intent intent = new Intent(F, ActAttachesView.class);
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        String str = this.b;
        intent.putExtra("ru.ok.tamtam.extra.START_LOCAL_ID", str);
        intent.putExtra("ru.ok.tamtam.extra.START_MESSAGE", new xw8(es8));
        intent.putExtra("ru.ok.tamtam.extra.DESC_ORDER", this.c);
        cu8 cu8 = es8.a;
        intent.putExtra("ru.ok.tamtam.extra.SINGLE_ATTACH", cu8.s() ? true : this.d);
        if (this.e) {
            intent.putExtra("ru.ok.tamtam.extra.PLAY_VIDEO_ID", str);
        }
        intent.putExtra("ru.ok.tamtam.extra.CAST_ENABLED", this.f);
        k8g k8g = cu8.z0;
        if (k8g.i() > 0) {
            int i = 0;
            while (true) {
                if (i >= k8g.i()) {
                    break;
                }
                l20 h = k8g.h(i);
                if (h.g()) {
                    c20 c20 = h.g;
                    if (c20.a()) {
                        h = c20.g;
                    }
                }
                boolean f2 = h.f();
                String str2 = h.s;
                if (f2) {
                    x10 x10 = h.b;
                    if (!x10.X && h.r.equals(str)) {
                        if (oag.t(str2)) {
                            str2 = x10.a();
                        }
                        Uri r = kk5.r(str2);
                        if (r != null) {
                            iv6 o = s36.o();
                            xv6 d2 = xv6.d(r);
                            d2.d = tfg.v(F, h, false);
                            o.f(d2.a(), (t68) null);
                        }
                    }
                }
                if (h.i()) {
                    s36.o().f(wv6.a(kk5.r(h.d.d)), (t68) null);
                } else if (h.c() && (l20 = s10.d) != null) {
                    if (!l20.f()) {
                        l20 l202 = (s10 = h.j).d;
                        str2 = l202.i() ? l202.d.d : null;
                    }
                    if (!oag.t(str2)) {
                        s36.o().f(wv6.a(j47.N(str2)), (t68) null);
                    }
                }
                i++;
            }
        }
        intent.putExtra("ru.ok.tamtam.extra.COMPAT_MODE", true);
        intent.putExtra("ru.ok.tamtam.extra.START_COMPAT_VIDEO", true);
        ay7.F(znc).startActivity(intent);
    }
}
