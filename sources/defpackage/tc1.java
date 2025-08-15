package defpackage;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: tc1  reason: default package */
public final /* synthetic */ class tc1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ tc1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                b46 b46 = CallLinkInfoScreen.B0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(r7a.n);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground((Drawable) null);
                fmVar.setStateListAnimator((StateListAnimator) null);
                tc1 tc1 = new tc1(callLinkInfoScreen, 1);
                w53 w53 = new w53(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53.setLayoutParams(dmVar);
                w53.setTitleEnabled(false);
                tc1.invoke(w53);
                fmVar.addView(w53);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(r7a.l);
                rw3 rw3 = new rw3(-1, -1);
                rw3.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(callLinkInfoScreen.z0);
                recyclerView.setItemAnimator((mdc) null);
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new ync(15, callLinkInfoScreen), (l) null, 12));
                recyclerView.j(new sc1(0));
                coordinatorLayout.addView(recyclerView);
                OneMeButton oneMeButton = new OneMeButton(coordinatorLayout.getContext(), (AttributeSet) null);
                oneMeButton.setId(r7a.o);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.a);
                rw3 rw32 = new rw3(-1, -2);
                rw32.c = 81;
                float f = (float) 12;
                rw32.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                rw32.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                rw32.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                rw32.topMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(rw32);
                coordinatorLayout.addView(oneMeButton);
                v3c.y(new c3(callLinkInfoScreen, (Continuation) null, 3), coordinatorLayout);
                return e5f;
            default:
                w53 w532 = (w53) obj;
                b46 b462 = CallLinkInfoScreen.B0;
                k8 k8Var = new k8(callLinkInfoScreen, 25);
                Toolbar toolbar = new Toolbar(w532.getContext(), (AttributeSet) null);
                t53 t53 = new t53(-1, -2);
                t53.a = 1;
                toolbar.setLayoutParams(t53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                k8Var.invoke(toolbar);
                w532.addView(toolbar);
                k8 k8Var2 = new k8(callLinkInfoScreen, 26);
                LinearLayout linearLayout = new LinearLayout(w532.getContext());
                linearLayout.setId(r7a.p);
                t53 t532 = new t53(-1, -2);
                t532.a = 2;
                t532.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(t532);
                linearLayout.setOrientation(1);
                k8Var2.invoke(linearLayout);
                w532.addView(linearLayout);
                return e5f;
        }
    }
}
