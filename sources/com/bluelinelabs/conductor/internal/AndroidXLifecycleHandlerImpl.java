package com.bluelinelabs.conductor.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.a;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bluelinelabs/conductor/internal/AndroidXLifecycleHandlerImpl;", "Landroidx/fragment/app/a;", "Lwg7;", "Lyg7;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidXLifecycleHandlerImpl extends a implements wg7, yg7 {
    public final xg7 l1 = new xg7(true);

    public AndroidXLifecycleHandlerImpl() {
        a1();
        Y0(true);
    }

    public final void A(String str, Intent intent, int i, Bundle bundle) {
        f1(i, str);
        d1(intent, i, bundle);
    }

    public final void A0() {
        this.S0 = true;
        c().e = false;
        Activity activity = c().b;
        if (activity != null) {
            c54.r(this, activity.isChangingConfigurations());
        }
    }

    public final void B(int i, String str) {
        f1(i, str);
    }

    public final void E(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    public final boolean G0(MenuItem menuItem) {
        return c54.C(this, menuItem, new ie(this, menuItem));
    }

    public final void H(Activity activity) {
        c54.F(this, activity, this);
    }

    public final void I0(Menu menu) {
        for (b8 x : c54.w(this)) {
            x.x(menu);
        }
    }

    public final void J0(int i, String[] strArr, int[] iArr) {
        c54.D(this, i, strArr, iArr);
    }

    public final void L0(Bundle bundle) {
        c54.E(this, bundle);
    }

    public final List U() {
        return x53.D0(this.l1.j.values());
    }

    public final Activity a() {
        return this.l1.b;
    }

    public final xg7 c() {
        return this.l1;
    }

    public final b8 e(w12 w12, Bundle bundle) {
        return c54.v(this, w12, bundle, this);
    }

    public final void e1() {
        c54.B(this);
    }

    public final void f1(int i, String str) {
        c().h.put(i, str);
    }

    public final void g(String str) {
        c54.H(this, str);
    }

    public final void j(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    public final void l(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        je jeVar = new je(this, intentSender, i, intent, i2, i3, i4, bundle, 0);
        String str2 = str;
        int i5 = i;
        f1(i, str);
        jeVar.invoke();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c54.P(this, activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        zg7.a.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        c54.Q(this, activity);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        if (c().b == activity && !activity.isChangingConfigurations()) {
            e1();
        }
    }

    public final void onActivityResumed(Activity activity) {
        c54.R(this, activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c54.S(this, activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
        c54.T(this, activity);
    }

    public final void onActivityStopped(Activity activity) {
        c54.U(this, activity);
    }

    public final void s0(int i, int i2, Intent intent) {
        super.s0(i, i2, intent);
        c54.y(this, i, i2, intent);
    }

    public final void u0(Context context) {
        super.u0(context);
        c54.z(this, context);
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        c54.A(this, bundle);
    }

    public final void w0(Menu menu, MenuInflater menuInflater) {
        for (b8 v : c54.w(this)) {
            v.v(menu, menuInflater);
        }
    }

    public final void y0() {
        this.S0 = true;
        c54.B(this);
    }
}
