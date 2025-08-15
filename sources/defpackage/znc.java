package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: znc  reason: default package */
public abstract class znc {
    public final nf0 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;
    public boolean f;
    public boolean g = false;
    public boolean h = false;
    public ViewGroup i;

    public znc() {
        nf0 nf0 = new nf0();
        this.a = nf0;
        nf0.b = new ync(0, this);
    }

    public static void b(znc znc, ArrayList arrayList) {
        znc.getClass();
        nf0 nf0 = znc.a;
        ArrayList arrayList2 = new ArrayList(nf0.a.size());
        Iterator c2 = nf0.c();
        while (c2.hasNext()) {
            arrayList2.add(((coc) c2.next()).a);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            uu3 uu3 = (uu3) it.next();
            if (uu3.getView() != null) {
                arrayList.add(uu3.getView());
            }
            for (znc b2 : uu3.getChildRouters()) {
                b(b2, arrayList);
            }
        }
    }

    public static ArrayList l(Iterator it, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        while (it.hasNext()) {
            coc coc = (coc) it.next();
            if (z2) {
                arrayList.add(coc);
            }
            z2 = coc.b() != null && !coc.b().d();
            if (z && !z2) {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final void A() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 < arrayList.size()) {
                zu3.c((wu3) arrayList.get(i2));
                i2++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean B(uu3 uu3) {
        ft.e();
        nf0 nf0 = this.a;
        coc a2 = nf0.a();
        ArrayDeque arrayDeque = nf0.a;
        if (a2 == null || a2.a != uu3) {
            Iterator it = nf0.iterator();
            coc coc = null;
            zu3 b2 = a2 != null ? a2.b() : null;
            boolean z = b2 != null && !b2.d();
            coc coc2 = null;
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                }
                coc coc3 = (coc) u1Var.next();
                uu3 uu32 = coc3.a;
                if (uu32 == uu3) {
                    X(coc3);
                    arrayDeque.remove(coc3);
                    coc2 = coc3;
                } else if (coc2 != null) {
                    if (z && !uu32.isAttached()) {
                        coc = coc3;
                    }
                }
            }
            if (coc2 != null) {
                y(coc, coc2, false);
            }
        } else {
            X(nf0.b());
            y(nf0.a(), a2, false);
        }
        return this.e == 3 ? a2 != null : !arrayDeque.isEmpty();
    }

    public final boolean C() {
        ft.e();
        coc a2 = this.a.a();
        if (a2 != null) {
            return B(a2.a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }

    public final void D(String str) {
        coc coc;
        ft.e();
        ft.e();
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc = (coc) u1Var.next();
            } else {
                return;
            }
        } while (!str.equals(coc.b));
        E(coc);
    }

    public final void E(coc coc) {
        nf0 nf0 = this.a;
        if (nf0.a.size() > 0) {
            coc a2 = nf0.a();
            ArrayList arrayList = new ArrayList();
            Iterator c2 = nf0.c();
            while (c2.hasNext()) {
                coc coc2 = (coc) c2.next();
                arrayList.add(coc2);
                if (coc2 == coc) {
                    break;
                }
            }
            zu3 overriddenPopHandler = a2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = a2.d;
            }
            P(arrayList, overriddenPopHandler);
        }
    }

