package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.loader.MessageModel;

/* renamed from: q5g  reason: default package */
public final class q5g extends qy8 {
    public final kk7 I0;
    public tc9 J0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q5g(android.content.Context r5) {
        /*
            r4 = this;
            p5g r0 = new p5g
            r0.<init>(r5)
            r4.<init>(r0)
            kk7 r1 = new kk7
            yqd r2 = new yqd
            r3 = 8
            r2.<init>(r5, r3)
            r5 = 7
            r3 = 0
            r1.<init>(r3, r2, r5)
            r4.I0 = r1
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r5 = 24
            float r5 = (float) r5
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r5
            int r1 = defpackage.tu0.G(r1)
            r4.setMarginStart(r1)
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r5 = r5 * r1
            int r5 = defpackage.tu0.G(r5)
            r4.setMarginEnd(r5)
            r0.setLayoutParams(r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 0
            r4.setShape(r5)
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1103101952(0x41c00000, float:24.0)
            float r1 = r1 * r2
            r2 = 8
            float[] r3 = new float[r2]
        L_0x0062:
            if (r5 >= r2) goto L_0x0069
            r3[r5] = r1
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0069:
            r4.setCornerRadii(r3)
            r0.setBackground(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5g.<init>(android.content.Context):void");
    }

    public final void D() {
        CharSequence a;
        tc9 tc9 = this.J0;
        if (tc9 != null && (a = tc9.a()) != null) {
            this.I0.getClass();
            kk7.a(a);
        }
    }

    public final void E(MessageModel messageModel, List list) {
        MessageModel messageModel2 = messageModel;
        this.H0 = new ry8(messageModel2.I0);
        tc9 tc9 = messageModel2.z0;
        this.J0 = tc9;
        View view = this.a;
        if (tc9 != null) {
            p5g p5g = (p5g) view;
            p5g.y0 = tc9;
            Iterator it = tc9.b.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                boolean hasNext = it.hasNext();
                TextView textView = p5g.b;
                TextView textView2 = p5g.c;
                bu6 bu6 = p5g.a;
                c17 c17 = p5g.o;
                if (hasNext) {
                    s5g s5g = (s5g) it.next();
                    Iterator it2 = it;
                    if (s5g instanceof t5g) {
                        ay7.b(p5g, c17, -1);
                        float f = p5g.x0;
                        c17.a = f;
                        c17.b = f;
                        c17.a(tc9.a, ((t5g) s5g).a, true);
                        z4 = true;
                    } else if (s5g instanceof u5g) {
                        u5g u5g = (u5g) s5g;
                        ViewGroup.LayoutParams layoutParams = bu6.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = u5g.a.getWidth();
                            layoutParams.height = u5g.a.getHeight();
                            bu6.setLayoutParams(layoutParams);
                            String str = u5g.b;
                            if (str == null || str.length() == 0) {
                                yt6 yt6 = u5g.c;
                                if (yt6 != null) {
                                    bu6.setColorFilter((ColorFilter) null);
                                    bu6.setImageAttach(yt6);
                                }
                            } else {
                                if (u5g.d) {
                                    bu6.setColorFilter(qp4.u0.j(p5g).a().s().c.b);
                                } else {
                                    bu6.setColorFilter((ColorFilter) null);
                                }
                                bu6.o(xv6.d(Uri.parse(str)).a(), (wv6) null);
                            }
                            z = true;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else if (s5g instanceof v5g) {
                        v5g v5g = (v5g) s5g;
                        boolean z5 = v5g.c;
                        if (z5) {
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                        CharSequence charSequence = v5g.a;
                        if (z5) {
                            textView2.setText(charSequence);
                        } else {
                            textView.setText(charSequence);
                            kqe kqe = i4f.a;
                            v5g.b.b(textView, du4.b);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    it = it2;
                } else {
                    bu6.setVisibility(z ? 0 : 8);
                    textView.setVisibility(z2 ? 0 : 8);
                    textView2.setVisibility(z3 ? 0 : 8);
                    c17.setVisibility(z4 ? 0 : 8);
                }
            }
        }
        F(messageModel2, view);
    }

    public final void e(v83 v83) {
        Drawable background = ((p5g) this.a).getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(v83.b.w);
        }
    }
}
