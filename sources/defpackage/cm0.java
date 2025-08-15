package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: cm0  reason: default package */
public final class cm0 extends hqd {
    public final /* synthetic */ int F0 = 0;
    public final m56 G0;

    public cm0(Context context, iv5 iv5) {
        super(new bm0(context));
        this.G0 = iv5;
    }

    public final void A(ol7 ol7) {
        wv6 wv6;
        wv6 wv62;
        switch (this.F0) {
            case 0:
                ov5 ov5 = (ov5) ol7;
                bm0 bm0 = (bm0) this.a;
                bm0.c.setText(ov5.b);
                bm0.o.setText(ov5.o);
                bm0.setBackgroundColor(ov5.c);
                String str = ov5.X;
                if (str != null) {
                    xv6 d = xv6.d(Uri.parse(str));
                    d.d = bm0.b;
                    wv6 = d.a();
                } else {
                    wv6 = null;
                }
                SimpleDraweeView simpleDraweeView = bm0.s0;
                if (wv6 != null) {
                    iv6 o = s36.o();
                    o.getClass();
                    hv6 hv6 = new hv6(o, wv6, bm0);
                    wjc wjc = bm0.a;
                    wjc.a(hv6);
                    if (simpleDraweeView.getController() == null) {
                        e2b a = s36.a.get();
                        a.g = wjc;
                        a.k = true;
                        simpleDraweeView.setController(a.a());
                    }
                    simpleDraweeView.setVisibility(0);
                } else {
                    simpleDraweeView.setController((mq4) null);
                    simpleDraweeView.setVisibility(8);
                }
                tu0.K(bm0, 300, new tb((Object) this, 1, (Object) ov5));
                return;
            default:
                ov5 ov52 = (ov5) ol7;
                pv5 pv5 = (pv5) this.a;
                pv5.c.setText(ov52.b);
                pv5.o.setText(ov52.o);
                pv5.setBackgroundColor(ov52.c);
                String str2 = ov52.X;
                if (str2 != null) {
                    xv6 d2 = xv6.d(Uri.parse(str2));
                    d2.d = pv5.b;
                    wv62 = d2.a();
                } else {
                    wv62 = null;
                }
                SimpleDraweeView simpleDraweeView2 = pv5.s0;
                if (wv62 != null) {
                    iv6 o2 = s36.o();
                    o2.getClass();
                    hv6 hv62 = new hv6(o2, wv62, pv5);
                    wjc wjc2 = pv5.a;
                    wjc2.a(hv62);
                    if (simpleDraweeView2.getController() == null) {
                        e2b a2 = s36.a.get();
                        a2.g = wjc2;
                        a2.k = true;
                        simpleDraweeView2.setController(a2.a());
                    }
                    simpleDraweeView2.setVisibility(0);
                } else {
                    simpleDraweeView2.setController((mq4) null);
                    simpleDraweeView2.setVisibility(8);
                }
                tu0.K(pv5, 300, new vu5(this, 1, ov52));
                return;
        }
    }

    public cm0(Context context, m56 m56) {
        super(new pv5(context));
        this.G0 = m56;
    }
}
