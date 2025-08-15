package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: tde  reason: default package */
public final class tde {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ ude E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public k7 z;

    public tde(ude ude, Menu menu) {
        this.E = ude;
        this.a = menu;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.y;
        ude ude = this.E;
        if (str != null) {
            if (!ude.c.isRestricted()) {
                if (ude.d == null) {
                    ude.d = ude.a(ude.c);
                }
                Object obj = ude.d;
                String str2 = this.y;
                sde sde = new sde();
                sde.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    sde.c = cls.getMethod(str2, sde.d);
                    menuItem.setOnMenuItemClickListener(sde);
                } catch (Exception e2) {
                    StringBuilder m2 = au1.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    m2.append(cls.getName());
                    InflateException inflateException = new InflateException(m2.toString());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof br8) {
                br8 br8 = (br8) menuItem;
                br8.I0 = (br8.I0 & -5) | 4;
            } else if (menuItem instanceof fr8) {
                fr8 fr8 = (fr8) menuItem;
                try {
                    Method method = fr8.X;
                    vde vde = fr8.o;
                    if (method == null) {
                        fr8.X = vde.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    fr8.X.invoke(vde, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, ude.e, ude.a));
            z2 = true;
        }
        int i3 = this.w;
        if (i3 > 0 && !z2) {
            menuItem.setActionView(i3);
        }
        k7 k7Var = this.z;
        if (k7Var != null && (menuItem instanceof vde)) {
            ((vde) menuItem).a(k7Var);
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof vde;
        if (z3) {
            ((vde) menuItem).setContentDescription(charSequence);
        } else {
            zq8.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((vde) menuItem).setTooltipText(charSequence2);
        } else {
            zq8.m(menuItem, charSequence2);
        }
        char c2 = this.n;
        int i4 = this.o;
        if (z3) {
            ((vde) menuItem).setAlphabeticShortcut(c2, i4);
        } else {
            zq8.g(menuItem, c2, i4);
        }
        char c3 = this.p;
        int i5 = this.q;
        if (z3) {
            ((vde) menuItem).setNumericShortcut(c3, i5);
        } else {
            zq8.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((vde) menuItem).setIconTintMode(mode);
            } else {
                zq8.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList == null) {
            return;
        }
        if (z3) {
            ((vde) menuItem).setIconTintList(colorStateList);
        } else {
            zq8.i(menuItem, colorStateList);
        }
    }
}
