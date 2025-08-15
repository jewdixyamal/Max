package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: mwe  reason: default package */
public final class mwe extends ote {
    public final Window.Callback X;
    public final qje Y;
    public boolean Z;
    public final rwe o;
    public boolean s0;
    public boolean t0;
    public final ArrayList u0 = new ArrayList();
    public final gwe v0 = new gwe(1, (Object) this);

    public mwe(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        super(3);
        u5e u5e = new u5e(this);
        toolbar.getClass();
        rwe rwe = new rwe(toolbar, false);
        this.o = rwe;
        callback.getClass();
        this.X = callback;
        rwe.k = callback;
        toolbar.setOnMenuItemClickListener(u5e);
        if (!rwe.g) {
            rwe.h = charSequence;
            if ((rwe.b & 8) != 0) {
                Toolbar toolbar2 = rwe.a;
                toolbar2.setTitle(charSequence);
                if (rwe.g) {
                    zmf.k(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.Y = new qje(1, this);
    }

    public final boolean C() {
        rwe rwe = this.o;
        Toolbar toolbar = rwe.a;
        gwe gwe = this.v0;
        toolbar.removeCallbacks(gwe);
        Toolbar toolbar2 = rwe.a;
        WeakHashMap weakHashMap = zmf.a;
        toolbar2.postOnAnimation(gwe);
        return true;
    }

    public final void H() {
    }

    public final void I() {
        this.o.a.removeCallbacks(this.v0);
    }

    public final boolean L(int i, KeyEvent keyEvent) {
        Menu c0 = c0();
        if (c0 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c0.setQwertyMode(z);
        return c0.performShortcut(i, keyEvent, 0);
    }

    public final boolean M(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            N();
        }
        return true;
    }

    public final boolean N() {
        return this.o.a.w();
    }

    public final void P(boolean z) {
    }

    public final void Q(boolean z) {
    }

    public final void U(CharSequence charSequence) {
        rwe rwe = this.o;
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.s0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r0 = this;
            rwe r0 = r0.o
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x0014
            e7 r0 = r0.s0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwe.a():boolean");
    }

    public final Menu c0() {
        boolean z = this.s0;
        rwe rwe = this.o;
        if (!z) {
            ar0 ar0 = new ar0((Object) this);
            w5e w5e = new w5e(this);
            Toolbar toolbar = rwe.a;
            toolbar.b1 = ar0;
            toolbar.c1 = w5e;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.t0 = ar0;
                actionMenuView.u0 = w5e;
            }
            this.s0 = true;
        }
        return rwe.a.getMenu();
    }

    public final boolean g() {
        br8 br8;
        iwe iwe = this.o.a.a1;
        if (iwe == null || (br8 = iwe.b) == null) {
            return false;
        }
        if (iwe == null) {
            br8 = null;
        }
        if (br8 == null) {
            return true;
        }
        br8.collapseActionView();
        return true;
    }

    public final void h(boolean z) {
        if (z != this.t0) {
            this.t0 = z;
            ArrayList arrayList = this.u0;
            if (arrayList.size() > 0) {
                au1.r(arrayList.get(0));
                throw null;
            }
        }
    }

    public final int q() {
        return this.o.b;
    }

    public final Context y() {
        return this.o.a.getContext();
    }
}
