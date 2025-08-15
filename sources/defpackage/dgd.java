package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: dgd  reason: default package */
public final /* synthetic */ class dgd implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ dgd(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        SettingsListScreen settingsListScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7Arr = SettingsListScreen.B0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(lha.g);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                v3c.y(new ep9(3, (Continuation) null, 1), fmVar);
                settingsListScreen.y0 = fmVar;
                fmVar.setLiftOnScroll(true);
                dgd dgd = new dgd(settingsListScreen, 1);
                w53 w53 = new w53(fmVar.getContext());
                w53.setId(lha.e);
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53.setLayoutParams(dmVar);
                w53.setTitleEnabled(false);
                dgd.invoke(w53);
                fmVar.addView(w53);
                coordinatorLayout.addView(fmVar);
                RecyclerView o0 = settingsListScreen.o0(24);
                rw3 rw3 = new rw3(-1, -1);
                rw3.b(new AppBarLayout$ScrollingViewBehavior());
                o0.setLayoutParams(rw3);
                o0.setPaddingRelative(o0.getPaddingStart(), o0.getPaddingTop(), o0.getPaddingEnd(), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
                o0.setClipToPadding(false);
                o0.setItemAnimator((mdc) null);
                o0.setClipChildren(false);
                o0.j(new kq(9));
                o0.j(new kq(10));
                coordinatorLayout.addView(o0);
                return e5f;
            case 1:
                w53 w532 = (w53) obj;
                bc7[] bc7Arr2 = SettingsListScreen.B0;
                dgd dgd2 = new dgd(settingsListScreen, 2);
                Toolbar toolbar = new Toolbar(w532.getContext(), (AttributeSet) null);
                toolbar.setId(lha.h);
                t53 t53 = new t53(-1, -2);
                t53.a = 1;
                toolbar.setLayoutParams(t53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                dgd2.invoke(toolbar);
                w532.addView(toolbar);
                w532.addView(new wid(w532.getContext()));
                return e5f;
            case 2:
                Toolbar toolbar2 = (Toolbar) obj;
                bc7[] bc7Arr3 = SettingsListScreen.B0;
                cla cla = new cla(toolbar2.getContext(), 6);
                cla.setId(lha.i);
                cla.setForm(uka.a);
                cla.setRightActions(new pka((yka) null, new vka(woc.F, new dgd(settingsListScreen, 3))));
                cla.setLeftActions(new oka(new vka(woc.N1, new dgd(settingsListScreen, 4))));
                toolbar2.addView(cla);
                return e5f;
            case 3:
                View view = (View) obj;
                bc7[] bc7Arr4 = SettingsListScreen.B0;
                add q0 = settingsListScreen.q0();
                Long t = q0.t();
                if (t != null) {
                    pnf.o(q0.z0, new wgd(t.longValue()));
                }
                return e5f;
            default:
                View view2 = (View) obj;
                ((l67) settingsListScreen.X.getValue()).b();
                cgd.c.P1().b(":invite/qr", (Bundle) null);
                return e5f;
        }
    }
}
