package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: dn  reason: default package */
public final class dn extends rm implements uq8, LayoutInflater.Factory2 {
    public static final qpd s1 = new qpd(0);
    public static final int[] t1 = {16842836};
    public static final boolean u1 = (!"robolectric".equals(Build.FINGERPRINT));
    public ude A0;
    public CharSequence B0;
    public u54 C0;
    public bkg D0;
    public wmc E0;
    public j7 F0;
    public ActionBarContextView G0;
    public PopupWindow H0;
    public sm I0;
    public vof J0 = null;
    public boolean K0;
    public ViewGroup L0;
    public TextView M0;
    public View N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public cn[] W0;
    public cn X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public Configuration c1;
    public final int d1 = -100;
    public int e1;
    public int f1;
    public boolean g1;
    public zm h1;
    public zm i1;
    public boolean j1;
    public int k1;
    public final sm l1 = new sm(this, 0);
    public boolean m1;
    public Rect n1;
    public Rect o1;
    public so p1;
    public OnBackInvokedDispatcher q1;
    public OnBackInvokedCallback r1;
    public final Object u0;
    public final Context v0;
    public Window w0;
    public ym x0;
    public final km y0;
    public ote z0;

    public dn(Context context, Window window, km kmVar, Object obj) {
        im imVar = null;
        this.v0 = context;
        this.y0 = kmVar;
        this.u0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof im)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        imVar = (im) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (imVar != null) {
                this.d1 = ((dn) imVar.V()).d1;
            }
        }
        if (this.d1 == -100) {
            qpd qpd = s1;
            Integer num = (Integer) qpd.get(this.u0.getClass().getName());
            if (num != null) {
                this.d1 = num.intValue();
                qpd.remove(this.u0.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        gn.d();
    }

    public static yq7 m(Context context) {
        yq7 yq7;
        yq7 yq72;
        if (Build.VERSION.SDK_INT >= 33 || (yq7 = rm.c) == null) {
            return null;
        }
        yq7 b = vm.b(context.getApplicationContext().getResources().getConfiguration());
        zq7 zq7 = yq7.a;
        if (zq7.a.isEmpty()) {
            yq72 = yq7.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                if (i >= b.a.a.size() + zq7.a.size()) {
                    break;
                }
                Locale locale = i < zq7.a.size() ? zq7.a.get(i) : b.a.a.get(i - zq7.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            yq72 = new yq7(new zq7(xq7.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return yq72.a.a.isEmpty() ? b : yq72;
    }

    public static Configuration q(Context context, int i, yq7 yq7, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (yq7 != null) {
            vm.d(configuration2, yq7);
        }
        return configuration2;
    }

    public final int A(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.i1 == null) {
                            this.i1 = new zm(this, context);
                        }
                        return this.i1.D();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return v(context).D();
            }
        }
        return i;
    }

    public final boolean B() {
        boolean z = this.Y0;
        this.Y0 = false;
        cn w = w(0);
        if (w.m) {
            if (!z) {
                p(w, true);
            }
            return true;
        }
        j7 j7Var = this.F0;
        if (j7Var != null) {
            j7Var.a();
            return true;
        }
        x();
        ote ote = this.z0;
        return ote != null && ote.g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        if (r3 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0173, code lost:
        if (r3.Z.getCount() > 0) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(defpackage.cn r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            if (r2 != 0) goto L_0x01d7
            boolean r2 = r0.b1
            if (r2 == 0) goto L_0x000e
            goto L_0x01d7
        L_0x000e:
            int r2 = r1.a
            android.content.Context r3 = r0.v0
            if (r2 != 0) goto L_0x0024
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0024
            return
        L_0x0024:
            android.view.Window r4 = r0.w0
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            wq8 r6 = r1.h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x0039
            r0.p(r1, r5)
            return
        L_0x0039:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r17.E(r18, r19)
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            bn r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x0068
            boolean r9 = r1.n
            if (r9 == 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01ae
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01ae
            r10 = r6
            goto L_0x01af
        L_0x0068:
            if (r6 != 0) goto L_0x00e2
            r17.x()
            ote r6 = r0.z0
            if (r6 == 0) goto L_0x0076
            android.content.Context r6 = r6.y()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r6
        L_0x007b:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            int r10 = defpackage.vsb.actionBarPopupTheme
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009b
            r9.applyStyle(r10, r5)
        L_0x009b:
            int r10 = defpackage.vsb.panelMenuListTheme
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00a8
            r9.applyStyle(r6, r5)
            goto L_0x00ad
        L_0x00a8:
            int r6 = defpackage.s2c.Theme_AppCompat_CompactMenu
            r9.applyStyle(r6, r5)
        L_0x00ad:
            du3 r6 = new du3
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.j = r6
            int[] r3 = defpackage.p3c.AppCompatTheme
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            int r6 = defpackage.p3c.AppCompatTheme_panelBackground
            int r6 = r3.getResourceId(r6, r7)
            r1.b = r6
            int r6 = defpackage.p3c.AppCompatTheme_android_windowAnimationStyle
            int r6 = r3.getResourceId(r6, r7)
            r1.d = r6
            r3.recycle()
            bn r3 = new bn
            du3 r6 = r1.j
            r3.<init>(r0, r6)
            r1.e = r3
            r3 = 81
            r1.c = r3
            goto L_0x00f1
        L_0x00e2:
            boolean r3 = r1.n
            if (r3 == 0) goto L_0x00f1
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f1
            bn r3 = r1.e
            r3.removeAllViews()
        L_0x00f1:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x00f8
            r1.f = r3
            goto L_0x0155
        L_0x00f8:
            wq8 r3 = r1.h
            if (r3 != 0) goto L_0x00fe
            goto L_0x01d5
        L_0x00fe:
            wmc r3 = r0.E0
            if (r3 != 0) goto L_0x010a
            wmc r3 = new wmc
            r6 = 0
            r3.<init>(r0, r6)
            r0.E0 = r3
        L_0x010a:
            wmc r3 = r0.E0
            ql7 r6 = r1.i
            if (r6 != 0) goto L_0x0124
            ql7 r6 = new ql7
            du3 r9 = r1.j
            int r10 = defpackage.zyb.abc_list_menu_item_layout
            r6.<init>(r9, r10)
            r1.i = r6
            r6.Y = r3
            wq8 r3 = r1.h
            android.content.Context r9 = r3.a
            r3.b(r6, r9)
        L_0x0124:
            ql7 r3 = r1.i
            bn r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.o
            if (r9 != 0) goto L_0x014f
            android.view.LayoutInflater r9 = r3.b
            int r10 = defpackage.zyb.abc_expanded_menu_layout
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.o = r6
            pl7 r6 = r3.Z
            if (r6 != 0) goto L_0x0143
            pl7 r6 = new pl7
            r6.<init>(r3)
            r3.Z = r6
        L_0x0143:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.o
            pl7 r9 = r3.Z
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.o
            r6.setOnItemClickListener(r3)
        L_0x014f:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.o
            r1.f = r3
            if (r3 == 0) goto L_0x01d5
        L_0x0155:
            android.view.View r3 = r1.f
            if (r3 != 0) goto L_0x015b
            goto L_0x01d5
        L_0x015b:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            ql7 r3 = r1.i
            pl7 r6 = r3.Z
            if (r6 != 0) goto L_0x016d
            pl7 r6 = new pl7
            r6.<init>(r3)
            r3.Z = r6
        L_0x016d:
            pl7 r3 = r3.Z
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d5
        L_0x0175:
            android.view.View r3 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0182:
            int r6 = r1.b
            bn r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x019a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L_0x019a:
            bn r6 = r1.e
            android.view.View r9 = r1.f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01ae
            android.view.View r3 = r1.f
            r3.requestFocus()
        L_0x01ae:
            r10 = r8
        L_0x01af:
            r1.l = r7
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = r1.c
            r3.gravity = r6
            int r6 = r1.d
            r3.windowAnimations = r6
            bn r6 = r1.e
            r4.addView(r6, r3)
            r1.m = r5
            if (r2 != 0) goto L_0x01d4
            r17.G()
        L_0x01d4:
            return
        L_0x01d5:
            r1.n = r5
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.C(cn, android.view.KeyEvent):void");
    }

    public final boolean D(cn cnVar, int i, KeyEvent keyEvent) {
        wq8 wq8;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((cnVar.k || E(cnVar, keyEvent)) && (wq8 = cnVar.h) != null) {
            return wq8.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean E(cn cnVar, KeyEvent keyEvent) {
        u54 u54;
        u54 u542;
        u54 u543;
        Resources.Theme theme;
        u54 u544;
        if (this.b1) {
            return false;
        }
        if (cnVar.k) {
            return true;
        }
        cn cnVar2 = this.X0;
        if (!(cnVar2 == null || cnVar2 == cnVar)) {
            p(cnVar2, false);
        }
        Window.Callback callback = this.w0.getCallback();
        int i = cnVar.a;
        if (callback != null) {
            cnVar.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (u544 = this.C0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) u544;
            actionBarOverlayLayout.e();
            ((rwe) actionBarOverlayLayout.s0).l = true;
        }
        if (cnVar.g == null && (!z || !(this.z0 instanceof mwe))) {
            wq8 wq8 = cnVar.h;
            if (wq8 == null || cnVar.o) {
                if (wq8 == null) {
                    Context context = this.v0;
                    if ((i == 0 || i == 108) && this.C0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(vsb.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(vsb.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(vsb.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            du3 du3 = new du3(context, 0);
                            du3.getTheme().setTo(theme);
                            context = du3;
                        }
                    }
                    wq8 wq82 = new wq8(context);
                    wq82.X = this;
                    wq8 wq83 = cnVar.h;
                    if (wq82 != wq83) {
                        if (wq83 != null) {
                            wq83.r(cnVar.i);
                        }
                        cnVar.h = wq82;
                        ql7 ql7 = cnVar.i;
                        if (ql7 != null) {
                            wq82.b(ql7, wq82.a);
                        }
                    }
                    if (cnVar.h == null) {
                        return false;
                    }
                }
                if (z && (u543 = this.C0) != null) {
                    if (this.D0 == null) {
                        this.D0 = new bkg(2, this);
                    }
                    ((ActionBarOverlayLayout) u543).f(cnVar.h, this.D0);
                }
                cnVar.h.w();
                if (!callback.onCreatePanelMenu(i, cnVar.h)) {
                    wq8 wq84 = cnVar.h;
                    if (wq84 != null) {
                        if (wq84 != null) {
                            wq84.r(cnVar.i);
                        }
                        cnVar.h = null;
                    }
                    if (z && (u542 = this.C0) != null) {
                        ((ActionBarOverlayLayout) u542).f((Menu) null, this.D0);
                    }
                    return false;
                }
                cnVar.o = false;
            }
            cnVar.h.w();
            Bundle bundle = cnVar.p;
            if (bundle != null) {
                cnVar.h.s(bundle);
                cnVar.p = null;
            }
            if (!callback.onPreparePanel(0, cnVar.g, cnVar.h)) {
                if (z && (u54 = this.C0) != null) {
                    ((ActionBarOverlayLayout) u54).f((Menu) null, this.D0);
                }
                cnVar.h.v();
                return false;
            }
            cnVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            cnVar.h.v();
        }
        cnVar.k = true;
        cnVar.l = false;
        this.X0 = cnVar;
        return true;
    }

    public final void F() {
        if (this.K0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.q1 != null && (w(0).m || this.F0 != null)) {
                z = true;
            }
            if (z && this.r1 == null) {
                this.r1 = xm.b(this.q1, this);
            } else if (!z && (onBackInvokedCallback = this.r1) != null) {
                xm.c(this.q1, onBackInvokedCallback);
                this.r1 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.j() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q(defpackage.wq8 r6) {
        /*
            r5 = this;
            u54 r6 = r5.C0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x00d3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            v54 r6 = r6.s0
            rwe r6 = (defpackage.rwe) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00d3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x00d3
            boolean r6 = r6.o
            if (r6 == 0) goto L_0x00d3
            android.content.Context r6 = r5.v0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            u54 r6 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            v54 r6 = r6.s0
            rwe r6 = (defpackage.rwe) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x00d3
            e7 r6 = r6.s0
            if (r6 == 0) goto L_0x00d3
            i76 r2 = r6.F0
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.j()
            if (r6 == 0) goto L_0x00d3
        L_0x004a:
            android.view.Window r6 = r5.w0
            android.view.Window$Callback r6 = r6.getCallback()
            u54 r2 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.e()
            v54 r2 = r2.s0
            rwe r2 = (defpackage.rwe) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x008c
            u54 r0 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.e()
            v54 r0 = r0.s0
            rwe r0 = (defpackage.rwe) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x007e
            e7 r0 = r0.s0
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.f()
        L_0x007e:
            boolean r0 = r5.b1
            if (r0 != 0) goto L_0x00e0
            cn r5 = r5.w(r1)
            wq8 r5 = r5.h
            r6.onPanelClosed(r3, r5)
            goto L_0x00e0
        L_0x008c:
            if (r6 == 0) goto L_0x00e0
            boolean r2 = r5.b1
            if (r2 != 0) goto L_0x00e0
            boolean r2 = r5.j1
            if (r2 == 0) goto L_0x00a9
            int r2 = r5.k1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00a9
            android.view.Window r0 = r5.w0
            android.view.View r0 = r0.getDecorView()
            sm r2 = r5.l1
            r0.removeCallbacks(r2)
            r2.run()
        L_0x00a9:
            cn r0 = r5.w(r1)
            wq8 r2 = r0.h
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r0.o
            if (r4 != 0) goto L_0x00e0
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto L_0x00e0
            wq8 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            u54 r5 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.e()
            v54 r5 = r5.s0
            rwe r5 = (defpackage.rwe) r5
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.w()
            goto L_0x00e0
        L_0x00d3:
            cn r6 = r5.w(r1)
            r6.n = r0
            r5.p(r6, r1)
            r0 = 0
            r5.C(r6, r0)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.Q(wq8):void");
    }

    public final void a() {
        if (this.z0 != null) {
            x();
            if (!this.z0.C()) {
                y(0);
            }
        }
    }

    public final void c() {
        String str;
        this.Z0 = true;
        k(false, true);
        u();
        Object obj = this.u0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = od2.K(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ote ote = this.z0;
                if (ote == null) {
                    this.m1 = true;
                } else {
                    ote.P(true);
                }
            }
            synchronized (rm.s0) {
                rm.e(this);
                rm.Z.add(new WeakReference(this));
            }
        }
        this.c1 = new Configuration(this.v0.getResources().getConfiguration());
        this.a1 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = defpackage.rm.s0
            monitor-enter(r0)
            defpackage.rm.e(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r3
        L_0x0011:
            boolean r0 = r3.j1
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.w0
            android.view.View r0 = r0.getDecorView()
            sm r1 = r3.l1
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.b1 = r0
            int r0 = r3.d1
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.u0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            qpd r0 = s1
            java.lang.Object r1 = r3.u0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.d1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            qpd r0 = s1
            java.lang.Object r1 = r3.u0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            ote r0 = r3.z0
            if (r0 == 0) goto L_0x0063
            r0.I()
        L_0x0063:
            zm r0 = r3.h1
            if (r0 == 0) goto L_0x006a
            r0.y()
        L_0x006a:
            zm r3 = r3.i1
            if (r3 == 0) goto L_0x0071
            r3.y()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.d():void");
    }

    public final boolean f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.U0 && i == 108) {
            return false;
        }
        if (this.Q0 && i == 1) {
            this.Q0 = false;
        }
        if (i == 1) {
            F();
            this.U0 = true;
            return true;
        } else if (i == 2) {
            F();
            this.O0 = true;
            return true;
        } else if (i == 5) {
            F();
            this.P0 = true;
            return true;
        } else if (i == 10) {
            F();
            this.S0 = true;
            return true;
        } else if (i == 108) {
            F();
            this.Q0 = true;
            return true;
        } else if (i != 109) {
            return this.w0.requestFeature(i);
        } else {
            F();
            this.R0 = true;
            return true;
        }
    }

    public final void g(int i) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.L0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.v0).inflate(i, viewGroup);
        this.x0.a(this.w0.getCallback());
    }

    public final void h(View view) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.L0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.x0.a(this.w0.getCallback());
    }

    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.L0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.x0.a(this.w0.getCallback());
    }

    public final void j(CharSequence charSequence) {
        this.B0 = charSequence;
        u54 u54 = this.C0;
        if (u54 != null) {
            u54.setWindowTitle(charSequence);
            return;
        }
        ote ote = this.z0;
        if (ote != null) {
            ote.U(charSequence);
            return;
        }
        TextView textView = this.M0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(boolean r13, boolean r14) {
        /*
            r12 = this;
            boolean r0 = r12.b1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r12.d1
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = defpackage.rm.b
        L_0x000f:
            android.content.Context r2 = r12.v0
            int r3 = r12.A(r2, r0)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L_0x0021
            yq7 r4 = m(r2)
            goto L_0x0022
        L_0x0021:
            r4 = r6
        L_0x0022:
            if (r14 != 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            android.content.res.Resources r14 = r2.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            yq7 r4 = defpackage.vm.b(r14)
        L_0x0032:
            android.content.res.Configuration r14 = q(r2, r3, r4, r6, r1)
            boolean r3 = r12.g1
            r5 = 1
            java.lang.Object r7 = r12.u0
            if (r3 != 0) goto L_0x0061
            boolean r3 = r7 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0061
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            if (r3 != 0) goto L_0x0049
            r3 = r1
            goto L_0x0065
        L_0x0049:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Class r9 = r7.getClass()     // Catch:{ NameNotFoundException -> 0x005f }
            r8.<init>(r2, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            r9 = 269221888(0x100c0000, float:2.7610132E-29)
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            if (r3 == 0) goto L_0x0061
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x005f }
            r12.f1 = r3     // Catch:{ NameNotFoundException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r12.f1 = r1
        L_0x0061:
            r12.g1 = r5
            int r3 = r12.f1
        L_0x0065:
            android.content.res.Configuration r8 = r12.c1
            if (r8 != 0) goto L_0x0071
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
        L_0x0071:
            int r9 = r8.uiMode
            r9 = r9 & 48
            int r10 = r14.uiMode
            r10 = r10 & 48
            yq7 r8 = defpackage.vm.b(r8)
            if (r4 != 0) goto L_0x0081
            r4 = r6
            goto L_0x0085
        L_0x0081:
            yq7 r4 = defpackage.vm.b(r14)
        L_0x0085:
            if (r9 == r10) goto L_0x008a
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x008b
        L_0x008a:
            r9 = r1
        L_0x008b:
            if (r4 == 0) goto L_0x0095
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0095
            r9 = r9 | 8196(0x2004, float:1.1485E-41)
        L_0x0095:
            int r8 = ~r3
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00d2
            if (r13 == 0) goto L_0x00d2
            boolean r13 = r12.Z0
            if (r13 == 0) goto L_0x00d2
            boolean r13 = u1
            if (r13 != 0) goto L_0x00a7
            boolean r13 = r12.a1
            if (r13 == 0) goto L_0x00d2
        L_0x00a7:
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L_0x00d2
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r8 = r13.isChild()
            if (r8 != 0) goto L_0x00d2
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r8 < r11) goto L_0x00cd
            r8 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x00cd
            android.view.Window r8 = r13.getWindow()
            android.view.View r8 = r8.getDecorView()
            int r14 = r14.getLayoutDirection()
            r8.setLayoutDirection(r14)
        L_0x00cd:
            r13.recreate()
            r13 = r5
            goto L_0x00d3
        L_0x00d2:
            r13 = r1
        L_0x00d3:
            if (r13 != 0) goto L_0x013a
            if (r9 == 0) goto L_0x013a
            r13 = r9 & r3
            if (r13 != r9) goto L_0x00dc
            r1 = r5
        L_0x00dc:
            android.content.res.Resources r13 = r2.getResources()
            android.content.res.Configuration r14 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r13.getConfiguration()
            r14.<init>(r3)
            android.content.res.Configuration r3 = r13.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & -49
            r3 = r3 | r10
            r14.uiMode = r3
            if (r4 == 0) goto L_0x00f9
            defpackage.vm.d(r14, r4)
        L_0x00f9:
            r13.updateConfiguration(r14, r6)
            int r13 = r12.e1
            if (r13 == 0) goto L_0x010c
            r2.setTheme(r13)
            android.content.res.Resources$Theme r13 = r2.getTheme()
            int r3 = r12.e1
            r13.applyStyle(r3, r5)
        L_0x010c:
            if (r1 == 0) goto L_0x013b
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L_0x013b
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r1 = r13 instanceof defpackage.eh7
            if (r1 == 0) goto L_0x012e
            r1 = r13
            eh7 r1 = (defpackage.eh7) r1
            gh7 r1 = r1.Q()
            fg7 r1 = r1.d
            fg7 r3 = defpackage.fg7.c
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x013b
            r13.onConfigurationChanged(r14)
            goto L_0x013b
        L_0x012e:
            boolean r1 = r12.a1
            if (r1 == 0) goto L_0x013b
            boolean r1 = r12.b1
            if (r1 != 0) goto L_0x013b
            r13.onConfigurationChanged(r14)
            goto L_0x013b
        L_0x013a:
            r5 = r13
        L_0x013b:
            if (r5 == 0) goto L_0x0154
            boolean r13 = r7 instanceof defpackage.im
            if (r13 == 0) goto L_0x0154
            r13 = r9 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x014b
            r13 = r7
            im r13 = (defpackage.im) r13
            r13.getClass()
        L_0x014b:
            r13 = r9 & 4
            if (r13 == 0) goto L_0x0154
            im r7 = (defpackage.im) r7
            r7.getClass()
        L_0x0154:
            if (r4 == 0) goto L_0x0165
            android.content.res.Resources r13 = r2.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            yq7 r13 = defpackage.vm.b(r13)
            defpackage.vm.c(r13)
        L_0x0165:
            if (r0 != 0) goto L_0x016f
            dle r13 = r12.v(r2)
            r13.d0()
            goto L_0x0176
        L_0x016f:
            zm r13 = r12.h1
            if (r13 == 0) goto L_0x0176
            r13.y()
        L_0x0176:
            r13 = 3
            if (r0 != r13) goto L_0x018a
            zm r13 = r12.i1
            if (r13 != 0) goto L_0x0184
            zm r13 = new zm
            r13.<init>((defpackage.dn) r12, (android.content.Context) r2)
            r12.i1 = r13
        L_0x0184:
            zm r12 = r12.i1
            r12.d0()
            goto L_0x0191
        L_0x018a:
            zm r12 = r12.i1
            if (r12 == 0) goto L_0x0191
            r12.y()
        L_0x0191:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.k(boolean, boolean):boolean");
    }

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.w0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof ym)) {
                ym ymVar = new ym(this, callback);
                this.x0 = ymVar;
                window.setCallback(ymVar);
                int[] iArr = t1;
                Context context = this.v0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    gn a = gn.a();
                    synchronized (a) {
                        drawable = a.a.e(resourceId, context, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.w0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.q1) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.r1) == null)) {
                        xm.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.r1 = null;
                    }
                    Object obj = this.u0;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.q1 = xm.a(activity);
                            G();
                            return;
                        }
                    }
                    this.q1 = null;
                    G();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void n(int i, cn cnVar, wq8 wq8) {
        if (wq8 == null) {
            if (cnVar == null && i >= 0) {
                cn[] cnVarArr = this.W0;
                if (i < cnVarArr.length) {
                    cnVar = cnVarArr[i];
                }
            }
            if (cnVar != null) {
                wq8 = cnVar.h;
            }
        }
        if ((cnVar == null || cnVar.m) && !this.b1) {
            ym ymVar = this.x0;
            Window.Callback callback = this.w0.getCallback();
            ymVar.getClass();
            try {
                ymVar.X = true;
                callback.onPanelClosed(i, wq8);
                ymVar.X = false;
            } catch (Throwable th) {
                ymVar.X = false;
                throw th;
            }
        }
    }

    public final void o(wq8 wq8) {
        e7 e7Var;
        if (!this.V0) {
            this.V0 = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.C0;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((rwe) actionBarOverlayLayout.s0).a.a;
            if (!(actionMenuView == null || (e7Var = actionMenuView.s0) == null)) {
                e7Var.f();
                b7 b7Var = e7Var.E0;
                if (b7Var != null && b7Var.b()) {
                    b7Var.j.dismiss();
                }
            }
            Window.Callback callback = this.w0.getCallback();
            if (callback != null && !this.b1) {
                callback.onPanelClosed(108, wq8);
            }
            this.V0 = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            r8 = 3
            r0 = -1
            r1 = 0
            r2 = 1
            so r3 = r7.p1
            r4 = 0
            if (r3 != 0) goto L_0x0040
            int[] r3 = defpackage.p3c.AppCompatTheme
            android.content.Context r5 = r7.v0
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r3)
            int r6 = defpackage.p3c.AppCompatTheme_viewInflaterClass
            java.lang.String r6 = r3.getString(r6)
            r3.recycle()
            if (r6 != 0) goto L_0x0024
            so r3 = new so
            r3.<init>()
            r7.p1 = r3
            goto L_0x0040
        L_0x0024:
            java.lang.ClassLoader r3 = r5.getClassLoader()     // Catch:{ all -> 0x0039 }
            java.lang.Class r3 = r3.loadClass(r6)     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch:{ all -> 0x0039 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ all -> 0x0039 }
            so r3 = (defpackage.so) r3     // Catch:{ all -> 0x0039 }
            r7.p1 = r3     // Catch:{ all -> 0x0039 }
            goto L_0x0040
        L_0x0039:
            so r3 = new so
            r3.<init>()
            r7.p1 = r3
        L_0x0040:
            so r7 = r7.p1
            int r3 = defpackage.tbf.a
            r7.getClass()
            int[] r3 = defpackage.p3c.View
            android.content.res.TypedArray r3 = r10.obtainStyledAttributes(r11, r3, r1, r1)
            int r5 = defpackage.p3c.View_theme
            int r5 = r3.getResourceId(r5, r1)
            r3.recycle()
            if (r5 == 0) goto L_0x0069
            boolean r3 = r10 instanceof defpackage.du3
            if (r3 == 0) goto L_0x0063
            r3 = r10
            du3 r3 = (defpackage.du3) r3
            int r3 = r3.a
            if (r3 == r5) goto L_0x0069
        L_0x0063:
            du3 r3 = new du3
            r3.<init>(r10, r5)
            goto L_0x006a
        L_0x0069:
            r3 = r10
        L_0x006a:
            r9.getClass()
            int r5 = r9.hashCode()
            switch(r5) {
                case -1946472170: goto L_0x0115;
                case -1455429095: goto L_0x0109;
                case -1346021293: goto L_0x00fd;
                case -938935918: goto L_0x00f1;
                case -937446323: goto L_0x00e6;
                case -658531749: goto L_0x00db;
                case -339785223: goto L_0x00d0;
                case 776382189: goto L_0x00c5;
                case 799298502: goto L_0x00b8;
                case 1125864064: goto L_0x00ab;
                case 1413872058: goto L_0x009e;
                case 1601505219: goto L_0x0091;
                case 1666676343: goto L_0x0084;
                case 2001146706: goto L_0x0077;
                default: goto L_0x0074;
            }
        L_0x0074:
            r5 = r0
            goto L_0x0120
        L_0x0077:
            java.lang.String r5 = "Button"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0080
            goto L_0x0074
        L_0x0080:
            r5 = 13
            goto L_0x0120
        L_0x0084:
            java.lang.String r5 = "EditText"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x008d
            goto L_0x0074
        L_0x008d:
            r5 = 12
            goto L_0x0120
        L_0x0091:
            java.lang.String r5 = "CheckBox"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x009a
            goto L_0x0074
        L_0x009a:
            r5 = 11
            goto L_0x0120
        L_0x009e:
            java.lang.String r5 = "AutoCompleteTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00a7
            goto L_0x0074
        L_0x00a7:
            r5 = 10
            goto L_0x0120
        L_0x00ab:
            java.lang.String r5 = "ImageView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00b4
            goto L_0x0074
        L_0x00b4:
            r5 = 9
            goto L_0x0120
        L_0x00b8:
            java.lang.String r5 = "ToggleButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00c1
            goto L_0x0074
        L_0x00c1:
            r5 = 8
            goto L_0x0120
        L_0x00c5:
            java.lang.String r5 = "RadioButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00ce
            goto L_0x0074
        L_0x00ce:
            r5 = 7
            goto L_0x0120
        L_0x00d0:
            java.lang.String r5 = "Spinner"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x0074
        L_0x00d9:
            r5 = 6
            goto L_0x0120
        L_0x00db:
            java.lang.String r5 = "SeekBar"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00e4
            goto L_0x0074
        L_0x00e4:
            r5 = 5
            goto L_0x0120
        L_0x00e6:
            java.lang.String r5 = "ImageButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00ef
            goto L_0x0074
        L_0x00ef:
            r5 = 4
            goto L_0x0120
        L_0x00f1:
            java.lang.String r5 = "TextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00fb
            goto L_0x0074
        L_0x00fb:
            r5 = r8
            goto L_0x0120
        L_0x00fd:
            java.lang.String r5 = "MultiAutoCompleteTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0107
            goto L_0x0074
        L_0x0107:
            r5 = 2
            goto L_0x0120
        L_0x0109:
            java.lang.String r5 = "CheckedTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0113
            goto L_0x0074
        L_0x0113:
            r5 = r2
            goto L_0x0120
        L_0x0115:
            java.lang.String r5 = "RatingBar"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x011f
            goto L_0x0074
        L_0x011f:
            r5 = r1
        L_0x0120:
            switch(r5) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0168;
                case 2: goto L_0x0162;
                case 3: goto L_0x015d;
                case 4: goto L_0x0157;
                case 5: goto L_0x0151;
                case 6: goto L_0x014b;
                case 7: goto L_0x0146;
                case 8: goto L_0x0140;
                case 9: goto L_0x013a;
                case 10: goto L_0x0135;
                case 11: goto L_0x0130;
                case 12: goto L_0x012a;
                case 13: goto L_0x0125;
                default: goto L_0x0123;
            }
        L_0x0123:
            r5 = r4
            goto L_0x0173
        L_0x0125:
            androidx.appcompat.widget.AppCompatButton r5 = r7.b(r3, r11)
            goto L_0x0173
        L_0x012a:
            androidx.appcompat.widget.AppCompatEditText r5 = new androidx.appcompat.widget.AppCompatEditText
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x0130:
            androidx.appcompat.widget.AppCompatCheckBox r5 = r7.c(r3, r11)
            goto L_0x0173
        L_0x0135:
            jm r5 = r7.a(r3, r11)
            goto L_0x0173
        L_0x013a:
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x0140:
            qo r5 = new qo
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x0146:
            mn r5 = r7.d(r3, r11)
            goto L_0x0173
        L_0x014b:
            bo r5 = new bo
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x0151:
            pn r5 = new pn
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x0157:
            androidx.appcompat.widget.AppCompatImageButton r5 = new androidx.appcompat.widget.AppCompatImageButton
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x015d:
            androidx.appcompat.widget.AppCompatTextView r5 = r7.e(r3, r11)
            goto L_0x0173
        L_0x0162:
            kn r5 = new kn
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x0168:
            lm r5 = new lm
            r5.<init>(r3, r11)
            goto L_0x0173
        L_0x016e:
            nn r5 = new nn
            r5.<init>(r3, r11)
        L_0x0173:
            if (r5 != 0) goto L_0x01c3
            if (r10 == r3) goto L_0x01c3
            java.lang.Object[] r10 = r7.a
            java.lang.String r5 = "view"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0187
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r4, r9)
        L_0x0187:
            r10[r1] = r3     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            r10[r2] = r11     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            r5 = 46
            int r5 = r9.indexOf(r5)     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            if (r0 != r5) goto L_0x01af
            r0 = r1
        L_0x0194:
            java.lang.String[] r5 = defpackage.so.d     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            if (r0 >= r8) goto L_0x01aa
            r5 = r5[r0]     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            android.view.View r5 = r7.f(r3, r9, r5)     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            if (r5 == 0) goto L_0x01a6
            r10[r1] = r4
            r10[r2] = r4
            r4 = r5
            goto L_0x01c2
        L_0x01a6:
            int r0 = r0 + r2
            goto L_0x0194
        L_0x01a8:
            r7 = move-exception
            goto L_0x01b9
        L_0x01aa:
            r10[r1] = r4
            r10[r2] = r4
            goto L_0x01c2
        L_0x01af:
            android.view.View r7 = r7.f(r3, r9, r4)     // Catch:{ Exception -> 0x01be, all -> 0x01a8 }
            r10[r1] = r4
            r10[r2] = r4
            r4 = r7
            goto L_0x01c2
        L_0x01b9:
            r10[r1] = r4
            r10[r2] = r4
            throw r7
        L_0x01be:
            r10[r1] = r4
            r10[r2] = r4
        L_0x01c2:
            r5 = r4
        L_0x01c3:
            if (r5 == 0) goto L_0x01eb
            android.content.Context r7 = r5.getContext()
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L_0x01eb
            boolean r8 = r5.hasOnClickListeners()
            if (r8 != 0) goto L_0x01d4
            goto L_0x01eb
        L_0x01d4:
            int[] r8 = defpackage.so.c
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r11, r8)
            java.lang.String r8 = r7.getString(r1)
            if (r8 == 0) goto L_0x01e8
            ro r9 = new ro
            r9.<init>(r5, r8)
            r5.setOnClickListener(r9)
        L_0x01e8:
            r7.recycle()
        L_0x01eb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(cn cnVar, boolean z) {
        bn bnVar;
        u54 u54;
        if (z && cnVar.a == 0 && (u54 = this.C0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) u54;
            actionBarOverlayLayout.e();
            if (((rwe) actionBarOverlayLayout.s0).a.p()) {
                o(cnVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.v0.getSystemService("window");
        if (!(windowManager == null || !cnVar.m || (bnVar = cnVar.e) == null)) {
            windowManager.removeView(bnVar);
            if (z) {
                n(cnVar.a, cnVar, (wq8) null);
            }
        }
        cnVar.k = false;
        cnVar.l = false;
        cnVar.m = false;
        cnVar.f = null;
        cnVar.n = true;
        if (this.X0 == cnVar) {
            this.X0 = null;
        }
        if (cnVar.a == 0) {
            G();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if (r6.f() != false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u0
            boolean r1 = r0 instanceof defpackage.gc7
            if (r1 != 0) goto L_0x000a
            boolean r0 = r0 instanceof defpackage.fn
            if (r0 == 0) goto L_0x0014
        L_0x000a:
            android.view.Window r0 = r6.w0
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0014
            java.util.WeakHashMap r0 = defpackage.zmf.a
        L_0x0014:
            int r0 = r7.getKeyCode()
            r1 = 1
            r2 = 0
            r3 = 82
            if (r0 != r3) goto L_0x0038
            ym r0 = r6.x0
            android.view.Window r4 = r6.w0
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.o = r1     // Catch:{ all -> 0x0034 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0034 }
            r0.o = r2
            if (r4 == 0) goto L_0x0038
            return r1
        L_0x0034:
            r6 = move-exception
            r0.o = r2
            throw r6
        L_0x0038:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006a
            if (r0 == r5) goto L_0x005b
            if (r0 == r3) goto L_0x0048
            goto L_0x0067
        L_0x0048:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x012d
            cn r0 = r6.w(r2)
            boolean r2 = r0.m
            if (r2 != 0) goto L_0x012d
            r6.E(r0, r7)
            goto L_0x012d
        L_0x005b:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            r6.Y0 = r1
        L_0x0067:
            r1 = r2
            goto L_0x012d
        L_0x006a:
            if (r0 == r5) goto L_0x0127
            if (r0 == r3) goto L_0x006f
            goto L_0x0067
        L_0x006f:
            j7 r0 = r6.F0
            if (r0 == 0) goto L_0x0075
            goto L_0x012d
        L_0x0075:
            cn r0 = r6.w(r2)
            u54 r3 = r6.C0
            android.content.Context r4 = r6.v0
            if (r3 == 0) goto L_0x00ed
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.e()
            v54 r3 = r3.s0
            rwe r3 = (defpackage.rwe) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x00ed
            androidx.appcompat.widget.ActionMenuView r3 = r3.a
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r3.o
            if (r3 == 0) goto L_0x00ed
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x00ed
            u54 r3 = r6.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.e()
            v54 r3 = r3.s0
            rwe r3 = (defpackage.rwe) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            boolean r3 = r3.p()
            if (r3 != 0) goto L_0x00d1
            boolean r3 = r6.b1
            if (r3 != 0) goto L_0x010d
            boolean r7 = r6.E(r0, r7)
            if (r7 == 0) goto L_0x010d
            u54 r6 = r6.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            v54 r6 = r6.s0
            rwe r6 = (defpackage.rwe) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            boolean r6 = r6.w()
            goto L_0x0113
        L_0x00d1:
            u54 r6 = r6.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            v54 r6 = r6.s0
            rwe r6 = (defpackage.rwe) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x010d
            e7 r6 = r6.s0
            if (r6 == 0) goto L_0x010d
            boolean r6 = r6.f()
            if (r6 == 0) goto L_0x010d
            goto L_0x010b
        L_0x00ed:
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x010f
            boolean r5 = r0.l
            if (r5 == 0) goto L_0x00f6
            goto L_0x010f
        L_0x00f6:
            boolean r3 = r0.k
            if (r3 == 0) goto L_0x010d
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0105
            r0.k = r2
            boolean r3 = r6.E(r0, r7)
            goto L_0x0106
        L_0x0105:
            r3 = r1
        L_0x0106:
            if (r3 == 0) goto L_0x010d
            r6.C(r0, r7)
        L_0x010b:
            r6 = r1
            goto L_0x0113
        L_0x010d:
            r6 = r2
            goto L_0x0113
        L_0x010f:
            r6.p(r0, r1)
            r6 = r3
        L_0x0113:
            if (r6 == 0) goto L_0x012d
            android.content.Context r6 = r4.getApplicationContext()
            java.lang.String r7 = "audio"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            if (r6 == 0) goto L_0x012d
            r6.playSoundEffect(r2)
            goto L_0x012d
        L_0x0127:
            boolean r6 = r6.B()
            if (r6 == 0) goto L_0x0067
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.r(android.view.KeyEvent):boolean");
    }

    public final void s(int i) {
        cn w = w(i);
        if (w.h != null) {
            Bundle bundle = new Bundle();
            w.h.t(bundle);
            if (bundle.size() > 0) {
                w.p = bundle;
            }
            w.h.w();
            w.h.clear();
        }
        w.o = true;
        w.n = true;
        if ((i == 108 || i == 0) && this.C0 != null) {
            cn w2 = w(0);
            w2.k = false;
            E(w2, (KeyEvent) null);
        }
    }

    public final void t() {
        ViewGroup viewGroup;
        if (!this.K0) {
            int[] iArr = p3c.AppCompatTheme;
            Context context = this.v0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(p3c.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowNoTitle, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowActionBar, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowActionBarOverlay, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowActionModeOverlay, false)) {
                    f(10);
                }
                this.T0 = obtainStyledAttributes.getBoolean(p3c.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                u();
                this.w0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.U0) {
                    viewGroup = this.S0 ? (ViewGroup) from.inflate(zyb.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(zyb.abc_screen_simple, (ViewGroup) null);
                } else if (this.T0) {
                    viewGroup = (ViewGroup) from.inflate(zyb.abc_dialog_title_material, (ViewGroup) null);
                    this.R0 = false;
                    this.Q0 = false;
                } else if (this.Q0) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(vsb.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new du3(context, typedValue.resourceId) : context).inflate(zyb.abc_screen_toolbar, (ViewGroup) null);
                    u54 u54 = (u54) viewGroup.findViewById(mvb.decor_content_parent);
                    this.C0 = u54;
                    u54.setWindowCallback(this.w0.getCallback());
                    if (this.R0) {
                        ((ActionBarOverlayLayout) this.C0).d(109);
                    }
                    if (this.O0) {
                        ((ActionBarOverlayLayout) this.C0).d(2);
                    }
                    if (this.P0) {
                        ((ActionBarOverlayLayout) this.C0).d(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    o9g o9g = new o9g(2, (Object) this);
                    WeakHashMap weakHashMap = zmf.a;
                    omf.u(viewGroup, o9g);
                    if (this.C0 == null) {
                        this.M0 = (TextView) viewGroup.findViewById(mvb.title);
                    }
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(mvb.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.w0.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.w0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new y8((Object) this));
                    this.L0 = viewGroup;
                    Object obj = this.u0;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B0;
                    if (!TextUtils.isEmpty(title)) {
                        u54 u542 = this.C0;
                        if (u542 != null) {
                            u542.setWindowTitle(title);
                        } else {
                            ote ote = this.z0;
                            if (ote != null) {
                                ote.U(title);
                            } else {
                                TextView textView = this.M0;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.L0.findViewById(16908290);
                    View decorView = this.w0.getDecorView();
                    contentFrameLayout2.u0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(p3c.AppCompatTheme);
                    obtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.K0 = true;
                    cn w = w(0);
                    if (!this.b1 && w.h == null) {
                        y(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.Q0);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.R0);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.T0);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.S0);
                sb.append(", windowNoTitle: ");
                throw new IllegalArgumentException(au1.j(sb, this.U0, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void u() {
        if (this.w0 == null) {
            Object obj = this.u0;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.w0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final dle v(Context context) {
        if (this.h1 == null) {
            if (vq7.s0 == null) {
                Context applicationContext = context.getApplicationContext();
                vq7.s0 = new vq7(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.h1 = new zm(this, vq7.s0);
        }
        return this.h1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: cn[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: cn[]} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, cn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cn w(int r5) {
        /*
            r4 = this;
            cn[] r0 = r4.W0
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            cn[] r2 = new defpackage.cn[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.W0 = r2
            r0 = r2
        L_0x0015:
            r4 = r0[r5]
            if (r4 != 0) goto L_0x0024
            cn r4 = new cn
            r4.<init>()
            r4.a = r5
            r4.n = r1
            r0[r5] = r4
        L_0x0024:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.w(int):cn");
    }

    public final void x() {
        t();
        if (this.Q0 && this.z0 == null) {
            Object obj = this.u0;
            if (obj instanceof Activity) {
                this.z0 = new d6g((Activity) obj, this.R0);
            } else if (obj instanceof Dialog) {
                this.z0 = new d6g((Dialog) obj);
            }
            ote ote = this.z0;
            if (ote != null) {
                ote.P(this.m1);
            }
        }
    }

    public final void y(int i) {
        this.k1 = (1 << i) | this.k1;
        if (!this.j1) {
            View decorView = this.w0.getDecorView();
            WeakHashMap weakHashMap = zmf.a;
            decorView.postOnAnimation(this.l1);
            this.j1 = true;
        }
    }

    public final boolean z(wq8 wq8, MenuItem menuItem) {
        cn cnVar;
        Window.Callback callback = this.w0.getCallback();
        if (callback != null && !this.b1) {
            wq8 k = wq8.k();
            cn[] cnVarArr = this.W0;
            int length = cnVarArr != null ? cnVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    cnVar = cnVarArr[i];
                    if (cnVar != null && cnVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    cnVar = null;
                    break;
                }
            }
            if (cnVar != null) {
                return callback.onMenuItemSelected(cnVar.a, menuItem);
            }
        }
        return false;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
