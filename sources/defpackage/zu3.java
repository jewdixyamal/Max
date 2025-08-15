package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;

/* renamed from: zu3  reason: default package */
public abstract class zu3 {
    public static final HashMap c = new HashMap();
    public boolean a;
    public boolean b;

    public zu3() {
        try {
            getClass().getConstructor((Class[]) null);
        } catch (Throwable unused) {
            throw new RuntimeException(getClass() + " does not have a default constructor.");
        }
    }

    public static final void c(wu3 wu3) {
        View view;
        ViewGroup viewGroup = wu3.d;
        if (viewGroup != null) {
            zu3 zu3 = wu3.e;
            if (zu3 == null) {
                zu3 = new gqd(true);
            } else if (zu3.b && !zu3.e()) {
                zu3 = zu3.b();
            }
            zu3 zu32 = zu3;
            zu32.b = true;
            HashMap hashMap = c;
            uu3 uu3 = wu3.a;
            uu3 uu32 = wu3.b;
            boolean z = wu3.c;
            if (uu32 != null) {
                if (z) {
                    np8.k(uu32.getInstanceId());
                } else {
                    vu3 vu3 = (vu3) hashMap.get(uu32.getInstanceId());
                    if (vu3 != null) {
                        boolean z2 = vu3.b;
                        zu3 zu33 = vu3.a;
                        if (z2) {
                            zu33.f(zu32, uu3);
                        } else {
                            zu33.a();
                        }
                        vu3 vu32 = (vu3) hashMap.remove(uu32.getInstanceId());
                    }
                }
            }
            if (uu3 != null) {
                hashMap.put(uu3.getInstanceId(), new vu3(zu32, z));
            }
            List<yu3> list = wu3.f;
            for (yu3 a2 : list) {
                a2.a(uu3, uu32, z);
            }
            av3 av3 = z ? av3.PUSH_ENTER : av3.POP_ENTER;
            av3 av32 = z ? av3.PUSH_EXIT : av3.POP_EXIT;
            View view2 = null;
            if (uu3 != null) {
                View inflate = uu3.inflate(viewGroup);
                uu3.changeStarted(zu32, av3);
                view = inflate;
            } else {
                view = null;
            }
            if (uu32 != null) {
                view2 = uu32.getView();
                uu32.changeStarted(zu32, av32);
            }
            zu32.g(viewGroup, view2, view, z, new xu3(uu32, zu32, av32, uu3, list, view2, av3, z, viewGroup));
        }
    }

    public void a() {
    }

    public zu3 b() {
        return np8.p(j());
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public void f(zu3 zu3, uu3 uu3) {
    }

    public abstract void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3);

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        i(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
}
