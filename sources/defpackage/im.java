package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* renamed from: im  reason: default package */
public abstract class im extends b implements km {
    public dn J0;

    public im() {
        ((mm) this.o.o).f("androidx:appcompat", new gm(this));
        z(new hm(this));
    }

    public final rm V() {
        if (this.J0 == null) {
            qm qmVar = rm.a;
            this.J0 = new dn(this, (Window) null, this, this);
        }
        return this.J0;
    }

    public final void W() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(eyb.view_tree_view_model_store_owner, this);
        wmd.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(gyb.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        dn dnVar = (dn) V();
        dnVar.t();
        ((ViewGroup) dnVar.L0.findViewById(16908290)).addView(view, layoutParams);
        dnVar.x0.a(dnVar.w0.getCallback());
    }

    public void attachBaseContext(Context context) {
        dn dnVar = (dn) V();
        dnVar.Z0 = true;
        int i = dnVar.d1;
        if (i == -100) {
            i = rm.b;
        }
        int A = dnVar.A(context, i);
        if (rm.b(context) && rm.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (rm.t0) {
                    try {
                        yq7 yq7 = rm.c;
                        if (yq7 == null) {
                            if (rm.o == null) {
                                rm.o = yq7.a(od2.Q(context));
                            }
                            if (!rm.o.a.a.isEmpty()) {
                                rm.c = rm.o;
                            }
                        } else if (!yq7.equals(rm.o)) {
                            yq7 yq72 = rm.c;
                            rm.o = yq72;
                            od2.O(context, yq72.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!rm.Y) {
                rm.a.execute(new nm(context, 0));
            }
        }
        yq7 m = dn.m(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(dn.q(context, A, m, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof du3) {
            try {
                ((du3) context).a(dn.q(context, A, m, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (dn.u1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    vm.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration q = dn.q(context, A, m, configuration, true);
            du3 du3 = new du3(context, s2c.Theme_AppCompat_Empty);
            du3.a(q);
            try {
                if (context.getTheme() != null) {
                    uic.a(du3.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = du3;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        dn dnVar = (dn) V();
        dnVar.x();
        ote ote = dnVar.z0;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (ote == null || !ote.a()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        dn dnVar = (dn) V();
        dnVar.x();
        ote ote = dnVar.z0;
        if (keyCode != 82 || ote == null || !ote.M(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final View findViewById(int i) {
        dn dnVar = (dn) V();
        dnVar.t();
        return dnVar.w0.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        dn dnVar = (dn) V();
        if (dnVar.A0 == null) {
            dnVar.x();
            ote ote = dnVar.z0;
            dnVar.A0 = new ude(ote != null ? ote.y() : dnVar.v0);
        }
        return dnVar.A0;
    }

    public final Resources getResources() {
        int i = tbf.a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        V().a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dn dnVar = (dn) V();
        if (dnVar.Q0 && dnVar.K0) {
            dnVar.x();
            ote ote = dnVar.z0;
            if (ote != null) {
                ote.H();
            }
        }
        gn a = gn.a();
        Context context = dnVar.v0;
        synchronized (a) {
            oic oic = a.a;
            synchronized (oic) {
                wv7 wv7 = (wv7) oic.b.get(context);
                if (wv7 != null) {
                    wv7.a();
                }
            }
        }
        dnVar.c1 = new Configuration(dnVar.v0.getResources().getConfiguration());
        dnVar.k(false, false);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        V().d();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        dn dnVar = (dn) V();
        dnVar.x();
        ote ote = dnVar.z0;
        if (menuItem.getItemId() != 16908332 || ote == null || (ote.q() & 4) == 0) {
            return false;
        }
        Intent I = od2.I(this);
        if (I == null) {
            return false;
        }
        if (shouldUpRecreateTask(I)) {
            ArrayList arrayList = new ArrayList();
            Intent I2 = od2.I(this);
            if (I2 == null) {
                I2 = od2.I(this);
            }
            if (I2 != null) {
                ComponentName component = I2.getComponent();
                if (component == null) {
                    component = I2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent J = od2.J(this, component);
                    while (J != null) {
                        arrayList.add(size, J);
                        J = od2.J(this, J.getComponent());
                    }
                    arrayList.add(I2);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(I);
            return true;
        }
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((dn) V()).t();
    }

    public final void onPostResume() {
        super.onPostResume();
        dn dnVar = (dn) V();
        dnVar.x();
        ote ote = dnVar.z0;
        if (ote != null) {
            ote.Q(true);
        }
    }

    public void onStart() {
        super.onStart();
        ((dn) V()).k(true, false);
    }

    public void onStop() {
        super.onStop();
        dn dnVar = (dn) V();
        dnVar.x();
        ote ote = dnVar.z0;
        if (ote != null) {
            ote.Q(false);
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        V().j(charSequence);
    }

    public final void openOptionsMenu() {
        dn dnVar = (dn) V();
        dnVar.x();
        ote ote = dnVar.z0;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (ote == null || !ote.N()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        W();
        V().g(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((dn) V()).e1 = i;
    }

    public void setContentView(View view) {
        W();
        V().h(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        V().i(view, layoutParams);
    }
}
