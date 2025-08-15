package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: d6g  reason: default package */
public final class d6g extends ote implements j6 {
    public static final AccelerateInterpolator M0 = new AccelerateInterpolator();
    public static final DecelerateInterpolator N0 = new DecelerateInterpolator();
    public final ArrayList A0 = new ArrayList();
    public int B0 = 0;
    public boolean C0 = true;
    public boolean D0;
    public boolean E0;
    public boolean F0 = true;
    public wof G0;
    public boolean H0;
    public boolean I0;
    public final b6g J0 = new b6g(this, 0);
    public final b6g K0 = new b6g(this, 1);
    public final w5e L0 = new w5e(this);
    public Context X;
    public ActionBarOverlayLayout Y;
    public ActionBarContainer Z;
    public Context o;
    public v54 s0;
    public ActionBarContextView t0;
    public final View u0;
    public boolean v0;
    public c6g w0;
    public c6g x0;
    public i7 y0;
    public boolean z0;

    public d6g(Activity activity, boolean z) {
        super(3);
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        d0(decorView);
        if (!z) {
            this.u0 = decorView.findViewById(16908290);
        }
    }

    public final void H() {
        e0(this.o.getResources().getBoolean(atb.abc_action_bar_embed_tabs));
    }

    public final boolean L(int i, KeyEvent keyEvent) {
        wq8 wq8;
        c6g c6g = this.w0;
        if (c6g == null || (wq8 = c6g.o) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        wq8.setQwertyMode(z);
        return wq8.performShortcut(i, keyEvent, 0);
    }

    public final void P(boolean z) {
        if (!this.v0) {
            int i = z ? 4 : 0;
            rwe rwe = (rwe) this.s0;
            int i2 = rwe.b;
            this.v0 = true;
            rwe.a((i & 4) | (i2 & -5));
        }
    }

    public final void Q(boolean z) {
        wof wof;
        this.H0 = z;
        if (!z && (wof = this.G0) != null) {
            wof.a();
        }
    }

    public final void U(CharSequence charSequence) {
        rwe rwe = (rwe) this.s0;
        if (!rwe.g) {
            rwe.h = charSequence;
            if ((rwe.b & 8) != 0) {
                Toolbar toolbar = rwe.a;
                toolbar.setTitle(charSequence);
                if (rwe.g) {
                    zmf.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final j7 W(imc imc) {
        c6g c6g = this.w0;
        if (c6g != null) {
            c6g.a();
        }
        this.Y.setHideOnContentScrollEnabled(false);
        this.t0.e();
        c6g c6g2 = new c6g(this, this.t0.getContext(), imc);
        wq8 wq8 = c6g2.o;
        wq8.w();
        try {
            if (!c6g2.X.o(c6g2, wq8)) {
                return null;
            }
            this.w0 = c6g2;
            c6g2.g();
            this.t0.c(c6g2);
            c0(true);
            return c6g2;
        } finally {
            wq8.v();
        }
    }

    public final void c0(boolean z) {
        vof vof;
        vof vof2;
        if (z) {
            if (!this.E0) {
                this.E0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f0(false);
            }
        } else if (this.E0) {
            this.E0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Y;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f0(false);
        }
        if (this.Z.isLaidOut()) {
            if (z) {
                rwe rwe = (rwe) this.s0;
                vof2 = zmf.a(rwe.a);
                vof2.a(0.0f);
                vof2.c(100);
                vof2.d(new qwe(rwe, 4));
                vof = this.t0.i(0, 200);
            } else {
                rwe rwe2 = (rwe) this.s0;
                vof a = zmf.a(rwe2.a);
                a.a(1.0f);
                a.c(200);
                a.d(new qwe(rwe2, 0));
                vof vof3 = a;
                vof2 = this.t0.i(8, 100);
                vof = vof3;
            }
            wof wof = new wof();
            ArrayList arrayList = wof.a;
            arrayList.add(vof2);
            View view = (View) vof2.a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) vof.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            arrayList.add(vof);
            wof.b();
        } else if (z) {
            ((rwe) this.s0).a.setVisibility(4);
            this.t0.setVisibility(0);
        } else {
            ((rwe) this.s0).a.setVisibility(0);
            this.t0.setVisibility(8);
        }
    }

    public final void d0(View view) {
        v54 v54;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(mvb.decor_content_parent);
        this.Y = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(mvb.action_bar);
        if (findViewById instanceof v54) {
            v54 = (v54) findViewById;
        } else if (findViewById instanceof Toolbar) {
            v54 = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.s0 = v54;
        this.t0 = (ActionBarContextView) view.findViewById(mvb.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(mvb.action_bar_container);
        this.Z = actionBarContainer;
        v54 v542 = this.s0;
        if (v542 == null || this.t0 == null || actionBarContainer == null) {
            throw new IllegalStateException(d6g.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((rwe) v542).a.getContext();
        this.o = context;
        if ((((rwe) this.s0).b & 4) != 0) {
            this.v0 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.s0.getClass();
        e0(context.getResources().getBoolean(atb.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.o.obtainStyledAttributes((AttributeSet) null, p3c.ActionBar, vsb.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(p3c.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Y;
            if (actionBarOverlayLayout2.u0) {
                this.I0 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(p3c.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.Z;
            WeakHashMap weakHashMap = zmf.a;
            omf.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void e0(boolean z) {
        if (!z) {
            ((rwe) this.s0).getClass();
            this.Z.setTabContainer((hxc) null);
        } else {
            this.Z.setTabContainer((hxc) null);
            ((rwe) this.s0).getClass();
        }
        rwe rwe = (rwe) this.s0;
        rwe.getClass();
        rwe.a.setCollapsible(false);
        this.Y.setHasNonEmbeddedTabs(false);
    }

    public final void f0(boolean z) {
        boolean z2 = this.E0 || !this.D0;
        View view = this.u0;
        z00 z00 = null;
        w5e w5e = this.L0;
        if (z2) {
            if (!this.F0) {
                this.F0 = true;
                wof wof = this.G0;
                if (wof != null) {
                    wof.a();
                }
                this.Z.setVisibility(0);
                int i = this.B0;
                b6g b6g = this.K0;
                if (i != 0 || (!this.H0 && !z)) {
                    this.Z.setAlpha(1.0f);
                    this.Z.setTranslationY(0.0f);
                    if (this.C0 && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    b6g.c();
                } else {
                    this.Z.setTranslationY(0.0f);
                    float f = (float) (-this.Z.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.Z.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.Z.setTranslationY(f);
                    wof wof2 = new wof();
                    vof a = zmf.a(this.Z);
                    a.e(0.0f);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (w5e != null) {
                            z00 = new z00(w5e, view2);
                        }
                        view2.animate().setUpdateListener(z00);
                    }
                    boolean z3 = wof2.e;
                    ArrayList arrayList = wof2.a;
                    if (!z3) {
                        arrayList.add(a);
                    }
                    if (this.C0 && view != null) {
                        view.setTranslationY(f);
                        vof a2 = zmf.a(view);
                        a2.e(0.0f);
                        if (!wof2.e) {
                            arrayList.add(a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = N0;
                    boolean z4 = wof2.e;
                    if (!z4) {
                        wof2.c = decelerateInterpolator;
                    }
                    if (!z4) {
                        wof2.b = 250;
                    }
                    if (!z4) {
                        wof2.d = b6g;
                    }
                    this.G0 = wof2;
                    wof2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c(actionBarOverlayLayout);
                }
            }
        } else if (this.F0) {
            this.F0 = false;
            wof wof3 = this.G0;
            if (wof3 != null) {
                wof3.a();
            }
            int i2 = this.B0;
            b6g b6g2 = this.J0;
            if (i2 != 0 || (!this.H0 && !z)) {
                b6g2.c();
                return;
            }
            this.Z.setAlpha(1.0f);
            this.Z.setTransitioning(true);
            wof wof4 = new wof();
            float f2 = (float) (-this.Z.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.Z.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            vof a3 = zmf.a(this.Z);
            a3.e(f2);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                if (w5e != null) {
                    z00 = new z00(w5e, view3);
                }
                view3.animate().setUpdateListener(z00);
            }
            boolean z5 = wof4.e;
            ArrayList arrayList2 = wof4.a;
            if (!z5) {
                arrayList2.add(a3);
            }
            if (this.C0 && view != null) {
                vof a4 = zmf.a(view);
                a4.e(f2);
                if (!wof4.e) {
                    arrayList2.add(a4);
                }
            }
            AccelerateInterpolator accelerateInterpolator = M0;
            boolean z6 = wof4.e;
            if (!z6) {
                wof4.c = accelerateInterpolator;
            }
            if (!z6) {
                wof4.b = 250;
            }
            if (!z6) {
                wof4.d = b6g2;
            }
            this.G0 = wof4;
            wof4.b();
        }
    }

    public final boolean g() {
        iwe iwe;
        v54 v54 = this.s0;
        if (v54 == null || (iwe = ((rwe) v54).a.a1) == null || iwe.b == null) {
            return false;
        }
        iwe iwe2 = ((rwe) v54).a.a1;
        br8 br8 = iwe2 == null ? null : iwe2.b;
        if (br8 == null) {
            return true;
        }
        br8.collapseActionView();
        return true;
    }

    public final void h(boolean z) {
        if (z != this.z0) {
            this.z0 = z;
            ArrayList arrayList = this.A0;
            if (arrayList.size() > 0) {
                au1.r(arrayList.get(0));
                throw null;
            }
        }
    }

    public final int q() {
        return ((rwe) this.s0).b;
    }

    public final Context y() {
        if (this.X == null) {
            TypedValue typedValue = new TypedValue();
            this.o.getTheme().resolveAttribute(vsb.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.X = new ContextThemeWrapper(this.o, i);
            } else {
                this.X = this.o;
            }
        }
        return this.X;
    }

    public d6g(Dialog dialog) {
        super(3);
        new ArrayList();
        d0(dialog.getWindow().getDecorView());
    }
}
