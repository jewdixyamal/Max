package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: dv3  reason: default package */
public final class dv3 extends znc {
    public uu3 j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;

    public dv3() {
        this.e = 2;
    }

    public final void H(coc coc) {
        if (this.m) {
            coc.a.setDetachFrozen(true);
        }
        super.H(coc);
    }

    public final void J(int i, String str) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().J(i, str);
        }
    }

    public final void M(String str, String[] strArr, int i) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().M(str, strArr, i);
        }
    }

    public final void N(Bundle bundle) {
        super.N(bundle);
        this.k = bundle.getInt("ControllerHostedRouter.hostId");
        this.n = bundle.getBoolean("ControllerHostedRouter.boundToContainer");
        this.l = bundle.getString("ControllerHostedRouter.tag");
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.k);
        bundle.putBoolean("ControllerHostedRouter.boundToContainer", this.n);
        bundle.putString("ControllerHostedRouter.tag", this.l);
    }

    public final void P(List list, zu3 zu3) {
        if (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((coc) it.next()).a.setDetachFrozen(true);
            }
        }
        super.P(list, zu3);
    }

    public final void S(uu3 uu3) {
        uu3.setParentController(this.j);
        uu3.setRouter(this);
        uu3.onContextAvailable();
    }

    public final void T(Intent intent) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().T(intent);
        }
    }

    public final void U(String str, Intent intent, int i) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().U(str, intent, i);
        }
    }

    public final void V(String str, Intent intent, int i, Bundle bundle) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().V(str, intent, i, bundle);
        }
    }

    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().W(str, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public final void Y(String str) {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().Y(str);
        }
    }

    public final void Z() {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null && (viewGroup instanceof yu3)) {
            K((yu3) viewGroup);
        }
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            uu3 uu3 = (uu3) it.next();
            if (uu3.getView() != null) {
                uu3.detach(uu3.getView(), true, false);
            }
        }
        Iterator it2 = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it2;
            if (!u1Var.hasNext()) {
                break;
            }
            coc coc = (coc) u1Var.next();
            if (coc.a.getView() != null) {
                uu3 uu32 = coc.a;
                uu32.detach(uu32.getView(), true, false);
            }
        }
        this.g = false;
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        this.i = null;
    }

    public final void a0(boolean z) {
        this.m = z;
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                ((coc) u1Var.next()).a.setDetachFrozen(z);
            } else {
                return;
            }
        }
    }

    public final void b0(uu3 uu3, ViewGroup viewGroup) {
        if (this.j != uu3 || this.i != viewGroup) {
            Z();
            if (viewGroup instanceof yu3) {
                a((yu3) viewGroup);
            }
            this.j = uu3;
            this.i = viewGroup;
            Q(uu3.onBackPressedDispatcherEnabled);
            Iterator it = this.a.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (u1Var.hasNext()) {
                    ((coc) u1Var.next()).a.setParentController(uu3);
                } else {
                    this.i.post(new q57(21, this));
                    return;
                }
            }
        }
    }

    public final void c(boolean z) {
        a0(false);
        super.c(z);
    }

    public final Activity d() {
        uu3 uu3 = this.j;
        if (uu3 != null) {
            return uu3.getActivity();
        }
        return null;
    }

    public final znc i() {
        uu3 uu3 = this.j;
        return (uu3 == null || uu3.getRouter() == null) ? this : this.j.getRouter().i();
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j.getChildRouters());
        arrayList.addAll(this.j.getRouter().j());
        return arrayList;
    }

    public final fm5 k() {
        if (i() != this) {
            return i().k();
        }
        uu3 uu3 = this.j;
        throw new IllegalStateException("Unable to retrieve TransactionIndexer from ".concat(uu3 != null ? String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", new Object[]{uu3.getClass().getSimpleName(), Boolean.valueOf(this.j.isAttached()), Boolean.valueOf(this.j.isBeingDestroyed), this.j.getParentController()}) : "null host controller"));
    }

    public final void o() {
        uu3 uu3 = this.j;
        if (uu3 != null && uu3.getRouter() != null) {
            this.j.getRouter().o();
        }
    }

    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        Z();
    }

    public final void y(coc coc, coc coc2, boolean z) {
        super.y(coc, coc2, z);
        if (coc != null && !this.j.isAttached()) {
            if (coc.b() == null || coc.b().d()) {
                Iterator it = this.a.iterator();
                while (true) {
                    u1 u1Var = (u1) it;
                    if (u1Var.hasNext()) {
                        ((coc) u1Var.next()).a.setNeedsAttach(false);
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
