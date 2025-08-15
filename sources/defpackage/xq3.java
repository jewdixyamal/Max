package defpackage;

import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: xq3  reason: default package */
public final class xq3 extends hl7 {
    public final /* synthetic */ int X = 2;
    public final Object Y;

    public xq3(wq3 wq3) {
        super((ema) new y34(5));
        this.Y = wq3;
        A(true);
    }

    public long k(int i) {
        switch (this.X) {
            case 0:
                return (long) au1.s(((yq3) C(i)).a);
            default:
                return super.k(i);
        }
    }

    public final int l(int i) {
        switch (this.X) {
            case 0:
                int s = au1.s(((yq3) C(i)).a);
                if (s != 0) {
                    return (s == 2 || s == 3) ? 2 : 1;
                }
                return 0;
            case 1:
                return p8a.t;
            default:
                return ((izc) C(i)).l();
        }
    }

    public final void r(dec dec, int i) {
        CharSequence charSequence;
        e52 e52;
        uj3 l;
        String str;
        String str2;
        boolean z = true;
        switch (this.X) {
            case 0:
                yq3 yq3 = (yq3) C(i);
                if (!(dec instanceof ar3)) {
                    if (dec instanceof sr3) {
                        sr3 sr3 = (sr3) dec;
                        boolean z2 = j() > 1;
                        zda zda = (zda) sr3.a;
                        int s = au1.s(yq3.a);
                        if (s == 2) {
                            zda.setTitle(z7.B(zda.getContext(), u5a.h));
                            zda.setSubtitle(z7.B(zda.getContext(), u5a.g));
                            float f = (float) 56;
                            zda.x(kt3.b(zda.getContext(), woc.b), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                            zda.R0.setColors(sr3.H0, new float[]{0.0f, 1.0f});
                        } else if (s == 3) {
                            zda.setTitle(z7.B(zda.getContext(), u5a.f));
                            zda.setSubtitle(z7.B(zda.getContext(), u5a.i));
                            float f2 = (float) 56;
                            zda.x(kt3.b(zda.getContext(), woc.w1), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                            zda.R0.setColors(sr3.I0, new float[]{0.0f, 1.0f});
                        }
                        zda.setCloseButtonVisibility(false);
                        zda.setBannerClickListener(new fr3(sr3, yq3, z2, 1));
                        zda.setCloseButtonClickListener(new tb((Object) sr3, 22, (Object) yq3));
                        return;
                    } else if (dec instanceof gr3) {
                        gr3 gr3 = (gr3) dec;
                        boolean z3 = j() > 1;
                        x8a x8a = (x8a) gr3.a;
                        int s2 = au1.s(yq3.a);
                        if (s2 != 1) {
                            int[] iArr = gr3.I0;
                            if (s2 == 4) {
                                x8a.setTitle(z7.B(x8a.getContext(), u5a.c));
                                x8a.setSubtitle(z7.B(x8a.getContext(), u5a.i));
                                float f3 = (float) 24;
                                x8a.x(kt3.b(x8a.getContext(), woc.w1), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                                x8a.R0.setColors(iArr, new float[]{0.0f, 1.0f});
                            } else if (s2 == 6) {
                                x8a.setTitle(z7.B(x8a.getContext(), u5a.b));
                                x8a.setSubtitle(z7.B(x8a.getContext(), u5a.a));
                                float f4 = (float) 24;
                                x8a.x(kt3.b(x8a.getContext(), woc.X0), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                                x8a.R0.setColors(iArr, new float[]{0.0f, 1.0f});
                            }
                        } else {
                            x8a.setTitle(z7.B(x8a.getContext(), u5a.e));
                            x8a.setSubtitle(z7.B(x8a.getContext(), u5a.d));
                            float f5 = (float) 24;
                            x8a.x(kt3.b(x8a.getContext(), woc.b), tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                            x8a.R0.setColors(gr3.H0, new float[]{0.0f, 1.0f});
                        }
                        x8a.setCloseButtonVisibility(false);
                        x8a.setBannerClickListener(new fr3(gr3, yq3, z3, 0));
                        x8a.setCloseButtonClickListener(new tb((Object) gr3, 21, (Object) yq3));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((z8c) ((a9c) dec).a).setContacts((List) C(i));
                return;
            default:
                izc izc = (izc) C(i);
                if (izc instanceof vq2) {
                    vq2 vq2 = (vq2) izc;
                    ryc ryc = new ryc(this, 0);
                    syc syc = new syc(this, 0);
                    m62 m62 = (m62) ((wq2) dec).a;
                    tu0.K(m62, 300, new tb((Object) ryc, 14, (Object) vq2));
                    m62.setOnLongClickListener(new z52(syc, vq2, m62, 3));
                    int id = m62.getId();
                    m62.setId(Long.hashCode(vq2.c));
                    w6b w6b = vq2.x0;
                    m62.setTitle(m62.b(w6b.a.toString()) ? ema.D(w6b.a, vq2.b, w6b.b) : w6b.a);
                    m62.setSubtitle(vq2.y0);
                    m62.c(vq2.v0, vq2.E0, Long.valueOf(vq2.w0));
                    m62.setPinned(vq2.o);
                    m62.setMuted(vq2.X);
                    m62.setMention(vq2.Y);
                    m62.setReaction(vq2.Z);
                    m62.setTime(vq2.s0);
                    if (id != m62.getId()) {
                        z = false;
                    }
                    m62.e(vq2.t0, z);
                    m62.setStatus(vq2.u0);
                    m62.setVerified(vq2.F0);
                    return;
                } else if (izc instanceof od6) {
                    od6 od6 = (od6) izc;
                    ga gaVar = new ga(this, 28, (od6) izc);
                    ai0 ai0 = new ai0(25);
                    m62 m622 = (m62) ((pd6) dec).a;
                    tu0.K(m622, 300, new vu5(gaVar, 3, od6));
                    m622.setOnLongClickListener(new z52(ai0, od6, m622, 9));
                    long j = od6.c;
                    m622.setId(Long.hashCode(j));
                    w6b w6b2 = od6.Y;
                    boolean b = m622.b(w6b2.a.toString());
                    List list = od6.b;
                    m622.setTitle(b ? ema.D(w6b2.a, list, w6b2.b) : w6b2.a);
                    w6b w6b3 = od6.Z;
                    CharSequence charSequence2 = w6b3.a;
                    if (m622.a(charSequence2.toString())) {
                        charSequence2 = ema.D(charSequence2, list, w6b3.b);
                    }
                    m622.setSubtitle(charSequence2);
                    m622.c(od6.X, od6.u0, Long.valueOf(j));
                    m622.setTime(od6.o);
                    m622.setVerified(od6.v0);
                    return;
                } else if (izc instanceof jq3) {
                    jq3 jq3 = (jq3) izc;
                    ryc ryc2 = new ryc(this, 1);
                    syc syc2 = new syc(this, 1);
                    lk3 lk3 = (lk3) ((lq3) dec).a;
                    tu0.K(lk3, 300, new tb((Object) ryc2, 20, (Object) jq3));
                    lk3.setOnLongClickListener(new z52(syc2, jq3, lk3, 5));
                    Uri uri = jq3.t0;
                    if (uri == null || (str2 = uri.toString()) == null) {
                        str2 = Uri.EMPTY.toString();
                    }
                    lk3.O(jq3.c, jq3.u0, str2);
                    lk3.setName(jq3.o);
                    lk3.setMessage(jq3.X);
                    lk3.setVerified(jq3.Z);
                    return;
                } else if (izc instanceof td6) {
                    td6 td6 = (td6) izc;
                    ryc ryc3 = new ryc(this, 2);
                    lk3 lk32 = (lk3) ((ud6) dec).a;
                    tu0.K(lk32, 300, new vu5(ryc3, 5, td6));
                    w6b w6b4 = td6.X;
                    boolean M = lk32.M(w6b4.a.toString());
                    List list2 = td6.b;
                    lk32.setName(M ? ema.D(w6b4.a, list2, w6b4.b) : w6b4.a);
                    w6b w6b5 = td6.Y;
                    lk32.setMessage(lk32.K(w6b5.a.toString()) ? ema.D(w6b5.a, list2, w6b5.b) : w6b5.a);
                    Uri uri2 = td6.t0;
                    if (uri2 == null || (str = uri2.toString()) == null) {
                        str = Uri.EMPTY.toString();
                    }
                    lk32.O(td6.c, td6.o, str);
                    lk32.setVerified(td6.s0);
                    return;
                } else if (izc instanceof mx8) {
                    mx8 mx8 = (mx8) izc;
                    ryc ryc4 = new ryc(this, 3);
                    m62 m623 = (m62) ((ox8) dec).a;
                    tu0.K(m623, 300, new vu5(ryc4, 17, mx8));
                    if (mx8.Y != null) {
                        m623.setTitle(mx8.t0);
                        Uri uri3 = mx8.c;
                        e52 e522 = mx8.Y;
                        e522.l0();
                        m623.c(uri3, e522.x0, Long.valueOf(mx8.Y.f()));
                    }
                    if (m623.a(mx8.s0.a.toString())) {
                        w6b w6b6 = mx8.s0;
                        charSequence = ema.D(w6b6.a, mx8.b, w6b6.b);
                    } else {
                        charSequence = mx8.s0.a;
                    }
                    m623.setSubtitle(charSequence);
                    ida o = jyc.a.o();
                    long j2 = mx8.X.b;
                    t33 t33 = o.c;
                    m623.setTime(ay7.j(o.a, t33.v(), j2, t33.n(), true));
                    e52 e523 = mx8.Y;
                    if ((e523 == null || !e523.X()) && ((e52 = mx8.Y) == null || (l = e52.l()) == null || !l.u())) {
                        z = false;
                    }
                    m623.setVerified(z);
                    return;
                } else {
                    return;
                }
        }
    }

    public void s(dec dec, int i, List list) {
        switch (this.X) {
            case 2:
                r(dec, i);
                return;
            default:
                super.s(dec, i, list);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                wq3 wq3 = (wq3) this.Y;
                return i != 0 ? (i == 2 || i == 3) ? new sr3(viewGroup.getContext(), wq3) : new gr3(viewGroup.getContext(), wq3) : new ar3(viewGroup.getContext(), wq3);
            case 1:
                return new dec(new z8c(viewGroup.getContext(), (zu2) this.Y));
            default:
                if (i == p8a.l) {
                    return new dec(new m62(viewGroup.getContext()));
                }
                if (i == p8a.o) {
                    return new dec(new m62(viewGroup.getContext()));
                }
                if (i == p8a.m) {
                    return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == p8a.p) {
                    return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == p8a.r) {
                    return new dec(new m62(viewGroup.getContext()));
                }
                throw new IllegalArgumentException(zr6.h(i, "Unsupported view type: "));
        }
    }

    public xq3(zu2 zu2, ExecutorService executorService) {
        super(new qz7((Object) executorService, 4, (Object) new y34(7)));
        this.Y = zu2;
    }

    public xq3(tyc tyc, ExecutorService executorService) {
        super(new qz7((Object) executorService, 4, (Object) new y34(8)));
        this.Y = tyc;
    }
}
