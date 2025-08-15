package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.Violation;
import androidx.loader.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

public final class e {
    public final qz7 a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(qz7 qz7, f fVar, a aVar) {
        this.a = qz7;
        this.b = fVar;
        this.c = aVar;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        aVar.H0.S();
        aVar.a = 3;
        aVar.S0 = false;
        aVar.r0(bundle2);
        if (aVar.S0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                aVar.toString();
            }
            if (aVar.U0 != null) {
                Bundle bundle3 = aVar.b;
                Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                SparseArray sparseArray = aVar.c;
                if (sparseArray != null) {
                    aVar.U0.restoreHierarchyState(sparseArray);
                    aVar.c = null;
                }
                aVar.S0 = false;
                aVar.P0(bundle4);
                if (!aVar.S0) {
                    throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onViewStateRestored()"));
                } else if (aVar.U0 != null) {
                    aVar.e1.a(eg7.ON_CREATE);
                }
            }
            aVar.b = null;
            n16 n16 = aVar.H0;
            n16.H = false;
            n16.I = false;
            n16.O.g = false;
            n16.u(4);
            this.a.t(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        a aVar;
        View view;
        View view2;
        int i = -1;
        a aVar2 = this.c;
        View view3 = aVar2.T0;
        while (true) {
            aVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(pxb.fragment_container_view_tag);
            a aVar3 = tag instanceof a ? (a) tag : null;
            if (aVar3 != null) {
                aVar = aVar3;
                break;
            } else {
                ViewParent parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        a aVar4 = aVar2.I0;
        if (aVar != null && !aVar.equals(aVar4)) {
            int i2 = aVar2.K0;
            t16 t16 = u16.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(aVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(aVar);
            sb.append(" via container with ID ");
            u16.b(new Violation(aVar2, zr6.j(sb, i2, " without using parent's childFragmentManager")));
            u16.a(aVar2).getClass();
        }
        f fVar = this.b;
        fVar.getClass();
        ViewGroup viewGroup = aVar2.T0;
        if (viewGroup != null) {
            ArrayList arrayList = fVar.a;
            int indexOf = arrayList.indexOf(aVar2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        a aVar5 = (a) arrayList.get(indexOf);
                        if (aVar5.T0 == viewGroup && (view = aVar5.U0) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    a aVar6 = (a) arrayList.get(i3);
                    if (aVar6.T0 == viewGroup && (view2 = aVar6.U0) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        aVar2.T0.addView(aVar2.U0, i);
    }

    public final void c() {
        e eVar;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        a aVar2 = aVar.s0;
        f fVar = this.b;
        if (aVar2 != null) {
            eVar = (e) fVar.b.get(aVar2.Y);
            if (eVar != null) {
                aVar.t0 = aVar.s0.Y;
                aVar.s0 = null;
            } else {
                throw new IllegalStateException("Fragment " + aVar + " declared target fragment " + aVar.s0 + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = aVar.t0;
            if (str != null) {
                eVar = (e) fVar.b.get(str);
                if (eVar == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(aVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(zr6.l(sb, aVar.t0, " that does not belong to this FragmentManager!"));
                }
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            eVar.k();
        }
        c cVar = aVar.F0;
        aVar.G0 = cVar.w;
        aVar.I0 = cVar.y;
        qz7 qz7 = this.a;
        qz7.E(aVar, false);
        ArrayList arrayList = aVar.i1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar3 = ((u06) it.next()).a;
            aVar3.h1.s();
            z7.k(aVar3);
            Bundle bundle = aVar3.b;
            aVar3.h1.t(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        aVar.H0.b(aVar.G0, aVar.V(), aVar);
        aVar.a = 0;
        aVar.S0 = false;
        aVar.u0(aVar.G0.u0);
        if (aVar.S0) {
            Iterator it2 = aVar.F0.p.iterator();
            while (it2.hasNext()) {
                ((p16) it2.next()).a(aVar);
            }
            n16 n16 = aVar.H0;
            n16.H = false;
            n16.I = false;
            n16.O.g = false;
            n16.u(0);
            qz7.u(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onAttach()"));
    }

    public final int d() {
        yd4 yd4;
        a aVar = this.c;
        if (aVar.F0 == null) {
            return aVar.a;
        }
        int i = this.e;
        int ordinal = aVar.c1.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (aVar.z0) {
            if (aVar.A0) {
                i = Math.max(this.e, 2);
                View view = aVar.U0;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, aVar.a) : Math.min(i, 1);
            }
        }
        if (aVar.B0 && aVar.T0 == null) {
            i = Math.min(i, 4);
        }
        if (!aVar.w0) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = aVar.T0;
        if (viewGroup != null) {
            aVar.f0().K();
            Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
            if (tag instanceof yd4) {
                yd4 = (yd4) tag;
            } else {
                yd4 = new yd4(viewGroup);
                viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4);
            }
            yd4.getClass();
            ovd f = yd4.f(aVar);
            int i3 = f != null ? f.b : 0;
            ovd g = yd4.g(aVar);
            if (g != null) {
                i2 = g.b;
            }
            int i4 = i3 == 0 ? -1 : pvd.$EnumSwitchMapping$0[au1.s(i3)];
            if (!(i4 == -1 || i4 == 1)) {
                i2 = i3;
            }
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (aVar.x0) {
            i = aVar.q0() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (aVar.V0 && aVar.a < 5) {
            i = Math.min(i, 4);
        }
        if (aVar.y0) {
            i = Math.max(i, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        return i;
    }

    public final void e() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle2 = aVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (!aVar.a1) {
            qz7 qz7 = this.a;
            qz7.F(aVar, false);
            aVar.H0.S();
            aVar.a = 1;
            aVar.S0 = false;
            aVar.d1.a(new fdc(4, aVar));
            aVar.v0(bundle3);
            aVar.a1 = true;
            if (aVar.S0) {
                aVar.d1.d(eg7.ON_CREATE);
                qz7.w(aVar, false);
                return;
            }
            throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onCreate()"));
        }
        aVar.a = 1;
        Bundle bundle4 = aVar.b;
        if (bundle4 != null && (bundle = bundle4.getBundle("childFragmentManager")) != null) {
            aVar.H0.Z(bundle);
            n16 n16 = aVar.H0;
            n16.H = false;
            n16.I = false;
            n16.O.g = false;
            n16.u(1);
        }
    }

    public final void f() {
        String str;
        a aVar = this.c;
        if (!aVar.z0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = null;
            Bundle bundle3 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater C0 = aVar.C0(bundle3);
            aVar.Z0 = C0;
            ViewGroup viewGroup = aVar.T0;
            if (viewGroup == null) {
                int i = aVar.K0;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) aVar.F0.x.J(i);
                    if (viewGroup == null) {
                        if (!aVar.C0 && !aVar.B0) {
                            try {
                                str = aVar.g0().getResourceName(aVar.K0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.K0) + " (" + str + ") for fragment " + aVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        t16 t16 = u16.a;
                        u16.b(new Violation(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        u16.a(aVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(rh4.i("Cannot create fragment ", aVar, " for a container view with no id"));
                }
            }
            aVar.T0 = viewGroup;
            aVar.Q0(C0, viewGroup, bundle3);
            if (aVar.U0 != null) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(aVar);
                }
                aVar.U0.setSaveFromParentEnabled(false);
                aVar.U0.setTag(pxb.fragment_container_view_tag, aVar);
                if (viewGroup != null) {
                    b();
                }
                if (aVar.M0) {
                    aVar.U0.setVisibility(8);
                }
                if (aVar.U0.isAttachedToWindow()) {
                    View view = aVar.U0;
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c(view);
                } else {
                    View view2 = aVar.U0;
                    view2.addOnAttachStateChangeListener(new ef(view2, 1));
                }
                Bundle bundle4 = aVar.b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                }
                aVar.O0(aVar.U0, bundle2);
                aVar.H0.u(2);
                this.a.K(aVar, aVar.U0, false);
                int visibility = aVar.U0.getVisibility();
                aVar.a0().j = aVar.U0.getAlpha();
                if (aVar.T0 != null && visibility == 0) {
                    View findFocus = aVar.U0.findFocus();
                    if (findFocus != null) {
                        aVar.a0().k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            findFocus.toString();
                            Objects.toString(aVar);
                        }
                    }
                    aVar.U0.setAlpha(0.0f);
                }
            }
            aVar.a = 2;
        }
    }

    public final void g() {
        a b2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        boolean z = true;
        boolean z2 = aVar.x0 && !aVar.q0();
        f fVar = this.b;
        if (z2) {
            fVar.i(aVar.Y, (Bundle) null);
        }
        if (!z2) {
            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.Y) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                String str = aVar.t0;
                if (!(str == null || (b2 = fVar.b(str)) == null || !b2.O0)) {
                    aVar.s0 = b2;
                }
                aVar.a = 0;
                return;
            }
        }
        z06 z06 = aVar.G0;
        if (z06 instanceof ynf) {
            z = fVar.d.f;
        } else {
            Context context = z06.u0;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z2 || z) {
            FragmentManagerViewModel fragmentManagerViewModel2 = fVar.d;
            fragmentManagerViewModel2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            fragmentManagerViewModel2.f(aVar.Y, false);
        }
        aVar.H0.l();
        aVar.d1.d(eg7.ON_DESTROY);
        aVar.a = 0;
        aVar.S0 = false;
        aVar.a1 = false;
        aVar.y0();
        if (aVar.S0) {
            this.a.x(aVar, false);
            Iterator it = fVar.d().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar != null) {
                    String str2 = aVar.Y;
                    a aVar2 = eVar.c;
                    if (str2.equals(aVar2.t0)) {
                        aVar2.s0 = aVar;
                        aVar2.t0 = null;
                    }
                }
            }
            String str3 = aVar.t0;
            if (str3 != null) {
                aVar.s0 = fVar.b(str3);
            }
            fVar.h(this);
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        ViewGroup viewGroup = aVar.T0;
        if (!(viewGroup == null || (view = aVar.U0) == null)) {
            viewGroup.removeView(view);
        }
        aVar.H0.u(1);
        if (aVar.U0 != null) {
            x16 x16 = aVar.e1;
            x16.b();
            if (x16.X.d.a(fg7.c)) {
                aVar.e1.a(eg7.ON_DESTROY);
            }
        }
        aVar.a = 1;
        aVar.S0 = false;
        aVar.z0();
        if (aVar.S0) {
            new b(aVar, aVar.w()).c();
            aVar.D0 = false;
            this.a.L(aVar, false);
            aVar.T0 = null;
            aVar.U0 = null;
            aVar.e1 = null;
            aVar.f1.k((Object) null);
            aVar.A0 = false;
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onDestroyView()"));
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [n16, androidx.fragment.app.c] */
    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.a = -1;
        aVar.S0 = false;
        aVar.A0();
        aVar.Z0 = null;
        if (aVar.S0) {
            n16 n16 = aVar.H0;
            if (!n16.J) {
                n16.l();
                aVar.H0 = new c();
            }
            this.a.C(aVar, false);
            aVar.a = -1;
            aVar.G0 = null;
            aVar.I0 = null;
            aVar.F0 = null;
            if (!aVar.x0 || aVar.q0()) {
                FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
                boolean z = true;
                if (fragmentManagerViewModel.b.containsKey(aVar.Y) && fragmentManagerViewModel.e) {
                    z = fragmentManagerViewModel.f;
                }
                if (!z) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            aVar.n0();
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        a aVar = this.c;
        if (aVar.z0 && aVar.A0 && !aVar.D0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = null;
            Bundle bundle3 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater C0 = aVar.C0(bundle3);
            aVar.Z0 = C0;
            aVar.Q0(C0, (ViewGroup) null, bundle3);
            View view = aVar.U0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aVar.U0.setTag(pxb.fragment_container_view_tag, aVar);
                if (aVar.M0) {
                    aVar.U0.setVisibility(8);
                }
                Bundle bundle4 = aVar.b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                }
                aVar.O0(aVar.U0, bundle2);
                aVar.H0.u(2);
                this.a.K(aVar, aVar.U0, false);
                aVar.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        yd4 yd4;
        ViewGroup viewGroup2;
        yd4 yd42;
        ViewGroup viewGroup3;
        yd4 yd43;
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (!z) {
            try {
                this.d = true;
                boolean z2 = false;
                while (true) {
                    int d2 = d();
                    int i = aVar.a;
                    int i2 = 3;
                    if (d2 != i) {
                        if (d2 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    aVar.a = 1;
                                    break;
                                case 2:
                                    aVar.A0 = false;
                                    aVar.a = 2;
                                    break;
                                case 3:
                                    if (Log.isLoggable("FragmentManager", 3)) {
                                        Objects.toString(aVar);
                                    }
                                    if (aVar.U0 != null && aVar.c == null) {
                                        p();
                                    }
                                    if (!(aVar.U0 == null || (viewGroup2 = aVar.T0) == null)) {
                                        aVar.f0().K();
                                        Object tag = viewGroup2.getTag(pxb.special_effects_controller_view_tag);
                                        if (tag instanceof yd4) {
                                            yd42 = (yd4) tag;
                                        } else {
                                            yd42 = new yd4(viewGroup2);
                                            viewGroup2.setTag(pxb.special_effects_controller_view_tag, yd42);
                                        }
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            yd42.getClass();
                                            Objects.toString(aVar);
                                        }
                                        yd42.d(1, 3, this);
                                    }
                                    aVar.a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    aVar.a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(aVar.U0 == null || (viewGroup3 = aVar.T0) == null)) {
                                        aVar.f0().K();
                                        Object tag2 = viewGroup3.getTag(pxb.special_effects_controller_view_tag);
                                        if (tag2 instanceof yd4) {
                                            yd43 = (yd4) tag2;
                                        } else {
                                            yd43 = new yd4(viewGroup3);
                                            viewGroup3.setTag(pxb.special_effects_controller_view_tag, yd43);
                                        }
                                        int visibility = aVar.U0.getVisibility();
                                        if (visibility == 0) {
                                            i2 = 2;
                                        } else if (visibility == 4) {
                                            i2 = 4;
                                        } else if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            yd43.getClass();
                                            Objects.toString(aVar);
                                        }
                                        yd43.d(i2, 2, this);
                                    }
                                    aVar.a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    aVar.a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z2 = true;
                    } else {
                        if (!z2 && i == -1 && aVar.x0 && !aVar.q0()) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
                            fragmentManagerViewModel.getClass();
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            fragmentManagerViewModel.f(aVar.Y, true);
                            fVar.h(this);
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            aVar.n0();
                        }
                        if (aVar.Y0) {
                            if (!(aVar.U0 == null || (viewGroup = aVar.T0) == null)) {
                                aVar.f0().K();
                                Object tag3 = viewGroup.getTag(pxb.special_effects_controller_view_tag);
                                if (tag3 instanceof yd4) {
                                    yd4 = (yd4) tag3;
                                } else {
                                    yd4 = new yd4(viewGroup);
                                    viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4);
                                }
                                if (aVar.M0) {
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        yd4.getClass();
                                        Objects.toString(aVar);
                                    }
                                    yd4.d(3, 1, this);
                                } else {
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        yd4.getClass();
                                        Objects.toString(aVar);
                                    }
                                    yd4.d(2, 1, this);
                                }
                            }
                            c cVar = aVar.F0;
                            if (cVar != null && aVar.w0 && c.M(aVar)) {
                                cVar.G = true;
                            }
                            aVar.Y0 = false;
                            aVar.D0(aVar.M0);
                            aVar.H0.o();
                        }
                        this.d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.H0.u(5);
        if (aVar.U0 != null) {
            aVar.e1.a(eg7.ON_PAUSE);
        }
        aVar.d1.d(eg7.ON_PAUSE);
        aVar.a = 6;
        aVar.S0 = false;
        aVar.H0();
        if (aVar.S0) {
            this.a.D(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (aVar.b.getBundle("savedInstanceState") == null) {
                aVar.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                aVar.c = aVar.b.getSparseParcelableArray("viewState");
                aVar.o = aVar.b.getBundle("viewRegistryState");
                r16 r16 = (r16) aVar.b.getParcelable("state");
                if (r16 != null) {
                    aVar.t0 = r16.x0;
                    aVar.u0 = r16.y0;
                    Boolean bool = aVar.X;
                    if (bool != null) {
                        aVar.W0 = bool.booleanValue();
                        aVar.X = null;
                    } else {
                        aVar.W0 = r16.z0;
                    }
                }
                if (!aVar.W0) {
                    aVar.V0 = true;
                }
            } catch (BadParcelableException e2) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e2);
            }
        }
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        w06 w06 = aVar.X0;
        View view = w06 == null ? null : w06.k;
        if (view != null) {
            if (view != aVar.U0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == aVar.U0) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                Objects.toString(aVar);
                Objects.toString(aVar.U0.findFocus());
            }
        }
        aVar.a0().k = null;
        aVar.H0.S();
        aVar.H0.A(true);
        aVar.a = 7;
        aVar.S0 = false;
        aVar.K0();
        if (aVar.S0) {
            gh7 gh7 = aVar.d1;
            eg7 eg7 = eg7.ON_RESUME;
            gh7.d(eg7);
            if (aVar.U0 != null) {
                aVar.e1.a(eg7);
            }
            n16 n16 = aVar.H0;
            n16.H = false;
            n16.I = false;
            n16.O.g = false;
            n16.u(7);
            this.a.G(aVar, false);
            this.b.i(aVar.Y, (Bundle) null);
            aVar.b = null;
            aVar.c = null;
            aVar.o = null;
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        a aVar = this.c;
        if (aVar.a == -1 && (bundle = aVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new r16(aVar));
        if (aVar.a > -1) {
            Bundle bundle3 = new Bundle();
            aVar.L0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.H(aVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            aVar.h1.u(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle a0 = aVar.H0.a0();
            if (!a0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", a0);
            }
            if (aVar.U0 != null) {
                p();
            }
            SparseArray sparseArray = aVar.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = aVar.o;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = aVar.Z;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        a aVar = this.c;
        if (aVar.U0 != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
                Objects.toString(aVar.U0);
            }
            SparseArray sparseArray = new SparseArray();
            aVar.U0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                aVar.c = sparseArray;
            }
            Bundle bundle = new Bundle();
            aVar.e1.Y.u(bundle);
            if (!bundle.isEmpty()) {
                aVar.o = bundle;
            }
        }
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.H0.S();
        aVar.H0.A(true);
        aVar.a = 5;
        aVar.S0 = false;
        aVar.M0();
        if (aVar.S0) {
            gh7 gh7 = aVar.d1;
            eg7 eg7 = eg7.ON_START;
            gh7.d(eg7);
            if (aVar.U0 != null) {
                aVar.e1.a(eg7);
            }
            n16 n16 = aVar.H0;
            n16.H = false;
            n16.I = false;
            n16.O.g = false;
            n16.u(5);
            this.a.I(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        n16 n16 = aVar.H0;
        n16.I = true;
        n16.O.g = true;
        n16.u(4);
        if (aVar.U0 != null) {
            aVar.e1.a(eg7.ON_STOP);
        }
        aVar.d1.d(eg7.ON_STOP);
        aVar.a = 4;
        aVar.S0 = false;
        aVar.N0();
        if (aVar.S0) {
            this.a.J(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(rh4.i("Fragment ", aVar, " did not call through to super.onStop()"));
    }

    public e(qz7 qz7, f fVar, ClassLoader classLoader, f16 f16, Bundle bundle) {
        this.a = qz7;
        this.b = fVar;
        r16 r16 = (r16) bundle.getParcelable("state");
        a a2 = f16.a(r16.a);
        a2.Y = r16.b;
        a2.z0 = r16.c;
        a2.B0 = r16.o;
        a2.C0 = true;
        a2.J0 = r16.X;
        a2.K0 = r16.Y;
        a2.L0 = r16.Z;
        a2.O0 = r16.s0;
        a2.x0 = r16.t0;
        a2.N0 = r16.u0;
        a2.M0 = r16.v0;
        a2.c1 = fg7.values()[r16.w0];
        a2.t0 = r16.x0;
        a2.u0 = r16.y0;
        a2.W0 = r16.z0;
        this.c = a2;
        a2.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.X0(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(a2);
        }
    }

    public e(qz7 qz7, f fVar, a aVar, Bundle bundle) {
        this.a = qz7;
        this.b = fVar;
        this.c = aVar;
        aVar.c = null;
        aVar.o = null;
        aVar.E0 = 0;
        aVar.A0 = false;
        aVar.w0 = false;
        a aVar2 = aVar.s0;
        aVar.t0 = aVar2 != null ? aVar2.Y : null;
        aVar.s0 = null;
        aVar.b = bundle;
        aVar.Z = bundle.getBundle("arguments");
    }
}
