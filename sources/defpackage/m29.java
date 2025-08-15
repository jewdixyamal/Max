package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.messages.list.loader.MessageModel;

/* renamed from: m29  reason: default package */
public final class m29 extends ppd implements q29 {
    public final xs8 X;
    public final m56 Y;
    public final lk6 Z;
    public final ey1 s0;
    public final c66 t0;
    public final b17 u0;
    public final k56 v0;
    public final yh9 w0 = new yh9(20);
    public final ArrayList x0 = new ArrayList(20);

    public m29(ExecutorService executorService, b69 b69, om8 om8, mk6 mk6, ey1 ey1, vq0 vq0, yt8 yt8, p59 p59) {
        super(executorService);
        this.X = b69;
        this.Y = om8;
        this.Z = mk6;
        this.s0 = ey1;
        this.t0 = vq0;
        this.u0 = yt8;
        this.v0 = p59;
    }

    public final void E(List list) {
        throw null;
    }

    public final void F(List list, Runnable runnable) {
        super.F(list, new v05(this, list));
    }

    /* renamed from: I */
    public final void y(hqd hqd) {
        hqd.D();
        kk6 kk6 = hqd instanceof kk6 ? (kk6) hqd : null;
        if (kk6 != null) {
            mk6 mk6 = (mk6) this.Z;
            mk6.getClass();
            ((ht8) kk6).I();
            mk6.b.remove(kk6);
        }
    }

    public final long J(long j) {
        int i;
        ArrayList arrayList = this.x0;
        if (!arrayList.isEmpty()) {
            yh9 yh9 = this.w0;
            if (yh9.e != 0) {
                int size = arrayList.size();
                int i2 = 0;
                y53.P(arrayList.size(), 0, size);
                int i3 = size - 1;
                while (true) {
                    if (i2 > i3) {
                        i = -(i2 + 1);
                        break;
                    }
                    i = (i2 + i3) >>> 1;
                    int intValue = Integer.valueOf(tpa.n(((MessageModel) arrayList.get(i)).c, j)).intValue();
                    if (intValue >= 0) {
                        if (intValue <= 0) {
                            break;
                        }
                        i3 = i - 1;
                    } else {
                        i2 = i + 1;
                    }
                }
                int i4 = -1;
                if (i < 0) {
                    int i5 = dv8.b;
                    return (((long) -1) & 4294967295L) | (((long) i) << 32);
                }
                int b = yh9.b(i);
                if (b >= 0) {
                    i4 = yh9.c[b];
                }
                if (i4 < 0) {
                    return dv8.a;
                }
                int i6 = dv8.b;
                return (((long) i4) & 4294967295L) | (((long) i) << 32);
            }
        }
        return dv8.a;
    }

    public final int K(long j) {
        long J = J(j);
        int i = dv8.b;
        int i2 = (int) (J >> 32);
        if (i2 >= 0) {
            return (int) (J & 4294967295L);
        }
        if (J == dv8.a) {
            return j();
        }
        yh9 yh9 = this.w0;
        int b = yh9.b(Math.abs(i2) - 1);
        int i3 = b >= 0 ? yh9.c[b] : -1;
        return i3 >= 0 ? i3 : j();
    }

    public final MessageModel L(int i) {
        ol7 G = G(i);
        if (G instanceof MessageModel) {
            return (MessageModel) G;
        }
        return null;
    }

    public final List b() {
        return this.x0;
    }

    public final int f(long j) {
        long J = J(j);
        int i = dv8.b;
        if (((int) (J >> 32)) < 0) {
            return -1;
        }
        return (int) (J & 4294967295L);
    }

