package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;

/* renamed from: ac3  reason: default package */
public class ac3 extends Dialog implements eh7, j3a, isc {
    public gh7 a;
    public final td b = new td((isc) this);
    public final i3a c = new i3a(new cu1(16, this));

    public ac3(Context context, int i) {
        super(context, i);
    }

    public static void a(ac3 ac3) {
        super.onBackPressed();
    }

    public final gh7 Q() {
        return b();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addContentView(view, layoutParams);
    }

    public final gh7 b() {
        gh7 gh7 = this.a;
        if (gh7 != null) {
            return gh7;
        }
        gh7 gh72 = new gh7(this);
        this.a = gh72;
        return gh72;
    }

    public final void c() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(gyb.view_tree_on_back_pressed_dispatcher_owner, this);
        wmd.G(getWindow().getDecorView(), this);
    }

    public final void onBackPressed() {
        this.c.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher k = getOnBackInvokedDispatcher();
            i3a i3a = this.c;
            i3a.e = k;
            i3a.e(i3a.g);
        }
        this.b.t(bundle);
        b().d(eg7.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.b.u(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        b().d(eg7.ON_RESUME);
    }

    public void onStop() {
        b().d(eg7.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    public final mm y() {
        return (mm) this.b.o;
    }

    public void setContentView(View view) {
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.setContentView(view, layoutParams);
    }
}
