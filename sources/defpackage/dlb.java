package defpackage;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.profile.ProfileScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: dlb  reason: default package */
public final /* synthetic */ class dlb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ dlb(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ProfileScreen profileScreen = this.b;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7Arr = ProfileScreen.D0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(wea.l1);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                endlessRecyclerView2.setItemAnimator((mdc) null);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                b bVar = new b();
                bVar.setMaxRecycledViews(1, 1);
                bVar.setMaxRecycledViews(2, 1);
                bVar.setMaxRecycledViews(128, 1);
                bVar.setMaxRecycledViews(64, 1);
                bVar.setMaxRecycledViews(32768, 1);
                bVar.setMaxRecycledViews(32, 1);
                bVar.setMaxRecycledViews(16, 1);
                bVar.setMaxRecycledViews(8, 1);
                bVar.setMaxRecycledViews(65536, 1);
                bVar.setMaxRecycledViews(4096, 1);
                endlessRecyclerView2.setRecycledViewPool(bVar);
                endlessRecyclerView2.setAdapter(new qlb(((iba) xcb.a.getAccessor().c(iba.class)).a(), profileScreen));
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setPager(new j81(profileScreen, 7));
                bi9 bi9 = k37.a;
                bi9 bi92 = new bi9(3);
                bi92.g(1);
                bi92.g(4);
                bi92.g(2);
                endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new y98((Object) endlessRecyclerView2, 25, (Object) bi92), (l) null, 12));
                float f = (float) 12;
                float f2 = (float) 24;
                yh9 y = ay7.y(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), 512, tu0.G(fk4.d().getDisplayMetrics().density * f), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
                int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
                int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
                int G3 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                float f3 = (float) 18;
                int G4 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int G5 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int G6 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int G7 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                int G8 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int G9 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int G10 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int G11 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                float f4 = (float) 6;
                float f5 = (float) 10;
                endlessRecyclerView2.j(new nz7(y, ay7.y(G, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11, 512, 0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 0, 4096, tu0.G(fk4.d().getDisplayMetrics().density * f4), 0), ay7.y(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density), 0, tu0.G(f4 * fk4.d().getDisplayMetrics().density), 0, 0, 0, 0, 0, 0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f5), 4096, tu0.G(fk4.d().getDisplayMetrics().density * f5), 512, tu0.G(fk4.d().getDisplayMetrics().density * f5), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density)), 1));
                linearLayout.addView(endlessRecyclerView2);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(wea.j1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
                layoutParams.leftMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
                layoutParams.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                layoutParams.topMargin = tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
                v3c.y(new mo2(3, (Continuation) null, 1), frameLayout);
                linearLayout.addView(frameLayout);
                return e5f;
            case 1:
                w53 w53 = (w53) obj;
                bc7[] bc7Arr2 = ProfileScreen.D0;
                ww9 ww9 = new ww9(profileScreen, 23);
                Toolbar toolbar = new Toolbar(w53.getContext(), (AttributeSet) null);
                t53 t53 = new t53(-1, -2);
                t53.a = 1;
                toolbar.setLayoutParams(t53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                ww9.invoke(toolbar);
                w53.addView(toolbar);
                ww9 ww92 = new ww9(profileScreen, 24);
                LinearLayout linearLayout2 = new LinearLayout(w53.getContext());
                linearLayout2.setId(wea.f1);
                t53 t532 = new t53(-1, -2);
                t532.a = 2;
                t532.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                linearLayout2.setLayoutParams(t532);
                linearLayout2.setOrientation(1);
                ww92.invoke(linearLayout2);
                w53.addView(linearLayout2);
                return e5f;
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7Arr3 = ProfileScreen.D0;
                dlb dlb = new dlb(profileScreen, 3);
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(wea.d1);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground((Drawable) null);
                dlb.invoke(fmVar);
                coordinatorLayout.addView(fmVar);
                NestedScrollView nestedScrollView = new NestedScrollView(coordinatorLayout.getContext(), (AttributeSet) null);
                rw3 rw3 = new rw3(-1, -1);
                rw3.b(new AppBarLayout$ScrollingViewBehavior());
                nestedScrollView.setLayoutParams(rw3);
                dlb dlb2 = new dlb(profileScreen, 0);
                LinearLayout linearLayout3 = new LinearLayout(nestedScrollView.getContext());
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout3.setOrientation(1);
                dlb2.invoke(linearLayout3);
                nestedScrollView.addView(linearLayout3);
                coordinatorLayout.addView(nestedScrollView);
                return e5f;
            default:
                fm fmVar2 = (fm) obj;
                bc7[] bc7Arr4 = ProfileScreen.D0;
                dlb dlb3 = new dlb(profileScreen, 1);
                w53 w532 = new w53(fmVar2.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w532.setLayoutParams(dmVar);
                w532.setTitleEnabled(false);
                dlb3.invoke(w532);
                fmVar2.addView(w532);
                return e5f;
        }
    }
}
