package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jv5  reason: default package */
public final class jv5 extends ppd {
    public final /* synthetic */ int X;
    public Object Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv5(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    public void H(hqd hqd, int i) {
        switch (this.X) {
            case 0:
                hqd.A((ol7) C(i));
                return;
            case 2:
                K((iq) hqd, i);
                return;
            case 3:
                L((g62) hqd, i);
                return;
            case 4:
                M((qr3) hqd, i);
                return;
            case 6:
                N((gv5) hqd, i);
                return;
            case 7:
                O((io6) hqd, i);
                return;
            case 8:
                P((fn8) hqd, i);
                return;
            case 9:
                ol7 ol7 = (ol7) this.o.f.get(i);
                if (ol7.l() == 2 && (ol7 instanceof op9)) {
                    op9 op9 = (op9) ol7;
                    ((cmd) ((pp9) hqd).a).b.c();
                    return;
                } else if (ol7.l() == 1 && (ol7 instanceof qo9)) {
                    to9 to9 = (to9) hqd;
                    qo9 qo9 = (qo9) ol7;
                    om8 om8 = new om8(1, (gp9) this.Y, gp9.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 7);
                    to9.A(qo9);
                    tu0.K((OneMeDraweeView) to9.a, 300, new vu5(om8, 20, qo9));
                    return;
                } else {
                    return;
                }
            case 10:
                Q((kgb) hqd, i);
                return;
            case 11:
                R((y8c) hqd, i);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (hqd instanceof hed) {
                    hed hed = (hed) hqd;
                    ol7 ol72 = (ol7) C(i);
                    if (ol72 instanceof wo0) {
                        hed.A(ol72);
                        lk3 lk3 = (lk3) hed.a;
                        Integer valueOf = Integer.valueOf(hha.a);
                        b7a b7a = b7a.o;
                        wo0 wo0 = (wo0) ol72;
                        gaa gaa = (gaa) this.Y;
                        lk3.S(lk3, valueOf, b7a, new zja(gaa, 19, wo0), 4);
                        tu0.K(lk3, 300, new v7d(gaa, 1, wo0));
                        return;
                    }
                    return;
                }
                hqd.A((ol7) C(i));
                return;
            case 13:
                S((ise) hqd, i);
                return;
            default:
                super.r(hqd, i);
                return;
        }
    }

    public qo9 J(int i) {
        ol7 ol7 = (ol7) C(i);
        if (ol7 instanceof qo9) {
            return (qo9) ol7;
        }
        return null;
    }

    public void K(iq iqVar, int i) {
        eq eqVar = (eq) this.o.f.get(i);
        f fVar = new f(1, (mr) this.Y, mr.class, "onAppearanceModeSelected", "onAppearanceModeSelected(Lone/me/appearancesettings/singletheme/model/AppearanceMode;)V", 0, 1);
        iqVar.A(eqVar);
        tu0.K((gq) iqVar.a, 300, new hq(fVar, 0, eqVar));
    }

    public void L(g62 g62, int i) {
        c62 c62 = (c62) this.o.f.get(i);
        f fVar = new f(1, (w52) this.Y, w52.class, "onBackgroundSelected", "onBackgroundSelected(Lone/me/appearancesettings/singletheme/model/ChatBackground;)V", 0, 7);
        View view = g62.a;
        f62 f62 = (f62) view;
        f62.setBackgroundPreview(c62.o);
        Boolean bool = c62.a;
        f62.setSelected(bool != null ? bool.booleanValue() : false);
        tu0.K((f62) view, 300, new tb((Object) fVar, 11, (Object) c62));
    }

    public void M(qr3 qr3, int i) {
        pr3 pr3 = (pr3) ((ol7) C(i));
        e11 e11 = new e11(0, (nr3) this.Y, nr3.class, "onButtonClick", "onButtonClick()V", 0, 18);
        qr3.A(pr3);
        qr3.F(pr3.b, e11);
    }

    public void N(gv5 gv5, int i) {
        w9f w9f = (w9f) ((ol7) C(i));
        v9f v9f = v9f.a;
        v9f v9f2 = w9f.b;
        View view = gv5.a;
        if (v9f2 == v9f) {
            ((TextView) view).setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(view, 300, new ev5((m56) this.Y, w9f, 0));
        }
        if (w9f.b == v9f) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(w9f.c.a(gv5));
    }

    public void O(io6 io6, int i) {
        go6 go6 = (go6) this.o.f.get(i);
        f fVar = new f(1, (o7d) this.Y, o7d.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0, 25);
        View view = io6.a;
        ho6 ho6 = (ho6) view;
        ho6.G0.setText(go6.a);
        Boolean bool = go6.b;
        ho6.setSelected(bool != null ? bool.booleanValue() : false);
        tu0.K((ho6) view, 300, new vu5(fVar, 6, go6));
    }

    public void P(fn8 fn8, int i) {
        en8 en8 = (en8) ((ol7) C(i));
        om8 om8 = new om8(1, (gn8) this.Y, gn8.class, "onMemberListActionClick", "onMemberListActionClick(I)V", 0, 1);
        fn8.A(en8);
        tu0.K(fn8.a, 300, new vu5(om8, 14, en8));
    }

    public void Q(kgb kgb, int i) {
        kgb kgb2 = kgb;
        efb efb = (efb) ((ol7) C(i));
        kgb2.A(efb);
        dec dec = null;
        if (efb instanceof zm3) {
            if (kgb2 instanceof fq3) {
                dec = (fq3) kgb2;
            }
            if (dec != null) {
                tu0.K(dec.a, 300, new xx5(28, this));
            }
        } else if (efb instanceof x6) {
            if (kgb2 instanceof n6) {
                dec = (n6) kgb2;
            }
            if (dec != null) {
                v59 v59 = new v59(2, (mdb) this.Y, mdb.class, "onChecked", "onChecked(JZ)V", 0, 10);
                om8 om8 = new om8(1, (mdb) this.Y, mdb.class, "onDisabledClick", "onDisabledClick(J)V", 0, 12);
                View view = dec.a;
                ((ufd) view).setOnSwitchListener(new qz7((Object) v59, 2, (Object) om8));
                tu0.K(view, 300, new m6(0, new zja(this, 4, efb)));
            }
        } else if (efb instanceof gh4) {
            if (kgb2 instanceof fh4) {
                dec = (fh4) kgb2;
            }
            if (dec != null) {
                tu0.K(dec.a, 300, new m6(8, new lwa(6, this)));
            }
        }
    }

    public void R(y8c y8c, int i) {
        v8c v8c = (v8c) ((ol7) C(i));
        om8 om8 = new om8(1, (zu2) this.Y, zu2.class, "onRecentContactClick", "onRecentContactClick(Lone/me/chats/search/models/RecentContactModel;)V", 0, 14);
        y8c.A(v8c);
        tu0.K(y8c.a, 300, new vu5(om8, 27, v8c));
    }

    public void S(ise ise, int i) {
        wre wre = (wre) this.o.f.get(i);
        om8 om8 = new om8(1, (cr) this.Y, cr.class, "onThemeSelected", "onThemeSelected(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V", 0, 19);
        View view = ise.a;
        zre zre = (zre) view;
        zre.setThemeName(wre.b);
        Drawable drawable = wre.o;
        if (drawable != null) {
            zre.setBackgroundPattern(drawable);
        }
        tu0.K((zre) view, 300, new v7d(om8, 14, wre));
    }

    public int j() {
        switch (this.X) {
            case 3:
                return this.o.f.size();
            case 13:
                return this.o.f.size();
            default:
                return super.j();
        }
    }

    public int l(int i) {
        switch (this.X) {
            case 1:
                return ((ol7) C(i)).l();
            case 4:
                return ((pr3) ((ol7) C(i))).c;
            case 5:
                return ((ol7) C(i)).l();
            case 6:
                return lw5.$EnumSwitchMapping$0[((w9f) ((ol7) C(i))).b.ordinal()] == 1 ? oba.h : oba.p;
            case 9:
                return ((ol7) this.o.f.get(i)).l();
            case 10:
                return ((efb) ((ol7) C(i))).l();
            default:
                return super.l(i);
        }
    }

    public /* bridge */ /* synthetic */ void r(dec dec, int i) {
        switch (this.X) {
            case 0:
                H((hqd) dec, i);
                return;
            case 2:
                K((iq) dec, i);
                return;
            case 3:
                L((g62) dec, i);
                return;
            case 4:
                M((qr3) dec, i);
                return;
            case 6:
                N((gv5) dec, i);
                return;
            case 7:
                O((io6) dec, i);
                return;
            case 8:
                P((fn8) dec, i);
                return;
            case 9:
                H((hqd) dec, i);
                return;
            case 10:
                Q((kgb) dec, i);
                return;
            case 11:
                R((y8c) dec, i);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                H((hqd) dec, i);
                return;
            case 13:
                S((ise) dec, i);
                return;
            default:
                super.r(dec, i);
                return;
        }
    }

    public void s(dec dec, int i, List list) {
        switch (this.X) {
            case 2:
                iq iqVar = (iq) dec;
                Object q0 = x53.q0(list);
                if (q0 == null) {
                    K(iqVar, i);
                    return;
                } else if (q0 instanceof cq) {
                    gq gqVar = (gq) iqVar.a;
                    Boolean bool = ((cq) q0).a;
                    gqVar.setSelected(bool != null ? bool.booleanValue() : false);
                    return;
                } else {
                    return;
                }
            case 3:
                g62 g62 = (g62) dec;
                Object q02 = x53.q0(list);
                if (q02 == null) {
                    L(g62, i);
                    return;
                } else if (q02 instanceof b62) {
                    f62 f62 = (f62) g62.a;
                    Boolean bool2 = ((b62) q02).a;
                    f62.setSelected(bool2 != null ? bool2.booleanValue() : false);
                    return;
                } else {
                    return;
                }
            case 4:
                qr3 qr3 = (qr3) dec;
                Object i0 = x53.i0(list);
                if (i0 == null) {
                    M(qr3, i);
                    return;
                } else if (i0 instanceof or3) {
                    qr3.F(((or3) i0).a, new e11(0, (nr3) this.Y, nr3.class, "onButtonClick", "onButtonClick()V", 0, 19));
                    return;
                } else {
                    return;
                }
            case 7:
                io6 io6 = (io6) dec;
                Object q03 = x53.q0(list);
                if (q03 == null) {
                    O(io6, i);
                    return;
                } else if (q03 instanceof fo6) {
                    ho6 ho6 = (ho6) io6.a;
                    Boolean bool3 = ((fo6) q03).a;
                    ho6.setSelected(bool3 != null ? bool3.booleanValue() : false);
                    return;
                } else {
                    return;
                }
            case 11:
                y8c y8c = (y8c) dec;
                if (!list.isEmpty()) {
                    for (Object next : list) {
                        boolean z = next instanceof r8c;
                        View view = y8c.a;
                        if (z) {
                            ((x8c) view).setAvatar(((r8c) next).h);
                        } else if (next instanceof q8c) {
                            ((x8c) view).setAbbreviation(oag.a(((q8c) next).h, Long.valueOf(y8c.X)));
                        } else if (next instanceof s8c) {
                            ((x8c) view).setName(((s8c) next).h);
                        } else if (next instanceof u8c) {
                            ((x8c) view).setVerified(((u8c) next).h);
                        } else if (next instanceof t8c) {
                            ((x8c) view).setOnline(((t8c) next).h);
                        }
                    }
                    return;
                }
                R(y8c, i);
                return;
            case 13:
                ise ise = (ise) dec;
                Object q04 = x53.q0(list);
                if (q04 != null && (q04 instanceof ure)) {
                    ((zre) ise.a).setSelected(((ure) q04).a);
                }
                S(ise, i);
                return;
            default:
                super.s(dec, i, list);
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        cm0 cm0;
        pq9 pq9 = qp4.u0;
        switch (this.X) {
            case 0:
                int i2 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
                if (i == uvb.oneme_folder_widget_view_type) {
                    cm0 = new cm0(viewGroup.getContext(), (m56) new iv5(this, 0));
                    View view = cm0.a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        float f = (float) 128;
                        layoutParams.width = tu0.G(fk4.d().getDisplayMetrics().density * f);
                        layoutParams.height = tu0.G(f * fk4.d().getDisplayMetrics().density);
                        view.setLayoutParams(layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else if (i == uvb.oneme_big_folder_widget_view_type) {
                    cm0 = new cm0(viewGroup.getContext(), new iv5(this, 1));
                    int m = wg0.m((float) 12, fk4.d().getDisplayMetrics().density, 2, i2);
                    View view2 = cm0.a;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = m;
                        layoutParams2.height = tu0.G(((float) 128) * fk4.d().getDisplayMetrics().density);
                        view2.setLayoutParams(layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else if (i == uvb.oneme_half_folder_widget_view_type) {
                    cm0 = new cm0(viewGroup.getContext(), (m56) new iv5(this, 2));
                    int m2 = (wg0.m((float) 12, fk4.d().getDisplayMetrics().density, 2, i2) - tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density)) / 2;
                    View view3 = cm0.a;
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = m2;
                        layoutParams3.height = tu0.G(((float) 128) * fk4.d().getDisplayMetrics().density);
                        view3.setLayoutParams(layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    String name = jv5.class.getName();
                    throw new IllegalStateException(("Not supported viewType " + i + " for " + name).toString());
                }
                return cm0;
            case 1:
                if (i == f4a.a) {
                    return new ze1(new c8a(viewGroup.getContext()), new f(1, (n) this.Y, n.class, "onVersionClick", "onVersionClick(Ljava/lang/String;)V", 0, 0));
                }
                throw new IllegalArgumentException("Not supported viewType for AboutAppAdapter");
            case 2:
                return new dec(new gq(viewGroup.getContext(), (AttributeSet) null));
            case 3:
                return new dec(new f62(viewGroup.getContext()));
            case 4:
                aba aba = new aba(viewGroup.getContext(), (AttributeSet) null);
                dec dec = new dec(aba);
                aba.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return dec;
            case 5:
                return i == jca.q ? new b02(viewGroup.getContext(), new fh5(10)) : new mw4(viewGroup.getContext(), (bkg) this.Y);
            case 6:
                int i3 = oba.h;
                v9f v9f = v9f.a;
                v9f v9f2 = i == i3 ? v9f : v9f.b;
                Context context = viewGroup.getContext();
                TextView textView = new TextView(context);
                textView.setLayoutParams(new pdc(-1, -2));
                i4f.j.b(textView, du4.b);
                v3c.y(new fv5(3, (Continuation) null, 0), textView);
                int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                if (v9f2 == v9f) {
                    textView.setAlpha(0.35f);
                    textView.setEnabled(false);
                    EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, jub.ic_check_filled_24);
                    c54.Z(enhancedVectorDrawable, "circle_background", k7d.h(pq9, context).k);
                    textView.setCompoundDrawablePadding(G);
                    ArrayList arrayList = qqe.a;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(enhancedVectorDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setGravity(16);
                int G2 = tu0.G(((float) 18) * fk4.d().getDisplayMetrics().density);
                textView.setPadding(G, G2, G, G2);
                return new dec(textView);
            case 7:
                return new dec(new ho6(viewGroup.getContext()));
            case 8:
                return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
            case 9:
                if (i == 1) {
                    oo9 oo9 = new oo9(viewGroup.getContext());
                    float f2 = (float) 64;
                    oo9.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                    return new dec(oo9);
                } else if (i == 2) {
                    cmd cmd = new cmd(viewGroup.getContext());
                    int G3 = tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density);
                    cmd.setLayoutParams(new ViewGroup.LayoutParams(G3, G3));
                    cmd.setOutlineProvider(new ix3((float) G3));
                    cmd.setBackgroundColor(pq9.j(viewGroup).b().k);
                    v3c.y(new y03(G3, (Continuation) null), cmd);
                    return new dec(cmd);
                } else {
                    throw new IllegalStateException(("Such viewType " + i + " is not supported in NeuroAvatarsAdapter").toString());
                }
            case 10:
                int i4 = 536870911 & i;
                if (dy7.o(i4, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
                    return new n6(viewGroup.getContext());
                }
                if (dy7.o(i4, 2048) || dy7.o(i4, 4096)) {
                    return new g2b(viewGroup.getContext(), 1);
                }
                if (dy7.o(i4, 32768)) {
                    lk3 lk3 = new lk3(viewGroup.getContext(), (AttributeSet) null);
                    dec dec2 = new dec(lk3);
                    v3c.y(new a93(3, (Continuation) null, 1), lk3);
                    return dec2;
                } else if (dy7.o(i4, 128)) {
                    return new fh4(viewGroup.getContext());
                } else {
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
            case 11:
                return new dec(new x8c(viewGroup.getContext()));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
            case 13:
                return new dec(new zre(viewGroup.getContext()));
            default:
                return new vt3(((ThreadsStateViewerScreen) this.Y).getContext());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv5(Executor executor) {
        super(executor);
        this.X = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv5(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.X = i;
        this.Y = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jv5(ThreadsStateViewerScreen threadsStateViewerScreen, ExecutorService executorService) {
        super(executorService);
        this.X = 14;
        this.Y = threadsStateViewerScreen;
    }
}