    public final void s(dec dec, int i, List list) {
        CharSequence a;
        xs8 xs8;
        hqd hqd = (hqd) dec;
        ol7 ol7 = (ol7) C(i);
        if (hqd instanceof qy8) {
            MessageModel messageModel = (MessageModel) ol7;
            qy8 qy8 = (qy8) hqd;
            boolean z = qy8 instanceof ht8;
            ht8 ht8 = z ? (ht8) qy8 : null;
            if (ht8 != null) {
                xs8 xs82 = this.X;
                et8 et8 = new et8(xs82, ht8);
                View view = ht8.a;
                tu0.K(view, 300, et8);
                View view2 = ht8.I0;
                if (view2 instanceof ot8) {
                    GestureDetector gestureDetector = new GestureDetector(((zs8) view).getContext(), new p63(ht8, new ft8(ht8, xs82)));
                    gestureDetector.setIsLongpressEnabled(true);
                    view2.setOnTouchListener(new q46(gestureDetector, 3));
                    view2.setOnClickListener((View.OnClickListener) null);
                } else {
                    view2.setOnTouchListener((View.OnTouchListener) null);
                    tu0.K(view2, 300, new et8(ht8, xs82));
                }
                l7c l7c = view2 instanceof l7c ? (l7c) view2 : null;
                if (l7c != null) {
                    l7c.setOnClickListener(new ft8(xs82, ht8));
                }
                ad2 ad2 = new ad2(xs82, 4, ht8);
                view2.setOnLongClickListener(ad2);
                ((zs8) view).setOnLongClickListener(ad2);
                jw8 jw8 = view2 instanceof jw8 ? (jw8) view2 : null;
                if (jw8 != null) {
                    vw vwVar = r8;
                    jw8 jw82 = jw8;
                    xs8 = xs82;
                    vw vwVar2 = new vw(2, xs82, xs8.class, "onReplyClick", "onReplyClick(JJ)V", 0, 26);
                    jw82.setReplyClickListener(vwVar);
                    jw82.setForwardClickListener(new om8(1, xs8, xs8.class, "onForwardClick", "onForwardClick(Lone/me/messages/list/loader/MessageLink$ForwardModel;)V", 0, 2));
                } else {
                    xs8 = xs82;
                }
                xs8 xs83 = xs8;
                gt8 gt8 = new gt8(xs83, 0, ht8);
                qpe qpe = view2 instanceof qpe ? (qpe) view2 : null;
                if (qpe != null) {
                    qpe.setTextMessageLinkClickListener(gt8);
                }
                ck7 ck7 = view2 instanceof ck7 ? (ck7) view2 : null;
                if (ck7 != null) {
                    ck7.setOnLinkLongClickListener(new y98((Object) xs83, 9, (Object) ht8));
                }
            }
            lu3 lu3 = qy8 instanceof lu3 ? (lu3) qy8 : null;
            if (lu3 != null) {
                lu3.I0 = this.s0;
            }
            ht8 ht82 = z ? (ht8) qy8 : null;
            View view3 = ht82 != null ? ht82.I0 : null;
            l7c l7c2 = view3 instanceof l7c ? (l7c) view3 : null;
            if (l7c2 != null) {
                l7c2.setChipObserver(new y98((Object) this, 12, (Object) qy8));
            }
            qy8.E(messageModel, list);
            kk6 kk6 = qy8 instanceof kk6 ? (kk6) qy8 : null;
            if (kk6 != null) {
                mk6 mk6 = (mk6) this.Z;
                mk6.b.add(kk6);
                if (mk6.c) {
                    mk6.c = !((ht8) kk6).P(mk6.d, new vw(2, mk6, mk6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 22));
                }
                ((ht8) ((kk6) qy8)).P(mk6.d, new vw(2, this.Z, lk6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 27));
            }
            ht8 ht83 = z ? (ht8) qy8 : null;
            b17 b17 = this.u0;
            if (ht83 != null) {
                je7 je7 = ht83.N0;
                if (je7.a()) {
                    ((c17) je7.getValue()).setClickListener(b17);
                }
            }
            q5g q5g = qy8 instanceof q5g ? (q5g) qy8 : null;
            if (q5g != null) {
                gt8 gt82 = new gt8(this, 1, messageModel);
                kk7 kk7 = q5g.I0;
                kk7.a = gt82;
                tc9 tc9 = q5g.J0;
                if (!(tc9 == null || (a = tc9.a()) == null)) {
                    kk7.c(a);
                }
                ((p5g) q5g.a).setKeyboardListener(b17);
            }
        } else if (hqd instanceof u92) {
            ((u92) hqd).A((v92) ol7);
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == mda.e) {
            t92 t92 = new t92(viewGroup.getContext());
            dec dec = new dec(t92);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int G = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
            marginLayoutParams.setMargins(G, G, G, G);
            t92.setLayoutParams(marginLayoutParams);
            return dec;
        }
        int i2 = -2013265921 & i;
        if ((i & 256) != 0) {
            Context context = viewGroup.getContext();
            return new w50(context, new nd1(context), 2);
        } else if (ry8.a(i2, 0)) {
            TextView textView = new TextView(viewGroup.getContext());
            qy8 qy8 = new qy8(textView);
            textView.setMaxWidth(tu0.G(((float) 276) * fk4.d().getDisplayMetrics().density));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            float f = (float) 24;
            marginLayoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
            marginLayoutParams2.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
            textView.setGravity(17);
            textView.setLayoutParams(marginLayoutParams2);
            kqe kqe = i4f.a;
            os2.f.b(textView, du4.b);
            textView.setTextAlignment(4);
            textView.setGravity(17);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            float f2 = (float) 12;
            float f3 = (float) 4;
            textView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f4 = fk4.d().getDisplayMetrics().density * 12.0f;
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = f4;
            }
            gradientDrawable.setCornerRadii(fArr);
            textView.setBackground(gradientDrawable);
            return qy8;
        } else if (ry8.a(i2, 131072)) {
            return new q5g(viewGroup.getContext());
        } else {
            boolean z = (i & 16) != 0;
            m56 m56 = this.Y;
            if (z) {
                Context context2 = viewGroup.getContext();
                return new w50(context2, new lp3(context2, (om8) m56), 3);
            } else if ((i & 64) != 0) {
                Context context3 = viewGroup.getContext();
                return new w50(context3, new pa6(context3), 5);
            } else if ((i & 512) != 0) {
                Context context4 = viewGroup.getContext();
                return new w50(context4, new xkd(context4, (om8) m56), 6);
            } else if ((i & 32) != 0) {
                Context context5 = viewGroup.getContext();
                return new w50(context5, new gi5(context5), 4);
            } else if (!ry8.c(i2) && (i & 2) != 0 && !ry8.b(i2)) {
                return new l53(viewGroup.getContext(), (om8) m56, 2);
            } else {
                if (ry8.c(i2) && (i & 2) != 0 && !ry8.b(i2)) {
                    return new l53(viewGroup.getContext(), (om8) m56, 3);
                }
                if (!ry8.c(i2) && ry8.b(i2)) {
                    return new l53(viewGroup.getContext(), (om8) m56, 0);
                }
                if (ry8.c(i2) && ry8.b(i2)) {
                    return new l53(viewGroup.getContext(), (om8) m56, 1);
                }
                if (!ry8.c(i2) && (i & 4) != 0 && !ry8.b(i2)) {
                    Context context6 = viewGroup.getContext();
                    return new w50(context6, new esd(context6), 11);
                } else if (ry8.c(i2) && (i & 4) != 0 && !ry8.b(i2)) {
                    Context context7 = viewGroup.getContext();
                    return new w50(context7, new gsd(context7), 9);
                } else if (ry8.c(i2)) {
                    return new w50(viewGroup.getContext());
                } else {
                    if ((i & 4096) != 0) {
                        Context context8 = viewGroup.getContext();
                        return new w50(context8, new am0(context8), 1);
                    } else if ((i & 128) != 0) {
                        return new w50(viewGroup.getContext(), new x2e(viewGroup.getContext(), new kw7(viewGroup.getContext(), 1)), 7);
                    } else {
                        if ((i & 16384) != 0) {
                            return new w50(viewGroup.getContext(), new x2e(viewGroup.getContext(), new kw7(viewGroup.getContext(), 0)), 7);
                        }
                        if ((32768 & i) != 0) {
                            return new w50(viewGroup.getContext(), new x2e(viewGroup.getContext(), new kw7(viewGroup.getContext(), 2)), 7);
                        }
                        if ((i & 8) != 0) {
                            Context context9 = viewGroup.getContext();
                            return new w50(context9, new p50(context9, (om8) m56, (p59) this.v0), 0);
                        } else if ((65536 & i) != 0) {
                            Context context10 = viewGroup.getContext();
                            return new w50(context10, new dif(context10, (om8) m56), 10);
                        } else if ((33554432 & i) != 0) {
                            return new w50(viewGroup.getContext());
                        } else {
                            String e = ry8.e(i2);
                            String binaryString = Integer.toBinaryString(i);
                            throw new IllegalStateException(("unsupported view type=" + e + " binary=" + binaryString).toString());
                        }
                    }
                }
            }
        }
    }
}
