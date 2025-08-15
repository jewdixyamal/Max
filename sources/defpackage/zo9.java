package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: zo9  reason: default package */
public final /* synthetic */ class zo9 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ zo9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    /* JADX WARNING: type inference failed for: r3v28, types: [android.widget.LinearLayout, android.view.View, qp9] */
    public final Object invoke(Object obj) {
        boolean z = true;
        e5f e5f = e5f.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                qo9 J = neuroAvatarsScreen.I0.J(((Integer) obj).intValue());
                String str = J != null ? (String) ((Map) neuroAvatarsScreen.r0().y0.getValue()).get(Integer.valueOf(J.c)) : null;
                return str == null ? "" : str;
            case 1:
                int intValue = ((Integer) obj).intValue();
                jv5 jv5 = neuroAvatarsScreen.I0;
                if (jv5.j() > 0) {
                    qo9 J2 = jv5.J(intValue);
                    if (J2 == null || !J2.o) {
                        z = false;
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 2:
                w53 w53 = (w53) obj;
                bc7[] bc7Arr = NeuroAvatarsScreen.M0;
                zo9 zo9 = new zo9(neuroAvatarsScreen, 3);
                Toolbar toolbar = new Toolbar(w53.getContext(), (AttributeSet) null);
                float f = (float) 52;
                t53 t53 = new t53(-1, tu0.G(fk4.d().getDisplayMetrics().density * f));
                t53.a = 1;
                toolbar.setLayoutParams(t53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                zo9.invoke(toolbar);
                w53.addView(toolbar);
                zo9 zo92 = new zo9(neuroAvatarsScreen, 4);
                LinearLayout linearLayout = new LinearLayout(w53.getContext());
                linearLayout.setId(hwb.oneme_login_neuro_avatars_collapsible);
                t53 t532 = new t53(-1, -2);
                t532.a = 2;
                float f2 = (float) 24;
                t532.setMargins(0, rh4.c(f, fk4.d().getDisplayMetrics().density, tu0.G(fk4.d().getDisplayMetrics().density * f2)), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                linearLayout.setLayoutParams(t532);
                linearLayout.setOrientation(1);
                zo92.invoke(linearLayout);
                w53.addView(linearLayout);
                return e5f;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
                cla cla = new cla(toolbar2.getContext(), 6);
                cla.setId(hwb.oneme_login_neuro_avatars_toolbar);
                cla.setForm(uka.a);
                cla.setLeftActions(new kka(new zo9(neuroAvatarsScreen, 5)));
                cla.setTitle(neuroAvatarsScreen.r0().t0.a);
                cla.setTitleAlpha(0.0f);
                toolbar2.addView(cla);
                return e5f;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                bc7[] bc7Arr3 = NeuroAvatarsScreen.M0;
                TextView textView = new TextView(linearLayout2.getContext());
                textView.setId(hwb.oneme_login_neuro_avatars_title);
                i4f.c.b(textView, du4.b);
                textView.setText(neuroAvatarsScreen.r0().t0.a);
                textView.setGravity(1);
                t53 t533 = new t53(-1, -2);
                float f3 = (float) 12;
                t533.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(fk4.d().getDisplayMetrics().density * f3), 0);
                textView.setLayoutParams(t533);
                v3c.y(new v9(3, (Continuation) null, 19), textView);
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(linearLayout2.getContext());
                textView2.setId(hwb.oneme_login_neuro_avatars_description);
                i4f.m.b(textView2, du4.b);
                textView2.setText(neuroAvatarsScreen.r0().t0.b);
                textView2.setGravity(1);
                t53 t534 = new t53(-1, -2);
                t534.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density), 0);
                textView2.setLayoutParams(t534);
                v3c.y(new v9(3, (Continuation) null, 18), textView2);
                linearLayout2.addView(textView2);
                return e5f;
            case 5:
                View view = (View) obj;
                bc7[] bc7Arr4 = NeuroAvatarsScreen.M0;
                neuroAvatarsScreen.getRouter().C();
                return e5f;
            case 6:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7Arr5 = NeuroAvatarsScreen.M0;
                zo9 zo93 = new zo9(neuroAvatarsScreen, 7);
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(hwb.oneme_login_neuro_avatars_appbar);
                fmVar.setLayoutParams(new rw3(-1, -2));
                fmVar.setElevation(0.0f);
                v3c.y(new ep9(3, (Continuation) null, 0), fmVar);
                zo93.invoke(fmVar);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(hwb.oneme_login_neuro_avatars_recycler_view);
                rw3 rw3 = new rw3(-1, -1);
                rw3.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator((mdc) null);
                recyclerView.setOverScrollMode(2);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                jv5 jv52 = neuroAvatarsScreen.I0;
                recyclerView.setAdapter(jv52);
                recyclerView.m(neuroAvatarsScreen.J0);
                jn3 jn3 = new jn3(recyclerView, jv52, new zo9(neuroAvatarsScreen, 0));
                so9 so9 = new so9(new zo9(neuroAvatarsScreen, 1), recyclerView.getContext());
                recyclerView.j(jn3);
                recyclerView.j(so9);
                recyclerView.j(new sc1(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), 5));
                recyclerView.addOnLayoutChangeListener(new hp1(recyclerView, 4, neuroAvatarsScreen));
                coordinatorLayout.addView(recyclerView);
                zo9 zo94 = new zo9(neuroAvatarsScreen, 8);
                FrameLayout frameLayout = new FrameLayout(coordinatorLayout.getContext());
                frameLayout.setId(hwb.oneme_login_neuro_avatars_button_background);
                rw3 rw32 = new rw3(-1, -2);
                rw32.c = 80;
                frameLayout.setLayoutParams(rw32);
                frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, qp4.u0.j(frameLayout).e().c.a));
                br7.d(frameLayout, new x27(0, new yq0(3, 1, false), 1), (m56) null);
                zo94.invoke(frameLayout);
                v3c.y(new ro2(3, (Continuation) null, 3), frameLayout);
                coordinatorLayout.addView(frameLayout);
                return e5f;
            case 7:
                fm fmVar2 = (fm) obj;
                bc7[] bc7Arr6 = NeuroAvatarsScreen.M0;
                zo9 zo95 = new zo9(neuroAvatarsScreen, 2);
                w53 w532 = new w53(fmVar2.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w532.setLayoutParams(dmVar);
                w532.setTitleEnabled(false);
                zo95.invoke(w532);
                fmVar2.addView(w532);
                s5a s5a = new s5a(fmVar2.getContext());
                s5a.setId(hwb.oneme_login_neuro_avatars_avatar);
                float f4 = (float) 96;
                s5a.setLayoutParams(new dm(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density)));
                fmVar2.setGravity(1);
                s5a.setCloseBadgeClickListener(new ap9(neuroAvatarsScreen, 0));
                s5a.setOnImageLoadedListener(new ap9(neuroAvatarsScreen, 1));
                s5a.j(s5a, (Drawable) neuroAvatarsScreen.L0.getValue(), (m5a) null, 30);
                s5a.setAvatarShape(j5a.a);
                fmVar2.addView(s5a);
                ? linearLayout3 = new LinearLayout(fmVar2.getContext(), (AttributeSet) null, 0);
                float f5 = (float) 8;
                linearLayout3.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f5), 0, tu0.G(f5 * fk4.d().getDisplayMetrics().density), 0);
                linearLayout3.setId(hwb.oneme_login_neuro_avatars_tabs_shimmer);
                linearLayout3.setElevation(0.0f);
                dm dmVar2 = new dm(-1, -2);
                float f6 = (float) 32;
                dmVar2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f6);
                linearLayout3.setLayoutParams(dmVar2);
                linearLayout3.setVisibility(8);
                linearLayout3.setTabs(3);
                linearLayout3.setOverScrollMode(2);
                fmVar2.addView(linearLayout3);
                wja wja = new wja(fmVar2.getContext(), (AttributeSet) null);
                wja.setId(hwb.oneme_login_neuro_avatars_tabs);
                wja.setTabMode(0);
                wja.setElevation(0.0f);
                dm dmVar3 = new dm(-1, -2);
                dmVar3.topMargin = tu0.G(f6 * fk4.d().getDisplayMetrics().density);
                wja.setLayoutParams(dmVar3);
                wja.setOverScrollMode(2);
                fmVar2.addView(wja);
                return e5f;
            default:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                bc7[] bc7Arr7 = NeuroAvatarsScreen.M0;
                OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setId(hwb.oneme_login_neuro_avatars_continue_btn);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.o);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                float f7 = (float) 12;
                layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f7), 0, tu0.G(f7 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 48;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setText(neuroAvatarsScreen.r0().t0.c);
                frameLayout2.addView(oneMeButton);
                return e5f;
        }
    }
}