    public final void F() {
        this.c.clear();
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                String instanceId = coc.a.getInstanceId();
                HashMap hashMap = zu3.c;
                boolean k = np8.k(instanceId);
                uu3 uu3 = coc.a;
                if (k) {
                    uu3.setNeedsAttach(true);
                }
                uu3.prepareForHostDetach();
            } else {
                return;
            }
        }
    }

    public final void G(coc coc) {
        ft.e();
        coc a2 = this.a.a();
        H(coc);
        y(coc, a2, true);
    }

    public void H(coc coc) {
        nf0 nf0 = this.a;
        ArrayDeque arrayDeque = nf0.a;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (tpa.f(((coc) it.next()).a, coc.a)) {
                    throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
                }
            }
        }
        nf0.a.push(coc);
        ync ync = nf0.b;
        if (ync != null) {
            ync.d();
        }
    }

    public final void I() {
        ft.e();
        nf0 nf0 = this.a;
        ArrayList arrayList = new ArrayList(nf0.a.size());
        Iterator c2 = nf0.c();
        while (c2.hasNext()) {
            arrayList.add((coc) c2.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            coc coc = (coc) it.next();
            if (coc.a.getNeedsAttach()) {
                z(coc, (coc) null, true, new gqd(false));
            } else {
                S(coc.a);
            }
        }
    }

    public abstract void J(int i2, String str);

    public final void K(yu3 yu3) {
        this.b.remove(yu3);
    }

    public final void L(coc coc) {
        ft.e();
        nf0 nf0 = this.a;
        coc a2 = nf0.a();
        if (!nf0.a.isEmpty()) {
            X(nf0.b());
        }
        zu3 b2 = coc.b();
        if (a2 != null) {
            boolean z = false;
            boolean z2 = a2.b() == null || a2.b().d();
            if (b2 == null || b2.d()) {
                z = true;
            }
            if (!z2 && z) {
                Iterator it = l(nf0.iterator(), true).iterator();
                while (it.hasNext()) {
                    z((coc) null, (coc) it.next(), true, b2);
                }
            }
        }
        H(coc);
        if (b2 != null) {
            b2.a = true;
        }
        coc.c(b2);
        y(coc, a2, true);
    }

    public abstract void M(String str, String[] strArr, int i2);

    public void N(Bundle bundle) {
        this.e = au1.v(3)[bundle.getInt("Router.popRootControllerMode")];
        this.f = bundle.getBoolean("Router.onBackPressedDispatcherEnabled");
        nf0 nf0 = this.a;
        nf0.getClass();
        ArrayList parcelableArrayList = ((Bundle) bundle.getParcelable("Router.backstack")).getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle2 = (Bundle) it.next();
                ArrayDeque arrayDeque = nf0.a;
                uu3 newInstance = uu3.newInstance(bundle2.getBundle("RouterTransaction.controller.bundle"));
                HashMap hashMap = zu3.c;
                zu3 p = np8.p(bundle2.getBundle("RouterTransaction.pushControllerChangeHandler"));
                zu3 p2 = np8.p(bundle2.getBundle("RouterTransaction.popControllerChangeHandler"));
                arrayDeque.push(new coc(newInstance, bundle2.getString("RouterTransaction.tag"), p, p2, bundle2.getBoolean("RouterTransaction.attachedToRouter"), bundle2.getInt("RouterTransaction.transactionIndex")));
            }
        }
        ync ync = nf0.b;
        if (ync != null) {
            ync.d();
        }
        Iterator c2 = nf0.c();
        while (c2.hasNext()) {
            S(((coc) c2.next()).a);
        }
    }

    public void O(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        nf0 nf0 = this.a;
        nf0.getClass();
        ArrayDeque arrayDeque = nf0.a;
        ArrayList arrayList = new ArrayList(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            coc coc = (coc) it.next();
            coc.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle("RouterTransaction.controller.bundle", coc.a.saveInstanceState());
            zu3 zu3 = coc.c;
            if (zu3 != null) {
                bundle3.putBundle("RouterTransaction.pushControllerChangeHandler", zu3.j());
            }
            zu3 zu32 = coc.d;
            if (zu32 != null) {
                bundle3.putBundle("RouterTransaction.popControllerChangeHandler", zu32.j());
            }
            bundle3.putString("RouterTransaction.tag", coc.b);
            bundle3.putInt("RouterTransaction.transactionIndex", coc.f);
            bundle3.putBoolean("RouterTransaction.attachedToRouter", coc.e);
            arrayList.add(bundle3);
        }
        bundle2.putParcelableArrayList("Backstack.entries", arrayList);
        bundle.putInt("Router.popRootControllerMode", au1.s(this.e));
        bundle.putBoolean("Router.onBackPressedDispatcherEnabled", this.f);
        bundle.putParcelable("Router.backstack", bundle2);
    }

    public void P(List list, zu3 zu3) {
        boolean z;
        ft.e();
        ArrayList e2 = e();
        nf0 nf0 = this.a;
        ArrayList l = l(nf0.iterator(), false);
        ArrayList arrayList = new ArrayList();
        Iterator it = l(nf0.iterator(), false).iterator();
        while (it.hasNext()) {
            coc coc = (coc) it.next();
            if (coc.a.getView() != null) {
                arrayList.add(coc.a.getView());
            }
        }
        for (znc znc : j()) {
            if (znc.i == this.i) {
                b(znc, arrayList);
            }
        }
        for (int childCount = this.i.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.i.getChildAt(childCount);
            if (!arrayList.contains(childAt)) {
                this.i.removeView(childAt);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            coc coc2 = (coc) it2.next();
            fm5 k = k();
            if (coc2.f == -1) {
                int i2 = k.b + 1;
                k.b = i2;
                coc2.f = i2;
            }
            arrayList2.add(Integer.valueOf(coc2.f));
        }
        Collections.sort(arrayList2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((coc) list.get(i3)).f = ((Integer) arrayList2.get(i3)).intValue();
        }
        int i4 = 0;
        while (i4 < list.size()) {
            uu3 uu3 = ((coc) list.get(i4)).a;
            i4++;
            int i5 = i4;
            while (true) {
                if (i5 < list.size()) {
                    if (((coc) list.get(i5)).a != uu3) {
                        i5++;
                    } else {
                        throw new IllegalStateException("Trying to push the same controller to the backstack more than once.");
                    }
                }
            }
        }
        ArrayDeque arrayDeque = nf0.a;
        arrayDeque.clear();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayDeque.push((coc) it3.next());
        }
        ync ync = nf0.b;
        if (ync != null) {
            ync.d();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = e2.iterator();
        while (it4.hasNext()) {
            coc coc3 = (coc) it4.next();
            Iterator it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (coc3.a == ((coc) it5.next()).a) {
                        break;
                    }
                } else {
                    coc3.a.isBeingDestroyed = true;
                    arrayList3.add(coc3);
                    break;
                }
            }
        }
        Iterator c2 = nf0.c();
        while (c2.hasNext()) {
            coc coc4 = (coc) c2.next();
            coc4.e = true;
            S(coc4.a);
        }
        if (list.size() > 0) {
            ArrayList arrayList4 = new ArrayList(list);
            Collections.reverse(arrayList4);
            ArrayList l2 = l(arrayList4.iterator(), false);
            boolean z2 = l2.size() <= 0 || !e2.contains(l2.get(0));
            if (l2.size() == l.size()) {
                int i6 = 0;
                while (true) {
                    if (i6 >= l.size()) {
                        z = true;
                        break;
                    } else if (((coc) l.get(i6)).a != ((coc) l2.get(i6)).a) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            z = false;
            if (!z) {
                coc coc5 = l.size() > 0 ? (coc) l.get(0) : null;
                coc coc6 = (coc) l2.get(0);
                if (coc5 == null || coc5.a != coc6.a) {
                    if (coc5 != null) {
                        String instanceId = coc5.a.getInstanceId();
                        HashMap hashMap = zu3.c;
                        np8.k(instanceId);
                    }
                    z(coc6, coc5, z2, zu3);
                }
                for (int size = l.size() - 1; size > 0; size--) {
                    coc coc7 = (coc) l.get(size);
                    if (!l2.contains(coc7)) {
                        zu3 b2 = zu3 != null ? zu3.b() : new gqd();
                        b2.a = true;
                        np8.k(coc7.a.getInstanceId());
                        if (coc7.a.view != null) {
                            z((coc) null, coc7, z2, b2);
                        }
                    }
                }
                for (int i7 = 1; i7 < l2.size(); i7++) {
                    coc coc8 = (coc) l2.get(i7);
                    if (!l.contains(coc8)) {
                        z(coc8, (coc) l2.get(i7 - 1), true, coc8.b());
                    }
                }
            }
        } else {
            for (int size2 = l.size() - 1; size2 >= 0; size2--) {
                coc coc9 = (coc) l.get(size2);
                zu3 b3 = zu3 != null ? zu3.b() : new gqd();
                String instanceId2 = coc9.a.getInstanceId();
                HashMap hashMap2 = zu3.c;
                np8.k(instanceId2);
                z((coc) null, coc9, false, b3);
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            coc coc10 = (coc) it6.next();
            Iterator it7 = this.c.iterator();
            boolean z3 = false;
            while (it7.hasNext()) {
                if (((wu3) it7.next()).b == coc10.a) {
                    z3 = true;
                }
            }
            if (!z3) {
                coc10.a.destroy();
            }
        }
    }

    public final void Q(boolean z) {
        this.a.getSize();
        this.f = z;
    }

    public final void R(coc coc) {
        ft.e();
        P(Collections.singletonList(coc), coc.b());
    }

    public void S(uu3 uu3) {
        uu3.setRouter(this);
        uu3.onContextAvailable();
    }

    public abstract void T(Intent intent);

    public abstract void U(String str, Intent intent, int i2);

    public abstract void V(String str, Intent intent, int i2, Bundle bundle);

    public abstract void W(String str, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle);

    public final void X(coc coc) {
        if (!coc.a.isDestroyed()) {
            ArrayList arrayList = this.d;
            uu3 uu3 = coc.a;
            arrayList.add(uu3);
            uu3.addLifecycleListener(new ia3(5, this));
        }
    }

    public abstract void Y(String str);

    public final void a(yu3 yu3) {
        ArrayList arrayList = this.b;
        if (!arrayList.contains(yu3)) {
            arrayList.add(yu3);
        }
    }

    public void c(boolean z) {
        this.e = 3;
        nf0 nf0 = this.a;
        nf0.getClass();
        ArrayList arrayList = new ArrayList();
        while (!nf0.a.isEmpty()) {
            arrayList.add(nf0.b());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X((coc) it.next());
        }
        coc coc = null;
        if (z && arrayList.size() > 0) {
            coc coc2 = (coc) arrayList.get(0);
            coc2.a.addLifecycleListener(new joa((dv3) this, arrayList));
            zu3 overriddenPopHandler = coc2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = coc2.d;
            }
            z((coc) null, coc2, false, overriddenPopHandler);
            coc = coc2;
        }
        if (arrayList.size() > 0) {
            nq9 nq9 = new nq9();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                coc coc3 = (coc) it2.next();
                if (coc3 != coc) {
                    uu3 uu3 = coc3.a;
                    av3 av3 = av3.POP_EXIT;
                    uu3.changeStarted(nq9, av3);
                    coc3.a.changeEnded(nq9, av3);
                }
            }
        }
    }

    public abstract Activity d();

    public final ArrayList e() {
        nf0 nf0 = this.a;
        ArrayList arrayList = new ArrayList(nf0.a.size());
        Iterator c2 = nf0.c();
        while (c2.hasNext()) {
            arrayList.add((coc) c2.next());
        }
        return arrayList;
    }

    public final uu3 f(String str) {
        uu3 findController;
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return null;
            }
            findController = ((coc) u1Var.next()).a.findController(str);
        } while (findController == null);
        return findController;
    }

    public final uu3 g(String str) {
        coc coc;
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return null;
            }
            coc = (coc) u1Var.next();
        } while (!str.equals(coc.b));
        return coc.a;
    }

    public final i3a h() {
        Activity d2 = d();
        if (d2 instanceof yb3) {
            return ((yb3) d2).E();
        }
        return null;
    }

    public abstract znc i();

    public abstract List j();

    public abstract fm5 k();

    public final boolean m() {
        nf0 nf0 = this.a;
        if (nf0.a.isEmpty()) {
            return false;
        }
        if (nf0.a().a.handleBack()) {
            return true;
        }
        return (nf0.a.size() > 1 || this.e != 1) && C();
    }

    public final boolean n() {
        return this.a.getSize() > 0;
    }

    public abstract void o();

    public void p(Activity activity, boolean z) {
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        this.b.clear();
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                break;
            }
            coc coc = (coc) u1Var.next();
            coc.a.activityDestroyed(activity);
            for (znc p : coc.a.getChildRouters()) {
                p.p(activity, z);
            }
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            uu3 uu3 = (uu3) arrayList.get(size);
            uu3.activityDestroyed(activity);
            for (znc p2 : uu3.getChildRouters()) {
                p2.p(activity, z);
            }
        }
        this.i = null;
    }

    public final void q(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                coc.a.activityPaused(activity);
                for (znc q : coc.a.getChildRouters()) {
                    q.q(activity);
                }
            } else {
                return;
            }
        }
    }

    public final void r(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                coc.a.activityResumed(activity);
                for (znc r : coc.a.getChildRouters()) {
                    r.r(activity);
                }
            } else {
                return;
            }
        }
    }

    public final void s(Activity activity) {
        this.h = false;
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                coc.a.activityStarted(activity);
                for (znc s : coc.a.getChildRouters()) {
                    s.s(activity);
                }
            } else {
                return;
            }
        }
    }

    public final void t(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                coc.a.activityStopped(activity);
                for (znc t : coc.a.getChildRouters()) {
                    t.t(activity);
                }
            } else {
                this.h = true;
                return;
            }
        }
    }

    public void u() {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                ((coc) u1Var.next()).a.onContextAvailable();
            } else {
                return;
            }
        }
    }

    public final void v(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                coc.a.createOptionsMenu(menu, menuInflater);
                for (znc v : coc.a.getChildRouters()) {
                    v.v(menu, menuInflater);
                }
            } else {
                return;
            }
        }
    }

    public final boolean w(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return false;
            }
            coc coc = (coc) u1Var.next();
            if (coc.a.optionsItemSelected(menuItem)) {
                return true;
            }
            Iterator<znc> it2 = coc.a.getChildRouters().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().w(menuItem)) {
                        return true;
                    }
                }
            }
        }
    }

    public final void x(Menu menu) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                coc coc = (coc) u1Var.next();
                coc.a.prepareOptionsMenu(menu);
                for (znc x : coc.a.getChildRouters()) {
                    x.x(menu);
                }
            } else {
                return;
            }
        }
    }

    public void y(coc coc, coc coc2, boolean z) {
        zu3 zu3;
        if (z && coc != null) {
            coc.e = true;
        }
        if (z) {
            zu3 = coc.b();
        } else if (coc2 != null) {
            zu3 = coc2.a.getOverriddenPopHandler();
            if (zu3 == null) {
                zu3 = coc2.d;
            }
        } else {
            zu3 = null;
        }
        z(coc, coc2, z, zu3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0.isAttached() == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(defpackage.coc r12, defpackage.coc r13, boolean r14, defpackage.zu3 r15) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0006
            uu3 r1 = r12.a
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            if (r13 == 0) goto L_0x000b
            uu3 r0 = r13.a
        L_0x000b:
            r13 = 1
            r9 = 0
            if (r12 == 0) goto L_0x0023
            fm5 r2 = r11.k()
            int r3 = r12.f
            r4 = -1
            if (r3 != r4) goto L_0x001f
            int r3 = r2.b
            int r3 = r3 + r13
            r2.b = r3
            r12.f = r3
        L_0x001f:
            r11.S(r1)
            goto L_0x0044
        L_0x0023:
            nf0 r12 = r11.a
            java.util.ArrayDeque r12 = r12.a
            int r12 = r12.size()
            if (r12 != 0) goto L_0x0039
            int r12 = r11.e
            r2 = 2
            if (r12 != r2) goto L_0x0039
            nq9 r15 = new nq9
            r15.<init>()
        L_0x0037:
            r12 = r13
            goto L_0x0045
        L_0x0039:
            if (r14 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            boolean r12 = r0.isAttached()
            if (r12 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r12 = r9
        L_0x0045:
            if (r14 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x0071
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Trying to push a controller that has already been destroyed. ("
            r12.<init>(r13)
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0071:
            wu3 r10 = new wu3
            android.view.ViewGroup r6 = r11.i
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r2 = r11.b
            r8.<init>(r2)
            r2 = r10
            r3 = r1
            r4 = r0
            r5 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r14 = r11.c
            int r2 = r14.size()
            if (r2 <= 0) goto L_0x0095
            if (r1 == 0) goto L_0x0091
            r1.setNeedsAttach(r13)
        L_0x0091:
            r14.add(r10)
            goto L_0x00bc
        L_0x0095:
            if (r0 == 0) goto L_0x00b9
            if (r15 == 0) goto L_0x009f
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x00b9
        L_0x009f:
            boolean r15 = r11.g
            if (r15 != 0) goto L_0x00b9
            if (r1 == 0) goto L_0x00a8
            r1.setNeedsAttach(r13)
        L_0x00a8:
            r14.add(r10)
            android.view.ViewGroup r14 = r11.i
            if (r14 == 0) goto L_0x00bc
            u3c r15 = new u3c
            r1 = 7
            r15.<init>(r1, r11)
            r14.post(r15)
            goto L_0x00bc
        L_0x00b9:
            defpackage.zu3.c(r10)
        L_0x00bc:
            if (r12 == 0) goto L_0x00d1
            if (r0 == 0) goto L_0x00d1
            android.view.View r11 = r0.getView()
            if (r11 == 0) goto L_0x00ce
            android.view.View r11 = r0.getView()
            r0.detach(r11, r13, r9)
            goto L_0x00d1
        L_0x00ce:
            r0.destroy()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znc.z(coc, coc, boolean, zu3):void");
    }
}
