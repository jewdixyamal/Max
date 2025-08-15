package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.android.MainActivity;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: q5  reason: default package */
public abstract class q5 extends im implements ase {
    public y7g K0;
    public c8 L0;
    public gua M0;
    public sme N0;
    public int O0;
    public boolean P0;
    public final HashSet Q0 = new HashSet();
    public p5 R0;
    public long S0 = 0;
    public HashMap T0;

    public static void X(sme sme, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar instanceof FrgBase) {
                FrgBase frgBase = (FrgBase) aVar;
                frgBase.r1 = sme;
                View view = frgBase.U0;
                if (frgBase instanceof wme) {
                    ((wme) frgBase).z(sme);
                } else if (view != null) {
                    frgBase.i1();
                }
            } else if (aVar instanceof wme) {
                ((wme) aVar).z(sme);
            }
            X(sme, aVar.c0().c.f());
        }
    }

    public final Object H() {
        return this.T0;
    }

    public void U() {
        super.U();
        hm9.m("q5", "onResumeFragments: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        this.P0 = true;
        if (((f5a) ((y8a) ((ed3) this.K0.b)).getAccessor().c(f5a.class)).d()) {
            cy7 r = ((y8a) ((ed3) this.K0.b)).r();
            HashSet hashSet = this.Q0;
            int i = tu0.m;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                r.c((pi0) it.next());
            }
            hashSet.clear();
        } else {
            d0();
        }
        if (this.M0 != null) {
            this.M0 = null;
        }
        c8 c8Var = this.L0;
        if (c8Var != null) {
            c0(c8Var.a, c8Var.b, c8Var.c);
            this.L0 = null;
        }
    }

    public final void Y() {
        super.finish();
        if (((y8a) ((ed3) this.K0.b)).n().c.u()) {
            overridePendingTransition(0, 17432577);
        }
    }

    public abstract String Z();

    public void a0() {
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        super.addContentView(view, layoutParams);
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            String r = ((y8a) vl.b()).n().a.r();
            if (!TextUtils.isEmpty(r)) {
                Context baseContext = getBaseContext();
                int i = lz7.g;
                configuration.setTo(baseContext.getResources().getConfiguration());
                Locale locale = new Locale(r);
                Locale.setDefault(locale);
                configuration.fontScale = 0.0f;
                configuration.setLocale(locale);
            }
        }
        super.applyOverrideConfiguration(configuration);
    }

    public final void attachBaseContext(Context context) {
        String r = ((y8a) vl.b()).n().a.r();
        if (!TextUtils.isEmpty(r)) {
            int i = lz7.g;
            if (!oag.t(r)) {
                Locale locale = new Locale(r);
                Locale.setDefault(locale);
                Configuration configuration = new Configuration();
                configuration.fontScale = 0.0f;
                configuration.setLocale(locale);
                configuration.setLayoutDirection(locale);
                context = context.createConfigurationContext(configuration);
            }
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
    }

    public final void b0(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(u().c ? 3846 : 3862);
    }

    public void c0(int i, int i2, Intent intent) {
    }

    public void d0() {
        hm9.k("q5", "onLogout " + getLocalClassName());
        setResult(0);
        finishAffinity();
    }

    public final void e0() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(eyb.view_tree_view_model_store_owner, this);
        wmd.G(getWindow().getDecorView(), this);
    }

    public final void f0(int i) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public void finish() {
        super.finish();
        if (!((y8a) ((ed3) this.K0.b)).n().c.u()) {
            overridePendingTransition(0, 0);
        }
    }

    public final void g0(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(u().c ? 1792 : 1808);
    }

    public final Resources.Theme getTheme() {
        int i;
        Resources.Theme theme = super.getTheme();
        sme u = u();
        if (!(u == null || !u.c || (i = this.O0) == kpc.c || i == kpc.d || i == kpc.e || i == kpc.f || i == kpc.b)) {
            theme.applyStyle(kpc.a, true);
        }
        return theme;
    }

    public boolean h0() {
        return this instanceof MainActivity;
    }

    public final void i0() {
        if (((y8a) ((ed3) this.K0.b)).n().c.d("app.pinLock.screenshotEnabled", true)) {
            getWindow().clearFlags(8192);
        } else {
            getWindow().addFlags(8192);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.P0) {
            c0(i, i2, intent);
        } else {
            this.L0 = new c8(i, i2, intent);
        }
    }

    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        this.O0 = i;
        super.onApplyThemeResource(theme, i, z);
    }

    public void onBackPressed() {
        View view;
        if (this.P0) {
            for (a aVar : S().c.f()) {
                if (aVar != null && aVar.o0() && !aVar.p0() && (view = aVar.U0) != null && view.getWindowToken() != null && aVar.U0.getVisibility() == 0 && (aVar instanceof FrgBase) && ((FrgBase) aVar).n1()) {
                    return;
                }
            }
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        q7g q7g = (q7g) ((y8a) vl.b()).getAccessor().c(q7g.class);
        q7g.getClass();
        hm9.m("q7g", "enableWorkManager", new Object[0]);
        q7g.b.d();
        ub3 ub3 = (ub3) getLastNonConfigurationInstance();
        Object obj = ub3 != null ? ub3.a : null;
        if (obj == null || !(obj instanceof Map)) {
            this.T0 = new HashMap();
        } else {
            this.T0 = (HashMap) obj;
        }
        this.K0 = new y7g(vl.b());
        this.N0 = ((tme) ((y8a) vl.b()).getAccessor().c(tme.class)).c();
        S().p.add(new o5(this));
        i0();
        super.onCreate(bundle);
        hm9.m("q5", "onCreate: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!((y8a) ((ed3) this.K0.b)).n().c.u()) {
            overridePendingTransition(0, 0);
        }
        if (bundle != null) {
            tu0.u(bundle, this.Q0);
        }
        ((y8a) ((ed3) this.K0.b)).r().d(this);
        this.R0 = new p5(this);
        ((y8a) ((ed3) this.K0.b)).r().d(this.R0);
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            ((y8a) ((ed3) this.K0.b)).r().f(this);
            ((y8a) ((ed3) this.K0.b)).r().f(this.R0);
        } catch (Exception unused) {
        }
        hm9.m("q5", "onDestroy: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!isChangingConfigurations()) {
            for (Object next : this.T0.values()) {
                if (next instanceof cn4) {
                    ((cn4) next).c = 0;
                }
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (a aVar : S().c.f()) {
            if (aVar instanceof hc7) {
                ((hc7) aVar).B0(i, keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        hm9.k("q5", "onNewIntent: intent =" + intent + " " + getLocalClassName() + "@" + hashCode());
        super.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        hm9.m("q5", "onPause: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        this.P0 = false;
        if (!TextUtils.isEmpty(Z())) {
            ((y8a) ((ed3) this.K0.b)).b().l(SystemClock.elapsedRealtime() - this.S0, Z());
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        wmd.z(this, strArr, iArr);
        if (!this.P0) {
            this.M0 = new gua(i, strArr, iArr);
        }
        if (Arrays.asList(strArr).contains("android.permission.READ_CONTACTS") && wmd.j(this, wmd.e)) {
            ((y8a) ((ed3) this.K0.b)).p().getClass();
            ((jva) ((bva) ((jyc) jke.b()).getAccessor().c(bva.class))).c();
        }
    }

    public void onResume() {
        super.onResume();
        this.S0 = SystemClock.elapsedRealtime();
        hm9.m("q5", "onResume: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!TextUtils.isEmpty(Z())) {
            hm9.m("q5", "sendScreen: onResume " + Z(), new Object[0]);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HashSet hashSet = this.Q0;
        int i = tu0.m;
        hm9.k("tu0", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    public void onStart() {
        super.onStart();
        hm9.k("q5", "onStart: " + getLocalClassName() + "@" + hashCode());
    }

    public void onStop() {
        super.onStop();
        hm9.k("q5", "onStop: " + getLocalClassName() + "@" + hashCode());
    }

    public void onUserLeaveHint() {
        for (a aVar : S().c.f()) {
            if (aVar instanceof FrgBase) {
                ((FrgBase) aVar).getClass();
            }
        }
        super.onUserLeaveHint();
    }

    public final void setContentView(int i) {
        e0();
        super.setContentView(i);
    }

    public sme u() {
        return this.N0;
    }

    public void setContentView(View view) {
        e0();
        super.setContentView(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        super.setContentView(view, layoutParams);
    }
}
