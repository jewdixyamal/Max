package defpackage;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: zfb  reason: default package */
public final /* synthetic */ class zfb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ zfb(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = ProfileEditScreen.y0;
                i3a onBackPressedDispatcher = profileEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7Arr2 = ProfileEditScreen.y0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(sea.U);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground((Drawable) null);
                fmVar.setLiftOnScroll(true);
                fmVar.setStateListAnimator((StateListAnimator) null);
                zfb zfb = new zfb(profileEditScreen, 2);
                w53 w53 = new w53(fmVar.getContext());
                w53.setId(View.generateViewId());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53.setLayoutParams(dmVar);
                w53.setTitleEnabled(false);
                zfb.invoke(w53);
                fmVar.addView(w53);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(sea.r0);
                rw3 rw3 = new rw3(-1, -1);
                rw3.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setAdapter(profileEditScreen.X);
                recyclerView.setItemAnimator((mdc) null);
                int[] iArr = {2048, 128, 1, 2, 512, 131072};
                bi9 bi9 = k37.a;
                bi9 bi92 = new bi9(6);
                for (int i = 0; i < 6; i++) {
                    bi92.g(iArr[i]);
                }
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98((Object) profileEditScreen, 22, (Object) bi92), (l) null, 12));
                recyclerView.j(new nz7(0));
                coordinatorLayout.addView(recyclerView);
                return e5f;
            case 2:
                w53 w532 = (w53) obj;
                bc7[] bc7Arr3 = ProfileEditScreen.y0;
                zfb zfb2 = new zfb(profileEditScreen, 3);
                Toolbar toolbar = new Toolbar(w532.getContext(), (AttributeSet) null);
                toolbar.setId(View.generateViewId());
                t53 t53 = new t53(-1, -2);
                t53.a = 1;
                toolbar.setLayoutParams(t53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                zfb2.invoke(toolbar);
                w532.addView(toolbar);
                zfb zfb3 = new zfb(profileEditScreen, 4);
                LinearLayout linearLayout = new LinearLayout(w532.getContext());
                linearLayout.setId(sea.b0);
                t53 t532 = new t53(-1, -2);
                t532.a = 2;
                t532.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(t532);
                linearLayout.setOrientation(1);
                zfb3.invoke(linearLayout);
                w532.addView(linearLayout);
                return e5f;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                bc7[] bc7Arr4 = ProfileEditScreen.y0;
                cla cla = new cla(toolbar2.getContext(), 6);
                cla.setId(sea.q0);
                cla.setForm(uka.a);
                cla.setLeftActions(new kka(new zfb(profileEditScreen, 0)));
                cla.setRightActions(nka.a);
                toolbar2.addView(cla);
                return e5f;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                bc7[] bc7Arr5 = ProfileEditScreen.y0;
                s5a s5a = new s5a(linearLayout2.getContext());
                s5a.setId(sea.V);
                float f = (float) 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
                s5a.setLayoutParams(layoutParams);
                s5a.setAddBadgeVisibility(false);
                tu0.K(s5a, 300, new agb(profileEditScreen, 0));
                linearLayout2.addView(s5a);
                return e5f;
            default:
                View view2 = (View) obj;
                bc7[] bc7Arr6 = ProfileEditScreen.y0;
                profileEditScreen.n0().u();
                return e5f;
        }
    }
}
