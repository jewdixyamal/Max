package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: ai3  reason: default package */
public final class ai3 implements kwe {
    public Object X;
    public Object Y;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public ai3(je7 je7, y7d y7d) {
        this.a = y7d;
        this.b = je7;
        this.c = new AtomicInteger(0);
        this.o = new AtomicReference(zh3.b);
        this.X = new khe(new zf3(1));
        this.Y = new khe(new md1(23, this));
    }

    public static yj8 d(q3b q3b, zw6 zw6, yj8 yj8, hue hue) {
        mue x0 = q3b.x0();
        int B = q3b.B();
        Object m = x0.q() ? null : x0.m(B);
        int b2 = (q3b.n() || x0.q()) ? -1 : x0.f(B, hue).b(oaf.S(q3b.k()) - hue.g());
        for (int i = 0; i < zw6.size(); i++) {
            yj8 yj82 = (yj8) zw6.get(i);
            if (f(yj82, m, q3b.n(), q3b.o0(), q3b.O(), b2)) {
                return yj82;
            }
        }
        if (zw6.isEmpty() && yj8 != null) {
            if (f(yj8, m, q3b.n(), q3b.o0(), q3b.O(), b2)) {
                return yj8;
            }
        }
        return null;
    }

    public static boolean f(yj8 yj8, Object obj, boolean z, int i, int i2, int i3) {
        if (!yj8.a.equals(obj)) {
            return false;
        }
        int i4 = yj8.b;
        return (z && i4 == i && yj8.c == i2) || (!z && i4 == -1 && yj8.e == i3);
    }

    public void a(String str, String str2) {
        Map map = (Map) this.Y;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void b(jn jnVar, yj8 yj8, mue mue) {
        if (yj8 != null) {
            if (mue.b(yj8.a) != -1) {
                jnVar.I(yj8, mue);
                return;
            }
            mue mue2 = (mue) ((cx6) this.c).get(yj8);
            if (mue2 != null) {
                jnVar.I(yj8, mue2);
            }
        }
    }

    public ja0 c() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((i05) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.o) == null) {
            str = au1.g(str, " eventMillis");
        }
        if (((Long) this.X) == null) {
            str = au1.g(str, " uptimeMillis");
        }
        if (((Map) this.Y) == null) {
            str = au1.g(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new ja0((String) this.a, (Integer) this.b, (i05) this.c, ((Long) this.o).longValue(), ((Long) this.X).longValue(), (Map) this.Y);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public MenuItem e(int i) {
        Toolbar toolbar = (Toolbar) this.b;
        if (toolbar != null) {
            return toolbar.getMenu().findItem(i);
        }
        return null;
    }

    public void g(String str) {
        TextView textView = (TextView) this.o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void h() {
        b y = ((y7g) this.a).y();
        Toolbar toolbar = (Toolbar) this.b;
        if (toolbar != null && y != null) {
            dn dnVar = (dn) ((im) y).V();
            if (dnVar.u0 instanceof Activity) {
                dnVar.x();
                ote ote = dnVar.z0;
                if (!(ote instanceof d6g)) {
                    dnVar.A0 = null;
                    if (ote != null) {
                        ote.I();
                    }
                    dnVar.z0 = null;
                    Object obj = dnVar.u0;
                    mwe mwe = new mwe(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : dnVar.B0, dnVar.x0);
                    dnVar.z0 = mwe;
                    dnVar.x0.b = mwe.Y;
                    toolbar.setBackInvokedCallbackEnabled(true);
                    dnVar.a();
                    return;
                }
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
        }
    }

    public void i(mue mue) {
        jn a2 = cx6.a();
        if (((zw6) this.b).isEmpty()) {
            b(a2, (yj8) this.X, mue);
            if (!f46.B((yj8) this.Y, (yj8) this.X)) {
                b(a2, (yj8) this.Y, mue);
            }
            if (!f46.B((yj8) this.o, (yj8) this.X) && !f46.B((yj8) this.o, (yj8) this.Y)) {
                b(a2, (yj8) this.o, mue);
            }
        } else {
            for (int i = 0; i < ((zw6) this.b).size(); i++) {
                b(a2, (yj8) ((zw6) this.b).get(i), mue);
            }
            if (!((zw6) this.b).contains((yj8) this.o)) {
                b(a2, (yj8) this.o, mue);
            }
        }
        this.c = a2.j();
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    public ai3(go9 go9) {
        sme sme = (sme) go9.c;
        y7g y7g = (y7g) go9.d;
        if (((WeakReference) y7g.c).get() != null) {
            Context context = (Context) ((WeakReference) y7g.c).get();
        } else {
            WeakReference weakReference = (WeakReference) y7g.b;
            if (weakReference.get() != null) {
                ((a) weakReference.get()).d0();
            } else {
                throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
            }
        }
        bk4.b();
        this.a = y7g;
        Toolbar toolbar = (Toolbar) go9.e;
        this.b = toolbar;
        this.c = sme;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
        toolbar.findViewById(xxb.toolbar);
        this.Y = toolbar.findViewById(xxb.toolbar__wrapper_title);
        TextView textView = (TextView) toolbar.findViewById(go9.b);
        this.o = textView;
        if (textView != null) {
            new vqe(textView, c54.a(textView.getContext())).a();
        }
        this.X = (TextView) toolbar.findViewById(xxb.toolbar_subtitle);
        TamAvatarView tamAvatarView = (TamAvatarView) toolbar.findViewById(xxb.toolbar_avatar);
        if (((TextView) this.o) != null) {
            toolbar.setContentInsetStartWithNavigation(0);
            TextView textView2 = (TextView) this.o;
            textView2.getContext();
            j47.q(textView2, bk4.a(8.0f));
            TextView textView3 = (TextView) this.X;
            if (textView3 != null) {
                ((TextView) this.o).getContext();
                j47.q(textView3, bk4.a(8.0f));
            }
        }
        sme sme2 = (sme) this.c;
        ngg.i(sme2, toolbar, (TextView) this.o, (TextView) this.X, sme2.F, sme2.M);
        toolbar.m(azb.menu_empty);
        toolbar.setOnMenuItemClickListener(this);
        nd7.h(toolbar, new e5(19, this));
    }

    public ai3(m4b m4b, z9d z9d, k3b k3b, zw6 zw6, Bundle bundle, iad iad) {
        this.a = m4b;
        this.b = z9d;
        this.c = k3b;
        this.o = zw6;
        this.X = bundle == null ? Bundle.EMPTY : bundle;
        this.Y = iad;
    }
}
