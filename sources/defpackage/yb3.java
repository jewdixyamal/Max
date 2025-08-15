package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: yb3  reason: default package */
public abstract class yb3 extends Activity implements ynf, pi6, isc, j3a, i8, m3a, a4a, r3a, s3a, yq8, eh7, gc7 {
    public static final /* synthetic */ int D0 = 0;
    public boolean A0;
    public final khe B0;
    public final khe C0;
    public xnf X;
    public final vb3 Y;
    public final khe Z;
    public final gh7 a = new gh7(this);
    public final jt3 b = new jt3(0);
    public final pl8 c;
    public final td o;
    public final wb3 s0;
    public final CopyOnWriteArrayList t0;
    public final CopyOnWriteArrayList u0;
    public final CopyOnWriteArrayList v0;
    public final CopyOnWriteArrayList w0;
    public final CopyOnWriteArrayList x0;
    public final CopyOnWriteArrayList y0;
    public boolean z0;

    public yb3() {
        b bVar = (b) this;
        this.c = new pl8((Runnable) new ob3(bVar, 0));
        td tdVar = new td((isc) this);
        this.o = tdVar;
        this.Y = new vb3(bVar);
        this.Z = new khe(new xb3(bVar, 2));
        new AtomicInteger();
        this.s0 = new wb3(bVar);
        this.t0 = new CopyOnWriteArrayList();
        this.u0 = new CopyOnWriteArrayList();
        this.v0 = new CopyOnWriteArrayList();
        this.w0 = new CopyOnWriteArrayList();
        this.x0 = new CopyOnWriteArrayList();
        this.y0 = new CopyOnWriteArrayList();
        gh7 gh7 = this.a;
        if (gh7 != null) {
            gh7.a(new pb3(bVar, 0));
            this.a.a(new pb3(bVar, 1));
            this.a.a(new fdc(1, bVar));
            tdVar.s();
            z7.k(this);
            ((mm) tdVar.o).f("android:support:activity-result", new qb3(0, bVar));
            z(new rb3(bVar, 0));
            this.B0 = new khe(new xb3(bVar, 0));
            this.C0 = new khe(new xb3(bVar, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
    }

    public final void A(d16 d16) {
        this.w0.add(d16);
    }

    public final void B(d16 d16) {
        this.x0.add(d16);
    }

    public final void C(d16 d16) {
        this.u0.add(d16);
    }

    public final i3a E() {
        return (i3a) this.C0.getValue();
    }

    public final void F() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(eyb.view_tree_view_model_store_owner, this);
        wmd.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(gyb.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(gyb.report_drawn, this);
    }

    public final void G(Bundle bundle) {
        super.onCreate(bundle);
        int i = bhc.a;
        ju0.y(this);
    }

    public Object H() {
        return null;
    }

    public final void I(Bundle bundle) {
        fg7 fg7 = fg7.c;
        gh7 gh7 = this.a;
        gh7.c("setCurrentState");
        gh7.e(fg7);
        super.onSaveInstanceState(bundle);
    }

    public final void J(e16 e16) {
        pl8 pl8 = this.c;
        ((CopyOnWriteArrayList) pl8.b).remove(e16);
        au1.r(((HashMap) pl8.o).remove(e16));
        ((Runnable) pl8.c).run();
    }

    public final void K(d16 d16) {
        this.t0.remove(d16);
    }

    public final void L(d16 d16) {
        this.w0.remove(d16);
    }

    public final void N(d16 d16) {
        this.x0.remove(d16);
    }

    public final void P(d16 d16) {
        this.u0.remove(d16);
    }

    public final gh7 Q() {
        return this.a;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = zmf.a;
        return l(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = zmf.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final vnf o() {
        return (vnf) this.B0.getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.s0.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        E().d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.o.t(bundle);
        jt3 jt3 = this.b;
        jt3.b = this;
        Iterator it = ((CopyOnWriteArraySet) jt3.a).iterator();
        while (it.hasNext()) {
            ((n3a) it.next()).a();
        }
        G(bundle);
        int i = bhc.a;
        ju0.y(this);
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((e16) it.next()).a.k(menu, menuInflater);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((e16) it.next()).a.p(menuItem)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    public final void onMultiWindowModeChanged(boolean z) {
        if (!this.z0) {
            Iterator it = this.w0.iterator();
            while (it.hasNext()) {
                ((tj3) it.next()).accept(new lg9(z));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((e16) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        if (!this.A0) {
            Iterator it = this.x0.iterator();
            while (it.hasNext()) {
                ((tj3) it.next()).accept(new tza(z));
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((e16) it.next()).a.t(menu);
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.s0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [ub3, java.lang.Object] */
    public final Object onRetainNonConfigurationInstance() {
        ub3 ub3;
        Object H = H();
        xnf xnf = this.X;
        if (xnf == null && (ub3 = (ub3) getLastNonConfigurationInstance()) != null) {
            xnf = ub3.b;
        }
        if (xnf == null && H == null) {
            return null;
        }
        ? obj = new Object();
        obj.a = H;
        obj.b = xnf;
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
        gh7 gh7 = this.a;
        if (gh7 instanceof gh7) {
            fg7 fg7 = fg7.c;
            gh7.c("setCurrentState");
            gh7.e(fg7);
        }
        I(bundle);
        this.o.u(bundle);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(Integer.valueOf(i));
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final wh9 p() {
        wh9 wh9 = new wh9(0);
        if (getApplication() != null) {
            wh9.a(unf.d, getApplication());
        }
        wh9.a(z7.e, this);
        wh9.a(z7.f, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            wh9.a(z7.g, extras);
        }
        return wh9;
    }

    public final void reportFullyDrawn() {
        try {
            if (hye.a()) {
                Trace.beginSection(c37.F("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            j56 j56 = (j56) this.Z.getValue();
            synchronized (j56.b) {
                j56.c = true;
                Iterator it = j56.d.iterator();
                while (it.hasNext()) {
                    ((k56) it.next()).invoke();
                }
                j56.d.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void s(e16 e16) {
        pl8 pl8 = this.c;
        ((CopyOnWriteArrayList) pl8.b).add(e16);
        ((Runnable) pl8.c).run();
    }

    public void setContentView(int i) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final void t(tj3 tj3) {
        this.t0.add(tj3);
    }

    public final xnf w() {
        if (getApplication() != null) {
            if (this.X == null) {
                ub3 ub3 = (ub3) getLastNonConfigurationInstance();
                if (ub3 != null) {
                    this.X = ub3.b;
                }
                if (this.X == null) {
                    this.X = new xnf();
                }
            }
            return this.X;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
    }

    public final mm y() {
        return (mm) this.o.o;
    }

    public final void z(n3a n3a) {
        jt3 jt3 = this.b;
        if (((Context) jt3.b) != null) {
            n3a.a();
        }
        ((CopyOnWriteArraySet) jt3.a).add(n3a);
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.z0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.z0 = false;
            Iterator it = this.w0.iterator();
            while (it.hasNext()) {
                ((tj3) it.next()).accept(new lg9(z));
            }
        } catch (Throwable th) {
            this.z0 = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.A0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.A0 = false;
            Iterator it = this.x0.iterator();
            while (it.hasNext()) {
                ((tj3) it.next()).accept(new tza(z));
            }
        } catch (Throwable th) {
            this.A0 = false;
            throw th;
        }
    }

    public void setContentView(View view) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
