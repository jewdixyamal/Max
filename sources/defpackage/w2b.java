package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.List;

/* renamed from: w2b  reason: default package */
public final class w2b extends Fragment implements wg7, yg7 {
    public final xg7 a = new xg7(false);

    public w2b() {
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    public final void A(String str, Intent intent, int i, Bundle bundle) {
        h(i, str);
        startActivityForResult(intent, i, bundle);
    }

    public final void B(int i, String str) {
        h(i, str);
    }

    public final void E(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    public final void H(Activity activity) {
        c54.F(this, activity, this);
    }

    public final List U() {
        return x53.D0(this.a.j.values());
    }

    public final Activity a() {
        return this.a.b;
    }

    public final xg7 c() {
        return this.a;
    }

    public final b8 e(w12 w12, Bundle bundle) {
        return c54.v(this, w12, bundle, this);
    }

    public final void f() {
        c54.B(this);
    }

    public final void g(String str) {
        c54.H(this, str);
    }

    public final void h(int i, String str) {
        c().h.put(i, str);
    }

    public final void j(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    public final void l(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        je jeVar = new je(this, intentSender, i, intent, i2, i3, i4, bundle, 1);
        String str2 = str;
        int i5 = i;
        h(i, str);
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
            f();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        c54.y(this, i, i2, intent);
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

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        c54.z(this, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c54.A(this, bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        for (b8 v : c54.w(this)) {
            v.v(menu, menuInflater);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        c54.B(this);
    }

    public final void onDetach() {
        super.onDetach();
        c().e = false;
        Activity activity = c().b;
        if (activity != null) {
            c54.r(this, activity.isChangingConfigurations());
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return c54.C(this, menuItem, new v2b(this, 0, menuItem));
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        for (b8 x : c54.w(this)) {
            x.x(menu);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        c54.D(this, i, strArr, iArr);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c54.E(this, bundle);
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        Boolean bool;
        v2b v2b = new v2b(this, 1, str);
        for (b8 b8Var : c54.w(this)) {
            Iterator it = b8Var.a.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    bool = null;
                    continue;
                    break;
                }
                coc coc = (coc) u1Var.next();
                if (coc.a.didRequestPermission(str)) {
                    bool = Boolean.valueOf(coc.a.shouldShowRequestPermissionRationale(str));
                    continue;
                    break;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return ((Boolean) v2b.invoke()).booleanValue();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        c54.z(this, context);
    }
}
