package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: qlb  reason: default package */
public final class qlb extends ppd {
    public final plb X;
    public final gaa Y = new gaa((Object) this);

    public qlb(ExecutorService executorService, plb plb) {
        super(executorService);
        this.X = plb;
    }

    /* renamed from: J */
    public final void r(gmb gmb, int i) {
        zl0 zl0;
        cjb cjb = (cjb) ((ol7) C(i));
        dec dec = null;
        View.OnClickListener mlb = cjb instanceof lib ? new mlb(this, 0) : cjb instanceof pib ? new mlb(this, 1) : cjb instanceof nib ? new mlb(this, 2) : cjb instanceof oib ? new mlb(this, 3) : cjb instanceof ajb ? new mlb(this, 4) : cjb instanceof zib ? new mlb(this, 5) : cjb instanceof uib ? new olb(cjb, this) : cjb instanceof xib ? new olb(this, cjb) : null;
        if (cjb instanceof ajb) {
            zl0 = new zl0(8, this);
        } else {
            boolean z = cjb instanceof uib;
            zl0 = null;
        }
        gmb.A(cjb);
        if ((cjb instanceof qib) || (cjb instanceof wib)) {
            gmb.F(this.Y);
        } else if (cjb instanceof pib) {
            if (gmb instanceof b42) {
                dec = (b42) gmb;
            }
            if (dec != null) {
                ((z32) dec.a).setOnShareLinkClickListener(new a42(0, new nlb(this, 0)));
            }
        } else if (cjb instanceof kib) {
            if (gmb instanceof p7a) {
                dec = (p7a) gmb;
            }
            if (dec != null) {
                ((o7a) dec.a).setListener(new wp(5, (m56) new nlb(this, 1)));
            }
        }
        if (mlb != null) {
            gmb.G(mlb);
        }
        if (zl0 != null) {
            gmb.H(zl0);
        }
    }

    public final int l(int i) {
        return ((cjb) ((ol7) C(i))).l();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = i;
        int i3 = 536870911 & i2;
        if (lz7.i(i3, 1)) {
            o7a o7a = new o7a(viewGroup.getContext());
            dec dec = new dec(o7a);
            o7a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return dec;
        } else if (lz7.i(i3, 2)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            p20 p20 = new p20(oneMeButton, 6);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return p20;
        } else if (lz7.i(i3, 4)) {
            return new p20(viewGroup.getContext());
        } else {
            if (lz7.i(i3, 65536)) {
                return new p20(new eq3(viewGroup.getContext()), 3);
            }
            if (lz7.i(i3, 8)) {
                return new p20(new en2(viewGroup.getContext()), 1);
            }
            if (lz7.i(i3, 16)) {
                ufd ufd = new ufd(viewGroup.getContext(), (AttributeSet) null);
                p20 p202 = new p20(ufd, 7);
                ufd.setId(wea.c1);
                return p202;
            } else if (lz7.i(i3, 4096)) {
                TextView textView = new TextView(viewGroup.getContext());
                p20 p203 = new p20(textView, 4);
                p203.E();
                textView.setId(wea.z);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView.setGravity(16);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                i4f.l.b(textView, du4.b);
                v3c.y(new v9(3, (Continuation) null, 11), textView);
                return p203;
            } else if (lz7.i(i3, 32)) {
                TextView textView2 = new TextView(viewGroup.getContext());
                p20 p204 = new p20(textView2, 5);
                p204.E();
                textView2.setId(wea.T);
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView2.setTextAlignment(5);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                i4f.l.b(textView2, du4.b);
                Drawable b = kt3.b(textView2.getContext(), woc.V1);
                float f = (float) 20;
                b.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                textView2.setCompoundDrawablePadding(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                textView2.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, b, (Drawable) null);
                v3c.y(new c3(b, (Continuation) null, 14), textView2);
                return p204;
            } else if (lz7.i(i3, 32768)) {
                return new dec(new z32(viewGroup.getContext()));
            } else {
                if (lz7.i(i3, 64)) {
                    return new cc(viewGroup.getContext(), 0);
                }
                if (lz7.i(i3, 256)) {
                    ufd ufd2 = new ufd(viewGroup.getContext(), (AttributeSet) null);
                    p20 p205 = new p20(ufd2, 0);
                    ufd2.setModelItem(new vfd((long) 256, 0, new eqe(yea.i), (jfd) null, new eqe(yea.j), Integer.valueOf(woc.i1), cfd.a, (zed) null, (jqe) null, 0, (wed) null, 1800));
                    return p205;
                } else if (lz7.i(i3, 128)) {
                    return new cc(viewGroup.getContext(), 1);
                } else {
                    if (lz7.i(i3, 512)) {
                        lk3 lk3 = new lk3(viewGroup.getContext(), (AttributeSet) null);
                        p20 p206 = new p20(lk3, 2);
                        v3c.y(new a93(3, (Continuation) null, 0), lk3);
                        return p206;
                    } else if (lz7.i(i3, 2048)) {
                        return new cc(viewGroup.getContext(), 2);
                    } else {
                        if (lz7.i(i3, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                            amd amd = new amd(viewGroup.getContext());
                            amd.setShimmerBackground(zld.a);
                            return new p20(amd, 9);
                        }
                        throw new IllegalStateException(("unknown item view type " + i2 + "}").toString());
                    }
                }
            }
        }
    }
}
